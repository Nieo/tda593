package build;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import org.eclipse.emf.common.util.EList;

import RootElement.Booking;
import RootElement.Cleaning;
import RootElement.Clerk;
import RootElement.Feedback;
import RootElement.FeedbackReader;
import RootElement.Guest;
import RootElement.HotelSystem;
import RootElement.MakeBooking;
import RootElement.Manager;
import RootElement.Payment;
import RootElement.Room;
import RootElement.RoomAttribute;
import RootElement.RoomAttributeHandling;
import RootElement.RoomBooking;
import RootElement.RoomType;
import RootElement.ServiceItem;
import RootElement.ServiceItemHandling;
import RootElement.Staff;
import RootElement.SupportTicket;
import RootElement.SupportTicketReader;
import RootElement.SupportTicketWriter;
import RootElement.SysAdmin;
import RootElement.impl.HotelFactory;

public class MainCLI{

	private Scanner in;
	
	private HotelSystem hotel;
	private Guest guest;
	private Staff staff;
	private Clerk clerk;
	private Manager manager;
	private SysAdmin sysAdmin;
	
	public MainCLI() {
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
			System.out.println("Login - Who do you want to log in as?");
			System.out.println("1:\tGuest\n2:\tStaff\n3:\tClerk\n4:\tManager\n5:\tSystem Administrator\nOr 0 to exit\n");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (Exception e) {
				System.out.println("Only digits 0-5 is allowed.");
				continue;
			}
			switch (input) {
			case 0:
				break;
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
			System.out.println("Guest - What do you want to do?");
			System.out.println("1:\tMake or cancel a Booking\n2:\tWrite a Support Ticket\n3:\tGive Feedback\nOr 0 to go back\n");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (Exception e) {
				System.out.println("Only digits 0-3 is allowed.");
				continue;
			}
			switch (input) {
			case 0:
				break;
			case 1:
				handleNewBooking(guest);
				break;
			case 2:
				makeSupportTicket(guest);
				break;
			case 3:
				System.out.println("Please enter your feedback:");
				guest.giveFeedback(in.nextLine());
				System.out.println("Feedback has been recorded.");
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
		int input = -1;
		while (input != 0) {
			System.out.println("Staff - What do you want to do?");
			System.out.println("1:\tHandle cleaning\n2:\tHandle Support Tickets\nOr 0 to go back\n");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (Exception e) {
				System.out.println("Only digits 0-2 is allowed.");
				continue;
			}
			switch (input) {
			case 0:
				break;
			case 1:
				handleCleaning(staff);
				break;
			case 2:
				handleSupportTickets(staff);
				break;
			default:
				System.out.println(input + " is not on the list.\n");
			}
		}
	}
	
	private void clerkLoggedIn() {
		System.out.println("Logged in as a Clerk!");
		if (clerk == null) {
			clerk = hotel.getClerk("1");
		}
		int input = -1;
		while (input != 0) {
			System.out.println("Clerk - What do you want to do?");
			System.out.println("1:\tReception\n2:\tMake or cancel a Booking\n3:\tPayment\n4:\tHandle cleaning\n5:\tHandle Support Tickets\nOr 0 to go back\n");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (Exception e) {
				System.out.println("Only digits 0-5 is allowed.");
				continue;
			}
			switch (input) {
			case 0:
				break;
			case 1:
				reception(clerk);
				break;
			case 2:
				handleNewBooking(clerk);
				break;
			case 3:
				handlePayment(clerk);
				break;
			case 4:
				handleCleaning(clerk);
				break;
			case 5:
				handleSupportTickets(clerk);
				break;
			default:
				System.out.println(input + " is not on the list.\n");
			}
		}
	}
	
	private void managerLoggedIn() {
		System.out.println("Logged in as a Manager!");
		if (manager == null) {
			manager = hotel.getManager("1");
		}
		int input = -1;
		while (input != 0) {
			System.out.println("Manager - What do you want to do?");
			System.out.println("1:\tReception\n2:\tMake or cancel a Booking\n3:\tPayment\n4:\tHandle cleaning\n5:\tHandle Support Tickets\n"
					+ "6:\tRead feedback\n7:\tHandle rooms\n8:\tHandle room types\n9\t:Handle room attributes\nOr 0 to go back\n");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (Exception e) {
				System.out.println("Only digits 0-5 is allowed.");
				continue;
			}
			switch (input) {
			case 0:
				break;
			case 1:
				reception(manager);
				break;
			case 2:
				handleNewBooking(manager);
				break;
			case 3:
				handlePayment(manager);
				break;
			case 4:
				handleCleaning(manager);
				break;
			case 5:
				handleSupportTickets(manager);
				break;
			case 6:
				readFeedback(manager);
				break;
			case 7:
				handleRooms(manager);
				break;
			case 8:
				handleRoomTypes(manager);
				break;
			case 9:
				handleRoomAttributes(manager);
				break;
			default:
				System.out.println(input + " is not on the list.\n");
			}
		}
	}

	private void sysAdminLoggedIn() {
		System.out.println("Logged in as a System Administrator!");
		if (sysAdmin == null) {
			sysAdmin = hotel.getSystemAdministrator();
		}
		int input = -1;
		while (input != 0) {
			System.out.println("System Administrator - What do you want to do?");
			System.out.println("1:\tHandle rooms\n2:\tHandle room types\n3\t:Handle room attributes\nOr 0 to exit\n");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (Exception e) {
				System.out.println("Only digits 0-3 is allowed.");
				continue;
			}
			switch (input) {
			case 0:
				break;
			case 1:
				handleRooms(sysAdmin);
				break;
			case 2:
				handleRoomTypes(sysAdmin);
				break;
			case 3:
				handleRoomAttributes(sysAdmin);
				break;
			default:
				System.out.println(input + " is not on the list.\n");
			}
		}
	}
	
	private void handleNewBooking(MakeBooking actor) {
		int input = -1;
		while (input != 0) {
			System.out.println("Bookings - What do you want to do?");
			System.out.println("1:\tMake a new booking\n2:\tCancel a booking\nOr 0 to exit\n");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (Exception e) {
				System.out.println("Only digits 0-2 is allowed.");
				continue;
			}
			switch (input) {
			case 0:
				break;
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
			System.out.println("Booking process - What do you want to do?");
			System.out.println("1:\tSearch for available rooms\n2:\tConfirm the booking\nOr 0 to discard and go back\n");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (Exception e) {
				System.out.println("Only digits 0-2 is allowed.");
				continue;
			}
			switch (input) {
			case 0:
				break;
			case 1:
				searchAndChooseRoomType(booking, actor);
				break;
			case 2:
				if (confirmNewBooking(booking, actor)) {
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
	
	private boolean confirmNewBooking(Booking booking, MakeBooking actor) {
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
				+ rb.getRoom().getRoomType().getPrice() + "/day\tStatus: "
				+ rb.getBookingStatus());
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
				System.out.print((i+1) + ":\t");
				printRoomType(roomTypes.get(i));
			}
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Wrong format! Only integer numbers are allowed!");
				continue;
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
	
	private void makeSupportTicket(SupportTicketWriter actor) {
		System.out.print("Please enter the room ID: ");
		String roomID = in.nextLine().trim();
		System.out.println("Please write a description of the problem:");
		String description = in.nextLine().trim();
		actor.newSupportTicket(roomID, description);
	}
	
	private void handleCleaning(Cleaning actor) {
		int input = -1;
		while (input != 0) {
			System.out.println("Cleaning - What do you want to do?");
			System.out.println("1:\tList uncleaned rooms\n2:\tCheck if room is cleaned\nOr 0 to go back\n");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (Exception e) {
				System.out.println("Only digits 0-2 is allowed.");
				continue;
			}
			switch (input) {
			case 0:
				break;
			case 1:
				cleaningChooser(actor.getListOfUncleanRooms(), actor);
				break;
			case 2:
				System.out.print("Please enter the room ID: ");
				try {
					if (actor.checkIfRoomCleaned(in.nextLine().trim())) {
						System.out.println("The room is clean.");
					} else {
						System.out.println("The room is not clean");
					}
				} catch (Exception ex) {
					System.out.println("No room with that ID was found.");
				}
				break;
			default:
				System.out.println(input + " is not on the list.\n");
			}
		}
	}
	
	private void cleaningChooser(EList<Room> list, Cleaning actor) {
		int input=-1;
		while(input != 0) {
			if (list == null || list.isEmpty()) {
				System.out.println("No dirty rooms where found.");
				break;
			}
			for (int i=0; i<list.size(); i++) {
				Room room = list.get(i);
				System.out.print((i+1) + ":\t");
				System.out.println("Room ID: " + room.getRoomName() + "\tStatus: " + (room.isNeedCleaning()?"Not clean":"Clean"));
			}
			System.out.print("Choose a room to mark it as cleaned or 0 to go back: ");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Wrong format! Only integer numbers are allowed!");
				continue;
			}
			if (input == 0) {
				break;
			}
			try {
				actor.markRoomAsCleaned(list.get(input-1));
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("There are " + list.size()
							+ " choices, not '" + input + "'... Try again.");
			}
		}
	}
	
	private void handleSupportTickets(Staff actor) {
		int input = -1;
		while (input != 0) {
			System.out.println("Support Tickets - What do you want to do?");
			System.out.println("1:\tWrite Support Ticket\n2:\tList unfixed Support Tickets\n3:\tShow Support Tickets for a room\nOr 0 to go back\n");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (Exception e) {
				System.out.println("Only digits 0-3 is allowed.");
				continue;
			}
			switch (input) {
			case 0:
				break;
			case 1:
				makeSupportTicket(actor);
				break;
			case 2:
				supportTicketChooser(actor.getUnfixedTickets(), actor);
				break;
			case 3:
				System.out.print("Please enter the roomID: ");
				EList<SupportTicket> list = actor.getSupportTicketsForRoom(in.nextLine());
				if (list == null || list.isEmpty()) {
					System.out.println("No tickets where found for that room.");
				} else {
					supportTicketChooser(list, actor);
				}
				break;
			default:
				System.out.println(input + " is not on the list.\n");
			}
		}
	}
	
	private void supportTicketChooser(EList<SupportTicket> list, SupportTicketReader actor) {
		int input=-1;
		while(input != 0) {
			if (list == null || list.isEmpty()) {
				System.out.println("No tickets where found.");
				break;
			}
			for (int i=0; i<list.size(); i++) {
				SupportTicket st = list.get(i);
				System.out.print((i+1) + ":\t");
				System.out.println(st.getRoomID() + "\t" + (st.isFixed()?"Fixed":"Not fixed"));
				System.out.println("\t" + (st.getProblemDescription().length()>60
						? st.getProblemDescription().substring(0, 60) + "..."
								: st.getProblemDescription()));
			}
			System.out.print("Choose a ticket to read it or 0 to go back: ");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Wrong format! Only integer numbers are allowed!");
				continue;
			}
			if (input == 0) {
				break;
			}
			try {
				SupportTicket st = list.get(input-1);
				System.out.println("Room ID: " + st.getRoomID());
				System.out.println("Status: " + (st.isFixed()?"Fixed":"Not fixed"));
				System.out.println(st.getProblemDescription() + "\n");
				System.out.println("1:\tMark as fixed\n\tGo back");
				int input2 = -1;
				while(input2 != 0) {
					try {
						input2 = Integer.parseInt(in.nextLine());
					} catch (NumberFormatException e) {
						System.out.println("Only digits 0-1 are allowed.");
						continue;
					}
					switch (input2) {
					case 0:
						break;
					case 1:
						actor.markAsCompleted(st);
						System.out.println("Support Ticket marked as fixed.");
						break;
					default:
						System.out.println(input2 + " is not on the list.\n");
					}
				}
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("There are " + list.size()
							+ " choices, not '" + input + "'... Try again.");
			}
		}
	}
	
	private void reception(Clerk actor) {
		int input = -1;
		while (input != 0) {
			System.out.println("Reception - What do you want to do?");
			System.out.println("1:\tFind booking by name\n2:\tFind booking by room ID\nOr 0 to discard and go back\n");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (Exception e) {
				System.out.println("Only digits 0-2 is allowed.");
				continue;
			}
			switch (input) {
			case 0:
				break;
			case 1:
				System.out.println("Please enter the name to search for: ");
				EList<Booking> bookings = actor.findBookings(in.nextLine().trim());
				if (bookings == null || bookings.isEmpty()) {
					System.out.println("No bookings for that name were found.");
				} else {
					int input2=-1;
					while(input2 != 0) {
						for (int i=0; i<bookings.size(); i++) {
							Booking booking = bookings.get(i);
							System.out.print((i+1) + ":\t");
							System.out.println("ID: " + booking.getBookingID() + "\tGuest: " + booking.getGuest().getName()
									+ " : " + booking.getGuest().getSocialSecurityNumber());
						}
						System.out.print("Choose a booking to handle or 0 to go back: ");
						try {
							input2 = Integer.parseInt(in.nextLine());
						} catch (NumberFormatException e) {
							System.out.println("Wrong format! Only integer numbers are allowed!");
							continue;
						}
						if (input2 == 0) {
							break;
						}
						try {
							Booking booking = bookings.get(input-1);
							handleBooking(booking, actor);
							break;
						} catch (ArrayIndexOutOfBoundsException ex) {
							System.out.println("There are " + bookings.size()
										+ " choices, not '" + input + "'... Try again.");
						}
					}
				}
				break;
			case 2:
				System.out.print("Please enter the room ID: ");
				handleBooking(actor.findActiveBooking(in.nextLine().trim()), actor);
				break;
			default:
				System.out.println(input + " is not on the list.\n");
			}
		}
	}
	
	private void handleBooking(Booking booking, Clerk actor) {
		int input = -1;
		while (input != 0) {
			System.out.println("Handle Booking - What do you want to do?");
			System.out.println("1:\tCheck in\n2:\tCheck out\n\t3:Add Service Item\n\t4:Remove Service Item\nOr 0 to go back\n");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (Exception e) {
				System.out.println("Only digits 0-4 is allowed.");
				continue;
			}
			switch (input) {
			case 0:
				break;
			case 1:
				RoomBooking checkInRoom = chooseRoomBooking(booking);
				if (checkInRoom != null) {
					if (actor.checkIn(checkInRoom)) {
						System.out.println("Room has been checked in.");
					} else {
						System.out.println("Failed to check in!");
					}					
				}
				break;
			case 2:
				RoomBooking checkOutRoom = chooseRoomBooking(booking);
				if (checkOutRoom != null) {
					int amount = booking.calculateCost();
					while(true) {
						System.out.println("The total cost for the booking is: " + amount);
						System.out.print("Pay for the booking now? (y/n): ");
						String choice = in.nextLine().toLowerCase().trim(); 
						if (choice.equals("y")) {
							System.out.print("Please enter the credit card: ");
							String creditCard = in.nextLine().trim();
							if (actor.debitCard(creditCard, amount)) {
								System.out.println("Payment successfull.");
								break;
							} else {
								System.out.println("Payment failed!");
							}
						} else if (choice.equals("n")) {
							break;
						} else {
							System.out.println("Only 'y' or 'n' are allowed.");
						}
					}
					if (actor.checkOut(checkOutRoom)) {
						System.out.println("Checkout successful.");
					} else {
						System.out.println("Checkout failed!");
					}
				}
				break;
			case 3:
				System.out.print("Please enter a name of the service item: ");
				String name = in.nextLine().trim();
				System.out.println("Please enter a description of the service item: ");
				String description = in.nextLine().trim();
				int price = 0;
				while (true) {
					System.out.print("Please enter the price of the service item: ");
					try {
						price = Integer.parseInt(in.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.out.println("Wrong format! Only an integer number is allowed!");
					}
				}
				actor.addServiceItem(booking, name, description, price);
				break;
			case 4:
				removeServiceItem(booking, actor);
				break;
			default:
				System.out.println(input + " is not on the list.\n");
			}
		}
	}
	
	private RoomBooking chooseRoomBooking(Booking booking) {
		EList<RoomBooking> list = booking.getRoombooking();
		if (list != null && !list.isEmpty()) {
			int input = -1;
			while (input != 0) {
				for (int i=0; i<list.size(); i++) {
					System.out.print(i+ ":\t");
					printRoomBooking(list.get(i));
				}
				System.out.print("Select a room booking or 0 to go back: ");
				try {
					input = Integer.parseInt(in.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("Wrong format! Only integer numbers are allowed!");
					continue;
				}
				if (input == 0) {
					break;
				}
				try {
					return list.get(input - 1);
				} catch (ArrayIndexOutOfBoundsException ex) {
					System.out.println("There are " + list.size()
								+ " choices, not '" + input + "'... Try again.");
				}
			}
		}
		return null;
	}
	
	private void removeServiceItem(Booking booking, ServiceItemHandling actor) {
		EList<ServiceItem> list = booking.getServiceitem();
		int input=-1;
		while(input != 0) {
			if (list == null || list.isEmpty()) {
				System.out.println("No service items where found.");
				break;
			}
			for (int i=0; i<list.size(); i++) {
				ServiceItem si = list.get(i);
				System.out.print((i+1) + ":\t");
				System.out.println(si.getName() + "\t" + si.getPrice());
				System.out.println("\t" + (si.getDescription().length()>60
						? si.getDescription().substring(0, 60) + "..."
								: si.getDescription()));
			}
			System.out.print("Choose a service item to handle it or 0 to go back: ");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Wrong format! Only integer numbers are allowed!");
				continue;
			}
			if (input == 0) {
				break;
			}
			try {
				ServiceItem si = list.get(input-1);
				System.out.println("Name: " + si.getName());
				System.out.println("Price: " + si.getPrice());
				System.out.println(si.getDescription() + "\n");
				System.out.println("1:\tDelete this item\n\tGo back");
				int input2 = -1;
				while(input2 != 0) {
					try {
						input2 = Integer.parseInt(in.nextLine());
					} catch (NumberFormatException e) {
						System.out.println("Only digits 0-1 are allowed.");
						continue;
					}
					switch (input2) {
					case 0:
						break;
					case 1:
						actor.removeServiceItem(booking, si);
						System.out.println("Service item has been removed.");
						break;
					default:
						System.out.println(input2 + " is not on the list.\n");
					}
				}
				break;
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("There are " + list.size()
							+ " choices, not '" + input + "'... Try again.");
			}
		}
	}
	
	private void handlePayment(Payment actor) {
		int input = -1;
		while (input != 0) {
			System.out.println("Payment - What do you want to do?");
			System.out.println("1:\tVerify a card\n2:\tMake a payment\nOr 0 to go back\n");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (Exception e) {
				System.out.println("Only digits 0-2 is allowed.");
				continue;
			}
			switch (input) {
			case 0:
				break;
			case 1:
				System.out.print("Please enter the card number: ");
				if (actor.verifyCreditCard(in.nextLine().trim())) {
					System.out.println("The card is valid.");
				} else {
					System.out.println("The car is NOT valid.");
				}
				break;
			case 2:
				System.out.print("Please enter the card number: ");
				String card = in.nextLine().trim();
				int amount = 0;
				while (true) {
					System.out.println("Please enter the amount in SEK: ");
					try {
						amount = Integer.parseInt(in.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.out.println("Wrong format! Only an integer number is allowed!");
					}
				}
				actor.debitCard(card, amount);
				break;
			default:
				System.out.println(input + " is not on the list.\n");
			}
		}
	}
	
	private void readFeedback(FeedbackReader actor) {
		int input = -1;
		while (input != 0) {
			System.out.println("Feedback - What do you want to do?");
			System.out.println("1:\tRead un-read feedback\n2:\tRead all feedback\nOr 0 to exit\n");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (Exception e) {
				System.out.println("Only digits 0-2 is allowed.");
				continue;
			}
			switch (input) {
			case 0:
				break;
			case 1:
				listFeedback(actor.getUnreadFeedback());
				break;
			case 2:
				listFeedback(actor.getAllFeedback());
				break;
			default:
				System.out.println(input + " is not on the list.\n");
			}
		}
	}
	
	private void listFeedback(EList<Feedback> list) {
		if (list != null && !list.isEmpty()) {
			for (Feedback feedback : list) {
				System.out.println("Rating:\n\t" + feedback.getRating());
				System.out.println("Feedback message:\n\t" + feedback.getFeedbackDescription());
				System.out.println("---------------------------------------------------------------------");
			}
		} else {
			System.out.println("No feedback was found.");
		}
	}
	
	private void handleRooms(SysAdmin sysAdmin) {
		//TODO Implement
	}
	
	private void handleRoomTypes(SysAdmin sysAdmin) {
		//TODO Implement
	}
	
	private void handleRoomAttributes(SysAdmin actor) {
		int input = -1;
		while (input != 0) {
			System.out.println("Room Attributes - What do you want to do?");
			System.out.println("1:\tAdd an attribute\n2:\tEdit or remove an attribute\nOr 0 to go back\n");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (Exception e) {
				System.out.println("Only digits 0-2 is allowed.");
				continue;
			}
			switch (input) {
			case 0:
				break;
			case 1:
				System.out.print("Please enter the name of the new attribute: ");
				String name = in.nextLine().trim();
				System.out.println("Please enter the description: ");
				String description = in.nextLine().trim();
				actor.addRoomAttribute(name, description);
				System.out.println("Room attribute added.");
				break;
			case 2:
				RoomAttribute ra = listAndChooseRoomAttribute(actor);
				if (ra != null) {
					editOrRemoveRoomAttribute(ra, actor);
				}
				break;
			default:
				System.out.println(input + " is not on the list.\n");
			}
		}
	}
	
	private RoomAttribute listAndChooseRoomAttribute(RoomAttributeHandling actor) {
		EList<RoomAttribute> list = actor.getAllRoomAttributes();
		if (list != null && !list.isEmpty()) {
			int input = -1;
			while (input != 0) {
				for (int i=0; i<list.size(); i++) {
					RoomAttribute ra = list.get(i);
					System.out.print(i+ ":\t");
					System.out.println("Name:\t\t" + ra.getName());
					System.out.println("\t\t" + (ra.getDescription().length()>60
							? ra.getDescription().substring(0, 60) + "..."
									: ra.getDescription()));
				}
				System.out.print("Select a room attribute or 0 to go back: ");
				try {
					input = Integer.parseInt(in.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("Wrong format! Only integer numbers are allowed!");
					continue;
				}
				if (input == 0) {
					break;
				}
				try {
					return list.get(input - 1);
				} catch (ArrayIndexOutOfBoundsException ex) {
					System.out.println("There are " + list.size()
								+ " choices, not '" + input + "'... Try again.");
				}
			}
		} else {
			System.out.println("No room attributes exists.");
		}
		return null;
	}

	private void editOrRemoveRoomAttribute(RoomAttribute ra, RoomAttributeHandling actor) {
		int input = -1;
		while (input != 0) {
			System.out.println("Name:\t" + ra.getName());
			System.out.println("ID:\t" + ra.getId());
			System.out.println("Description:\t" + ra.getDescription());
			System.out.println("1:\tEdit name\n2:\tEdit description\n3:\tRemove this attribute\nOr 0 to go back");
			try {
				input = Integer.parseInt(in.nextLine());
			} catch (Exception e) {
				System.out.println("Only digits 0-3 is allowed.");
				continue;
			}
			switch (input) {
			case 0:
				break;
			case 1:
				System.out.print("Please enter the new name: ");
				if (actor.editRoomAttribute(ra, in.nextLine().trim(), ra.getDescription())) {
					System.out.println("Name edited.");
				} else {
					System.out.println("Name change failed!");
				}
				break;
			case 2:
				System.out.print("Please enter the new description: ");
				if (actor.editRoomAttribute(ra, ra.getName(), in.nextLine().trim())) {
					System.out.println("Description edited.");
				} else {
					System.out.println("Description change failed!");
				}
				break;
			case 3:
				if (actor.removeRoomAttribute(ra)) {
					System.out.println("Room attribute successfully removed.");
					input = 0;
				} else {
					System.out.println("Failed to remove room attribute.");
				}
				break;
			default:
				System.out.println(input + " is not on the list.\n");
			}
		}
	}

	public static void main(String[] args) {
		new MainCLI();
	}
}
