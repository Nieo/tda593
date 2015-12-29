package tests;

import java.util.Date;

import org.junit.Test;

import RootElement.Booking;
import RootElement.Clerk;
import RootElement.Guest;
import RootElement.HotelSystem;
import RootElement.RoomType;
import RootElement.impl.HotelFactory;

public class BookingTest {
	
	@SuppressWarnings("deprecation")
	private Date date1 = new Date(2016, 01, 10);
	@SuppressWarnings("deprecation")
	private Date date2 = new Date(2016, 01, 11);
	@SuppressWarnings("deprecation")
	private Date date3 = new Date(2016, 01, 12);

	/**
	 * This test checks the following:
	 *  - Ability of creating a booking
	 *  - Ability of getting all available rooms for a time period
	 *  - Ability of adding these found rooms to the booking
	 *  - Ability of confirming the booking without errors.
	 *  - Ability of cancelling the booking and therefore making the rooms available
	 * It also confirms that no side effects shows on the following:
	 *  - The same room search on another date
	 *  - No other person can find these booked rooms
	 *  - Two people that searches for rooms at the same time cannot "double book" rooms
	 *  - The same booking cannot be confirmed twice.
	 */
	@Test
	public void testBooking(){
		HotelSystem hs = HotelFactory.createHotelSystem();
		checkForClerk(hs);
		checkForGuest(hs);
	}
	
	private void checkForClerk(HotelSystem hs){
		Clerk clerk = hs.getClerk("AwesomeClerk");
		Booking booking = clerk.createBooking();
		Booking booking2 = clerk.createBooking();
		int foundRoomsOtherDate = clerk.getAvailableRooms(date2, date3, 1, 0).size();
		int foundRooms = 0;
		for(RoomType rt : clerk.getAvailableRooms(date1, date2, 1, 0)){
			assert(clerk.addRoom(booking, rt, 1, 0));
			assert(clerk.addRoom(booking2, rt, 1, 0));
			foundRooms++;
		}
		assert(clerk.confirmBooking(booking, "Nano", "000-000000", "mail@me.se", "Sweden", -1, null));
		assert(!clerk.confirmBooking(booking2, "Nano", "000-000000", "mail@me.se", "Sweden", -1, null));
		assert(!clerk.confirmBooking(booking, "Nano", "000-000000", "mail@me.se", "Sweden", -1, null));
		assert(clerk.getAvailableRooms(date1, date2, 1, 0).size() == 0);
		assert(clerk.getAvailableRooms(date2, date3, 1, 0).size() == foundRoomsOtherDate);
		assert(clerk.cancelBooking(booking));
		assert(clerk.getAvailableRooms(date1, date2, 1, 0).size() == foundRooms);
	}
	
	private void checkForGuest(HotelSystem hs){
		Guest guest = hs.getGuest();
		Booking booking = guest.createBooking();
		Booking booking2 = guest.createBooking();
		int foundRoomsOtherDate = guest.getAvailableRooms(date2, date3, 1, 0).size();
		int foundRooms = 0;
		for(RoomType rt : guest.getAvailableRooms(date1, date2, 1, 0)){
			assert(guest.addRoom(booking, rt, 1, 0));
			assert(guest.addRoom(booking2, rt, 1, 0));
			foundRooms++;
		}
		assert(guest.confirmBooking(booking, "Nano", "000-000000", "mail@me.se", "Sweden", -1, null));
		assert(!guest.confirmBooking(booking2, "Nano", "000-000000", "mail@me.se", "Sweden", -1, null));
		assert(!guest.confirmBooking(booking, "Nano", "000-000000", "mail@me.se", "Sweden", -1, null));
		assert(guest.getAvailableRooms(date1, date2, 1, 0).size() == 0);
		assert(guest.getAvailableRooms(date2, date3, 1, 0).size() == foundRoomsOtherDate);
		assert(guest.cancelBooking(booking));
		assert(guest.getAvailableRooms(date1, date2, 1, 0).size() == foundRooms);
	}
	
}
