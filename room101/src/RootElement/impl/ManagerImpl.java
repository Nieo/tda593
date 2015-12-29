/**
 */
package RootElement.impl;

import RootElement.Feedback;
import RootElement.FeedbackReader;
import RootElement.Manager;
import RootElement.Room;
import RootElement.RoomAttribute;
import RootElement.RoomAttributeHandling;
import RootElement.RoomHandling;
import RootElement.RoomType;
import RootElement.RoomTypeHandling;
import RootElement.RootElementPackage;
import RootElement.SysAdmin;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * 
 * The manager contains functionality to perform both the actions of
 * a system administrator (SysAdmin) and the clerk.
 */
public class ManagerImpl extends ClerkImpl implements Manager {
	/**
	 * A link to the sysadmin, to make sure that the manager can do
	 * everything that the sysadmin can.
	 * @generated NOT
	 */
	private SysAdmin sysAdmin;
	
	/**
	 * The cached value of the '{@link #getFeedbackReader() <em>Feedback Reader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackReader()
	 * @generated
	 * @ordered
	 */
	protected FeedbackReader feedbackReader;
	
	/**
	 * Creates a manager user. The manager gets access to the room structure of
	 * the hotel with the default name, as defined in RoomSetupFactory.
	 * @generated NOT
	 */
	protected ManagerImpl() {
		this(RoomSetupFactory.DEFAULT_HOTELNAME);
		feedbackReader = FeedbackHandlerFactory.createFeedbackReader();
	}
	
	/**
	 * Creates a manager user that gets access to the room structure of
	 * the hotel with the given name.
	 * @generated NOT
	 */
	protected ManagerImpl(String hotelName){
		super();
		sysAdmin = new SysAdminImpl(hotelName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackReader getFeedbackReader() {
		if (feedbackReader != null && feedbackReader.eIsProxy()) {
			InternalEObject oldFeedbackReader = (InternalEObject)feedbackReader;
			feedbackReader = (FeedbackReader)eResolveProxy(oldFeedbackReader);
			if (feedbackReader != oldFeedbackReader) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootElementPackage.MANAGER__FEEDBACK_READER, oldFeedbackReader, feedbackReader));
			}
		}
		return feedbackReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackReader basicGetFeedbackReader() {
		return feedbackReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedbackReader(FeedbackReader newFeedbackReader) {
		FeedbackReader oldFeedbackReader = feedbackReader;
		feedbackReader = newFeedbackReader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.MANAGER__FEEDBACK_READER, oldFeedbackReader, feedbackReader));
	}

	/**
	 * Adds a room with the given properties to the list of available
	 * rooms at the current hotel.
	 * @generated NOT
	 */
	public Room addRoom(RoomType roomType, String roomName) {
		return sysAdmin.addRoom(roomType, roomName);
	}

	/**
	 * Attempts to remove the given room from the list
	 * of available rooms of the current hotel.
	 * @generated NOT
	 */
	public boolean removeRoom(Room room) {
		return sysAdmin.removeRoom(room);
	}

	/**
	 * Updates the room with the given name with the new parameters.
	 * @generated NOT
	 */
	public boolean editRoom(Room room, RoomType newRoomType, String newRoomName) {
		return sysAdmin.editRoom(room, newRoomType, newRoomName);
	}

	/**
	 * Searches for rooms among the available at the hotel.
	 * @generated NOT
	 */
	public EList<Room> findRoom(String roomName) {
		return sysAdmin.findRoom(roomName);
	}

	/**
	 * Retrieves all rooms available at the hotel
	 * @generated NOT
	 */
	public EList<Room> getAllRooms() {
		return sysAdmin.getAllRooms();
	}

	/**
	 * Adds a room type with the given properties to the list of available
	 * room types at the current hotel.
	 * @generated NOT
	 */
	public RoomType addRoomType(String name, int cost) {
		return sysAdmin.addRoomType(name, cost);
	}

	/**
	 * Updates the given room type with the new parameters.
	 * @generated NOT
	 */
	public boolean editRoomType(RoomType roomType, String newName, int newCost) {
		return sysAdmin.editRoomType(roomType, newName, newCost);
	}

	/**
	 * Attempts to remove the given room type from the list
	 * of available room types of the current hotel.
	 * @generated NOT
	 */
	public boolean removeRoomType(RoomType roomType) {
		return sysAdmin.removeRoomType(roomType);
	}

	/**
	 * Retrieves a list of all available room types at the current hotel.
	 * @generated NOT
	 */
	public EList<RoomType> getAllRoomTypes() {
		return sysAdmin.getAllRoomTypes();
	}

	/**
	 * Binds a room attribute to a room type.
	 * @generated NOT
	 */
	public boolean addAttributeToRoomType(RoomType roomType, RoomAttribute roomAttribute) {
		return sysAdmin.addAttributeToRoomType(roomType, roomAttribute);
	}

	/**
	 * Unbinds a room attribute from a room type
	 * @generated NOT
	 */
	public boolean removeAttributeFromRoomType(RoomType roomType, RoomAttribute roomAttribute) {
		return sysAdmin.removeAttributeFromRoomType(roomType, roomAttribute);
	}

	/**
	 * Retrieves the room types with name that contains
	 * the given argument
	 * @generated NOT
	 */
	public EList<RoomType> findRoomType(String name) {
		return sysAdmin.findRoomType(name);
	}

	/**
	 * Adds a room attribute with the given properties to the list of available
	 * room attributes at the current hotel.
	 * @generated NOT
	 */
	public RoomAttribute addRoomAttribute(String name, String description) {
		return sysAdmin.addRoomAttribute(name, description);
	}

	/**
	 * Updates the given room attribute with the new parameters.
	 * @generated NOT
	 */
	public boolean editRoomAttribute(RoomAttribute roomAttribute, String newName, String newDescription) {
		return sysAdmin.editRoomAttribute(roomAttribute, newName, newDescription);
	}

	/**
	 * Attempts to remove the given room attribute from the list
	 * of available room attributes of the current hotel.
	 * @generated NOT
	 */
	public boolean removeRoomAttribute(RoomAttribute roomAttribute) {
		return sysAdmin.removeRoomAttribute(roomAttribute);
	}

	/**
	 * Retrieves all room attributes of the current hotel
	 * @generated NOT
	 */
	public EList<RoomAttribute> getAllRoomAttributes() {
		return sysAdmin.getAllRoomAttributes();
	}
	
	/**
	 * Retrieves the room attribute with name that contains
	 * the given argument
	 * @generated NOT
	 */
	public EList<RoomAttribute> findRoomAttribute(String name) {
		return sysAdmin.findRoomAttribute(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feedback> getAllFeedback() {
		return feedbackReader.getAllFeedback();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feedback> getUnreadFeedback() {
		return feedbackReader.getUnreadFeedback();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.MANAGER;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootElementPackage.MANAGER__FEEDBACK_READER:
				if (resolve) return getFeedbackReader();
				return basicGetFeedbackReader();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RootElementPackage.MANAGER__FEEDBACK_READER:
				setFeedbackReader((FeedbackReader)newValue);
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
			case RootElementPackage.MANAGER__FEEDBACK_READER:
				setFeedbackReader((FeedbackReader)null);
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
			case RootElementPackage.MANAGER__FEEDBACK_READER:
				return feedbackReader != null;
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
		if (baseClass == RoomAttributeHandling.class) {
			switch (baseOperationID) {
				case RootElementPackage.ROOM_ATTRIBUTE_HANDLING___ADD_ROOM_ATTRIBUTE__STRING_STRING: return RootElementPackage.MANAGER___ADD_ROOM_ATTRIBUTE__STRING_STRING;
				case RootElementPackage.ROOM_ATTRIBUTE_HANDLING___EDIT_ROOM_ATTRIBUTE__ROOMATTRIBUTE_STRING_STRING: return RootElementPackage.MANAGER___EDIT_ROOM_ATTRIBUTE__ROOMATTRIBUTE_STRING_STRING;
				case RootElementPackage.ROOM_ATTRIBUTE_HANDLING___REMOVE_ROOM_ATTRIBUTE__ROOMATTRIBUTE: return RootElementPackage.MANAGER___REMOVE_ROOM_ATTRIBUTE__ROOMATTRIBUTE;
				case RootElementPackage.ROOM_ATTRIBUTE_HANDLING___GET_ALL_ROOM_ATTRIBUTES: return RootElementPackage.MANAGER___GET_ALL_ROOM_ATTRIBUTES;
				case RootElementPackage.ROOM_ATTRIBUTE_HANDLING___FIND_ROOM_ATTRIBUTE__STRING: return RootElementPackage.MANAGER___FIND_ROOM_ATTRIBUTE__STRING;
				default: return -1;
			}
		}
		if (baseClass == RoomHandling.class) {
			switch (baseOperationID) {
				case RootElementPackage.ROOM_HANDLING___ADD_ROOM__ROOMTYPE_STRING: return RootElementPackage.MANAGER___ADD_ROOM__ROOMTYPE_STRING;
				case RootElementPackage.ROOM_HANDLING___REMOVE_ROOM__ROOM: return RootElementPackage.MANAGER___REMOVE_ROOM__ROOM;
				case RootElementPackage.ROOM_HANDLING___EDIT_ROOM__ROOM_ROOMTYPE_STRING: return RootElementPackage.MANAGER___EDIT_ROOM__ROOM_ROOMTYPE_STRING;
				case RootElementPackage.ROOM_HANDLING___FIND_ROOM__STRING: return RootElementPackage.MANAGER___FIND_ROOM__STRING;
				case RootElementPackage.ROOM_HANDLING___GET_ALL_ROOMS: return RootElementPackage.MANAGER___GET_ALL_ROOMS;
				default: return -1;
			}
		}
		if (baseClass == RoomTypeHandling.class) {
			switch (baseOperationID) {
				case RootElementPackage.ROOM_TYPE_HANDLING___ADD_ROOM_TYPE__STRING_INT: return RootElementPackage.MANAGER___ADD_ROOM_TYPE__STRING_INT;
				case RootElementPackage.ROOM_TYPE_HANDLING___EDIT_ROOM_TYPE__ROOMTYPE_STRING_INT: return RootElementPackage.MANAGER___EDIT_ROOM_TYPE__ROOMTYPE_STRING_INT;
				case RootElementPackage.ROOM_TYPE_HANDLING___REMOVE_ROOM_TYPE__ROOMTYPE: return RootElementPackage.MANAGER___REMOVE_ROOM_TYPE__ROOMTYPE;
				case RootElementPackage.ROOM_TYPE_HANDLING___GET_ALL_ROOM_TYPES: return RootElementPackage.MANAGER___GET_ALL_ROOM_TYPES;
				case RootElementPackage.ROOM_TYPE_HANDLING___ADD_ATTRIBUTE_TO_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE: return RootElementPackage.MANAGER___ADD_ATTRIBUTE_TO_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE;
				case RootElementPackage.ROOM_TYPE_HANDLING___REMOVE_ATTRIBUTE_FROM_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE: return RootElementPackage.MANAGER___REMOVE_ATTRIBUTE_FROM_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE;
				case RootElementPackage.ROOM_TYPE_HANDLING___FIND_ROOM_TYPE__STRING: return RootElementPackage.MANAGER___FIND_ROOM_TYPE__STRING;
				default: return -1;
			}
		}
		if (baseClass == SysAdmin.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == FeedbackReader.class) {
			switch (baseOperationID) {
				case RootElementPackage.FEEDBACK_READER___GET_ALL_FEEDBACK: return RootElementPackage.MANAGER___GET_ALL_FEEDBACK;
				case RootElementPackage.FEEDBACK_READER___GET_UNREAD_FEEDBACK: return RootElementPackage.MANAGER___GET_UNREAD_FEEDBACK;
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
			case RootElementPackage.MANAGER___ADD_ROOM_ATTRIBUTE__STRING_STRING:
				return addRoomAttribute((String)arguments.get(0), (String)arguments.get(1));
			case RootElementPackage.MANAGER___EDIT_ROOM_ATTRIBUTE__ROOMATTRIBUTE_STRING_STRING:
				return editRoomAttribute((RoomAttribute)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case RootElementPackage.MANAGER___REMOVE_ROOM_ATTRIBUTE__ROOMATTRIBUTE:
				return removeRoomAttribute((RoomAttribute)arguments.get(0));
			case RootElementPackage.MANAGER___GET_ALL_ROOM_ATTRIBUTES:
				return getAllRoomAttributes();
			case RootElementPackage.MANAGER___FIND_ROOM_ATTRIBUTE__STRING:
				return findRoomAttribute((String)arguments.get(0));
			case RootElementPackage.MANAGER___ADD_ROOM__ROOMTYPE_STRING:
				return addRoom((RoomType)arguments.get(0), (String)arguments.get(1));
			case RootElementPackage.MANAGER___REMOVE_ROOM__ROOM:
				return removeRoom((Room)arguments.get(0));
			case RootElementPackage.MANAGER___EDIT_ROOM__ROOM_ROOMTYPE_STRING:
				return editRoom((Room)arguments.get(0), (RoomType)arguments.get(1), (String)arguments.get(2));
			case RootElementPackage.MANAGER___FIND_ROOM__STRING:
				return findRoom((String)arguments.get(0));
			case RootElementPackage.MANAGER___GET_ALL_ROOMS:
				return getAllRooms();
			case RootElementPackage.MANAGER___ADD_ROOM_TYPE__STRING_INT:
				return addRoomType((String)arguments.get(0), (Integer)arguments.get(1));
			case RootElementPackage.MANAGER___EDIT_ROOM_TYPE__ROOMTYPE_STRING_INT:
				return editRoomType((RoomType)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
			case RootElementPackage.MANAGER___REMOVE_ROOM_TYPE__ROOMTYPE:
				return removeRoomType((RoomType)arguments.get(0));
			case RootElementPackage.MANAGER___GET_ALL_ROOM_TYPES:
				return getAllRoomTypes();
			case RootElementPackage.MANAGER___ADD_ATTRIBUTE_TO_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE:
				return addAttributeToRoomType((RoomType)arguments.get(0), (RoomAttribute)arguments.get(1));
			case RootElementPackage.MANAGER___REMOVE_ATTRIBUTE_FROM_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE:
				return removeAttributeFromRoomType((RoomType)arguments.get(0), (RoomAttribute)arguments.get(1));
			case RootElementPackage.MANAGER___FIND_ROOM_TYPE__STRING:
				return findRoomType((String)arguments.get(0));
			case RootElementPackage.MANAGER___GET_ALL_FEEDBACK:
				return getAllFeedback();
			case RootElementPackage.MANAGER___GET_UNREAD_FEEDBACK:
				return getUnreadFeedback();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ManagerImpl
