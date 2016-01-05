package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import RootElement.HotelSystem;
import RootElement.Manager;
import RootElement.RoomType;
import RootElement.Room;
import RootElement.SysAdmin;
import RootElement.impl.HotelFactory;

public class RoomTest {

	private SysAdmin sysAdmin;
	private Manager manager;
	
	@Before
	public void setUp() throws Exception {
		HotelNullifier.resetSystem();
		HotelSystem hs = HotelFactory.createHotelSystem();
		sysAdmin = hs.getSystemAdministrator();
		manager = hs.getManager("Manager");
	}	
	
	@Test
	public void test(){
		testAddRoom(sysAdmin, "sysAdminAddingRoom");
		testAddRoom(manager, "managerAddingRoom");
		
		testRemoveRoom(sysAdmin, "sysAdminRemovingRoom");
		testRemoveRoom(manager, "managerRemovingRoom");
	}
	
	private void testAddRoom(SysAdmin actor, String roomName) {
		RoomType roomType = actor.addRoomType(roomName, 2, 10);
		actor.addRoom(roomType, roomName);
		
		boolean RoomFound = false;
		EList<Room> rooms = actor.findRoom(roomName);
		for(int i = 0; i < rooms.size(); i++) {
			if(rooms.get(i).getName().equals(roomName)){
				RoomFound = true;
			}
		}		
		assertTrue("Room couldn't be created", RoomFound);	
	}

	private void testRemoveRoom(SysAdmin actor, String roomName) {
		RoomType roomType = actor.addRoomType(roomName, 2, 10);
		Room room = actor.addRoom(roomType, roomName);
		actor.removeRoom(room);
		
		boolean RoomFound = false;
		EList<Room> rooms = actor.findRoom(roomName);
		for(int i = 0; i < rooms.size(); i++) {
			if(rooms.get(i).getName().equals(roomName)){
				RoomFound = true;
			}
		}
		assertFalse("Room couldn't be removed", RoomFound);		
	}

	
	
}
