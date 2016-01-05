package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import RootElement.Booking;
import RootElement.HotelSystem;
import RootElement.MakeBooking;
import RootElement.RoomType;
import RootElement.impl.HotelFactory;
import build.HotelSystemInitiator;

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
		HotelSystemInitiator.initOwnFile(hs, "nanos");
		//Test clerk
		doTest(hs, hs.getClerk("AwesomeClerk"));
		//Test guest
		doTest(hs, hs.getGuest());
	}
	
	private void doTest(HotelSystem hs, MakeBooking actor){
		Booking booking = actor.createBooking();
		Booking booking2 = actor.createBooking();
		int foundRoomsOtherDate = actor.getAvailableRooms(date2, date3, 1, 0).size();
		int foundRooms = 0;
		for(RoomType rt : actor.getAvailableRooms(date1, date2, 1, 0)){
			assertTrue(actor.addRoom(booking, rt, 1, 0, date1, date2));
			assertTrue(actor.addRoom(booking2, rt, 1, 0, date1, date2));
			foundRooms++;
		}
		
		assertNotEquals(0, foundRooms);
		System.out.println(foundRooms);
		assertTrue(actor.confirmBooking(booking, "Nano", "000-000000", "mail@me.se", hs.getNationality(), -1, null));
		assertEquals(0, actor.getAvailableRooms(date1, date2, 1, 0).size());
		assertTrue(!actor.confirmBooking(booking2, "Nano", "000-000000", "mail@me.se", hs.getNationality(), -1, null));
		assertTrue(!actor.confirmBooking(booking, "Nano", "000-000000", "mail@me.se", hs.getNationality(), -1, null));
		assertEquals(0, actor.getAvailableRooms(date1, date2, 1, 0).size());
		assertEquals(foundRoomsOtherDate, actor.getAvailableRooms(date2, date3, 1, 0).size());
		assertTrue(actor.cancelBooking(booking));
		assertEquals(foundRooms, actor.getAvailableRooms(date1, date2, 1, 0).size());
		
		//Check passportNumber & nextDestination is required
		Booking booking3 = actor.createBooking();
		for(RoomType rt : actor.getAvailableRooms(date1, date2, 1, 0)){
			assertTrue(actor.addRoom(booking3, rt, 1, 0, date1, date2));
			foundRooms++;
		}
		assertTrue(!actor.confirmBooking(booking, "Nano", "000-000000", "mail@me.se", "FR", -1, null));
		actor.cancelBooking(booking3);
		
		//Check no multiple uses of one and the same room
		Booking booking4 = actor.createBooking();
		EList<RoomType> availableRooms = actor.getAvailableRooms(date1, date2, 1, 0);
		assertTrue(availableRooms.size()>0);
		RoomType rt = availableRooms.get(0);
		int rtCount = 0;
		for(RoomType roomType : availableRooms){
			if(roomType == rt){
				rtCount++;
			}
		}
		
		for(int i = 0; i<rtCount+1; i++){
			assertTrue(actor.addRoom(booking4, rt, 1, 0, date1, date2) == (i<rtCount));
		}
		assertTrue(!actor.confirmBooking(booking, "Nano", "000-000000", "mail@me.se", hs.getNationality(), -1, null));
	}	
}
