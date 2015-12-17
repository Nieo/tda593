/**
 */
package RootElement.impl;

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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sys Admin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.impl.SysAdminImpl#getRoomAttributeHandling <em>Room Attribute Handling</em>}</li>
 *   <li>{@link RootElement.impl.SysAdminImpl#getRoomHandling <em>Room Handling</em>}</li>
 *   <li>{@link RootElement.impl.SysAdminImpl#getRoomTypeHandling <em>Room Type Handling</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SysAdminImpl extends MinimalEObjectImpl.Container implements SysAdmin {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SysAdminImpl() {
		super();
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
	public RoomAttributeHandling getRoomAttributeHandling() {
		if (roomAttributeHandling != null && roomAttributeHandling.eIsProxy()) {
			InternalEObject oldRoomAttributeHandling = (InternalEObject)roomAttributeHandling;
			roomAttributeHandling = (RoomAttributeHandling)eResolveProxy(oldRoomAttributeHandling);
			if (roomAttributeHandling != oldRoomAttributeHandling) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootElementPackage.SYS_ADMIN__ROOM_ATTRIBUTE_HANDLING, oldRoomAttributeHandling, roomAttributeHandling));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.SYS_ADMIN__ROOM_ATTRIBUTE_HANDLING, oldRoomAttributeHandling, roomAttributeHandling));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootElementPackage.SYS_ADMIN__ROOM_HANDLING, oldRoomHandling, roomHandling));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.SYS_ADMIN__ROOM_HANDLING, oldRoomHandling, roomHandling));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootElementPackage.SYS_ADMIN__ROOM_TYPE_HANDLING, oldRoomTypeHandling, roomTypeHandling));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.SYS_ADMIN__ROOM_TYPE_HANDLING, oldRoomTypeHandling, roomTypeHandling));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootElementPackage.SYS_ADMIN__ROOM_ATTRIBUTE_HANDLING:
				if (resolve) return getRoomAttributeHandling();
				return basicGetRoomAttributeHandling();
			case RootElementPackage.SYS_ADMIN__ROOM_HANDLING:
				if (resolve) return getRoomHandling();
				return basicGetRoomHandling();
			case RootElementPackage.SYS_ADMIN__ROOM_TYPE_HANDLING:
				if (resolve) return getRoomTypeHandling();
				return basicGetRoomTypeHandling();
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
			case RootElementPackage.SYS_ADMIN__ROOM_ATTRIBUTE_HANDLING:
				setRoomAttributeHandling((RoomAttributeHandling)newValue);
				return;
			case RootElementPackage.SYS_ADMIN__ROOM_HANDLING:
				setRoomHandling((RoomHandling)newValue);
				return;
			case RootElementPackage.SYS_ADMIN__ROOM_TYPE_HANDLING:
				setRoomTypeHandling((RoomTypeHandling)newValue);
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
			case RootElementPackage.SYS_ADMIN__ROOM_ATTRIBUTE_HANDLING:
				setRoomAttributeHandling((RoomAttributeHandling)null);
				return;
			case RootElementPackage.SYS_ADMIN__ROOM_HANDLING:
				setRoomHandling((RoomHandling)null);
				return;
			case RootElementPackage.SYS_ADMIN__ROOM_TYPE_HANDLING:
				setRoomTypeHandling((RoomTypeHandling)null);
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
			case RootElementPackage.SYS_ADMIN__ROOM_ATTRIBUTE_HANDLING:
				return roomAttributeHandling != null;
			case RootElementPackage.SYS_ADMIN__ROOM_HANDLING:
				return roomHandling != null;
			case RootElementPackage.SYS_ADMIN__ROOM_TYPE_HANDLING:
				return roomTypeHandling != null;
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
		if (baseClass == RoomHandling.class) {
			switch (baseOperationID) {
				case RootElementPackage.ROOM_HANDLING___ADD_ROOM__ROOMTYPE_INT: return RootElementPackage.SYS_ADMIN___ADD_ROOM__ROOMTYPE_INT;
				case RootElementPackage.ROOM_HANDLING___REMOVE_ROOM__INT: return RootElementPackage.SYS_ADMIN___REMOVE_ROOM__INT;
				case RootElementPackage.ROOM_HANDLING___EDIT_ROOM__INT_ROOMTYPE_INT: return RootElementPackage.SYS_ADMIN___EDIT_ROOM__INT_ROOMTYPE_INT;
				case RootElementPackage.ROOM_HANDLING___FIND_ROOM__INT: return RootElementPackage.SYS_ADMIN___FIND_ROOM__INT;
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
			case RootElementPackage.SYS_ADMIN___ADD_ROOM__ROOMTYPE_INT:
				return addRoom((RoomType)arguments.get(0), (Integer)arguments.get(1));
			case RootElementPackage.SYS_ADMIN___REMOVE_ROOM__INT:
				return removeRoom((Integer)arguments.get(0));
			case RootElementPackage.SYS_ADMIN___EDIT_ROOM__INT_ROOMTYPE_INT:
				editRoom((Integer)arguments.get(0), (RoomType)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case RootElementPackage.SYS_ADMIN___FIND_ROOM__INT:
				return findRoom((Integer)arguments.get(0));
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
		}
		return super.eInvoke(operationID, arguments);
	}

} //SysAdminImpl
