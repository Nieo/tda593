package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import RootElement.HotelSystem;
import RootElement.Manager;
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
	private Manager manager;
	@Before
	public void  setUp() throws Exception {
		HotelNullifier.resetSystem();
		HotelSystem hs = HotelFactory.createHotelSystem();
		sysAdmin = hs.getSystemAdministrator();
		manager = hs.getManager("Manager");
		
		
	}	

	@Test 
	public void test() {
		testAddRoomAttribute(sysAdmin);
		testAddRoomAttribute(manager);
		
		testRemoveRoomAttribute(sysAdmin);
		testRemoveRoomAttribute(manager);
		
		testRemoveAttributeWhileAttachedToRoomtype(sysAdmin);
		testRemoveAttributeWhileAttachedToRoomtype(manager);
		
	}
	
	
	private void testAddRoomAttribute(SysAdmin actor){
		RoomAttribute attribute = actor.addRoomAttribute("addedAttribute", "descrition");
		boolean roomAttributeFound = false;
		EList<RoomAttribute> roomAttributes = actor.findRoomAttribute("addedAttribute");
		for(int i = 0; i < roomAttributes.size(); i++) {
			if(roomAttributes.get(i).getId() == attribute.getId()){
				roomAttributeFound = true;
			}
		}
		assertTrue("Attribute couldn't not be created.", roomAttributeFound);
	}
	
	
	private void testRemoveRoomAttribute(SysAdmin actor) {
		RoomAttribute attribute = actor.addRoomAttribute("removeAttribute", "description");
		actor.removeRoomAttribute(attribute);
		
		EList<RoomAttribute> roomAttributes = actor.findRoomAttribute("removeAttribute");

		
		boolean roomAttributeFound = false;
		for(int i = 0; i < roomAttributes.size(); i++) {
			if(roomAttributes.get(i).getId() == attribute.getId()){
				roomAttributeFound = true;
			}
		}
		assertFalse("Attribute couldn't be removed.", roomAttributeFound);
		
	}
		
	private void testRemoveAttributeWhileAttachedToRoomtype(SysAdmin actor) {
		RoomAttribute pool = actor.addRoomAttribute("Pool", "This suite has a pool");
		RoomType king = actor.addRoomType("King", 5, 10);
		actor.addAttributeToRoomType(king, pool);		
		assertFalse("Room attribute could be removed even if it was attached to a roomtype",sysAdmin.removeRoomAttribute(pool));		
	}
	

}
