/**
 */
package RootElement.util;

import RootElement.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see RootElement.RootElementPackage
 * @generated
 */
public class RootElementAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RootElementPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootElementAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RootElementPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootElementSwitch<Adapter> modelSwitch =
		new RootElementSwitch<Adapter>() {
			@Override
			public Adapter caseGuest(Guest object) {
				return createGuestAdapter();
			}
			@Override
			public Adapter caseSupportTicketWriter(SupportTicketWriter object) {
				return createSupportTicketWriterAdapter();
			}
			@Override
			public Adapter caseMakeBooking(MakeBooking object) {
				return createMakeBookingAdapter();
			}
			@Override
			public Adapter caseBooking(Booking object) {
				return createBookingAdapter();
			}
			@Override
			public Adapter caseRoomBooking(RoomBooking object) {
				return createRoomBookingAdapter();
			}
			@Override
			public Adapter caseRoom(Room object) {
				return createRoomAdapter();
			}
			@Override
			public Adapter caseRoomType(RoomType object) {
				return createRoomTypeAdapter();
			}
			@Override
			public Adapter caseRoomAttribute(RoomAttribute object) {
				return createRoomAttributeAdapter();
			}
			@Override
			public Adapter caseServiceItem(ServiceItem object) {
				return createServiceItemAdapter();
			}
			@Override
			public Adapter caseServiceItemhandling(ServiceItemhandling object) {
				return createServiceItemhandlingAdapter();
			}
			@Override
			public Adapter caseFeedbackWriter(FeedbackWriter object) {
				return createFeedbackWriterAdapter();
			}
			@Override
			public Adapter caseFeedback(Feedback object) {
				return createFeedbackAdapter();
			}
			@Override
			public Adapter caseStaff(Staff object) {
				return createStaffAdapter();
			}
			@Override
			public Adapter caseCleaning(Cleaning object) {
				return createCleaningAdapter();
			}
			@Override
			public Adapter caseSupportTicketReader(SupportTicketReader object) {
				return createSupportTicketReaderAdapter();
			}
			@Override
			public Adapter caseSupportTicket(SupportTicket object) {
				return createSupportTicketAdapter();
			}
			@Override
			public Adapter caseClerk(Clerk object) {
				return createClerkAdapter();
			}
			@Override
			public Adapter caseReceptionHandling(ReceptionHandling object) {
				return createReceptionHandlingAdapter();
			}
			@Override
			public Adapter casePayment(Payment object) {
				return createPaymentAdapter();
			}
			@Override
			public Adapter caseManager(Manager object) {
				return createManagerAdapter();
			}
			@Override
			public Adapter caseSysAdmin(SysAdmin object) {
				return createSysAdminAdapter();
			}
			@Override
			public Adapter caseRoomAttributeHandling(RoomAttributeHandling object) {
				return createRoomAttributeHandlingAdapter();
			}
			@Override
			public Adapter caseRoomHandling(RoomHandling object) {
				return createRoomHandlingAdapter();
			}
			@Override
			public Adapter caseRoomTypeHandling(RoomTypeHandling object) {
				return createRoomTypeHandlingAdapter();
			}
			@Override
			public Adapter caseFeedbackReader(FeedbackReader object) {
				return createFeedbackReaderAdapter();
			}
			@Override
			public Adapter caseBookingHandler(BookingHandler object) {
				return createBookingHandlerAdapter();
			}
			@Override
			public Adapter caseRoomFetcher(RoomFetcher object) {
				return createRoomFetcherAdapter();
			}
			@Override
			public Adapter caseRoomStructure(RoomStructure object) {
				return createRoomStructureAdapter();
			}
			@Override
			public Adapter caseFeedbackHandler(FeedbackHandler object) {
				return createFeedbackHandlerAdapter();
			}
			@Override
			public Adapter caseSupportTicketHandler(SupportTicketHandler object) {
				return createSupportTicketHandlerAdapter();
			}
			@Override
			public Adapter caseCleaningHandler(CleaningHandler object) {
				return createCleaningHandlerAdapter();
			}
			@Override
			public Adapter casePaymentHandler(PaymentHandler object) {
				return createPaymentHandlerAdapter();
			}
			@Override
			public Adapter caseDailyRoomBooking(DailyRoomBooking object) {
				return createDailyRoomBookingAdapter();
			}
			@Override
			public Adapter caseHourlyRoomBooking(HourlyRoomBooking object) {
				return createHourlyRoomBookingAdapter();
			}
			@Override
			public Adapter caseHotelSystem(HotelSystem object) {
				return createHotelSystemAdapter();
			}
			@Override
			public Adapter caseHotel(Hotel object) {
				return createHotelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Guest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Guest
	 * @generated
	 */
	public Adapter createGuestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.RoomType
	 * @generated
	 */
	public Adapter createRoomTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.RoomAttribute <em>Room Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.RoomAttribute
	 * @generated
	 */
	public Adapter createRoomAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Feedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Feedback
	 * @generated
	 */
	public Adapter createFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Staff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Staff
	 * @generated
	 */
	public Adapter createStaffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Booking
	 * @generated
	 */
	public Adapter createBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.RoomBooking <em>Room Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.RoomBooking
	 * @generated
	 */
	public Adapter createRoomBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.ServiceItem <em>Service Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.ServiceItem
	 * @generated
	 */
	public Adapter createServiceItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.SupportTicket <em>Support Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.SupportTicket
	 * @generated
	 */
	public Adapter createSupportTicketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Clerk <em>Clerk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Clerk
	 * @generated
	 */
	public Adapter createClerkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Manager
	 * @generated
	 */
	public Adapter createManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.SysAdmin <em>Sys Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.SysAdmin
	 * @generated
	 */
	public Adapter createSysAdminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.MakeBooking <em>Make Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.MakeBooking
	 * @generated
	 */
	public Adapter createMakeBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.ReceptionHandling <em>Reception Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.ReceptionHandling
	 * @generated
	 */
	public Adapter createReceptionHandlingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.BookingHandler <em>Booking Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.BookingHandler
	 * @generated
	 */
	public Adapter createBookingHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.RoomStructure <em>Room Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.RoomStructure
	 * @generated
	 */
	public Adapter createRoomStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.RoomHandling <em>Room Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.RoomHandling
	 * @generated
	 */
	public Adapter createRoomHandlingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.RoomTypeHandling <em>Room Type Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.RoomTypeHandling
	 * @generated
	 */
	public Adapter createRoomTypeHandlingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.RoomAttributeHandling <em>Room Attribute Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.RoomAttributeHandling
	 * @generated
	 */
	public Adapter createRoomAttributeHandlingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.FeedbackHandler <em>Feedback Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.FeedbackHandler
	 * @generated
	 */
	public Adapter createFeedbackHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.SupportTicketHandler <em>Support Ticket Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.SupportTicketHandler
	 * @generated
	 */
	public Adapter createSupportTicketHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.FeedbackReader <em>Feedback Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.FeedbackReader
	 * @generated
	 */
	public Adapter createFeedbackReaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.FeedbackWriter <em>Feedback Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.FeedbackWriter
	 * @generated
	 */
	public Adapter createFeedbackWriterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.SupportTicketWriter <em>Support Ticket Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.SupportTicketWriter
	 * @generated
	 */
	public Adapter createSupportTicketWriterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.SupportTicketReader <em>Support Ticket Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.SupportTicketReader
	 * @generated
	 */
	public Adapter createSupportTicketReaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.CleaningHandler <em>Cleaning Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.CleaningHandler
	 * @generated
	 */
	public Adapter createCleaningHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.RoomFetcher <em>Room Fetcher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.RoomFetcher
	 * @generated
	 */
	public Adapter createRoomFetcherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Cleaning <em>Cleaning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Cleaning
	 * @generated
	 */
	public Adapter createCleaningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.PaymentHandler <em>Payment Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.PaymentHandler
	 * @generated
	 */
	public Adapter createPaymentHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Payment
	 * @generated
	 */
	public Adapter createPaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DailyRoomBooking <em>Daily Room Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DailyRoomBooking
	 * @generated
	 */
	public Adapter createDailyRoomBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.HourlyRoomBooking <em>Hourly Room Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.HourlyRoomBooking
	 * @generated
	 */
	public Adapter createHourlyRoomBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.ServiceItemhandling <em>Service Itemhandling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.ServiceItemhandling
	 * @generated
	 */
	public Adapter createServiceItemhandlingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.HotelSystem <em>Hotel System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.HotelSystem
	 * @generated
	 */
	public Adapter createHotelSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Hotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Hotel
	 * @generated
	 */
	public Adapter createHotelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RootElementAdapterFactory
