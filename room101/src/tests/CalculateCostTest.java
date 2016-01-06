package tests;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import RootElement.Booking;
import RootElement.Manager;
import RootElement.RoomType;
import RootElement.impl.HotelFactory;

/**
 * Tests the calculate cost of a booking,
 * includes several roombookings over a different amount of days
 * and different service items.
 *
 * @author Patrik Haar
 */
public class CalculateCostTest {

	@Before
	public void setUp() throws Exception {
		HotelNullifier.resetSystem();
	}

	@Test
	public void testCalculateCost() {
		Manager manager = HotelFactory.createHotelSystem().getManager("1");
		RoomType room = manager.addRoomType("Type1", 4, 500);
		manager.addRoom(room, "Room1");
		manager.addRoom(room, "Room2");
		Booking booking = manager.createBooking();
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.DATE, 5);
		manager.addRoom(booking, room, 1, 0, Date.from(cal1.toInstant()), Date.from(cal2.toInstant()));
		assertEquals(2500, booking.calculateCost());
		cal1.add(Calendar.DATE, 2);
		manager.addRoom(booking, room, 1, 0, Date.from(cal1.toInstant()), Date.from(cal2.toInstant()));
		assertEquals(4000, booking.calculateCost());
		manager.confirmBooking(booking, "asdf", "123412341", "asdf@qwer.ty", "SE", -1, null);
		manager.addServiceItem(booking, "Roomservice", "Pizza and wine", 300);
		assertEquals(4300, booking.calculateCost());
		manager.addServiceItem(booking, "Damages", "Broke the toilet", 1200);
		assertEquals(5500, booking.calculateCost());
	}

}
