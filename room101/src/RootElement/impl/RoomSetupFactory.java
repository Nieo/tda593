package RootElement.impl;

import java.util.HashMap;
import java.util.Map;

import RootElement.RoomAttributeHandling;
import RootElement.RoomFetcher;
import RootElement.RoomHandling;
import RootElement.RoomStructure;
import RootElement.RoomTypeHandling;

/**
 * Factory to make sure the same instance of RoomStructure is used.
 * Contains support for keeping track of multiple hotels at the same time.
 *
 * @author Patrik Haar
 * @revised Matz Larsson
 */
public class RoomSetupFactory {
	
	/**
	 * The default hotel name unless one is provided
	 * @generated NOT
	 */
	public static final String DEFAULT_HOTELNAME = "Hotel Chalmers";
	
	private static Map<String, RoomStructure> instance = new HashMap<String, RoomStructure>();

	private static RoomStructure getInstance(String hotelName) {
		if (!instance.containsKey(hotelName)) {
			RoomStructure rs = new RoomStructureImpl();
			instance.put(hotelName, rs);
			return rs;
		}else{
			return instance.get(hotelName);
		}
	}
	
	public static RoomHandling createRoomHandling(String hotelName) {
		return getInstance(hotelName);
	}
	
	public static RoomTypeHandling createRoomTypeHandling(String hotelName) {
		return getInstance(hotelName);
	}
	
	public static RoomAttributeHandling createRoomAttributeHandling(String hotelName) {
		return getInstance(hotelName);
	}
	
	public static RoomFetcher createRoomFetcher(String hotelName) {
		return getInstance(hotelName);
	}
}
