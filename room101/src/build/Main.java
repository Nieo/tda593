package build;

import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import RootElement.Booking;
import RootElement.Cleaning;
import RootElement.Clerk;
import RootElement.Feedback;
import RootElement.FeedbackReader;
import RootElement.FeedbackWriter;
import RootElement.Guest;
import RootElement.HotelSystem;
import RootElement.MakeBooking;
import RootElement.Manager;
import RootElement.Payment;
import RootElement.ReceptionHandling;
import RootElement.Room;
import RootElement.RoomAttribute;
import RootElement.RoomBooking;
import RootElement.RoomType;
import RootElement.ServiceItem;
import RootElement.ServiceItemhandling;
import RootElement.Staff;
import RootElement.SupportTicket;
import RootElement.SupportTicketReader;
import RootElement.SupportTicketWriter;
import RootElement.SysAdmin;
import RootElement.impl.HotelFactory;

public class Main implements Guest, Staff, Clerk, Manager, SysAdmin{

	private Scanner in;
	
	private HotelSystem hotel;
	private Guest guest;
	private Staff staff;
	private Clerk clerk;
	private Manager manager;
	private SysAdmin sysAdmin;
	
	public Main() {
		in = new Scanner(System.in);
		hotel = HotelFactory.createHotelSystem();
		
		System.out.println("Welcome to the best hotel booking system in the world!");
		loginSelect();
		System.out.println("Exiting the hotel booking system...");
		
		in.close();
	}
	
	private void loginSelect() {
		int input = -1;
		while (input != 0) {
			System.out.println("Who do you want to log in as?");
			System.out.println("1:\tGuest\n2:\tStaff\n3:\tClerk\n4:\tManager\n5:\tSystem Administrator\nOr 0 to exit\n");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (Exception e) {
				System.out.println("Only digits 0-5 is allowed.");
				continue;
			}
			switch (input) {
			case 1:
				guestLoggedIn();
				break;
			case 2:
				staffLoggedIn();
				break;
			case 3:
				clerkLoggedIn();
				break;
			case 4:
				managerLoggedIn();
				break;
			case 5:
				sysAdminLoggedIn();
				break;
			default:
				System.out.println(input + " is not on the list.\n");
			}
		}
	}
	
	private void guestLoggedIn() {
		System.out.println("Logged in as a Guest!");
		if (guest == null) {
			guest = hotel.getGuest();
		}
		int input = -1;
		while (input != 0) {
			System.out.println("What do you want to do?");
			System.out.println("1:\tMake or cancel a Booking\n2:\tWrite a Support Ticket\n3:\tGive Feedback\nOr 0 to go back\n");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (Exception e) {
				System.out.println("Only digits 0-3 is allowed.");
				continue;
			}
			switch (input) {
			case 1:
				makeBooking(guest);
				break;
			case 2:
				System.out.print("Please enter the room ID: ");
				String roomID = in.nextLine().trim();
				System.out.println("Please write a description of the problem:");
				String description = in.nextLine().trim();
				guest.newSupportTicket(roomID, description);
				break;
			case 3:
				giveFeedback(null);
				break;
			default:
				System.out.println(input + " is not on the list.\n");
			}
		}
	}
	
	private void staffLoggedIn() {
		System.out.println("Logged in as a Staff!");
		if (staff == null) {
			staff = hotel.getStaff("1");
		}
	}
	
	private void clerkLoggedIn() {
		System.out.println("Logged in as a Clerk!");
		if (clerk == null) {
			clerk = hotel.getClerk("1");
		}
	}
	
	private void managerLoggedIn() {
		System.out.println("Logged in as a Manager!");
		if (manager == null) {
			manager = hotel.getManager("1");
		}
	}
	
	private void sysAdminLoggedIn() {
		System.out.println("Logged in as a System Administrator!");
		if (sysAdmin == null) {
			sysAdmin = hotel.getSystemAdministrator();
		}
	}
	
	private void makeBooking(MakeBooking actor) {
		int input = -1;
		while (input != 0) {
			System.out.println("What do you want to do?");
			System.out.println("1:\tMake a new booking\n2:\tCancel a booking\nOr 0 to exit\n");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (Exception e) {
				System.out.println("Only digits 0-2 is allowed.");
				continue;
			}
			switch (input) {
			case 1:
				bookingProcess(actor);
				break;
			case 2:
				cancelBookingProcess(actor);
				break;
			default:
				System.out.println(input + " is not on the list.\n");
			}
		}
	}
	
	private void bookingProcess(MakeBooking actor) {
		Booking booking = actor.createBooking();
		int input = -1;
		while (input != 0) {
			printBooking(booking);
			System.out.println("What do you want to do?");
			System.out.println("1:\tSearch for available rooms\n2:\tConfirm the booking\nOr 0 to discard and go back\n");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (Exception e) {
				System.out.println("Only digits 0-2 is allowed.");
				continue;
			}
			switch (input) {
			case 1:
				searchAndChooseRoomType(booking, actor);
				break;
			case 2:
				if (confirmBooking(booking, actor)) {
					System.out.println("Booking confirmed.");
					return;
				} else {
					System.out.println("Booking confirmation failed: Bad details.");
				}
				break;
			default:
				System.out.println(input + " is not on the list.\n");
			}
		}
	}
	
	private boolean confirmBooking(Booking booking, MakeBooking actor) {
		String name = null, phone = null, mail = null, nationality = null, nextDest = null;
		int passportNbr = -1;
		System.out.print("What's your name?: ");
		name = in.nextLine().trim();
		System.out.println("What's your phone number?: ");
		phone = in.nextLine().trim();
		System.out.println("What's your e-mail? (optional): ");
		mail = in.nextLine().trim();
		System.out.println("What's your nationality?: ");
		nationality = in.nextLine().trim();
		String natLow = nationality.toLowerCase().trim();
		if (!natLow.equals("sweden") && !natLow.equals("sverige") && !natLow.equals("se")) {
			while (true) {
				System.out.print("What's your passport number?: ");
				try {
					passportNbr = Integer.parseInt(in.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("Wrong format! Only an integer number is allowed!");
				}
			}
		}
		return actor.confirmBooking(booking, name, phone, mail, nationality, passportNbr, nextDest);
	}
	
	private void cancelBookingProcess(MakeBooking actor) {
		String name = null, phoneNbr = null;
		System.out.print("Please state your name: ");
		name = in.nextLine();
		System.out.println("Please state your phone number: ");
		phoneNbr = in.nextLine();
		Booking booking = actor.lookupBooking(name, phoneNbr);
		if (booking != null) {
			System.out.println("Found booking:");
			while (true) {
				printBooking(booking);
				System.out.println("1: Cancel the booking\n0: Go back");
				int input = -1;
				try {
					input = Integer.parseInt(in.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("Only an integer 0-1 is allowed!");
				}
				if (input == 1) {
					if (actor.cancelBooking(booking)) {
						System.out.println("Booking cancelled");						
					} else {
						System.out.println("Failed to cancel booking");
					}
					break;
				} else if (input == 0) {
					break;
				}
			}
		}
	}
	
	private void printBooking(Booking booking) {
		if (!booking.getRoombooking().isEmpty()) {
			System.out.println("\nRooms booked:");
			for (RoomBooking rb : booking.getRoombooking()) {
				printRoomBooking(rb);
			}
			System.out.println("Total cost: " + booking.calculateCost() + "\n");
		}
	}
	
	private void printRoomBooking(RoomBooking rb) {
		System.out.println(rb.getRoom().getRoomType().getName() + "\tfrom "
				+ rb.getStartDate() + " to " + rb.getEndDate() + "\t"
				+ rb.getRoom().getRoomType().getPrice() + "/day");
	}
	
	private void searchAndChooseRoomType(Booking booking, MakeBooking actor) {
		Date startDate = null, endDate = null;
		int nbrOfAdults = 0, nbrOfChildren = 0;
		EList<RoomType> allRooms;
		ArrayList<RoomType> roomTypes = new ArrayList<>();
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		do {
			System.out.print("Please state the start date (yyyy-mm-dd):");
			try {
				startDate = format.parse(in.nextLine());
			} catch (ParseException e) {
				System.out.println("Wrong format!");
			}			
		} while (startDate != null);
		do {
			System.out.print("Please state the end date (yyyy-mm-dd):");
			try {
				endDate = format.parse(in.nextLine());
			} catch (ParseException e) {
				System.out.println("Wrong format!");
			}			
		} while (endDate != null);
		while (true) {
			System.out.print("How many adults?: ");
			try {
				nbrOfAdults = Integer.parseInt(in.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Wrong format! Only an integer number is allowed!");
			}
		}
		while (true) {
			System.out.print("How many Children?: ");
			try {
				nbrOfChildren = Integer.parseInt(in.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Wrong format! Only an integer number is allowed!");
			}
		}
		allRooms = actor.getAvailableRooms(startDate, endDate, nbrOfAdults, nbrOfChildren);
		int input = -1;
		while (input != 0) {
			printBooking(booking);
			roomTypes.clear();
			for (RoomType rt : allRooms) {
				if (!roomTypes.contains(rt)) {
					roomTypes.add(rt);
				}
			}
			System.out.println("Choose a room below to add it to the booking or 0 to go back\n");
			for (int i=0; i< roomTypes.size(); i++) {
				System.out.print(i+ ":\t");
				printRoomType(roomTypes.get(i));
			}
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Wrong format! Only integer numbers are allowed!");
			}
			if (input == 0) {
				break;
			}
			try {
				actor.addRoom(booking, allRooms.get(input -1), nbrOfAdults, nbrOfChildren);
				roomTypes.add(allRooms.get(input - 1));
				allRooms.remove(input -1);
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("There are " + roomTypes.size()
							+ " choices, not '" + input + "'... Try again.");
			}
		}
	}
	
	private void printRoomType(RoomType rt) {
		System.out.print("Room type:\t\t" + rt.getName()
				+ "\tPrice per night:\t" + rt.getPrice()
				+ "\n\tAttributes:");
		for (int i=0; i < rt.getRoomAttributes().size(); i++) {
			RoomAttribute ra = rt.getRoomAttributes().get(i);
			if (i!=0) {
				System.out.print("\t\t\t");
			}
			System.out.println("\t\t" + ra.getName() + ", " + ra.getDescription());
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}

	@Override
	public void newSupportTicket(String roomID, String description) {}
	@Override
	public EClass eClass() {return null;}
	@Override
	public Resource eResource() {return null;}
	@Override
	public EObject eContainer() {return null;}
	@Override
	public EStructuralFeature eContainingFeature() {return null;}
	@Override
	public EReference eContainmentFeature() {return null;}
	@Override
	public EList<EObject> eContents() {return null;}
	@Override
	public TreeIterator<EObject> eAllContents() {return null;}
	@Override
	public boolean eIsProxy() {return false;}
	@Override
	public EList<EObject> eCrossReferences() {return null;}
	@Override
	public Object eGet(EStructuralFeature feature) {return null;}
	@Override
	public Object eGet(EStructuralFeature feature, boolean resolve) {return null;}
	@Override
	public void eSet(EStructuralFeature feature, Object newValue) {}
	@Override
	public boolean eIsSet(EStructuralFeature feature) {return false;}
	@Override
	public void eUnset(EStructuralFeature feature) {}
	@Override
	public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {return null;}
	@Override
	public EList<Adapter> eAdapters() {return null;}
	@Override
	public boolean eDeliver() {return false;}
	@Override
	public void eSetDeliver(boolean deliver) {}
	@Override
	public void eNotify(Notification notification) {}

	@Override
	public void giveFeedback(String feedback) {
		System.out.println("Please enter your feedback:");
		guest.giveFeedback(in.nextLine());
		System.out.println("Feedback has been recorded.");
	}

	@Override
	public Booking createBooking() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<RoomType> getAvailableRooms(Date startDate, Date endDate, int nbrOfAdults, int nbrOfChildren) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addRoom(Booking booking, RoomType room, int nbrOfAdults, int nbrOfChildren) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean confirmBooking(Booking booking, String name, String phone, String mail, String nationality,
			int passportNr, String nextDestination) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cancelBooking(Booking booking) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Booking lookupBooking(String name, String phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPhoneNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPhoneNumber(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNextDestination() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNextDestination(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNationality() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNationality(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getMail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMail(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getSocialSecurityNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSocialSecurityNumber(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SupportTicketWriter getSupportTicketWriter() {return null;}
	@Override
	public void setSupportTicketWriter(SupportTicketWriter value) {}
	@Override
	public MakeBooking getMakeBooking() {return null;}
	@Override
	public void setMakeBooking(MakeBooking value) {}
	@Override
	public FeedbackWriter getFeedbackWriter() {return null;}
	@Override
	public void setFeedbackWriter(FeedbackWriter value) {}

	@Override
	public boolean checkIfRoomCleaned(String roomID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EList<Room> getListOfUncleanRooms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void markRoomAsCleaned(Room room) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EList<SupportTicket> getUnfixedTickets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<SupportTicket> getSupportTicketsForRoom(Room room) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void markAsCompleted(SupportTicket supportTicket) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkIn(RoomBooking booking) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkOut(RoomBooking booking) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EList<Booking> findBookings(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking findActiveBooking(String roomID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addServiceItem(String name, String description, int price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeServiceItem(ServiceItem serviceItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServiceItem findAllServiceItems(Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verifyCreditCard(String creditCard) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean debitCard(String creditCard, int amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public RoomAttribute addRoomAttribute(String name, String description) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean editRoomAttribute(RoomAttribute roomAttribute, String newName, String newDescription) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeRoomAttribute(RoomAttribute roomAttribute) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EList<Room> getAllRooms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoomType addRoomType(String name, int cost) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean editRoomType(RoomType roomType, String newName, int newCost) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeRoomType(RoomType roomType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EList<RoomType> getAllRoomTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addAttributeToRoomType(RoomType roomType, RoomAttribute roomAttribute) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAttributeFromRoomType(RoomType roomType, RoomAttribute roomAttribute) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EList<Feedback> getAllFeedback() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Feedback> getUnreadFeedback() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FeedbackReader getFeedbackReader() {return null;}
	@Override
	public void setFeedbackReader(FeedbackReader value) {}
	@Override
	public ReceptionHandling getReceptionHandling() {return null;}
	@Override
	public void setReceptionHandling(ReceptionHandling value) {}
	@Override
	public ServiceItemhandling getServiceItemHandling() {return null;}
	@Override
	public void setServiceItemHandling(ServiceItemhandling value) {}
	@Override
	public Payment getPayment() {return null;}
	@Override
	public void setPayment(Payment value) {}
	@Override
	
	public String getStaffID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setStaffID(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cleaning getCleaning() {return null;}
	@Override
	public void setCleaning(Cleaning value) {}
	@Override
	public SupportTicketReader getSupportTicketReader() {return null;}
	@Override
	public void setSupportTicketReader(SupportTicketReader value) {}

	@Override
	public EList<RoomAttribute> getAllRoomAttributes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Room addRoom(RoomType roomType, String roomName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeRoom(String roomName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editRoom(String roomName, RoomType newRoomType, String newRoomName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Room findRoom(String roomName) {
		// TODO Auto-generated method stub
		return null;
	}
}
