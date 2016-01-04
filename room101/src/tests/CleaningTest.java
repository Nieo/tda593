package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

import RootElement.Booking;
import RootElement.Clerk;
import RootElement.HotelSystem;
import RootElement.Manager;
import RootElement.Room;
import RootElement.RoomType;
import RootElement.Staff;
import RootElement.SysAdmin;
import RootElement.impl.HotelFactory;
/**
 * This test checks if the manager,staff and clerks can use 
 * the following methods successfully:
 * checkIfRoomCleaned
 * getListOfUncleanRooms
 * markRoomAsCleaned
 * @author David
 *
 */
public class CleaningTest {
	SysAdmin sysAdmin; 
	Manager manager;
	Staff staff;
	Clerk clerk;
	Booking booking;
	@Before
	public void setUp() throws Exception {
		HotelSystem hs = HotelFactory.createHotelSystem();
		sysAdmin = hs.getSystemAdministrator();
		manager = hs.getManager("Manager");
		staff = hs.getStaff("Staff");
		clerk = hs.getClerk("Clerk");

	}
	@Test
	public void test(){
		testCheckRoomCleaned();
		testGetListOfUncleanRoom();
		testMarkRoomAsCleaned();
	}
	private void testCheckRoomCleaned(){
		RoomType roomType = sysAdmin.addRoomType("Queen", 10);
		Room room = sysAdmin.addRoom(roomType, "Under Pressure");
		room.setNeedCleaning(false);
		try{
		assertTrue(manager.checkIfRoomCleaned("Under Pressure"));
		assertTrue(staff.checkIfRoomCleaned("Under Pressure"));
		assertTrue(clerk.checkIfRoomCleaned("Under Pressure"));
		}catch(NoSuchElementException e){
			 fail("Exception thrown");
		}
		try{
		manager.checkIfRoomCleaned("Room 237");
		fail("Exception not thrown");
		}catch(NoSuchElementException e){
			
		}
		try{
			clerk.checkIfRoomCleaned("Room 237");
			fail("Exception not thrown");
		}catch(NoSuchElementException e){
		
		}
		try{
			staff.checkIfRoomCleaned("Room 237");
			fail("Exception not thrown");
		}catch(NoSuchElementException e){
		
		}
		room.setNeedCleaning(true);
		try{
			assertFalse(manager.checkIfRoomCleaned("Under Pressure"));
			assertFalse(staff.checkIfRoomCleaned("Under Pressure"));
			assertFalse(clerk.checkIfRoomCleaned("Under Pressure"));
			}catch(NoSuchElementException e){
				 fail("Exception thrown");
			}
		sysAdmin.removeRoom(room);
		sysAdmin.removeRoomType(roomType);
	}
	private void testGetListOfUncleanRoom(){
		RoomType roomType = sysAdmin.addRoomType("Queen", 10);
		Room room = sysAdmin.addRoom(roomType, "Under Pressure");
		Room room2 = sysAdmin.addRoom(roomType, "Dont stop me now");
		
		room.setNeedCleaning(false);
		room2.setNeedCleaning(false);
		
		List<Room> rooms = manager.getListOfUncleanRooms();
		assertTrue(rooms.size() == 0);
		room.setNeedCleaning(true);
		rooms = manager.getListOfUncleanRooms();
		assertTrue(rooms.size() == 1);
		room2.setNeedCleaning(true);
		rooms = manager.getListOfUncleanRooms();
		assertTrue(rooms.size() == 2);
		room.setNeedCleaning(false);
		rooms = manager.getListOfUncleanRooms();
		assertTrue(rooms.size() == 1);
		
		room.setNeedCleaning(false);
		room2.setNeedCleaning(false);
		
		rooms = clerk.getListOfUncleanRooms();
		assertTrue(rooms.size() == 0);
		room.setNeedCleaning(true);
		rooms = clerk.getListOfUncleanRooms();
		assertTrue(rooms.size() == 1);
		room2.setNeedCleaning(true);
		rooms = clerk.getListOfUncleanRooms();
		assertTrue(rooms.size() == 2);
		room.setNeedCleaning(false);
		rooms = clerk.getListOfUncleanRooms();
		assertTrue(rooms.size() == 1);
		
		room.setNeedCleaning(false);
		room2.setNeedCleaning(false);
		
		rooms = staff.getListOfUncleanRooms();
		assertTrue(rooms.size() == 0);
		room.setNeedCleaning(true);
		rooms = staff.getListOfUncleanRooms();
		assertTrue(rooms.size() == 1);
		room2.setNeedCleaning(true);
		rooms = staff.getListOfUncleanRooms();
		assertTrue(rooms.size() == 2);
		room.setNeedCleaning(false);
		rooms = staff.getListOfUncleanRooms();
		assertTrue(rooms.size() == 1);
		
		sysAdmin.removeRoom(room);
		sysAdmin.removeRoom(room2);
		sysAdmin.removeRoomType(roomType);
	}
	private void testMarkRoomAsCleaned(){
		RoomType roomType = sysAdmin.addRoomType("Queen", 10);
		Room room = sysAdmin.addRoom(roomType, "Under Pressure");
		
		room.setNeedCleaning(false);
		manager.markRoomAsCleaned(room);
		assertFalse(room.isNeedCleaning());
		
		room.setNeedCleaning(true);
		assertTrue(room.isNeedCleaning());
		manager.markRoomAsCleaned(room);
		assertFalse(room.isNeedCleaning());
		
		room.setNeedCleaning(false);
		staff.markRoomAsCleaned(room);
		assertFalse(room.isNeedCleaning());
		
		room.setNeedCleaning(true);
		assertTrue(room.isNeedCleaning());
		staff.markRoomAsCleaned(room);
		assertFalse(room.isNeedCleaning());
		
		room.setNeedCleaning(true);
		assertTrue(room.isNeedCleaning());
		staff.markRoomAsCleaned(room);
		assertFalse(room.isNeedCleaning());
		
		room.setNeedCleaning(false);
		clerk.markRoomAsCleaned(room);
		assertFalse(room.isNeedCleaning());
		
		sysAdmin.removeRoom(room);
		sysAdmin.removeRoomType(roomType);		
	}

}
