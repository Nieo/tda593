/**
 */
package RootElement.impl;

import RootElement.Booking;
import RootElement.BookingHandler;
import RootElement.RoomFetcher;
import RootElement.RootElementPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.impl.BookingHandlerImpl#getBooking <em>Booking</em>}</li>
 *   <li>{@link RootElement.impl.BookingHandlerImpl#getRoomFetcher <em>Room Fetcher</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingHandlerImpl extends MinimalEObjectImpl.Container implements BookingHandler {
	/**
	 * The cached value of the '{@link #getBooking() <em>Booking</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking> booking;

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
	 * @generated
	 */
	protected BookingHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.BOOKING_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getBooking() {
		if (booking == null) {
			booking = new EObjectResolvingEList<Booking>(Booking.class, this, RootElementPackage.BOOKING_HANDLER__BOOKING);
		}
		return booking;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootElementPackage.BOOKING_HANDLER__ROOM_FETCHER, oldRoomFetcher, roomFetcher));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.BOOKING_HANDLER__ROOM_FETCHER, oldRoomFetcher, roomFetcher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootElementPackage.BOOKING_HANDLER__BOOKING:
				return getBooking();
			case RootElementPackage.BOOKING_HANDLER__ROOM_FETCHER:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RootElementPackage.BOOKING_HANDLER__BOOKING:
				getBooking().clear();
				getBooking().addAll((Collection<? extends Booking>)newValue);
				return;
			case RootElementPackage.BOOKING_HANDLER__ROOM_FETCHER:
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
			case RootElementPackage.BOOKING_HANDLER__BOOKING:
				getBooking().clear();
				return;
			case RootElementPackage.BOOKING_HANDLER__ROOM_FETCHER:
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
			case RootElementPackage.BOOKING_HANDLER__BOOKING:
				return booking != null && !booking.isEmpty();
			case RootElementPackage.BOOKING_HANDLER__ROOM_FETCHER:
				return roomFetcher != null;
		}
		return super.eIsSet(featureID);
	}

} //BookingHandlerImpl
