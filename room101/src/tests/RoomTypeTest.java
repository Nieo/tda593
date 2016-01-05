package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import RootElement.HotelSystem;
import RootElement.Manager;
import RootElement.RoomType;
import RootElement.SysAdmin;
import RootElement.impl.HotelFactory;

/**
 * 
 * @author Johan Segerlund
 *
 */
public class RoomTypeTest {

	private SysAdmin sysAdmin;
	private Manager manager;
	
	@Before
	public void  setUp() throws Exception {
		HotelNullifier.resetSystem();
		HotelSystem hs = HotelFactory.createHotelSystem();
		sysAdmin = hs.getSystemAdministrator();
		manager = hs.getManager("Manager");
		
	}	

	@Test
	public void test(){
		testAddRoomtype(sysAdmin, "King");
		testAddRoomtype(manager, "Queen");
		
		testRemoveRoomtype(sysAdmin, "Single");
		testRemoveRoomtype(manager, "Double");
		
	}
	
	
	private void testAddRoomtype(SysAdmin actor, String roomTypeName){
		RoomType singleRoom = actor.addRoomType(roomTypeName, 1, 3);
		boolean RoomtypeFound = false;
		EList<RoomType> roomTypes = actor.findRoomType(roomTypeName);
		for(int i = 0; i < roomTypes.size(); i++) {
			if(roomTypes.get(i).getName().equals(roomTypeName)){
				RoomtypeFound = true;
			}
		}		
		assertTrue("Roomtype couldn't be created", RoomtypeFound);
		
	}
	
	
	private void testRemoveRoomtype(SysAdmin actor, String roomTypeName) {
		RoomType doubleRoom = actor.addRoomType(roomTypeName, 2, 3);
		actor.removeRoomType(doubleRoom);
		
		boolean RoomtypeFound = false;
		EList<RoomType> roomTypes = actor.findRoomType(roomTypeName);
		for(int i = 0; i < roomTypes.size(); i++) {
			if(roomTypes.get(i).getName().equals(roomTypeName)){
				RoomtypeFound = true;
			}
		}
		assertFalse("Roomtype couldn't be removed", RoomtypeFound);		
	}


}
