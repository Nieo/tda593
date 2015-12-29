/**
 */
package RootElement.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import RootElement.Room;
import RootElement.RoomAttribute;
import RootElement.RoomAttributeHandling;
import RootElement.RoomHandling;
import RootElement.RoomType;
import RootElement.RoomTypeHandling;
import RootElement.RootElementPackage;
import RootElement.SysAdmin;

/**
 * An implementation of the model object '<em><b>Sys Admin</b></em>'.
 * The SysAdmin gives access for certain functionality the concrete
 * actor system administrator should be able to do.
 * 
 * For testing purposes, the SysAdmin can gain access to a hotel structure
 * by just providing its name as into the different room entity handlers
 * (RoomHandler, RoomTypeHandler, RoomAttributeHandler). This feature should
 * be turned off before shipping a product for any commercial market.
 * 
 * @author Matz Larsson
 */
public class SysAdminImpl extends MinimalEObjectImpl.Container implements SysAdmin {
	/**
	 * Handler for the room attributes.
	 * @generated NOT
	 */
	private RoomAttributeHandling roomAttributeHandling;

	/**
	 * Handler for the rooms.
	 * @generated NOT
	 */
	private RoomHandling roomHandling;

	/**
	 * Handler for the room types.
	 * @generated NOT
	 */
	private RoomTypeHandling roomTypeHandling;
	
	/**
	 * Creates a sysadmin user that gets access to the room structure of
	 * the hotel with the default name, as defined in RoomSetupFactory.
	 * @generated NOT
	 */
	protected SysAdminImpl(){
		this(RoomSetupFactory.DEFAULT_HOTELNAME);
	}

	/**
	 * Creates a sysadmin user that gets access to the room structure of
	 * the hotel with the given name.
	 * @generated NOT
	 */
	protected SysAdminImpl(String hotelName) {
		super();
		roomHandling = RoomSetupFactory.createRoomHandling(hotelName);
		roomTypeHandling = RoomSetupFactory.createRoomTypeHandling(hotelName);
		roomAttributeHandling = RoomSetupFactory.createRoomAttributeHandling(hotelName);
	}

	/**
	 * Adds a room with the given properties to the list of available
	 * rooms at the current hotel.
	 * @generated NOT
	 */
	public Room addRoom(RoomType roomType, String roomName) {
		return roomHandling.addRoom(roomType, roomName);
	}

	/**
	 * Attempts to remove the room with the given name from the list
	 * of available rooms of the current hotel.
	 * @generated NOT
	 */
	public boolean removeRoom(String roomName) {
		return roomHandling.removeRoom(roomName);
	}

	/**
	 * Updates the room with the given name with the new parameters.
	 * @generated NOT
	 */
	public boolean editRoom(Room room, RoomType newRoomType, String newRoomName) {
		return roomHandling.editRoom(room, newRoomType, newRoomName);
	}

	/**
	 * Searches for a room among the available at the hotel. If it does
	 * not find it, null is returned.
	 * @generated NOT
	 */
	public Room findRoom(String roomName) {
		return roomHandling.findRoom(roomName);
	}

	/**
	 * Retrieves all rooms available at the hotel
	 * @generated NOT
	 */
	public EList<Room> getAllRooms() {
		return roomHandling.getAllRooms();
	}

	/**
	 * Adds a room type with the given properties to the list of available
	 * room types at the current hotel.
	 * @generated NOT
	 */
	public RoomType addRoomType(String name, int cost) {
		return roomTypeHandling.addRoomType(name, cost);
	}

	/**
	 * Updates the given room type with the new parameters.
	 * @generated NOT
	 */
	public boolean editRoomType(RoomType roomType, String newName, int newCost) {
		return roomTypeHandling.editRoomType(roomType, newName, newCost);
	}

	/**
	 * Attempts to remove the given room type from the list
	 * of available room types of the current hotel.
	 * @generated NOT
	 */
	public boolean removeRoomType(RoomType roomType) {
		return roomTypeHandling.removeRoomType(roomType);
	}

	/**
	 * Retrieves a list of all available room types at the current hotel.
	 * @generated NOT
	 */
	public EList<RoomType> getAllRoomTypes() {
		return roomTypeHandling.getAllRoomTypes();
	}

	/**
	 * Binds a room attribute to a room type.
	 * @generated NOT
	 */
	public boolean addAttributeToRoomType(RoomType roomType, RoomAttribute roomAttribute) {
		return roomTypeHandling.addAttributeToRoomType(roomType, roomAttribute);
	}

	/**
	 * Unbinds a room attribute from a room type
	 * @generated NOT
	 */
	public boolean removeAttributeFromRoomType(RoomType roomType, RoomAttribute roomAttribute) {
		return roomTypeHandling.removeAttributeFromRoomType(roomType, roomAttribute);
	}

	/**
	 * Finds the room type with the given name
	 * @generated NOT
	 */
	public RoomType findRoomType(String name) {
		return roomTypeHandling.findRoomType(name);
	}

	/**
	 * Adds a room attribute with the given properties to the list of available
	 * room attributes at the current hotel.
	 * @generated NOT
	 */
	public RoomAttribute addRoomAttribute(String name, String description) {
		return roomAttributeHandling.addRoomAttribute(name, description);
	}

	/**
	 * Updates the given room attribute with the new parameters.
	 * @generated NOT
	 */
	public boolean editRoomAttribute(RoomAttribute roomAttribute, String newName, String newDescription) {
		return roomAttributeHandling.editRoomAttribute(roomAttribute, newName, newDescription);
	}

	/**
	 * Attempts to remove the given room attribute from the list
	 * of available room attributes of the current hotel.
	 * @generated NOT
	 */
	public boolean removeRoomAttribute(RoomAttribute roomAttribute) {
		return roomAttributeHandling.removeRoomAttribute(roomAttribute);
	}

	/**
	 * Retrieves all room attributes of the current hotel
	 * @generated NOT
	 */
	public EList<RoomAttribute> getAllRoomAttributes() {
		return roomAttributeHandling.getAllRoomAttributes();
	}

	/**
	 * Finds the room attribute with the given ID
	 * @generated NOT
	 */
	public RoomAttribute findRoomAttribute(int id) {
		return roomAttributeHandling.findRoomAttribute(id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.SYS_ADMIN;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == RoomHandling.class) {
			switch (baseOperationID) {
				case RootElementPackage.ROOM_HANDLING___ADD_ROOM__ROOMTYPE_STRING: return RootElementPackage.SYS_ADMIN___ADD_ROOM__ROOMTYPE_STRING;
				case RootElementPackage.ROOM_HANDLING___REMOVE_ROOM__STRING: return RootElementPackage.SYS_ADMIN___REMOVE_ROOM__STRING;
				case RootElementPackage.ROOM_HANDLING___EDIT_ROOM__ROOM_ROOMTYPE_STRING: return RootElementPackage.SYS_ADMIN___EDIT_ROOM__ROOM_ROOMTYPE_STRING;
				case RootElementPackage.ROOM_HANDLING___FIND_ROOM__STRING: return RootElementPackage.SYS_ADMIN___FIND_ROOM__STRING;
				case RootElementPackage.ROOM_HANDLING___GET_ALL_ROOMS: return RootElementPackage.SYS_ADMIN___GET_ALL_ROOMS;
				default: return -1;
			}
		}
		if (baseClass == RoomTypeHandling.class) {
			switch (baseOperationID) {
				case RootElementPackage.ROOM_TYPE_HANDLING___ADD_ROOM_TYPE__STRING_INT: return RootElementPackage.SYS_ADMIN___ADD_ROOM_TYPE__STRING_INT;
				case RootElementPackage.ROOM_TYPE_HANDLING___EDIT_ROOM_TYPE__ROOMTYPE_STRING_INT: return RootElementPackage.SYS_ADMIN___EDIT_ROOM_TYPE__ROOMTYPE_STRING_INT;
				case RootElementPackage.ROOM_TYPE_HANDLING___REMOVE_ROOM_TYPE__ROOMTYPE: return RootElementPackage.SYS_ADMIN___REMOVE_ROOM_TYPE__ROOMTYPE;
				case RootElementPackage.ROOM_TYPE_HANDLING___GET_ALL_ROOM_TYPES: return RootElementPackage.SYS_ADMIN___GET_ALL_ROOM_TYPES;
				case RootElementPackage.ROOM_TYPE_HANDLING___ADD_ATTRIBUTE_TO_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE: return RootElementPackage.SYS_ADMIN___ADD_ATTRIBUTE_TO_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE;
				case RootElementPackage.ROOM_TYPE_HANDLING___REMOVE_ATTRIBUTE_FROM_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE: return RootElementPackage.SYS_ADMIN___REMOVE_ATTRIBUTE_FROM_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE;
				case RootElementPackage.ROOM_TYPE_HANDLING___FIND_ROOM_TYPE__STRING: return RootElementPackage.SYS_ADMIN___FIND_ROOM_TYPE__STRING;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RootElementPackage.SYS_ADMIN___ADD_ROOM_ATTRIBUTE__STRING_STRING:
				return addRoomAttribute((String)arguments.get(0), (String)arguments.get(1));
			case RootElementPackage.SYS_ADMIN___EDIT_ROOM_ATTRIBUTE__ROOMATTRIBUTE_STRING_STRING:
				return editRoomAttribute((RoomAttribute)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case RootElementPackage.SYS_ADMIN___REMOVE_ROOM_ATTRIBUTE__ROOMATTRIBUTE:
				return removeRoomAttribute((RoomAttribute)arguments.get(0));
			case RootElementPackage.SYS_ADMIN___GET_ALL_ROOM_ATTRIBUTES:
				return getAllRoomAttributes();
			case RootElementPackage.SYS_ADMIN___FIND_ROOM_ATTRIBUTE__INT:
				return findRoomAttribute((Integer)arguments.get(0));
			case RootElementPackage.SYS_ADMIN___ADD_ROOM__ROOMTYPE_STRING:
				return addRoom((RoomType)arguments.get(0), (String)arguments.get(1));
			case RootElementPackage.SYS_ADMIN___REMOVE_ROOM__STRING:
				return removeRoom((String)arguments.get(0));
			case RootElementPackage.SYS_ADMIN___EDIT_ROOM__ROOM_ROOMTYPE_STRING:
				return editRoom((Room)arguments.get(0), (RoomType)arguments.get(1), (String)arguments.get(2));
			case RootElementPackage.SYS_ADMIN___FIND_ROOM__STRING:
				return findRoom((String)arguments.get(0));
			case RootElementPackage.SYS_ADMIN___GET_ALL_ROOMS:
				return getAllRooms();
			case RootElementPackage.SYS_ADMIN___ADD_ROOM_TYPE__STRING_INT:
				return addRoomType((String)arguments.get(0), (Integer)arguments.get(1));
			case RootElementPackage.SYS_ADMIN___EDIT_ROOM_TYPE__ROOMTYPE_STRING_INT:
				return editRoomType((RoomType)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
			case RootElementPackage.SYS_ADMIN___REMOVE_ROOM_TYPE__ROOMTYPE:
				return removeRoomType((RoomType)arguments.get(0));
			case RootElementPackage.SYS_ADMIN___GET_ALL_ROOM_TYPES:
				return getAllRoomTypes();
			case RootElementPackage.SYS_ADMIN___ADD_ATTRIBUTE_TO_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE:
				return addAttributeToRoomType((RoomType)arguments.get(0), (RoomAttribute)arguments.get(1));
			case RootElementPackage.SYS_ADMIN___REMOVE_ATTRIBUTE_FROM_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE:
				return removeAttributeFromRoomType((RoomType)arguments.get(0), (RoomAttribute)arguments.get(1));
			case RootElementPackage.SYS_ADMIN___FIND_ROOM_TYPE__STRING:
				return findRoomType((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SysAdminImpl
