/**
 */
package RootElement.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import RootElement.Room;
import RootElement.RoomType;
import RootElement.RootElementPackage;

/**
 * An implementation of the model object '<em><b>Room</b></em>'.
 * 
 * The room is a container of data that maps 1 to 1 to a certain
 * physical room in the concrete hotel that is modelled.
 * 
 * @author Matz Larsson
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #isOccupied() <em>Is Occupied</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OCCUPIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOccupied() <em>Is Occupied</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected boolean isOccupied = IS_OCCUPIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoomName() <em>Room Name</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected static final String ROOM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoomName() <em>Room Name</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected String roomName = ROOM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isNeedCleaning() <em>Need Cleaning</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEED_CLEANING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedCleaning() <em>Need Cleaning</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected boolean needCleaning = NEED_CLEANING_EDEFAULT;

	/**
	 * The room type this room is categorized in.
	 * @generated
	 * @ordered
	 */
	protected RoomType roomType;

	/**
	 * Creates a basic room with the default parameters.
	 * Be sure to call {@link #setRoomName(String)} and {@link #setRoomtype(RoomType)}
	 * after gaining access to a room type object to initialize it.
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * Checks whether a room is currently occupied or not.
	 * @generated
	 */
	public boolean isOccupied() {
		return isOccupied;
	}

	/**
	 * Sets the status of the room to occupied or not
	 * @generated NOT
	 */
	public void setIsOccupied(boolean newIsOccupied) {
		boolean oldIsOccupied = isOccupied;
		isOccupied = newIsOccupied;
		if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.ROOM__IS_OCCUPIED, oldIsOccupied, isOccupied));
		}
	}

	/**
	 * Retrieves the name of the room
	 * @generated
	 */
	public String getRoomName() {
		return roomName;
	}

	/**
	 * Sets the name of this room. This name should be unique for all
	 * rooms in one hotel.
	 * @generated NOT
	 */
	public void setRoomName(String newRoomName) {
		String oldRoomName = roomName;
		roomName = newRoomName;
		if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.ROOM__ROOM_NAME, oldRoomName, roomName));
		}
	}

	/**
	 * Retrieves if the room needs some cleaning
	 * @generated
	 */
	public boolean isNeedCleaning() {
		return needCleaning;
	}

	/**
	 * Sets the cleaning status of the room
	 * @generated NOT
	 */
	public void setNeedCleaning(boolean newNeedCleaning) {
		boolean oldNeedCleaning = needCleaning;
		needCleaning = newNeedCleaning;
		if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.ROOM__NEED_CLEANING, oldNeedCleaning, needCleaning));
		}
	}

	/**
	 * Retrieves the room type this room is categorized in.
	 * @generated NOT
	 */
	public RoomType getRoomType() {
		return roomType;
	}

	/**
	 * Sets the room type this room should be categorized in.
	 * @generated NOT
	 */
	public void setRoomType(RoomType newRoomType) {
		RoomType oldRoomType = roomType;
		roomType = newRoomType;
		if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.ROOM__ROOM_TYPE, oldRoomType, roomType));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.ROOM;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootElementPackage.ROOM__IS_OCCUPIED:
				return isOccupied();
			case RootElementPackage.ROOM__ROOM_NAME:
				return getRoomName();
			case RootElementPackage.ROOM__NEED_CLEANING:
				return isNeedCleaning();
			case RootElementPackage.ROOM__ROOM_TYPE:
				return getRoomType();
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
			case RootElementPackage.ROOM__IS_OCCUPIED:
				setIsOccupied((Boolean)newValue);
				return;
			case RootElementPackage.ROOM__ROOM_NAME:
				setRoomName((String)newValue);
				return;
			case RootElementPackage.ROOM__NEED_CLEANING:
				setNeedCleaning((Boolean)newValue);
				return;
			case RootElementPackage.ROOM__ROOM_TYPE:
				setRoomType((RoomType)newValue);
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
			case RootElementPackage.ROOM__IS_OCCUPIED:
				setIsOccupied(IS_OCCUPIED_EDEFAULT);
				return;
			case RootElementPackage.ROOM__ROOM_NAME:
				setRoomName(ROOM_NAME_EDEFAULT);
				return;
			case RootElementPackage.ROOM__NEED_CLEANING:
				setNeedCleaning(NEED_CLEANING_EDEFAULT);
				return;
			case RootElementPackage.ROOM__ROOM_TYPE:
				setRoomType((RoomType)null);
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
			case RootElementPackage.ROOM__IS_OCCUPIED:
				return isOccupied != IS_OCCUPIED_EDEFAULT;
			case RootElementPackage.ROOM__ROOM_NAME:
				return ROOM_NAME_EDEFAULT == null ? roomName != null : !ROOM_NAME_EDEFAULT.equals(roomName);
			case RootElementPackage.ROOM__NEED_CLEANING:
				return needCleaning != NEED_CLEANING_EDEFAULT;
			case RootElementPackage.ROOM__ROOM_TYPE:
				return roomType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isOccupied: ");
		result.append(isOccupied);
		result.append(", roomName: ");
		result.append(roomName);
		result.append(", needCleaning: ");
		result.append(needCleaning);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
