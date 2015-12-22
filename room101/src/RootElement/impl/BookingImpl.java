/**
 */
package RootElement.impl;

import RootElement.Booking;
import RootElement.Guest;
import RootElement.RoomBooking;
import RootElement.RootElementPackage;

import RootElement.ServiceItem;
import java.lang.reflect.InvocationTargetException;

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
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.impl.BookingImpl#getBookingID <em>Booking ID</em>}</li>
 *   <li>{@link RootElement.impl.BookingImpl#getRoombooking <em>Roombooking</em>}</li>
 *   <li>{@link RootElement.impl.BookingImpl#getGuest <em>Guest</em>}</li>
 *   <li>{@link RootElement.impl.BookingImpl#getServiceitem <em>Serviceitem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
	/**
	 * The default value of the '{@link #getBookingID() <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingID()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOKING_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBookingID() <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingID()
	 * @generated
	 * @ordered
	 */
	protected String bookingID = BOOKING_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoombooking() <em>Roombooking</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoombooking()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomBooking> roombooking;

	/**
	 * The cached value of the '{@link #getGuest() <em>Guest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuest()
	 * @generated
	 * @ordered
	 */
	protected Guest guest;

	/**
	 * The cached value of the '{@link #getServiceitem() <em>Serviceitem</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceitem()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceItem> serviceitem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBookingID() {
		return bookingID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingID(String newBookingID) {
		String oldBookingID = bookingID;
		bookingID = newBookingID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.BOOKING__BOOKING_ID, oldBookingID, bookingID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomBooking> getRoombooking() {
		if (roombooking == null) {
			roombooking = new EObjectResolvingEList<RoomBooking>(RoomBooking.class, this, RootElementPackage.BOOKING__ROOMBOOKING);
		}
		return roombooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guest getGuest() {
		if (guest != null && guest.eIsProxy()) {
			InternalEObject oldGuest = (InternalEObject)guest;
			guest = (Guest)eResolveProxy(oldGuest);
			if (guest != oldGuest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootElementPackage.BOOKING__GUEST, oldGuest, guest));
			}
		}
		return guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guest basicGetGuest() {
		return guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuest(Guest newGuest) {
		Guest oldGuest = guest;
		guest = newGuest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.BOOKING__GUEST, oldGuest, guest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceItem> getServiceitem() {
		if (serviceitem == null) {
			serviceitem = new EObjectResolvingEList<ServiceItem>(ServiceItem.class, this, RootElementPackage.BOOKING__SERVICEITEM);
		}
		return serviceitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addServiceItem(String name, String description, int price) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeServiceItem(ServiceItem serviceItem) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceItem findAllServiceItems(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int calculateCost() {
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
			case RootElementPackage.BOOKING__BOOKING_ID:
				return getBookingID();
			case RootElementPackage.BOOKING__ROOMBOOKING:
				return getRoombooking();
			case RootElementPackage.BOOKING__GUEST:
				if (resolve) return getGuest();
				return basicGetGuest();
			case RootElementPackage.BOOKING__SERVICEITEM:
				return getServiceitem();
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
			case RootElementPackage.BOOKING__BOOKING_ID:
				setBookingID((String)newValue);
				return;
			case RootElementPackage.BOOKING__ROOMBOOKING:
				getRoombooking().clear();
				getRoombooking().addAll((Collection<? extends RoomBooking>)newValue);
				return;
			case RootElementPackage.BOOKING__GUEST:
				setGuest((Guest)newValue);
				return;
			case RootElementPackage.BOOKING__SERVICEITEM:
				getServiceitem().clear();
				getServiceitem().addAll((Collection<? extends ServiceItem>)newValue);
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
			case RootElementPackage.BOOKING__BOOKING_ID:
				setBookingID(BOOKING_ID_EDEFAULT);
				return;
			case RootElementPackage.BOOKING__ROOMBOOKING:
				getRoombooking().clear();
				return;
			case RootElementPackage.BOOKING__GUEST:
				setGuest((Guest)null);
				return;
			case RootElementPackage.BOOKING__SERVICEITEM:
				getServiceitem().clear();
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
			case RootElementPackage.BOOKING__BOOKING_ID:
				return BOOKING_ID_EDEFAULT == null ? bookingID != null : !BOOKING_ID_EDEFAULT.equals(bookingID);
			case RootElementPackage.BOOKING__ROOMBOOKING:
				return roombooking != null && !roombooking.isEmpty();
			case RootElementPackage.BOOKING__GUEST:
				return guest != null;
			case RootElementPackage.BOOKING__SERVICEITEM:
				return serviceitem != null && !serviceitem.isEmpty();
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
			case RootElementPackage.BOOKING___ADD_SERVICE_ITEM__STRING_STRING_INT:
				addServiceItem((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case RootElementPackage.BOOKING___REMOVE_SERVICE_ITEM__SERVICEITEM:
				removeServiceItem((ServiceItem)arguments.get(0));
				return null;
			case RootElementPackage.BOOKING___FIND_ALL_SERVICE_ITEMS__BOOKING:
				return findAllServiceItems((Booking)arguments.get(0));
			case RootElementPackage.BOOKING___CALCULATE_COST:
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
		result.append(" (bookingID: ");
		result.append(bookingID);
		result.append(')');
		return result.toString();
	}

} //BookingImpl
