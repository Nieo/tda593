/**
 */
package RootElement.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import RootElement.BookingStatus;
import RootElement.Room;
import RootElement.RoomBooking;
import RootElement.RootElementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.impl.RoomBookingImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link RootElement.impl.RoomBookingImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link RootElement.impl.RoomBookingImpl#getBookingStatus <em>Booking Status</em>}</li>
 *   <li>{@link RootElement.impl.RoomBookingImpl#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RoomBookingImpl extends MinimalEObjectImpl.Container implements RoomBooking {
	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBookingStatus() <em>Booking Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingStatus()
	 * @generated
	 * @ordered
	 */
	protected static final BookingStatus BOOKING_STATUS_EDEFAULT = BookingStatus.NONE;

	/**
	 * The cached value of the '{@link #getBookingStatus() <em>Booking Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingStatus()
	 * @generated
	 * @ordered
	 */
	protected BookingStatus bookingStatus = BOOKING_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected Room room;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomBookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.ROOM_BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.ROOM_BOOKING__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.ROOM_BOOKING__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingStatus(BookingStatus newBookingStatus) {
		BookingStatus oldBookingStatus = bookingStatus;
		bookingStatus = newBookingStatus == null ? BOOKING_STATUS_EDEFAULT : newBookingStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.ROOM_BOOKING__BOOKING_STATUS, oldBookingStatus, bookingStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject)room;
			room = (Room)eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootElementPackage.ROOM_BOOKING__ROOM, oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		Room oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.ROOM_BOOKING__ROOM, oldRoom, room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int calculateCost() {
		int price = room.getRoomType().getPrice();
		return price*getBookingTimeUnits()+price*getOverdueTimeUnits();
	}
	
	private int getBookingTimeUnits(){
		return (int)getTimeUnit().convert(getEndDate().getTime()-getStartDate().getTime(), TimeUnit.MILLISECONDS);
	}
	
	private int getOverdueTimeUnits(){
		if(getEndDate().after(new Date())){
			return 0;
		}else{
			return Math.max(0, (int)getTimeUnit().convert(new Date().getTime()-getEndDate().getTime(), TimeUnit.MILLISECONDS));
		}
	}
	
	protected abstract TimeUnit getTimeUnit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootElementPackage.ROOM_BOOKING__START_DATE:
				return getStartDate();
			case RootElementPackage.ROOM_BOOKING__END_DATE:
				return getEndDate();
			case RootElementPackage.ROOM_BOOKING__BOOKING_STATUS:
				return getBookingStatus();
			case RootElementPackage.ROOM_BOOKING__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
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
			case RootElementPackage.ROOM_BOOKING__START_DATE:
				setStartDate((Date)newValue);
				return;
			case RootElementPackage.ROOM_BOOKING__END_DATE:
				setEndDate((Date)newValue);
				return;
			case RootElementPackage.ROOM_BOOKING__BOOKING_STATUS:
				setBookingStatus((BookingStatus)newValue);
				return;
			case RootElementPackage.ROOM_BOOKING__ROOM:
				setRoom((Room)newValue);
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
			case RootElementPackage.ROOM_BOOKING__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case RootElementPackage.ROOM_BOOKING__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case RootElementPackage.ROOM_BOOKING__BOOKING_STATUS:
				setBookingStatus(BOOKING_STATUS_EDEFAULT);
				return;
			case RootElementPackage.ROOM_BOOKING__ROOM:
				setRoom((Room)null);
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
			case RootElementPackage.ROOM_BOOKING__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case RootElementPackage.ROOM_BOOKING__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case RootElementPackage.ROOM_BOOKING__BOOKING_STATUS:
				return bookingStatus != BOOKING_STATUS_EDEFAULT;
			case RootElementPackage.ROOM_BOOKING__ROOM:
				return room != null;
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
			case RootElementPackage.ROOM_BOOKING___CALCULATE_COST:
				return calculateCost();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", bookingStatus: ");
		result.append(bookingStatus);
		result.append(')');
		return result.toString();
	}

} //RoomBookingImpl
