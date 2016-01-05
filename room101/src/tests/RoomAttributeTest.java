package tests;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import RootElement.HotelSystem;
import RootElement.RoomAttribute;
import RootElement.RoomType;
import RootElement.SysAdmin;
import RootElement.impl.HotelFactory;

/**
 * 
 * @author Johan Segerlund
 *
 */
public class RoomAttributeTest {

	private SysAdmin sysAdmin;
	
	@Before
	public void  setUp() throws Exception {
		HotelSystem hs = HotelFactory.createHotelSystem();
		sysAdmin = hs.getSystemAdministrator();
		
	}	

	
	@Test
	public void testAddRoomAttribute(){
		RoomAttribute attribute = sysAdmin.addRoomAttribute("addedAttribute", "descrition");
		boolean roomAttributeFound = false;
		EList<RoomAttribute> roomAttributes = sysAdmin.findRoomAttribute("addedAttribute");
		for(int i = 0; i < roomAttributes.size(); i++) {
			if(roomAttributes.get(i).getId() == attribute.getId()){
				roomAttributeFound = true;
			}
		}
		assertTrue("Attribute couldn't not be created.", roomAttributeFound);
	}
	
	@Test
	public void testRemoveRoomAttribute() {
		RoomAttribute attribute = sysAdmin.addRoomAttribute("removeAttribute", "description");
		sysAdmin.removeRoomAttribute(attribute);
		
		EList<RoomAttribute> roomAttributes = sysAdmin.findRoomAttribute("removeAttribute");

		
		boolean roomAttributeFound = false;
		for(int i = 0; i < roomAttributes.size(); i++) {
			if(roomAttributes.get(i).getId() == attribute.getId()){
				roomAttributeFound = true;
			}
		}
		assertFalse("Attribute couldn't be removed.", roomAttributeFound);
		
	}
		
	@Test
	public void testRemoveAttributeWhileAttachedToRoomtype() {
		RoomAttribute pool = sysAdmin.addRoomAttribute("Pool", "This suite has a pool");
		RoomType king = sysAdmin.addRoomType("King", 5, 10);
		sysAdmin.addAttributeToRoomType(king, pool);		
		assertFalse("Room attribute could be removed even if it was attached to a roomtype",sysAdmin.removeRoomAttribute(pool));		
	}
	

}
