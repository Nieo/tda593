/**
 */
package RootElement.impl;

import RootElement.Room;
import RootElement.RoomType;
import RootElement.RootElementPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.impl.RoomImpl#isOccupied <em>Is Occupied</em>}</li>
 *   <li>{@link RootElement.impl.RoomImpl#getRoomID <em>Room ID</em>}</li>
 *   <li>{@link RootElement.impl.RoomImpl#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link RootElement.impl.RoomImpl#isNeedCleaning <em>Need Cleaning</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #isOccupied() <em>Is Occupied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOccupied()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OCCUPIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOccupied() <em>Is Occupied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOccupied()
	 * @generated
	 * @ordered
	 */
	protected boolean isOccupied = IS_OCCUPIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoomID() <em>Room ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomID()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoomID() <em>Room ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomID()
	 * @generated
	 * @ordered
	 */
	protected String roomID = ROOM_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomType() <em>Room Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected RoomType roomType;

	/**
	 * The default value of the '{@link #isNeedCleaning() <em>Need Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedCleaning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEED_CLEANING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedCleaning() <em>Need Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedCleaning()
	 * @generated
	 * @ordered
	 */
	protected boolean needCleaning = NEED_CLEANING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
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
	public boolean isOccupied() {
		return isOccupied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOccupied(boolean newIsOccupied) {
		boolean oldIsOccupied = isOccupied;
		isOccupied = newIsOccupied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.ROOM__IS_OCCUPIED, oldIsOccupied, isOccupied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomID() {
		return roomID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomID(String newRoomID) {
		String oldRoomID = roomID;
		roomID = newRoomID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.ROOM__ROOM_ID, oldRoomID, roomID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getRoomType() {
		if (roomType != null && roomType.eIsProxy()) {
			InternalEObject oldRoomType = (InternalEObject)roomType;
			roomType = (RoomType)eResolveProxy(oldRoomType);
			if (roomType != oldRoomType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootElementPackage.ROOM__ROOM_TYPE, oldRoomType, roomType));
			}
		}
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType basicGetRoomType() {
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomType(RoomType newRoomType) {
		RoomType oldRoomType = roomType;
		roomType = newRoomType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.ROOM__ROOM_TYPE, oldRoomType, roomType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedCleaning() {
		return needCleaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedCleaning(boolean newNeedCleaning) {
		boolean oldNeedCleaning = needCleaning;
		needCleaning = newNeedCleaning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.ROOM__NEED_CLEANING, oldNeedCleaning, needCleaning));
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
			case RootElementPackage.ROOM__ROOM_ID:
				return getRoomID();
			case RootElementPackage.ROOM__ROOM_TYPE:
				if (resolve) return getRoomType();
				return basicGetRoomType();
			case RootElementPackage.ROOM__NEED_CLEANING:
				return isNeedCleaning();
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
			case RootElementPackage.ROOM__ROOM_ID:
				setRoomID((String)newValue);
				return;
			case RootElementPackage.ROOM__ROOM_TYPE:
				setRoomType((RoomType)newValue);
				return;
			case RootElementPackage.ROOM__NEED_CLEANING:
				setNeedCleaning((Boolean)newValue);
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
			case RootElementPackage.ROOM__ROOM_ID:
				setRoomID(ROOM_ID_EDEFAULT);
				return;
			case RootElementPackage.ROOM__ROOM_TYPE:
				setRoomType((RoomType)null);
				return;
			case RootElementPackage.ROOM__NEED_CLEANING:
				setNeedCleaning(NEED_CLEANING_EDEFAULT);
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
			case RootElementPackage.ROOM__ROOM_ID:
				return ROOM_ID_EDEFAULT == null ? roomID != null : !ROOM_ID_EDEFAULT.equals(roomID);
			case RootElementPackage.ROOM__ROOM_TYPE:
				return roomType != null;
			case RootElementPackage.ROOM__NEED_CLEANING:
				return needCleaning != NEED_CLEANING_EDEFAULT;
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
		result.append(", roomID: ");
		result.append(roomID);
		result.append(", needCleaning: ");
		result.append(needCleaning);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
