package RootElement.impl;

import RootElement.RoomAttributeHandling;
import RootElement.RoomFetcher;
import RootElement.RoomHandling;
import RootElement.RoomStructure;
import RootElement.RoomTypeHandling;

/**
 * Factory to make sure the same instance of RoomStructure is used.
 *
 * @author Patrik Haar
 * @revised Matz Larsson
 */
public class RoomSetupFactory {
	
	private static RoomStructure instance;

	private static RoomStructure getInstance() {
		if (instance == null) {
			instance = new RoomStructureImpl();
		}
		
		return instance;
	}
	
	public static RoomHandling createRoomHandling() {
		return getInstance();
	}
	
	public static RoomTypeHandling createRoomTypeHandling() {
		return getInstance();
	}
	
	public static RoomAttributeHandling createRoomAttributeHandling() {
		return getInstance();
	}
	
	public static RoomFetcher createRoomFetcher() {
		return getInstance();
	}
}
