package build;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

import RootElement.Booking;
import RootElement.Guest;
import RootElement.HotelSystem;
import RootElement.Manager;
import RootElement.RoomType;

public class HotelSystemInitiator {

	private static Manager manager;
	private static Guest guest;
	private static Booking booking;
	private static boolean hasActiveBooking;
	
	/**
	 * Initiates the whole system with all pre-set data.
	 * @param hotel The hotel system to use.
	 */
	public static void init(HotelSystem hotel) {
		manager = hotel.getManager("1");
		guest = hotel.getGuest();
		parseFile("RoomAttributes");
		parseFile("RoomTypes");
		parseFile("Rooms");
		parseFile("Booking");
		parseFile("Feedback");
		parseFile("SupportTickets");
	}
	
	/**
	 * Initiates the system with all pre-set room attributes,
	 * room types and rooms.
	 * @param hotel The hotel system to use.
	 */
	public static void initRooms(HotelSystem hotel) {
		manager = hotel.getManager("1");
		parseFile("RoomAttributes");
		parseFile("RoomTypes");
		parseFile("Rooms");
	}
	
	/**
	 * Initiates the system with all pre-set room attributes and room types.
	 * @param hotel The hotel system to use.
	 */
	public static void initRoomTypes(HotelSystem hotel) {
		manager = hotel.getManager("1");
		parseFile("RoomAttributes");
		parseFile("RoomTypes");
	}
	
	/**
	 * Initiates the system with all pre-set room attributes.
	 * @param hotel The hotel system to use.
	 */
	public static void initRoomAttributes(HotelSystem hotel) {
		manager = hotel.getManager("1");
		parseFile("RoomAttributes");
	}
	
	/**
	 * Initiates the system with all the structure specified in the file.
	 * Note that the document must add the following things in this order:
	 * 1 Room attributes
	 * 2 Room types
	 * 3 Rooms
	 * 3 Bookings
	 * Other things are not affected by the order.
	 * @param hotel The hotel system to use.
	 * @param nameOfFile The name of the file to be read.
	 */
	public static void initOwnFile(HotelSystem hotel, String nameOfFile) {
		manager = hotel.getManager("1");
		guest = hotel.getGuest();
		parseFile(nameOfFile);
	}
	
	private static void parseFile(String nameOfFile) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("data/" + nameOfFile + ".txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(sc.hasNextLine()){
			String s = sc.nextLine();
			if(!s.startsWith("#") && !s.trim().isEmpty()){		//Use # for comments
				parseLine(s);
			}
		}
		sc.close();
	}
	
	private static void parseLine(String line) {
		String[] input = line.split("\\s*\\$\\s*");
		switch (input[0].toLowerCase()) {
		case "addroom": 
			addRoom(input[1], input[2]);
			break;
		case "addroomtype": 
			addRoomType(input[1], input[2], (input.length>3?Arrays.copyOfRange(input, 3, input.length):null));
			break;
		case "addroomattribute": 
			addRoomAttribute(input[1], input[2]);
			break;
		case "addfeedback": 
			addFeedback(input[1], input[2]);
			break;
		case "addsupportticket": 
			addSupportTicket(input[1], input[2]);
			break;
		case "newbooking":
			if (!hasActiveBooking) {
				newBooking();
			} else {
				throw new IllegalStateException("A booking is allready active and have not been closed properly");
			}
			break;
		case "addroomtobooking":
			if (hasActiveBooking) {
				addRoomBooking(input[1], input[2], input[3], input[4], input[5]);
			} else {
				throw new IllegalStateException("No booking is active");
			}
			break;
		case "confirmbooking":
			if (hasActiveBooking) {
				confirmBooking(input[1], input[2], input[3], input[4], input[5], input[6]);
			} else {
				throw new IllegalStateException("No booking is active");
			}
			break;
		}
	} 
	
	private static void addRoom(String name, String roomType) {
		manager.addRoom(manager.findRoomType(roomType).get(0), name);
	}
	
	private static void addRoomType(String name, String price, String... attributes) {
		RoomType type = manager.addRoomType(name, Integer.parseInt(price));
		if (attributes != null) {
			for (String att : attributes) {
				type.addRoomAttribute(manager.findRoomAttribute(att).get(0));
			}			
		}
	}

	private static void addRoomAttribute(String name, String description) {
		manager.addRoomAttribute(name, description);
	}
	
	private static void addFeedback(String feedback, String rating) {
		guest.giveFeedback(feedback, Integer.parseInt(rating));
	}
	
	private static void addSupportTicket(String roomName, String description) {
		manager.newSupportTicket(roomName, description);
	}
	
	private static void newBooking() {
		booking = manager.createBooking();
		hasActiveBooking = true;
	}
	
	private static void addRoomBooking(String roomType, String startDate, String endDate, String nbrOfAdults, String nbrOfChildren) {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			if (!manager.addRoom(booking, manager.findRoomType(roomType).get(0), Integer.parseInt(nbrOfAdults)
					, Integer.parseInt(nbrOfChildren), format.parse(startDate), format.parse(endDate))) {
				throw new IllegalStateException("Failed to add room booking");
			}
		} catch (NumberFormatException | ParseException e) {
			e.printStackTrace();
		}
	}
	
	private static void confirmBooking(String name, String phone, String mail, String nationality, String passportNr, String nextDestination) {
		if (!manager.confirmBooking(booking, name, phone, mail, nationality, Integer.parseInt(passportNr), nextDestination)) {
			throw new IllegalStateException("Failed to confirm booking");
		}
		hasActiveBooking = false;
	}
}
