/**
 */
package RootElement.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import RootElement.Room;
import RootElement.RoomAttribute;
import RootElement.RoomAttributeHandling;
import RootElement.RoomFetcher;
import RootElement.RoomStructure;
import RootElement.RoomType;
import RootElement.RoomTypeHandling;
import RootElement.RootElementPackage;

/**
 * An implementation of the model object '<em><b>Room Structure</b></em>'.
 * 
 * The room structure is responsible for the entire base functionality
 * in the hotel data structure. It is this class that stores and maintains
 * information and makes it accessible for the ones that are allowed to access
 * it.
 * 
 * @author Matz Larsson
 */
public class RoomStructureImpl extends MinimalEObjectImpl.Container implements RoomStructure {
	/**
	 * The rooms in the hotel
	 * @generated NOT
	 * @ordered
	 */
	private EList<Room> rooms;

	/**
	 * The room types available in the hotel
	 * @generated
	 * @ordered
	 */
	protected EList<RoomType> roomTypes;

	/**
	 * The room attributes available in the hotel
	 * @generated
	 * @ordered
	 */
	protected EList<RoomAttribute> roomAttributes;

	/**
	 * Initiates the RoomStructureImpl class.
	 * @generated
	 */
	protected RoomStructureImpl() {
		super();
	}

	/**
	 * Warning: DO NOT USE. The list of rooms are private and will
	 * not be exposed. This is merely an error from code generation.
	 * For accessing rooms, please see {@link #getAllRooms()} or 
	 * {@link #getAvailableRooms()}
	 * @generated NOT
	 */
	public EList<Room> getRooms() {
		//FIXME solve this in another way.
		throw new IllegalAccessError("This list is not directly accessible.");
	}

	/**
	 * Warning: DO NOT USE. The list of room types are private and will
	 * not be exposed. This is merely an error from code generation.
	 * For accessing room types, please see {@link #getAllRoomTypes()}.
	 * @generated NOT
	 */
	public EList<RoomType> getRoomTypes() {
		//FIXME solve this in another way.
		throw new IllegalAccessError("This list is not directly accessible.");
	}

	/**
	 * Warning: DO NOT USE. The list of room types are private and will
	 * not be exposed. This is merely an error from code generation.
	 * For finding a specific room attribute, please use
	 * {@link #getAllRoomAttributes()}
	 * @generated NOT
	 */
	public EList<RoomAttribute> getRoomAttributes() {
		//FIXME solve this in another way.
		throw new IllegalAccessError("This list is not directly accessible.");
	}

	/**
	 * Adds a room with the given properties to the list of available
	 * rooms at the current hotel.
	 * @generated NOT
	 */
	public Room addRoom(RoomType roomType, String roomName) {
		Room room = createRoom(roomName, roomType);
		rooms.add(room);
		return room;
	}

	/**
	 * Attempts to remove the given room from the list
	 * of available rooms of the current hotel.
	 * @generated NOT
	 */
	public boolean removeRoom(Room room) {
		return rooms.remove(room);
	}

	/**
	 * Updates the room with the given name with the new parameters.
	 * @generated NOT
	 */
	public boolean editRoom(Room room, RoomType newRoomType, String newRoomName) {
		if(room != null){
			room.setRoomType(newRoomType);
			room.setRoomName(newRoomName);
			return true;
		}
		
		return false;
	}

	/**
	 * Searches for rooms among the available at the hotel with
	 * names matching the given argument
	 * @generated NOT
	 */
	public EList<Room> findRoom(String roomName) {
		EList<Room> foundRooms = ECollections.<Room>emptyEList();
		if(roomName != null){
			roomName = roomName.toLowerCase();
			for(Room room : rooms){
				if(room.getRoomName() != null && room.getRoomName().toLowerCase().contains(roomName)){
					foundRooms.add(room);
				}
			}
		}
		
		return foundRooms;
	}

	/**
	 * Retrieves all rooms available at the hotel
	 * @generated NOT
	 */
	public EList<Room> getAllRooms() {
		return ECollections.unmodifiableEList(rooms);
	}

	/**
	 * Adds a room type with the given properties to the list of available
	 * room types at the current hotel.
	 * @generated NOT
	 */
	public RoomType addRoomType(String name, int cost) {
		RoomType type = createRoomType(name, cost);
		roomTypes.add(type);
		return type;
	}

	/**
	 * Updates the given room type with the new parameters.
	 * @generated NOT
	 */
	public boolean editRoomType(RoomType roomType, String newName, int newCost) {
		if(roomType != null){
			roomType.setName(newName);
			((RoomTypeImpl)roomType).setPrice(newCost);
			return true;
		}
		
		return false;
	}

	/**
	 * Attempts to remove the given room type from the list
	 * of available room types of the current hotel.
	 * @generated NOT
	 */
	public boolean removeRoomType(RoomType roomType) {
		if(roomType != null){
			return roomTypes.remove(roomType);
		}else{
			return false;
		}
	}

	/**
	 * Retrieves a list of all available room types at the current hotel.
	 * @generated NOT
	 */
	public EList<RoomType> getAllRoomTypes() {
		return ECollections.unmodifiableEList(roomTypes);
	}

	/**
	 * Binds a room attribute to a room type.
	 * @generated NOT
	 */
	public boolean addAttributeToRoomType(RoomType roomType, RoomAttribute roomAttribute) {
		if(roomType != null){
			return roomType.addRoomAttribute(roomAttribute);
		}
		
		return false;
	}

	/**
	 * Unbinds a room attribute from a room type
	 * @generated NOT
	 */
	public boolean removeAttributeFromRoomType(RoomType roomType, RoomAttribute roomAttribute) {
		if(roomType != null){
			return roomType.removeRoomAttribute(roomAttribute);
		}
		
		return false;
	}

	/**
	 * Retrieves the room types with name that contains the
	 * given argument
	 * @generated NOT
	 */
	public EList<RoomType> findRoomType(String name) {
		EList<RoomType> foundRoomTypes = ECollections.<RoomType>emptyEList();
		if(name != null){
			for(RoomType type : roomTypes){
				if(type.getName() != null && type.getName().contains(name)){
					foundRoomTypes.add(type);
				}
			}
		}
		
		return foundRoomTypes;
	}

	/**
	 * Adds a room attribute with the given properties to the list of available
	 * room attributes at the current hotel.
	 * @generated NOT
	 */
	public RoomAttribute addRoomAttribute(String name, String description) {
		RoomAttribute attribute = createRoomAttribute(name, description);
		roomAttributes.add(attribute);
		return attribute;
	}

	/**
	 * Updates the given room attribute with the new parameters.
	 * @generated NOT
	 */
	public boolean editRoomAttribute(RoomAttribute roomAttribute, String newName, String newDescription) {
		if(roomAttribute != null){
			roomAttribute.setName(newName);
			roomAttribute.setDescription(newDescription);
			return true;
		}
		
		return false;
	}

	/**
	 * Attempts to remove the given room attribute from the list
	 * of available room attributes of the current hotel.
	 * @generated NOT
	 */
	public boolean removeRoomAttribute(RoomAttribute roomAttribute) {
		if(roomAttribute != null){
			return roomAttributes.remove(roomAttribute);
		}
		
		return false;
	}

	/**
	 * Retrieves all room attributes of the current hotel
	 * @generated NOT
	 */
	public EList<RoomAttribute> getAllRoomAttributes() {
		return ECollections.unmodifiableEList(roomAttributes);
	}

	/**
	 * Retrieves the room attributes with name that contains
	 * the given argument.
	 * @generated NOT
	 */
	public EList<RoomAttribute> findRoomAttribute(String name) {
		EList<RoomAttribute> foundRoomAttributes = ECollections.<RoomAttribute>emptyEList();
		if(name != null){
			for(RoomAttribute attribute : roomAttributes){
				if(attribute.getName() != null && attribute.getName().contains(name)){
					foundRoomAttributes.add(attribute);
				}
			}
		}
			
		return foundRoomAttributes;
	}

	/**
	 * Retrieves all rooms that can be booked, not taking any concern about
	 * any bookings but just the state of the room (not broken and boookable).
	 * @generated NOT
	 */
	public EList<Room> getBookableRooms() {
		EList<Room> bookableRooms = new EObjectResolvingEList<Room>(Room.class, this, -1); 	//TODO solve how to make the last param more intuitive.
		ECollections.setEList(bookableRooms, rooms);
		for(Room room : bookableRooms){
			if(room.getRoomName() == null || room.getRoomType() == null){
				bookableRooms.remove(room);
			}
		}
		
		return bookableRooms;
	}

	/**
	 * Retrieves all rooms that can be cleaned, not taking concern if it is dirty or not.
	 * @generated NOT
	 */
	public EList<Room> getAllCleanableRooms() {
		return getAvailableRooms();
	}

	/**
	 * Retrieves all rooms that are available at the hotel (not broken).
	 * NOTE: Currently you cannot mark a room as broken
	 * @generated NOT
	 */
	public EList<Room> getAvailableRooms() {
		return getRooms();
	}
	
	/**
	 * Creates a room from the given values and returns the reference
	 * to the created object.
	 */
	private Room createRoom(String roomID, RoomType roomType){
		Room room = new RoomImpl();
		room.setRoomName(roomID);
		room.setRoomType(roomType);
		return room;
	}

	/**
	 * Creates a room type from the given values and returns the reference
	 * to the created object.
	 */
	private RoomType createRoomType(String name, int price){
		RoomTypeImpl type = new RoomTypeImpl();
		type.setName(name);
		type.setPrice(price);
		return type;
	}

	/**
	 * Creates a room attribute from the given values and returns the reference
	 * to the created object.
	 */
	private RoomAttribute createRoomAttribute(String name, String description){
		RoomAttribute attribute = new RoomAttributeImpl();
		attribute.setName(name);
		attribute.setDescription(description);
		return attribute;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.ROOM_STRUCTURE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootElementPackage.ROOM_STRUCTURE__ROOMS:
				return getRooms();
			case RootElementPackage.ROOM_STRUCTURE__ROOM_TYPES:
				return getRoomTypes();
			case RootElementPackage.ROOM_STRUCTURE__ROOM_ATTRIBUTES:
				return getRoomAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RootElementPackage.ROOM_STRUCTURE__ROOMS:
				getRooms().clear();
				getRooms().addAll((Collection<? extends Room>)newValue);
				return;
			case RootElementPackage.ROOM_STRUCTURE__ROOM_TYPES:
				getRoomTypes().clear();
				getRoomTypes().addAll((Collection<? extends RoomType>)newValue);
				return;
			case RootElementPackage.ROOM_STRUCTURE__ROOM_ATTRIBUTES:
				getRoomAttributes().clear();
				getRoomAttributes().addAll((Collection<? extends RoomAttribute>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RootElementPackage.ROOM_STRUCTURE__ROOMS:
				getRooms().clear();
				return;
			case RootElementPackage.ROOM_STRUCTURE__ROOM_TYPES:
				getRoomTypes().clear();
				return;
			case RootElementPackage.ROOM_STRUCTURE__ROOM_ATTRIBUTES:
				getRoomAttributes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RootElementPackage.ROOM_STRUCTURE__ROOMS:
				return rooms != null && !rooms.isEmpty();
			case RootElementPackage.ROOM_STRUCTURE__ROOM_TYPES:
				return roomTypes != null && !roomTypes.isEmpty();
			case RootElementPackage.ROOM_STRUCTURE__ROOM_ATTRIBUTES:
				return roomAttributes != null && !roomAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == RoomTypeHandling.class) {
			switch (baseOperationID) {
				case RootElementPackage.ROOM_TYPE_HANDLING___ADD_ROOM_TYPE__STRING_INT: return RootElementPackage.ROOM_STRUCTURE___ADD_ROOM_TYPE__STRING_INT;
				case RootElementPackage.ROOM_TYPE_HANDLING___EDIT_ROOM_TYPE__ROOMTYPE_STRING_INT: return RootElementPackage.ROOM_STRUCTURE___EDIT_ROOM_TYPE__ROOMTYPE_STRING_INT;
				case RootElementPackage.ROOM_TYPE_HANDLING___REMOVE_ROOM_TYPE__ROOMTYPE: return RootElementPackage.ROOM_STRUCTURE___REMOVE_ROOM_TYPE__ROOMTYPE;
				case RootElementPackage.ROOM_TYPE_HANDLING___GET_ALL_ROOM_TYPES: return RootElementPackage.ROOM_STRUCTURE___GET_ALL_ROOM_TYPES;
				case RootElementPackage.ROOM_TYPE_HANDLING___ADD_ATTRIBUTE_TO_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE: return RootElementPackage.ROOM_STRUCTURE___ADD_ATTRIBUTE_TO_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE;
				case RootElementPackage.ROOM_TYPE_HANDLING___REMOVE_ATTRIBUTE_FROM_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE: return RootElementPackage.ROOM_STRUCTURE___REMOVE_ATTRIBUTE_FROM_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE;
				case RootElementPackage.ROOM_TYPE_HANDLING___FIND_ROOM_TYPE__STRING: return RootElementPackage.ROOM_STRUCTURE___FIND_ROOM_TYPE__STRING;
				default: return -1;
			}
		}
		if (baseClass == RoomAttributeHandling.class) {
			switch (baseOperationID) {
				case RootElementPackage.ROOM_ATTRIBUTE_HANDLING___ADD_ROOM_ATTRIBUTE__STRING_STRING: return RootElementPackage.ROOM_STRUCTURE___ADD_ROOM_ATTRIBUTE__STRING_STRING;
				case RootElementPackage.ROOM_ATTRIBUTE_HANDLING___EDIT_ROOM_ATTRIBUTE__ROOMATTRIBUTE_STRING_STRING: return RootElementPackage.ROOM_STRUCTURE___EDIT_ROOM_ATTRIBUTE__ROOMATTRIBUTE_STRING_STRING;
				case RootElementPackage.ROOM_ATTRIBUTE_HANDLING___REMOVE_ROOM_ATTRIBUTE__ROOMATTRIBUTE: return RootElementPackage.ROOM_STRUCTURE___REMOVE_ROOM_ATTRIBUTE__ROOMATTRIBUTE;
				case RootElementPackage.ROOM_ATTRIBUTE_HANDLING___GET_ALL_ROOM_ATTRIBUTES: return RootElementPackage.ROOM_STRUCTURE___GET_ALL_ROOM_ATTRIBUTES;
				case RootElementPackage.ROOM_ATTRIBUTE_HANDLING___FIND_ROOM_ATTRIBUTE__STRING: return RootElementPackage.ROOM_STRUCTURE___FIND_ROOM_ATTRIBUTE__STRING;
				default: return -1;
			}
		}
		if (baseClass == RoomFetcher.class) {
			switch (baseOperationID) {
				case RootElementPackage.ROOM_FETCHER___GET_BOOKABLE_ROOMS: return RootElementPackage.ROOM_STRUCTURE___GET_BOOKABLE_ROOMS;
				case RootElementPackage.ROOM_FETCHER___GET_ALL_CLEANABLE_ROOMS: return RootElementPackage.ROOM_STRUCTURE___GET_ALL_CLEANABLE_ROOMS;
				case RootElementPackage.ROOM_FETCHER___GET_AVAILABLE_ROOMS: return RootElementPackage.ROOM_STRUCTURE___GET_AVAILABLE_ROOMS;
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
			case RootElementPackage.ROOM_STRUCTURE___ADD_ROOM__ROOMTYPE_STRING:
				return addRoom((RoomType)arguments.get(0), (String)arguments.get(1));
			case RootElementPackage.ROOM_STRUCTURE___REMOVE_ROOM__ROOM:
				return removeRoom((Room)arguments.get(0));
			case RootElementPackage.ROOM_STRUCTURE___EDIT_ROOM__ROOM_ROOMTYPE_STRING:
				return editRoom((Room)arguments.get(0), (RoomType)arguments.get(1), (String)arguments.get(2));
			case RootElementPackage.ROOM_STRUCTURE___FIND_ROOM__STRING:
				return findRoom((String)arguments.get(0));
			case RootElementPackage.ROOM_STRUCTURE___GET_ALL_ROOMS:
				return getAllRooms();
			case RootElementPackage.ROOM_STRUCTURE___ADD_ROOM_TYPE__STRING_INT:
				return addRoomType((String)arguments.get(0), (Integer)arguments.get(1));
			case RootElementPackage.ROOM_STRUCTURE___EDIT_ROOM_TYPE__ROOMTYPE_STRING_INT:
				return editRoomType((RoomType)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
			case RootElementPackage.ROOM_STRUCTURE___REMOVE_ROOM_TYPE__ROOMTYPE:
				return removeRoomType((RoomType)arguments.get(0));
			case RootElementPackage.ROOM_STRUCTURE___GET_ALL_ROOM_TYPES:
				return getAllRoomTypes();
			case RootElementPackage.ROOM_STRUCTURE___ADD_ATTRIBUTE_TO_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE:
				return addAttributeToRoomType((RoomType)arguments.get(0), (RoomAttribute)arguments.get(1));
			case RootElementPackage.ROOM_STRUCTURE___REMOVE_ATTRIBUTE_FROM_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE:
				return removeAttributeFromRoomType((RoomType)arguments.get(0), (RoomAttribute)arguments.get(1));
			case RootElementPackage.ROOM_STRUCTURE___FIND_ROOM_TYPE__STRING:
				return findRoomType((String)arguments.get(0));
			case RootElementPackage.ROOM_STRUCTURE___ADD_ROOM_ATTRIBUTE__STRING_STRING:
				return addRoomAttribute((String)arguments.get(0), (String)arguments.get(1));
			case RootElementPackage.ROOM_STRUCTURE___EDIT_ROOM_ATTRIBUTE__ROOMATTRIBUTE_STRING_STRING:
				return editRoomAttribute((RoomAttribute)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case RootElementPackage.ROOM_STRUCTURE___REMOVE_ROOM_ATTRIBUTE__ROOMATTRIBUTE:
				return removeRoomAttribute((RoomAttribute)arguments.get(0));
			case RootElementPackage.ROOM_STRUCTURE___GET_ALL_ROOM_ATTRIBUTES:
				return getAllRoomAttributes();
			case RootElementPackage.ROOM_STRUCTURE___FIND_ROOM_ATTRIBUTE__STRING:
				return findRoomAttribute((String)arguments.get(0));
			case RootElementPackage.ROOM_STRUCTURE___GET_BOOKABLE_ROOMS:
				return getBookableRooms();
			case RootElementPackage.ROOM_STRUCTURE___GET_ALL_CLEANABLE_ROOMS:
				return getAllCleanableRooms();
			case RootElementPackage.ROOM_STRUCTURE___GET_AVAILABLE_ROOMS:
				return getAvailableRooms();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomStructureImpl
