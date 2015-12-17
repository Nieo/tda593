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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.impl.ManagerImpl#getRoomAttributeHandling <em>Room Attribute Handling</em>}</li>
 *   <li>{@link RootElement.impl.ManagerImpl#getRoomHandling <em>Room Handling</em>}</li>
 *   <li>{@link RootElement.impl.ManagerImpl#getRoomTypeHandling <em>Room Type Handling</em>}</li>
 *   <li>{@link RootElement.impl.ManagerImpl#getFeedbackReader <em>Feedback Reader</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManagerImpl extends ClerkImpl implements Manager {
	/**
	 * The cached value of the '{@link #getRoomAttributeHandling() <em>Room Attribute Handling</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomAttributeHandling()
	 * @generated
	 * @ordered
	 */
	protected RoomAttributeHandling roomAttributeHandling;
	/**
	 * The cached value of the '{@link #getRoomHandling() <em>Room Handling</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomHandling()
	 * @generated
	 * @ordered
	 */
	protected RoomHandling roomHandling;
	/**
	 * The cached value of the '{@link #getRoomTypeHandling() <em>Room Type Handling</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeHandling()
	 * @generated
	 * @ordered
	 */
	protected RoomTypeHandling roomTypeHandling;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagerImpl() {
		super();
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
	public RoomAttributeHandling getRoomAttributeHandling() {
		if (roomAttributeHandling != null && roomAttributeHandling.eIsProxy()) {
			InternalEObject oldRoomAttributeHandling = (InternalEObject)roomAttributeHandling;
			roomAttributeHandling = (RoomAttributeHandling)eResolveProxy(oldRoomAttributeHandling);
			if (roomAttributeHandling != oldRoomAttributeHandling) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootElementPackage.MANAGER__ROOM_ATTRIBUTE_HANDLING, oldRoomAttributeHandling, roomAttributeHandling));
			}
		}
		return roomAttributeHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomAttributeHandling basicGetRoomAttributeHandling() {
		return roomAttributeHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomAttributeHandling(RoomAttributeHandling newRoomAttributeHandling) {
		RoomAttributeHandling oldRoomAttributeHandling = roomAttributeHandling;
		roomAttributeHandling = newRoomAttributeHandling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.MANAGER__ROOM_ATTRIBUTE_HANDLING, oldRoomAttributeHandling, roomAttributeHandling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomHandling getRoomHandling() {
		if (roomHandling != null && roomHandling.eIsProxy()) {
			InternalEObject oldRoomHandling = (InternalEObject)roomHandling;
			roomHandling = (RoomHandling)eResolveProxy(oldRoomHandling);
			if (roomHandling != oldRoomHandling) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootElementPackage.MANAGER__ROOM_HANDLING, oldRoomHandling, roomHandling));
			}
		}
		return roomHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomHandling basicGetRoomHandling() {
		return roomHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomHandling(RoomHandling newRoomHandling) {
		RoomHandling oldRoomHandling = roomHandling;
		roomHandling = newRoomHandling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.MANAGER__ROOM_HANDLING, oldRoomHandling, roomHandling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypeHandling getRoomTypeHandling() {
		if (roomTypeHandling != null && roomTypeHandling.eIsProxy()) {
			InternalEObject oldRoomTypeHandling = (InternalEObject)roomTypeHandling;
			roomTypeHandling = (RoomTypeHandling)eResolveProxy(oldRoomTypeHandling);
			if (roomTypeHandling != oldRoomTypeHandling) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootElementPackage.MANAGER__ROOM_TYPE_HANDLING, oldRoomTypeHandling, roomTypeHandling));
			}
		}
		return roomTypeHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypeHandling basicGetRoomTypeHandling() {
		return roomTypeHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomTypeHandling(RoomTypeHandling newRoomTypeHandling) {
		RoomTypeHandling oldRoomTypeHandling = roomTypeHandling;
		roomTypeHandling = newRoomTypeHandling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.MANAGER__ROOM_TYPE_HANDLING, oldRoomTypeHandling, roomTypeHandling));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomAttribute addRoomAttribute(String name, String description) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean editRoomAttribute(RoomAttribute roomAttribute, String newName, String newDescription) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeRoomAttribute(RoomAttribute roomAttribute) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room addRoom(RoomType roomType, int roomNbr) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeRoom(int roomNbr) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editRoom(int roomNbr, RoomType newRoomType, int newRoomNbr) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room findRoom(int roomNbr) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getAllRooms() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType addRoomType(String name, int cost) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean editRoomType(RoomType roomType, String newName, int newCost) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeRoomType(RoomType roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> getAllRoomTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addAttributeToRoomType(RoomType roomType, RoomAttribute roomAttribute) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeAttributeFromRoomType(RoomType roomType, RoomAttribute roomAttribute) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feedback> getAllFeedback() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feedback> getUnreadFeedback() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootElementPackage.MANAGER__ROOM_ATTRIBUTE_HANDLING:
				if (resolve) return getRoomAttributeHandling();
				return basicGetRoomAttributeHandling();
			case RootElementPackage.MANAGER__ROOM_HANDLING:
				if (resolve) return getRoomHandling();
				return basicGetRoomHandling();
			case RootElementPackage.MANAGER__ROOM_TYPE_HANDLING:
				if (resolve) return getRoomTypeHandling();
				return basicGetRoomTypeHandling();
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
			case RootElementPackage.MANAGER__ROOM_ATTRIBUTE_HANDLING:
				setRoomAttributeHandling((RoomAttributeHandling)newValue);
				return;
			case RootElementPackage.MANAGER__ROOM_HANDLING:
				setRoomHandling((RoomHandling)newValue);
				return;
			case RootElementPackage.MANAGER__ROOM_TYPE_HANDLING:
				setRoomTypeHandling((RoomTypeHandling)newValue);
				return;
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
			case RootElementPackage.MANAGER__ROOM_ATTRIBUTE_HANDLING:
				setRoomAttributeHandling((RoomAttributeHandling)null);
				return;
			case RootElementPackage.MANAGER__ROOM_HANDLING:
				setRoomHandling((RoomHandling)null);
				return;
			case RootElementPackage.MANAGER__ROOM_TYPE_HANDLING:
				setRoomTypeHandling((RoomTypeHandling)null);
				return;
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
			case RootElementPackage.MANAGER__ROOM_ATTRIBUTE_HANDLING:
				return roomAttributeHandling != null;
			case RootElementPackage.MANAGER__ROOM_HANDLING:
				return roomHandling != null;
			case RootElementPackage.MANAGER__ROOM_TYPE_HANDLING:
				return roomTypeHandling != null;
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == RoomAttributeHandling.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RoomHandling.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RoomTypeHandling.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SysAdmin.class) {
			switch (derivedFeatureID) {
				case RootElementPackage.MANAGER__ROOM_ATTRIBUTE_HANDLING: return RootElementPackage.SYS_ADMIN__ROOM_ATTRIBUTE_HANDLING;
				case RootElementPackage.MANAGER__ROOM_HANDLING: return RootElementPackage.SYS_ADMIN__ROOM_HANDLING;
				case RootElementPackage.MANAGER__ROOM_TYPE_HANDLING: return RootElementPackage.SYS_ADMIN__ROOM_TYPE_HANDLING;
				default: return -1;
			}
		}
		if (baseClass == FeedbackReader.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == RoomAttributeHandling.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RoomHandling.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RoomTypeHandling.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SysAdmin.class) {
			switch (baseFeatureID) {
				case RootElementPackage.SYS_ADMIN__ROOM_ATTRIBUTE_HANDLING: return RootElementPackage.MANAGER__ROOM_ATTRIBUTE_HANDLING;
				case RootElementPackage.SYS_ADMIN__ROOM_HANDLING: return RootElementPackage.MANAGER__ROOM_HANDLING;
				case RootElementPackage.SYS_ADMIN__ROOM_TYPE_HANDLING: return RootElementPackage.MANAGER__ROOM_TYPE_HANDLING;
				default: return -1;
			}
		}
		if (baseClass == FeedbackReader.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
				default: return -1;
			}
		}
		if (baseClass == RoomHandling.class) {
			switch (baseOperationID) {
				case RootElementPackage.ROOM_HANDLING___ADD_ROOM__ROOMTYPE_INT: return RootElementPackage.MANAGER___ADD_ROOM__ROOMTYPE_INT;
				case RootElementPackage.ROOM_HANDLING___REMOVE_ROOM__INT: return RootElementPackage.MANAGER___REMOVE_ROOM__INT;
				case RootElementPackage.ROOM_HANDLING___EDIT_ROOM__INT_ROOMTYPE_INT: return RootElementPackage.MANAGER___EDIT_ROOM__INT_ROOMTYPE_INT;
				case RootElementPackage.ROOM_HANDLING___FIND_ROOM__INT: return RootElementPackage.MANAGER___FIND_ROOM__INT;
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
			case RootElementPackage.MANAGER___ADD_ROOM__ROOMTYPE_INT:
				return addRoom((RoomType)arguments.get(0), (Integer)arguments.get(1));
			case RootElementPackage.MANAGER___REMOVE_ROOM__INT:
				return removeRoom((Integer)arguments.get(0));
			case RootElementPackage.MANAGER___EDIT_ROOM__INT_ROOMTYPE_INT:
				editRoom((Integer)arguments.get(0), (RoomType)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case RootElementPackage.MANAGER___FIND_ROOM__INT:
				return findRoom((Integer)arguments.get(0));
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
			case RootElementPackage.MANAGER___GET_ALL_FEEDBACK:
				return getAllFeedback();
			case RootElementPackage.MANAGER___GET_UNREAD_FEEDBACK:
				return getUnreadFeedback();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ManagerImpl
