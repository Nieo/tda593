/**
 */
package RootElement.impl;

import RootElement.Booking;
import RootElement.BookingHandler;
import RootElement.BookingStatus;
import RootElement.Guest;
import RootElement.MakeBooking;
import RootElement.Room;
import RootElement.RoomBooking;
import RootElement.RoomFetcher;
import RootElement.RoomType;
import RootElement.RootElementPackage;

import RootElement.ServiceItem;
import RootElement.ServiceItemHandling;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Date;
import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ECollections;
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
		booking = ECollections.<Booking>newBasicEList();
		roomFetcher = RoomSetupFactory.createRoomFetcher();
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
	 * @generated NOT
	 */
	public boolean checkIn(RoomBooking booking) {
		if(booking.getBookingStatus() == BookingStatus.BOOKED){
			booking.setBookingStatus(BookingStatus.CHECKED_IN);
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean checkOut(RoomBooking booking) {
		if(booking.getBookingStatus() == BookingStatus.CHECKED_IN){
			booking.setBookingStatus(BookingStatus.CHECKED_OUT);
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Booking> findBookings(String name) {
		EList<Booking> bookings =  new EObjectResolvingEList<Booking>(Booking.class, this, RootElementPackage.BOOKING_HANDLER__BOOKING);
		for(Booking b: booking){
			if(b.getGuest().getName().equals(name)){
				bookings.add(b);
			}
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking findActiveBooking(String roomID) {
		for(Booking b: booking){
			for(RoomBooking rb: b.getRoombooking()){
				try{
				if(rb.getRoom().getRoomName().equals(roomID) && rb.getBookingStatus() == BookingStatus.CHECKED_IN){ 
					return b;
				}
				}catch(NullPointerException e){
					//If null somewhere its not checked in... #MoreSpagetti
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking createBooking() {
		Booking book = new BookingImpl();
		booking.add(book);
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT	
	 */
	public EList<RoomType> getAvailableRooms(Date startDate, Date endDate, int nbrOfAdults, int nbrOfChildren) {
		//Check how many rooms of each type there are
		HashMap<RoomType,Integer> types = new HashMap<RoomType, Integer>();
		for(Room r: roomFetcher.getBookableRooms()){
			if(types.containsKey(r.getRoomType())){
				types.put(r.getRoomType(),types.get(r.getRoomType()) + 1);
			}else{
				types.put(r.getRoomType(), 1);
			}
		}
		//Remove 1 room for each booking in the interval 
		for(Booking book: this.booking){
			for(RoomBooking b:book.getRoombooking()){
				if(b.getStartDate().after(startDate) && b.getStartDate().before(endDate) || b.getEndDate().after(startDate) && b.getEndDate().before(endDate)){
					types.put(b.getRoom().getRoomType(),types.get(b.getRoom().getRoomType()) - 1);
				}
				
			}
		}
		//Add all room types that have at least 1 free room to list 
		EList<RoomType> freeRooms = ECollections.<RoomType>newBasicEList();
		for(RoomType rt: types.keySet()){
			if(types.get(rt) > 0){
				freeRooms.add(rt);
			}
		}
		return freeRooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addRoom(Booking booking, RoomType room, int nbrOfAdults, int nbrOfChildren, Date startDate, Date endDate) {
		RoomBooking roomBooking = new DailyRoomBookingImpl();
		roomBooking.setStartDate(startDate);
		roomBooking.setEndDate(endDate);
		Room r = new RoomImpl();
		r.setRoomType(room);
		roomBooking.setRoom(r);
		return booking.getRoombooking().add(roomBooking);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean confirmBooking(Booking booking, String name, String phone, String mail, String nationality, int passportNr, String nextDestination) {
		Guest guest = new GuestImpl();
		guest.setName(name);
		guest.setPhoneNumber(phone);
		guest.setMail(mail);
		guest.setNationality(nationality);
		guest.setSocialSecurityNumber(passportNr+ "");
		guest.setNextDestination(nextDestination);
		
		booking.setGuest(guest);
		
		boolean success = true;
		
		//Check if there are avaliable room of the selected type for each roomBooking
		for(RoomBooking roombooking: booking.getRoombooking()){
			EList<RoomType> a = getAvailableRooms(roombooking.getStartDate(), roombooking.getEndDate(), 1, 0);
			if(a.contains(roombooking.getRoom().getRoomType())){
				roombooking.setBookingStatus(BookingStatus.BOOKED);
			}else{
				success = false;
			}
		}
		//If there are no rooms then change all BookingStatus from BOOKED
		if(!success){
			for(RoomBooking roombooking: booking.getRoombooking()){
				roombooking.setBookingStatus(BookingStatus.NONE);
			}
		}
		
	
		return success;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean cancelBooking(Booking booking) {
		return this.booking.remove(booking);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking lookupBooking(String name, String phoneNumber) {
		for(Booking b: this.booking){
			if(b.getGuest().getName().equals(name) || b.getGuest().getPhoneNumber().equals(phoneNumber))
				return b;
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public void addServiceItem(Booking booking, String name, String description, int price) {
		ServiceItem serviceItem = new ServiceItemImpl();
		serviceItem.setName(name);
		serviceItem.setDescription(description);
		serviceItem.setPrice(price);
		booking.getServiceitem().add(serviceItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeServiceItem(Booking booking, ServiceItem serviceItem) {
		booking.getServiceitem().remove(serviceItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ServiceItem> findAllServiceItems(Booking booking) {
		return booking.getServiceitem();
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == MakeBooking.class) {
			switch (baseOperationID) {
				case RootElementPackage.MAKE_BOOKING___CREATE_BOOKING: return RootElementPackage.BOOKING_HANDLER___CREATE_BOOKING;
				case RootElementPackage.MAKE_BOOKING___GET_AVAILABLE_ROOMS__DATE_DATE_INT_INT: return RootElementPackage.BOOKING_HANDLER___GET_AVAILABLE_ROOMS__DATE_DATE_INT_INT;
				case RootElementPackage.MAKE_BOOKING___ADD_ROOM__BOOKING_ROOMTYPE_INT_INT_DATE_DATE: return RootElementPackage.BOOKING_HANDLER___ADD_ROOM__BOOKING_ROOMTYPE_INT_INT_DATE_DATE;
				case RootElementPackage.MAKE_BOOKING___CONFIRM_BOOKING__BOOKING_STRING_STRING_STRING_STRING_INT_STRING: return RootElementPackage.BOOKING_HANDLER___CONFIRM_BOOKING__BOOKING_STRING_STRING_STRING_STRING_INT_STRING;
				case RootElementPackage.MAKE_BOOKING___CANCEL_BOOKING__BOOKING: return RootElementPackage.BOOKING_HANDLER___CANCEL_BOOKING__BOOKING;
				case RootElementPackage.MAKE_BOOKING___LOOKUP_BOOKING__STRING_STRING: return RootElementPackage.BOOKING_HANDLER___LOOKUP_BOOKING__STRING_STRING;
				default: return -1;
			}
		}
		if (baseClass == ServiceItemHandling.class) {
			switch (baseOperationID) {
				case RootElementPackage.SERVICE_ITEM_HANDLING___ADD_SERVICE_ITEM__BOOKING_STRING_STRING_INT: return RootElementPackage.BOOKING_HANDLER___ADD_SERVICE_ITEM__BOOKING_STRING_STRING_INT;
				case RootElementPackage.SERVICE_ITEM_HANDLING___REMOVE_SERVICE_ITEM__BOOKING_SERVICEITEM: return RootElementPackage.BOOKING_HANDLER___REMOVE_SERVICE_ITEM__BOOKING_SERVICEITEM;
				case RootElementPackage.SERVICE_ITEM_HANDLING___FIND_ALL_SERVICE_ITEMS__BOOKING: return RootElementPackage.BOOKING_HANDLER___FIND_ALL_SERVICE_ITEMS__BOOKING;
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
			case RootElementPackage.BOOKING_HANDLER___CHECK_IN__ROOMBOOKING:
				return checkIn((RoomBooking)arguments.get(0));
			case RootElementPackage.BOOKING_HANDLER___CHECK_OUT__ROOMBOOKING:
				return checkOut((RoomBooking)arguments.get(0));
			case RootElementPackage.BOOKING_HANDLER___FIND_BOOKINGS__STRING:
				return findBookings((String)arguments.get(0));
			case RootElementPackage.BOOKING_HANDLER___FIND_ACTIVE_BOOKING__STRING:
				return findActiveBooking((String)arguments.get(0));
			case RootElementPackage.BOOKING_HANDLER___CREATE_BOOKING:
				return createBooking();
			case RootElementPackage.BOOKING_HANDLER___GET_AVAILABLE_ROOMS__DATE_DATE_INT_INT:
				return getAvailableRooms((Date)arguments.get(0), (Date)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case RootElementPackage.BOOKING_HANDLER___ADD_ROOM__BOOKING_ROOMTYPE_INT_INT_DATE_DATE:
				return addRoom((Booking)arguments.get(0), (RoomType)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Date)arguments.get(4), (Date)arguments.get(5));
			case RootElementPackage.BOOKING_HANDLER___CONFIRM_BOOKING__BOOKING_STRING_STRING_STRING_STRING_INT_STRING:
				return confirmBooking((Booking)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (Integer)arguments.get(5), (String)arguments.get(6));
			case RootElementPackage.BOOKING_HANDLER___CANCEL_BOOKING__BOOKING:
				return cancelBooking((Booking)arguments.get(0));
			case RootElementPackage.BOOKING_HANDLER___LOOKUP_BOOKING__STRING_STRING:
				return lookupBooking((String)arguments.get(0), (String)arguments.get(1));
			case RootElementPackage.BOOKING_HANDLER___ADD_SERVICE_ITEM__BOOKING_STRING_STRING_INT:
				addServiceItem((Booking)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3));
				return null;
			case RootElementPackage.BOOKING_HANDLER___REMOVE_SERVICE_ITEM__BOOKING_SERVICEITEM:
				removeServiceItem((Booking)arguments.get(0), (ServiceItem)arguments.get(1));
				return null;
			case RootElementPackage.BOOKING_HANDLER___FIND_ALL_SERVICE_ITEMS__BOOKING:
				return findAllServiceItems((Booking)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingHandlerImpl
