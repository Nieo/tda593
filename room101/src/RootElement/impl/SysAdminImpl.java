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
	 * the current hotel.
	 * @generated NOT
	 */
	protected SysAdminImpl(){
		super();
		roomHandling = RoomSetupFactory.createRoomHandling();
		roomTypeHandling = RoomSetupFactory.createRoomTypeHandling();
		roomAttributeHandling = RoomSetupFactory.createRoomAttributeHandling();
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
	 * Attempts to remove the given room from the list
	 * of available rooms of the current hotel.
	 * @generated NOT
	 */
	public boolean removeRoom(Room room) {
		return roomHandling.removeRoom(room);
	}

	/**
	 * Updates the room with the given name with the new parameters.
	 * @generated NOT
	 */
	public boolean editRoom(Room room, RoomType newRoomType, String newRoomName) {
		return roomHandling.editRoom(room, newRoomType, newRoomName);
	}

	/**
	 * Searches for rooms among the available at the hotel with name
	 * that contains the given argument
	 * @generated NOT
	 */
	public EList<Room> findRoom(String roomName) {
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
	 * Finds the room types with name that contains the given
	 * argument
	 * @generated NOT
	 */
	public EList<RoomType> findRoomType(String name) {
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
	 * Finds the room attributes with name that contains
	 * the given argument
	 * @generated NOT
	 */
	public EList<RoomAttribute> findRoomAttribute(String name) {
		return roomAttributeHandling.findRoomAttribute(name);
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
				case RootElementPackage.ROOM_HANDLING___REMOVE_ROOM__ROOM: return RootElementPackage.SYS_ADMIN___REMOVE_ROOM__ROOM;
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
			case RootElementPackage.SYS_ADMIN___FIND_ROOM_ATTRIBUTE__STRING:
				return findRoomAttribute((String)arguments.get(0));
			case RootElementPackage.SYS_ADMIN___ADD_ROOM__ROOMTYPE_STRING:
				return addRoom((RoomType)arguments.get(0), (String)arguments.get(1));
			case RootElementPackage.SYS_ADMIN___REMOVE_ROOM__ROOM:
				return removeRoom((Room)arguments.get(0));
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
