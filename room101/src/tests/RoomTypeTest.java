package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import RootElement.HotelSystem;
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
	
	@Before
	public void  setUp() throws Exception {
		HotelNullifier.resetSystem();
		HotelSystem hs = HotelFactory.createHotelSystem();
		sysAdmin = hs.getSystemAdministrator();
		
	}	

	
	@Test
	public void testAddRoomtype(){
		RoomType singleRoom = sysAdmin.addRoomType("Single", 1, 3);
		boolean RoomtypeFound = false;
		EList<RoomType> roomTypes = sysAdmin.findRoomType("Single");
		for(int i = 0; i < roomTypes.size(); i++) {
			if(roomTypes.get(i).getName().equals("Single")){
				RoomtypeFound = true;
			}
		}		
		assertTrue("Roomtype couldn't be created", RoomtypeFound);
		
	}
	
	@Test
	public void testRemoveRoomtype() {
		RoomType doubleRoom = sysAdmin.addRoomType("Double", 2, 3);
		sysAdmin.removeRoomType(doubleRoom);
		
		boolean RoomtypeFound = false;
		EList<RoomType> roomTypes = sysAdmin.findRoomType("Double");
		for(int i = 0; i < roomTypes.size(); i++) {
			if(roomTypes.get(i).getName().equals("Double")){
				RoomtypeFound = true;
			}
		}
		assertFalse("Roomtype couldn't be removed", RoomtypeFound);		
	}


}
