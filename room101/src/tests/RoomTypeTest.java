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
		HotelSystem hs = HotelFactory.createHotelSystem();
		sysAdmin = hs.getSystemAdministrator();
		manager = hs.getManager("Manager");
		
	}	

	@Test
	public void test(){
		testAddRoomtype(sysAdmin);
		testAddRoomtype(manager);
		
		testRemoveRoomtype(sysAdmin);
		testRemoveRoomtype(manager);
		
	}
	
	@Test
	public void testAddRoomtype(SysAdmin actor){
		RoomType singleRoom = actor.addRoomType("Single", 1, 3);
		boolean RoomtypeFound = false;
		EList<RoomType> roomTypes = actor.findRoomType("Single");
		for(int i = 0; i < roomTypes.size(); i++) {
			if(roomTypes.get(i).getName().equals("Single")){
				RoomtypeFound = true;
			}
		}		
		assertTrue("Roomtype couldn't be created", RoomtypeFound);
		
	}
	
	@Test
	public void testRemoveRoomtype(SysAdmin actor) {
		RoomType doubleRoom = actor.addRoomType("Double", 2, 3);
		actor.removeRoomType(doubleRoom);
		
		boolean RoomtypeFound = false;
		EList<RoomType> roomTypes = actor.findRoomType("Double");
		for(int i = 0; i < roomTypes.size(); i++) {
			if(roomTypes.get(i).getName().equals("Double")){
				RoomtypeFound = true;
			}
		}
		assertFalse("Roomtype couldn't be removed", RoomtypeFound);		
	}


}
