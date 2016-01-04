package build;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import RootElement.HotelSystem;
import RootElement.Manager;
import RootElement.RoomType;

public class HotelSystemInitiator {

	private static Manager actor;
	
	/**
	 * Initiates the whole system with all pre-set data.
	 * @param hotel The hotel system to use.
	 */
	public static void init(HotelSystem hotel) {
		actor = hotel.getManager("1");
		parseFile("RoomAttributes");
		parseFile("RoomTypes");
		parseFile("Rooms");
	}
	
	/**
	 * Initiates the system with all pre-set room attributes,
	 * room types and rooms.
	 * @param hotel The hotel system to use.
	 */
	public static void initRooms(HotelSystem hotel) {
		actor = hotel.getManager("1");
		parseFile("RoomAttributes");
		parseFile("RoomTypes");
		parseFile("Rooms");
	}
	
	/**
	 * Initiates the system with all pre-set room attributes and room types.
	 * @param hotel The hotel system to use.
	 */
	public static void initRoomTypes(HotelSystem hotel) {
		actor = hotel.getManager("1");
		parseFile("RoomAttributes");
		parseFile("RoomTypes");
	}
	
	/**
	 * Initiates the system with all pre-set room attributes.
	 * @param hotel The hotel system to use.
	 */
	public static void initRoomAttributes(HotelSystem hotel) {
		actor = hotel.getManager("1");
		parseFile("RoomAttributes");
	}
	
	/**
	 * Initiates the system with all the structure specified in the file.
	 * Note that the document must add things in this order:
	 * 1 Room attributes
	 * 2 Room types
	 * 3 Rooms
	 * @param hotel The hotel system to use.
	 * @param nameOfFile The name of the file to be read.
	 */
	public static void initOwnFile(HotelSystem hotel, String nameOfFile) {
		actor = hotel.getManager("1");
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
		}
	} 
	
	private static void addRoom(String name, String roomType) {
		actor.addRoom(actor.findRoomType(roomType).get(0), name);
	}
	
	private static void addRoomType(String name, String price, String... attributes) {
		RoomType type = actor.addRoomType(name, Integer.parseInt(price));
		if (attributes != null) {
			for (String att : attributes) {
				type.addRoomAttribute(actor.findRoomAttribute(att).get(0));
			}			
		}
	}

	private static void addRoomAttribute(String name, String description) {
		actor.addRoomAttribute(name, description);
	}
}
