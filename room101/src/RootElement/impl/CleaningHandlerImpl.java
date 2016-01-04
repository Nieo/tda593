/**
 */
package RootElement.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.NoSuchElementException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import RootElement.CleaningHandler;
import RootElement.Room;
import RootElement.RoomFetcher;
import RootElement.RootElementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cleaning Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.impl.CleaningHandlerImpl#getRoomFetcher <em>Room Fetcher</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CleaningHandlerImpl extends MinimalEObjectImpl.Container implements CleaningHandler {
	/**
	 * The cached value of the '{@link #getRoomFetcher() <em>Room Fetcher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomFetcher()
	 * @generated
	 * @ordered
	 */
	protected RoomFetcher roomFetcher;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected CleaningHandlerImpl() {
		super();
		roomFetcher = RoomSetupFactory.createRoomFetcher();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.CLEANING_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomFetcher getRoomFetcher() {
		if (roomFetcher != null && roomFetcher.eIsProxy()) {
			InternalEObject oldRoomFetcher = (InternalEObject)roomFetcher;
			roomFetcher = (RoomFetcher)eResolveProxy(oldRoomFetcher);
			if (roomFetcher != oldRoomFetcher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootElementPackage.CLEANING_HANDLER__ROOM_FETCHER, oldRoomFetcher, roomFetcher));
			}
		}
		return roomFetcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomFetcher basicGetRoomFetcher() {
		return roomFetcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomFetcher(RoomFetcher newRoomFetcher) {
		RoomFetcher oldRoomFetcher = roomFetcher;
		roomFetcher = newRoomFetcher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.CLEANING_HANDLER__ROOM_FETCHER, oldRoomFetcher, roomFetcher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * A method for checking if a specific room needs cleaning.
	 * @return true if the room is clean
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @throws NoSuchElementException if there are no rooms with the roomId
	 */
	public boolean checkIfRoomCleaned(String roomID) throws NoSuchElementException {
		for(Room r: roomFetcher.getAllCleanableRooms()){
			if(r.getRoomName().equals(roomID)){
				return !r.isNeedCleaning(); 
			}
		}
		throw new NoSuchElementException("No room with the roomID in the hotel"); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * A method for getting all the unclean rooms
	 * @return A list of all the unclean rooms
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Room> getListOfUncleanRooms() {
		EList<Room> listOfUncleanRooms = ECollections.<Room>newBasicEList();
		
		for(Room r: roomFetcher.getAllCleanableRooms()){	
			if(r.isNeedCleaning())
				listOfUncleanRooms.add(r);
		}

		return listOfUncleanRooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Marks a room as cleaned
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void markRoomAsCleaned(Room room) {
		/*Really unsure if this is permitted*/
		room.setNeedCleaning(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootElementPackage.CLEANING_HANDLER__ROOM_FETCHER:
				if (resolve) return getRoomFetcher();
				return basicGetRoomFetcher();
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
			case RootElementPackage.CLEANING_HANDLER__ROOM_FETCHER:
				setRoomFetcher((RoomFetcher)newValue);
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
			case RootElementPackage.CLEANING_HANDLER__ROOM_FETCHER:
				setRoomFetcher((RoomFetcher)null);
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
			case RootElementPackage.CLEANING_HANDLER__ROOM_FETCHER:
				return roomFetcher != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RootElementPackage.CLEANING_HANDLER___CHECK_IF_ROOM_CLEANED__STRING:
				return checkIfRoomCleaned((String)arguments.get(0));
			case RootElementPackage.CLEANING_HANDLER___GET_LIST_OF_UNCLEAN_ROOMS:
				return getListOfUncleanRooms();
			case RootElementPackage.CLEANING_HANDLER___MARK_ROOM_AS_CLEANED__ROOM:
				markRoomAsCleaned((Room)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CleaningHandlerImpl
