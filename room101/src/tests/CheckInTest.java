package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import RootElement.Booking;
import RootElement.BookingHandler;
import RootElement.Clerk;
import RootElement.Room;
import RootElement.RoomStructure;
import RootElement.RoomType;
import RootElement.impl.BookingHandlerFactory;
import RootElement.impl.HotelFactory;
import RootElement.impl.RoomSetupFactory;

public class CheckInTest {

	private Room[] rooms;
	private RoomType[] types;
	
	@Before
	public void setUp() throws Exception {
		HotelNullifier.resetSystem();
		RoomStructure rs = (RoomStructure)RoomSetupFactory.createRoomHandling();
		rooms = new Room[2];
		types = new RoomType[2];
		
		types[0] = rs.addRoomType("Type1", 2, 500);
		rooms[0] = rs.addRoom(types[0], "Room1");
		types[1] = rs.addRoomType("Type2", 2, 500);
		rooms[1] = rs.addRoom(types[1], "Room2");
	}

	@Test
	public void testCheckIn() {
		testCheckIn(HotelFactory.createHotelSystem().getClerk("1"), 0);
		testCheckIn(HotelFactory.createHotelSystem().getManager("1"), 1);
	}
	
	@Test
	public void testCheckOut() {
		testCheckOut(HotelFactory.createHotelSystem().getClerk("1"), 0);
		testCheckOut(HotelFactory.createHotelSystem().getManager("1"), 1);
	}
	
	private void testCheckIn(Clerk actor, int index) {
		BookingHandler bh = (BookingHandler)BookingHandlerFactory.createReceptionHandling();
		assertEquals(2, bh.getRoomFetcher().getBookableRooms().size());
		Booking booking = bh.createBooking();
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.DATE, 3);
		assertTrue("Failed to add a valid booking", bh.addRoom(booking, types[index], 1, 0, Date.from(cal1.toInstant()), Date.from(cal2.toInstant()))); //Today and 3 days ahead
		cal1.add(Calendar.DATE, 4);
		cal2.add(Calendar.DATE, 4);
		assertTrue("Failed to add a valid booking", bh.addRoom(booking, types[index], 1, 0, Date.from(cal1.toInstant()), Date.from(cal2.toInstant()))); //4 days ahead and 7 days ahead
		assertFalse("Room is occupied when it shouldn't be", rooms[index].isOccupied());
		assertFalse("Room is dirty when it shouldn't be", rooms[index].isNeedCleaning());
		assertTrue("Failed to confirm booking", bh.confirmBooking(booking, "Foo"+index, "1234567890", index+"asdf@qwer.ty", "SE", -1, null));
		
		Room givenRoom = null;
		try {
			givenRoom = actor.checkIn(booking.getRoombooking().get(1));
		} catch (IllegalArgumentException ex) {}
		assertTrue("Checked in on a booking 4 days ahead", givenRoom == null);
		assertFalse("Room became occupied when it shouldn't", rooms[index].isOccupied());
		try {
			givenRoom = actor.checkIn(booking.getRoombooking().get(0));
		} catch (IllegalArgumentException ex) {}
		assertTrue("Failed to check in on the correct day", givenRoom != null);
		assertTrue("Wrong room was checked in", rooms[index] == givenRoom);
		assertTrue("Room wasn't marked as occupied", rooms[index].isOccupied());
		givenRoom = null;
		try {
			givenRoom = actor.checkIn(booking.getRoombooking().get(0));
		} catch (IllegalArgumentException ex) {}
		assertTrue("Succeded in checking in the same booking twice", givenRoom == null);
	}
	
	private void testCheckOut(Clerk actor, int index) {
		assertTrue("Not implemented", false);
	}
}
