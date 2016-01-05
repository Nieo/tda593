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
		testAddRoomAttribute(sysAdmin, "systemAdminAddedAttribute");
		testAddRoomAttribute(manager, "managerAddedAttribute");
		
		testRemoveRoomAttribute(sysAdmin, "systemAdminRemoveAttribute");
		testRemoveRoomAttribute(manager, "managerRemoveAttribute");
		
		testRemoveAttributeWhileAttachedToRoomtype(sysAdmin, "sysAdminRoomType", "sysAdminAttribute");
		testRemoveAttributeWhileAttachedToRoomtype(manager, "managerRoomType", "managerAttribute");
		
	}
	
	
	private void testAddRoomAttribute(SysAdmin actor, String attributeName){
		RoomAttribute attribute = actor.addRoomAttribute(attributeName, "descrition");
		boolean roomAttributeFound = false;
		EList<RoomAttribute> roomAttributes = actor.findRoomAttribute(attributeName);
		for(int i = 0; i < roomAttributes.size(); i++) {
			if(roomAttributes.get(i).getId() == attribute.getId()){
				roomAttributeFound = true;
			}
		}
		assertTrue("Attribute couldn't not be created.", roomAttributeFound);
	}
	
	
	private void testRemoveRoomAttribute(SysAdmin actor, String attributeName) {
		RoomAttribute attribute = actor.addRoomAttribute(attributeName, "description");
		actor.removeRoomAttribute(attribute);
		
		EList<RoomAttribute> roomAttributes = actor.findRoomAttribute(attributeName);

		
		boolean roomAttributeFound = false;
		for(int i = 0; i < roomAttributes.size(); i++) {
			if(roomAttributes.get(i).getId() == attribute.getId()){
				roomAttributeFound = true;
			}
		}
		assertFalse("Attribute couldn't be removed.", roomAttributeFound);
		
	}
		
	private void testRemoveAttributeWhileAttachedToRoomtype(SysAdmin actor,String roomTypeName, String attributeName) {
		RoomAttribute attribute = actor.addRoomAttribute(attributeName, "descrition");
		RoomType roomType = actor.addRoomType(roomTypeName, 5, 10);
		actor.addAttributeToRoomType(roomType, attribute);		
		assertFalse("Room attribute could be removed even if it was attached to a roomtype",sysAdmin.removeRoomAttribute(attribute));		
	}
	

}
