/**
 */
package RootElement.impl;

import RootElement.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RootElementFactoryImpl extends EFactoryImpl implements RootElementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RootElementFactory init() {
		try {
			RootElementFactory theRootElementFactory = (RootElementFactory)EPackage.Registry.INSTANCE.getEFactory(RootElementPackage.eNS_URI);
			if (theRootElementFactory != null) {
				return theRootElementFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RootElementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootElementFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RootElementPackage.GUEST: return createGuest();
			case RootElementPackage.BOOKING: return createBooking();
			case RootElementPackage.ROOM: return createRoom();
			case RootElementPackage.ROOM_TYPE: return createRoomType();
			case RootElementPackage.ROOM_ATTRIBUTE: return createRoomAttribute();
			case RootElementPackage.SERVICE_ITEM: return createServiceItem();
			case RootElementPackage.FEEDBACK: return createFeedback();
			case RootElementPackage.SUPPORT_TICKET: return createSupportTicket();
			case RootElementPackage.CLERK: return createClerk();
			case RootElementPackage.MANAGER: return createManager();
			case RootElementPackage.SYS_ADMIN: return createSysAdmin();
			case RootElementPackage.BOOKING_HANDLER: return createBookingHandler();
			case RootElementPackage.ROOM_STRUCTURE: return createRoomStructure();
			case RootElementPackage.FEEDBACK_HANDLER: return createFeedbackHandler();
			case RootElementPackage.SUPPORT_TICKET_HANDLER: return createSupportTicketHandler();
			case RootElementPackage.CLEANING_HANDLER: return createCleaningHandler();
			case RootElementPackage.PAYMENT_HANDLER: return createPaymentHandler();
			case RootElementPackage.DAILY_ROOM_BOOKING: return createDailyRoomBooking();
			case RootElementPackage.HOURLY_ROOM_BOOKING: return createHourlyRoomBooking();
			case RootElementPackage.HOTEL: return createHotel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RootElementPackage.BOOKING_STATUS:
				return createBookingStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RootElementPackage.BOOKING_STATUS:
				return convertBookingStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guest createGuest() {
		GuestImpl guest = new GuestImpl();
		return guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType createRoomType() {
		RoomTypeImpl roomType = new RoomTypeImpl();
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomAttribute createRoomAttribute() {
		RoomAttributeImpl roomAttribute = new RoomAttributeImpl();
		return roomAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feedback createFeedback() {
		FeedbackImpl feedback = new FeedbackImpl();
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking createBooking() {
		BookingImpl booking = new BookingImpl();
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceItem createServiceItem() {
		ServiceItemImpl serviceItem = new ServiceItemImpl();
		return serviceItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportTicket createSupportTicket() {
		SupportTicketImpl supportTicket = new SupportTicketImpl();
		return supportTicket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clerk createClerk() {
		ClerkImpl clerk = new ClerkImpl();
		return clerk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager createManager() {
		ManagerImpl manager = new ManagerImpl();
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysAdmin createSysAdmin() {
		SysAdminImpl sysAdmin = new SysAdminImpl();
		return sysAdmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingHandler createBookingHandler() {
		BookingHandlerImpl bookingHandler = new BookingHandlerImpl();
		return bookingHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomStructure createRoomStructure() {
		RoomStructureImpl roomStructure = new RoomStructureImpl();
		return roomStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackHandler createFeedbackHandler() {
		FeedbackHandlerImpl feedbackHandler = new FeedbackHandlerImpl();
		return feedbackHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportTicketHandler createSupportTicketHandler() {
		SupportTicketHandlerImpl supportTicketHandler = new SupportTicketHandlerImpl();
		return supportTicketHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CleaningHandler createCleaningHandler() {
		CleaningHandlerImpl cleaningHandler = new CleaningHandlerImpl();
		return cleaningHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentHandler createPaymentHandler() {
		PaymentHandlerImpl paymentHandler = new PaymentHandlerImpl();
		return paymentHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DailyRoomBooking createDailyRoomBooking() {
		DailyRoomBookingImpl dailyRoomBooking = new DailyRoomBookingImpl();
		return dailyRoomBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HourlyRoomBooking createHourlyRoomBooking() {
		HourlyRoomBookingImpl hourlyRoomBooking = new HourlyRoomBookingImpl();
		return hourlyRoomBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel createHotel() {
		HotelImpl hotel = new HotelImpl();
		return hotel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingStatus createBookingStatusFromString(EDataType eDataType, String initialValue) {
		BookingStatus result = BookingStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBookingStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootElementPackage getRootElementPackage() {
		return (RootElementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RootElementPackage getPackage() {
		return RootElementPackage.eINSTANCE;
	}

} //RootElementFactoryImpl
