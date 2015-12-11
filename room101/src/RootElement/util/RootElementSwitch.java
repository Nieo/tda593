/**
 */
package RootElement.util;

import RootElement.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see RootElement.RootElementPackage
 * @generated
 */
public class RootElementSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RootElementPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootElementSwitch() {
		if (modelPackage == null) {
			modelPackage = RootElementPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RootElementPackage.GUEST: {
				Guest guest = (Guest)theEObject;
				T result = caseGuest(guest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.ROOM: {
				Room room = (Room)theEObject;
				T result = caseRoom(room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.ROOM_TYPE: {
				RoomType roomType = (RoomType)theEObject;
				T result = caseRoomType(roomType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.ROOM_ATTRIBUTE: {
				RoomAttribute roomAttribute = (RoomAttribute)theEObject;
				T result = caseRoomAttribute(roomAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.FEEDBACK: {
				Feedback feedback = (Feedback)theEObject;
				T result = caseFeedback(feedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.STAFF: {
				Staff staff = (Staff)theEObject;
				T result = caseStaff(staff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.BOOKING: {
				Booking booking = (Booking)theEObject;
				T result = caseBooking(booking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.ROOM_BOOKING: {
				RoomBooking roomBooking = (RoomBooking)theEObject;
				T result = caseRoomBooking(roomBooking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.SUPPORT_TICKET: {
				SupportTicket supportTicket = (SupportTicket)theEObject;
				T result = caseSupportTicket(supportTicket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.CLERK: {
				Clerk clerk = (Clerk)theEObject;
				T result = caseClerk(clerk);
				if (result == null) result = caseStaff(clerk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.MANAGER: {
				Manager manager = (Manager)theEObject;
				T result = caseManager(manager);
				if (result == null) result = caseClerk(manager);
				if (result == null) result = caseSysAdmin(manager);
				if (result == null) result = caseStaff(manager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.SYS_ADMIN: {
				SysAdmin sysAdmin = (SysAdmin)theEObject;
				T result = caseSysAdmin(sysAdmin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.MAKE_BOOKING: {
				MakeBooking makeBooking = (MakeBooking)theEObject;
				T result = caseMakeBooking(makeBooking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.CHECKINOUT: {
				Checkinout checkinout = (Checkinout)theEObject;
				T result = caseCheckinout(checkinout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.BOOKING_HANDLER: {
				BookingHandler bookingHandler = (BookingHandler)theEObject;
				T result = caseBookingHandler(bookingHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.ROOM_STRUCTURE: {
				RoomStructure roomStructure = (RoomStructure)theEObject;
				T result = caseRoomStructure(roomStructure);
				if (result == null) result = caseRoomHandling(roomStructure);
				if (result == null) result = caseRoomTypeHandling(roomStructure);
				if (result == null) result = caseRoomAttributeHandling(roomStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.ROOM_HANDLING: {
				RoomHandling roomHandling = (RoomHandling)theEObject;
				T result = caseRoomHandling(roomHandling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.ROOM_TYPE_HANDLING: {
				RoomTypeHandling roomTypeHandling = (RoomTypeHandling)theEObject;
				T result = caseRoomTypeHandling(roomTypeHandling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.ROOM_ATTRIBUTE_HANDLING: {
				RoomAttributeHandling roomAttributeHandling = (RoomAttributeHandling)theEObject;
				T result = caseRoomAttributeHandling(roomAttributeHandling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.FEEDBACK_HANDLER: {
				FeedbackHandler feedbackHandler = (FeedbackHandler)theEObject;
				T result = caseFeedbackHandler(feedbackHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.SUPPORT_TICKET_HANDLER: {
				SupportTicketHandler supportTicketHandler = (SupportTicketHandler)theEObject;
				T result = caseSupportTicketHandler(supportTicketHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.READ_FEEDBACK: {
				ReadFeedback readFeedback = (ReadFeedback)theEObject;
				T result = caseReadFeedback(readFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.WRITE_FEEDBACK: {
				WriteFeedback writeFeedback = (WriteFeedback)theEObject;
				T result = caseWriteFeedback(writeFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.WRITE_SUPPORT_TICKET: {
				WriteSupportTicket writeSupportTicket = (WriteSupportTicket)theEObject;
				T result = caseWriteSupportTicket(writeSupportTicket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.INTERACT_WITH_SUPPORT_TICKET: {
				InteractWithSupportTicket interactWithSupportTicket = (InteractWithSupportTicket)theEObject;
				T result = caseInteractWithSupportTicket(interactWithSupportTicket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.CLEANING_HANDLER: {
				CleaningHandler cleaningHandler = (CleaningHandler)theEObject;
				T result = caseCleaningHandler(cleaningHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.ROOM_FETCHER: {
				RoomFetcher roomFetcher = (RoomFetcher)theEObject;
				T result = caseRoomFetcher(roomFetcher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.CLEANING: {
				Cleaning cleaning = (Cleaning)theEObject;
				T result = caseCleaning(cleaning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.PAYMENT_HANDLER: {
				PaymentHandler paymentHandler = (PaymentHandler)theEObject;
				T result = casePaymentHandler(paymentHandler);
				if (result == null) result = casePayment(paymentHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.PAYMENT: {
				Payment payment = (Payment)theEObject;
				T result = casePayment(payment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.DAILY_ROOM_BOOKING: {
				DailyRoomBooking dailyRoomBooking = (DailyRoomBooking)theEObject;
				T result = caseDailyRoomBooking(dailyRoomBooking);
				if (result == null) result = caseRoomBooking(dailyRoomBooking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.HOURLY_ROOM_BOOKING: {
				HourlyRoomBooking hourlyRoomBooking = (HourlyRoomBooking)theEObject;
				T result = caseHourlyRoomBooking(hourlyRoomBooking);
				if (result == null) result = caseRoomBooking(hourlyRoomBooking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuest(Guest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoom(Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomType(RoomType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomAttribute(RoomAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeedback(Feedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaff(Staff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooking(Booking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomBooking(RoomBooking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Support Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Support Ticket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportTicket(SupportTicket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clerk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clerk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClerk(Clerk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManager(Manager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sys Admin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sys Admin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSysAdmin(SysAdmin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Make Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Make Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMakeBooking(MakeBooking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checkinout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checkinout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckinout(Checkinout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingHandler(BookingHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomStructure(RoomStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Handling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Handling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomHandling(RoomHandling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Type Handling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Type Handling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomTypeHandling(RoomTypeHandling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Attribute Handling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Attribute Handling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomAttributeHandling(RoomAttributeHandling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feedback Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feedback Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeedbackHandler(FeedbackHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Support Ticket Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Support Ticket Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportTicketHandler(SupportTicketHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadFeedback(ReadFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteFeedback(WriteFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Support Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Support Ticket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteSupportTicket(WriteSupportTicket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interact With Support Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interact With Support Ticket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractWithSupportTicket(InteractWithSupportTicket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cleaning Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cleaning Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCleaningHandler(CleaningHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Fetcher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Fetcher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomFetcher(RoomFetcher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cleaning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cleaning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCleaning(Cleaning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentHandler(PaymentHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayment(Payment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daily Room Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daily Room Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDailyRoomBooking(DailyRoomBooking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hourly Room Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hourly Room Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHourlyRoomBooking(HourlyRoomBooking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RootElementSwitch
