package RootElement.impl;

import RootElement.Hotel;
import RootElement.HotelSystem;

/**
 * Factory to get access to the Hotel System.
 *
 * @author Patrik Haar
 */
public class HotelFactory {

	private static Hotel instance = null;
	
	private static Hotel getInstance() {
		if (instance == null) {
			instance = new HotelImpl();
		}
		return instance;
	}
	
	public static HotelSystem createHotelSystem() {
		return getInstance();
	}
}
