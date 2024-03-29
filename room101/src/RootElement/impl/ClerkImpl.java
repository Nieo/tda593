/**
 */
package RootElement.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import RootElement.Booking;
import RootElement.Clerk;
import RootElement.MakeBooking;
import RootElement.Payment;
import RootElement.ReceptionHandling;
import RootElement.Room;
import RootElement.RoomBooking;
import RootElement.RoomType;
import RootElement.RootElementPackage;
import RootElement.ServiceItem;
import RootElement.ServiceItemHandling;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clerk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.impl.ClerkImpl#getReceptionHandling <em>Reception Handling</em>}</li>
 *   <li>{@link RootElement.impl.ClerkImpl#getServiceItemHandling <em>Service Item Handling</em>}</li>
 *   <li>{@link RootElement.impl.ClerkImpl#getMakeBooking <em>Make Booking</em>}</li>
 *   <li>{@link RootElement.impl.ClerkImpl#getPayment <em>Payment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClerkImpl extends StaffImpl implements Clerk {
	/**
	 * The cached value of the '{@link #getReceptionHandling() <em>Reception Handling</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceptionHandling()
	 * @generated
	 * @ordered
	 */
	protected ReceptionHandling receptionHandling;
	/**
	 * The cached value of the '{@link #getServiceItemHandling() <em>Service Item Handling</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceItemHandling()
	 * @generated
	 * @ordered
	 */
	protected ServiceItemHandling serviceItemHandling;
	/**
	 * The cached value of the '{@link #getMakeBooking() <em>Make Booking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMakeBooking()
	 * @generated
	 * @ordered
	 */
	protected MakeBooking makeBooking;
	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected Payment payment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ClerkImpl() {
		super();
		receptionHandling = BookingHandlerFactory.createReceptionHandling();
		serviceItemHandling = BookingHandlerFactory.createSerciveItemHandling();
		makeBooking = BookingHandlerFactory.createMakeBooking();
		payment = PaymentHandlerFactory.createPayment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.CLERK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceptionHandling getReceptionHandling() {
		if (receptionHandling != null && receptionHandling.eIsProxy()) {
			InternalEObject oldReceptionHandling = (InternalEObject)receptionHandling;
			receptionHandling = (ReceptionHandling)eResolveProxy(oldReceptionHandling);
			if (receptionHandling != oldReceptionHandling) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootElementPackage.CLERK__RECEPTION_HANDLING, oldReceptionHandling, receptionHandling));
			}
		}
		return receptionHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceptionHandling basicGetReceptionHandling() {
		return receptionHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceptionHandling(ReceptionHandling newReceptionHandling) {
		ReceptionHandling oldReceptionHandling = receptionHandling;
		receptionHandling = newReceptionHandling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.CLERK__RECEPTION_HANDLING, oldReceptionHandling, receptionHandling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceItemHandling getServiceItemHandling() {
		if (serviceItemHandling != null && serviceItemHandling.eIsProxy()) {
			InternalEObject oldServiceItemHandling = (InternalEObject)serviceItemHandling;
			serviceItemHandling = (ServiceItemHandling)eResolveProxy(oldServiceItemHandling);
			if (serviceItemHandling != oldServiceItemHandling) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootElementPackage.CLERK__SERVICE_ITEM_HANDLING, oldServiceItemHandling, serviceItemHandling));
			}
		}
		return serviceItemHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceItemHandling basicGetServiceItemHandling() {
		return serviceItemHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceItemHandling(ServiceItemHandling newServiceItemHandling) {
		ServiceItemHandling oldServiceItemHandling = serviceItemHandling;
		serviceItemHandling = newServiceItemHandling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.CLERK__SERVICE_ITEM_HANDLING, oldServiceItemHandling, serviceItemHandling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MakeBooking getMakeBooking() {
		if (makeBooking != null && makeBooking.eIsProxy()) {
			InternalEObject oldMakeBooking = (InternalEObject)makeBooking;
			makeBooking = (MakeBooking)eResolveProxy(oldMakeBooking);
			if (makeBooking != oldMakeBooking) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootElementPackage.CLERK__MAKE_BOOKING, oldMakeBooking, makeBooking));
			}
		}
		return makeBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MakeBooking basicGetMakeBooking() {
		return makeBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMakeBooking(MakeBooking newMakeBooking) {
		MakeBooking oldMakeBooking = makeBooking;
		makeBooking = newMakeBooking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.CLERK__MAKE_BOOKING, oldMakeBooking, makeBooking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Payment getPayment() {
		if (payment != null && payment.eIsProxy()) {
			InternalEObject oldPayment = (InternalEObject)payment;
			payment = (Payment)eResolveProxy(oldPayment);
			if (payment != oldPayment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootElementPackage.CLERK__PAYMENT, oldPayment, payment));
			}
		}
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Payment basicGetPayment() {
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayment(Payment newPayment) {
		Payment oldPayment = payment;
		payment = newPayment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.CLERK__PAYMENT, oldPayment, payment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Room checkIn(RoomBooking booking) {
		return receptionHandling.checkIn(booking);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean checkOut(RoomBooking booking) {
		return receptionHandling.checkOut(booking);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Booking> findBookings(String name) {
		return receptionHandling.findBookings(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking findActiveBooking(String roomName) {
		return receptionHandling.findActiveBooking(roomName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addServiceItem(Booking booking, String name, String description, int price) {
		serviceItemHandling.addServiceItem(booking, name, description, price);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeServiceItem(Booking booking, ServiceItem serviceItem) {
		serviceItemHandling.removeServiceItem(booking, serviceItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ServiceItem> findAllServiceItems(Booking booking) {
		return serviceItemHandling.findAllServiceItems(booking);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking createBooking() {
		return makeBooking.createBooking();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<RoomType> getAvailableRooms(Date startDate, Date endDate, int nbrOfAdults, int nbrOfChildren) {
		return makeBooking.getAvailableRooms(startDate, endDate, nbrOfAdults, nbrOfChildren);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addRoom(Booking booking, RoomType room, int nbrOfAdults, int nbrOfChildren, Date startDate, Date endDate) {
		return makeBooking.addRoom(booking, room, nbrOfAdults, nbrOfChildren, startDate, endDate);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean confirmBooking(Booking booking, String name, String phone, String mail, String nationality, int passportNr, String nextDestination) {
		return makeBooking.confirmBooking(booking, name, phone, mail, nationality, passportNr, nextDestination);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean cancelBooking(Booking booking) {
		return makeBooking.cancelBooking(booking);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Booking> lookupBooking(String name, String phoneNumber) {
		return makeBooking.lookupBooking(name, phoneNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean verifyCreditCard(String creditCard) {
		return payment.verifyCreditCard(creditCard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean debitCard(String creditCard, int amount) {
		return payment.debitCard(creditCard, amount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootElementPackage.CLERK__RECEPTION_HANDLING:
				if (resolve) return getReceptionHandling();
				return basicGetReceptionHandling();
			case RootElementPackage.CLERK__SERVICE_ITEM_HANDLING:
				if (resolve) return getServiceItemHandling();
				return basicGetServiceItemHandling();
			case RootElementPackage.CLERK__MAKE_BOOKING:
				if (resolve) return getMakeBooking();
				return basicGetMakeBooking();
			case RootElementPackage.CLERK__PAYMENT:
				if (resolve) return getPayment();
				return basicGetPayment();
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
			case RootElementPackage.CLERK__RECEPTION_HANDLING:
				setReceptionHandling((ReceptionHandling)newValue);
				return;
			case RootElementPackage.CLERK__SERVICE_ITEM_HANDLING:
				setServiceItemHandling((ServiceItemHandling)newValue);
				return;
			case RootElementPackage.CLERK__MAKE_BOOKING:
				setMakeBooking((MakeBooking)newValue);
				return;
			case RootElementPackage.CLERK__PAYMENT:
				setPayment((Payment)newValue);
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
			case RootElementPackage.CLERK__RECEPTION_HANDLING:
				setReceptionHandling((ReceptionHandling)null);
				return;
			case RootElementPackage.CLERK__SERVICE_ITEM_HANDLING:
				setServiceItemHandling((ServiceItemHandling)null);
				return;
			case RootElementPackage.CLERK__MAKE_BOOKING:
				setMakeBooking((MakeBooking)null);
				return;
			case RootElementPackage.CLERK__PAYMENT:
				setPayment((Payment)null);
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
			case RootElementPackage.CLERK__RECEPTION_HANDLING:
				return receptionHandling != null;
			case RootElementPackage.CLERK__SERVICE_ITEM_HANDLING:
				return serviceItemHandling != null;
			case RootElementPackage.CLERK__MAKE_BOOKING:
				return makeBooking != null;
			case RootElementPackage.CLERK__PAYMENT:
				return payment != null;
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
		if (baseClass == ReceptionHandling.class) {
			switch (baseOperationID) {
				case RootElementPackage.RECEPTION_HANDLING___CHECK_IN__ROOMBOOKING: return RootElementPackage.CLERK___CHECK_IN__ROOMBOOKING;
				case RootElementPackage.RECEPTION_HANDLING___CHECK_OUT__ROOMBOOKING: return RootElementPackage.CLERK___CHECK_OUT__ROOMBOOKING;
				case RootElementPackage.RECEPTION_HANDLING___FIND_BOOKINGS__STRING: return RootElementPackage.CLERK___FIND_BOOKINGS__STRING;
				case RootElementPackage.RECEPTION_HANDLING___FIND_ACTIVE_BOOKING__STRING: return RootElementPackage.CLERK___FIND_ACTIVE_BOOKING__STRING;
				default: return -1;
			}
		}
		if (baseClass == ServiceItemHandling.class) {
			switch (baseOperationID) {
				case RootElementPackage.SERVICE_ITEM_HANDLING___ADD_SERVICE_ITEM__BOOKING_STRING_STRING_INT: return RootElementPackage.CLERK___ADD_SERVICE_ITEM__BOOKING_STRING_STRING_INT;
				case RootElementPackage.SERVICE_ITEM_HANDLING___REMOVE_SERVICE_ITEM__BOOKING_SERVICEITEM: return RootElementPackage.CLERK___REMOVE_SERVICE_ITEM__BOOKING_SERVICEITEM;
				case RootElementPackage.SERVICE_ITEM_HANDLING___FIND_ALL_SERVICE_ITEMS__BOOKING: return RootElementPackage.CLERK___FIND_ALL_SERVICE_ITEMS__BOOKING;
				default: return -1;
			}
		}
		if (baseClass == MakeBooking.class) {
			switch (baseOperationID) {
				case RootElementPackage.MAKE_BOOKING___CREATE_BOOKING: return RootElementPackage.CLERK___CREATE_BOOKING;
				case RootElementPackage.MAKE_BOOKING___GET_AVAILABLE_ROOMS__DATE_DATE_INT_INT: return RootElementPackage.CLERK___GET_AVAILABLE_ROOMS__DATE_DATE_INT_INT;
				case RootElementPackage.MAKE_BOOKING___ADD_ROOM__BOOKING_ROOMTYPE_INT_INT_DATE_DATE: return RootElementPackage.CLERK___ADD_ROOM__BOOKING_ROOMTYPE_INT_INT_DATE_DATE;
				case RootElementPackage.MAKE_BOOKING___CONFIRM_BOOKING__BOOKING_STRING_STRING_STRING_STRING_INT_STRING: return RootElementPackage.CLERK___CONFIRM_BOOKING__BOOKING_STRING_STRING_STRING_STRING_INT_STRING;
				case RootElementPackage.MAKE_BOOKING___CANCEL_BOOKING__BOOKING: return RootElementPackage.CLERK___CANCEL_BOOKING__BOOKING;
				case RootElementPackage.MAKE_BOOKING___LOOKUP_BOOKING__STRING_STRING: return RootElementPackage.CLERK___LOOKUP_BOOKING__STRING_STRING;
				default: return -1;
			}
		}
		if (baseClass == Payment.class) {
			switch (baseOperationID) {
				case RootElementPackage.PAYMENT___VERIFY_CREDIT_CARD__STRING: return RootElementPackage.CLERK___VERIFY_CREDIT_CARD__STRING;
				case RootElementPackage.PAYMENT___DEBIT_CARD__STRING_INT: return RootElementPackage.CLERK___DEBIT_CARD__STRING_INT;
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
			case RootElementPackage.CLERK___CHECK_IN__ROOMBOOKING:
				return checkIn((RoomBooking)arguments.get(0));
			case RootElementPackage.CLERK___CHECK_OUT__ROOMBOOKING:
				return checkOut((RoomBooking)arguments.get(0));
			case RootElementPackage.CLERK___FIND_BOOKINGS__STRING:
				return findBookings((String)arguments.get(0));
			case RootElementPackage.CLERK___FIND_ACTIVE_BOOKING__STRING:
				return findActiveBooking((String)arguments.get(0));
			case RootElementPackage.CLERK___ADD_SERVICE_ITEM__BOOKING_STRING_STRING_INT:
				addServiceItem((Booking)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3));
				return null;
			case RootElementPackage.CLERK___REMOVE_SERVICE_ITEM__BOOKING_SERVICEITEM:
				removeServiceItem((Booking)arguments.get(0), (ServiceItem)arguments.get(1));
				return null;
			case RootElementPackage.CLERK___FIND_ALL_SERVICE_ITEMS__BOOKING:
				return findAllServiceItems((Booking)arguments.get(0));
			case RootElementPackage.CLERK___CREATE_BOOKING:
				return createBooking();
			case RootElementPackage.CLERK___GET_AVAILABLE_ROOMS__DATE_DATE_INT_INT:
				return getAvailableRooms((Date)arguments.get(0), (Date)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case RootElementPackage.CLERK___ADD_ROOM__BOOKING_ROOMTYPE_INT_INT_DATE_DATE:
				return addRoom((Booking)arguments.get(0), (RoomType)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Date)arguments.get(4), (Date)arguments.get(5));
			case RootElementPackage.CLERK___CONFIRM_BOOKING__BOOKING_STRING_STRING_STRING_STRING_INT_STRING:
				return confirmBooking((Booking)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (Integer)arguments.get(5), (String)arguments.get(6));
			case RootElementPackage.CLERK___CANCEL_BOOKING__BOOKING:
				return cancelBooking((Booking)arguments.get(0));
			case RootElementPackage.CLERK___LOOKUP_BOOKING__STRING_STRING:
				return lookupBooking((String)arguments.get(0), (String)arguments.get(1));
			case RootElementPackage.CLERK___VERIFY_CREDIT_CARD__STRING:
				return verifyCreditCard((String)arguments.get(0));
			case RootElementPackage.CLERK___DEBIT_CARD__STRING_INT:
				return debitCard((String)arguments.get(0), (Integer)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ClerkImpl
