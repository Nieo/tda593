package tests;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import RootElement.Booking;
import RootElement.HotelSystem;
import RootElement.MakeBooking;
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
		//Test clerk
		doTest(hs.getClerk("AwesomeClerk"));
		//Test guest
		doTest(hs.getGuest());
	}
	
	private void doTest(MakeBooking actor){
		Booking booking = actor.createBooking();
		Booking booking2 = actor.createBooking();
		int foundRoomsOtherDate = actor.getAvailableRooms(date2, date3, 1, 0).size();
		int foundRooms = 0;
		for(RoomType rt : actor.getAvailableRooms(date1, date2, 1, 0)){
			assert(actor.addRoom(booking, rt, 1, 0, date1, date2));
			assert(actor.addRoom(booking2, rt, 1, 0, date1, date2));
			foundRooms++;
		}
		assert(actor.confirmBooking(booking, "Nano", "000-000000", "mail@me.se", "Sweden", -1, null));
		assert(!actor.confirmBooking(booking2, "Nano", "000-000000", "mail@me.se", "Sweden", -1, null));
		assert(!actor.confirmBooking(booking, "Nano", "000-000000", "mail@me.se", "Sweden", -1, null));
		assert(actor.getAvailableRooms(date1, date2, 1, 0).size() == 0);
		assert(actor.getAvailableRooms(date2, date3, 1, 0).size() == foundRoomsOtherDate);
		assert(actor.cancelBooking(booking));
		assert(actor.getAvailableRooms(date1, date2, 1, 0).size() == foundRooms);
		
		//Check passportNumber & nextDestination is required
		Booking booking3 = actor.createBooking();
		for(RoomType rt : actor.getAvailableRooms(date1, date2, 1, 0)){
			assert(actor.addRoom(booking3, rt, 1, 0, date1, date2));
			foundRooms++;
		}
		assert(!actor.confirmBooking(booking, "Nano", "000-000000", "mail@me.se", "France", -1, null));
		actor.cancelBooking(booking3);
		
		//Check no multiple uses of one and the same room
		Booking booking4 = actor.createBooking();
		EList<RoomType> availableRooms = actor.getAvailableRooms(date1, date2, 1, 0);
		assert(availableRooms.size()>0);
		RoomType rt = availableRooms.get(0);
		for(int i = 0; i<availableRooms.size()+1; i++){
			actor.addRoom(booking4, rt, 1, 0, date1, date2);
		}
		assert(!actor.confirmBooking(booking, "Nano", "000-000000", "mail@me.se", "Sweden", -1, null));
	}	
}
