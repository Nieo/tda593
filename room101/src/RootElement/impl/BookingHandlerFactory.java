package RootElement.impl;

import RootElement.BookingHandler;
import RootElement.MakeBooking;
import RootElement.ReceptionHandling;
import RootElement.ServiceItemHandling;

/**
 * Factory to make sure the same instance of BookingHandler is used.
 *
 * @author Patrik Haar
 */
public class BookingHandlerFactory {

	private static BookingHandler instance = null;
	
	private static BookingHandler getInstance() {
		if (instance == null) {
			instance = new BookingHandlerImpl();
		}
		return instance;
	}
	
	public static ReceptionHandling createReceptionHandling() {
		return getInstance();
	}
	
	public static MakeBooking createMakeBooking() {
		return getInstance();
	}
	
	public static ServiceItemHandling createSerciveItemHandling() {
		return getInstance();
	}
}
