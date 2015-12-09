/**
 */
package RootElement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see RootElement.RootElementFactory
 * @model kind="package"
 * @generated
 */
public interface RootElementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RootElement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///RootElement.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RootElement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RootElementPackage eINSTANCE = RootElement.impl.RootElementPackageImpl.init();

	/**
	 * The meta object id for the '{@link RootElement.impl.GuestImpl <em>Guest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.GuestImpl
	 * @see RootElement.impl.RootElementPackageImpl#getGuest()
	 * @generated
	 */
	int GUEST = 0;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__PHONE_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Nationality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__NATIONALITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__NAME = 3;

	/**
	 * The feature id for the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__MAIL = 4;

	/**
	 * The feature id for the '<em><b>Social Security Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__SOCIAL_SECURITY_NUMBER = 5;

	/**
	 * The number of structural features of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Create Support Ticket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___CREATE_SUPPORT_TICKET__STRING_STRING = 0;

	/**
	 * The number of operations of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link RootElement.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.RoomImpl
	 * @see RootElement.impl.RootElementPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 1;

	/**
	 * The feature id for the '<em><b>Is Occupied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__IS_OCCUPIED = 0;

	/**
	 * The feature id for the '<em><b>Room ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_ID = 1;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Need Cleaning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NEED_CLEANING = 3;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.impl.RoomTypeImpl <em>Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.RoomTypeImpl
	 * @see RootElement.impl.RootElementPackageImpl#getRoomType()
	 * @generated
	 */
	int ROOM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__PRICE = 2;

	/**
	 * The number of structural features of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.impl.RoomAttributeImpl <em>Room Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.RoomAttributeImpl
	 * @see RootElement.impl.RootElementPackageImpl#getRoomAttribute()
	 * @generated
	 */
	int ROOM_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ATTRIBUTE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ATTRIBUTE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ATTRIBUTE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Room Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Room Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.impl.FeedbackImpl <em>Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.FeedbackImpl
	 * @see RootElement.impl.RootElementPackageImpl#getFeedback()
	 * @generated
	 */
	int FEEDBACK = 4;

	/**
	 * The feature id for the '<em><b>Feedback Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__FEEDBACK_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__RATING = 1;

	/**
	 * The feature id for the '<em><b>Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__READ = 2;

	/**
	 * The number of structural features of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Mark As Read</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK___MARK_AS_READ = 0;

	/**
	 * The number of operations of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link RootElement.impl.StaffImpl <em>Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.StaffImpl
	 * @see RootElement.impl.RootElementPackageImpl#getStaff()
	 * @generated
	 */
	int STAFF = 5;

	/**
	 * The feature id for the '<em><b>Staff ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__STAFF_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__NAME = 1;

	/**
	 * The number of structural features of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Read Support Ticket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF___READ_SUPPORT_TICKET = 0;

	/**
	 * The operation id for the '<em>Close Support Ticket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF___CLOSE_SUPPORT_TICKET = 1;

	/**
	 * The operation id for the '<em>Set Room Cleaned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF___SET_ROOM_CLEANED__BOOLEAN = 2;

	/**
	 * The number of operations of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link RootElement.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.BookingImpl
	 * @see RootElement.impl.RootElementPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 6;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__START_DATE = 0;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__END_DATE = 1;

	/**
	 * The feature id for the '<em><b>Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CHECKED_IN = 2;

	/**
	 * The feature id for the '<em><b>Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CHECKED_OUT = 3;

	/**
	 * The feature id for the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKING_ID = 4;

	/**
	 * The feature id for the '<em><b>Guest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__GUEST = 5;

	/**
	 * The feature id for the '<em><b>Room Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOM_DATA = 6;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__PRICE = 7;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Set Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___SET_DATE__DATE = 0;

	/**
	 * The operation id for the '<em>Set Duration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___SET_DURATION__DATE = 1;

	/**
	 * The operation id for the '<em>Set Checked In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___SET_CHECKED_IN = 2;

	/**
	 * The operation id for the '<em>Set Checked Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___SET_CHECKED_OUT = 3;

	/**
	 * The operation id for the '<em>Generate Booking ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___GENERATE_BOOKING_ID = 4;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link RootElement.impl.RoomBookingDataImpl <em>Room Booking Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.RoomBookingDataImpl
	 * @see RootElement.impl.RootElementPackageImpl#getRoomBookingData()
	 * @generated
	 */
	int ROOM_BOOKING_DATA = 7;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING_DATA__ROOM = 0;

	/**
	 * The feature id for the '<em><b>Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING_DATA__GUESTS = 1;

	/**
	 * The number of structural features of the '<em>Room Booking Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Room Booking Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.impl.SupportTicketImpl <em>Support Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.SupportTicketImpl
	 * @see RootElement.impl.RootElementPackageImpl#getSupportTicket()
	 * @generated
	 */
	int SUPPORT_TICKET = 8;

	/**
	 * The feature id for the '<em><b>Problem Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_TICKET__PROBLEM_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Room ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_TICKET__ROOM_ID = 1;

	/**
	 * The feature id for the '<em><b>Address To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_TICKET__ADDRESS_TO = 2;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_TICKET__FIXED = 3;

	/**
	 * The number of structural features of the '<em>Support Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_TICKET_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Support Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_TICKET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.impl.ClerkImpl <em>Clerk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.ClerkImpl
	 * @see RootElement.impl.RootElementPackageImpl#getClerk()
	 * @generated
	 */
	int CLERK = 9;

	/**
	 * The feature id for the '<em><b>Staff ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLERK__STAFF_ID = STAFF__STAFF_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLERK__NAME = STAFF__NAME;

	/**
	 * The number of structural features of the '<em>Clerk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLERK_FEATURE_COUNT = STAFF_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Read Support Ticket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLERK___READ_SUPPORT_TICKET = STAFF___READ_SUPPORT_TICKET;

	/**
	 * The operation id for the '<em>Close Support Ticket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLERK___CLOSE_SUPPORT_TICKET = STAFF___CLOSE_SUPPORT_TICKET;

	/**
	 * The operation id for the '<em>Set Room Cleaned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLERK___SET_ROOM_CLEANED__BOOLEAN = STAFF___SET_ROOM_CLEANED__BOOLEAN;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLERK___CREATE_BOOKING = STAFF_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLERK___CHECK_IN__BOOKING = STAFF_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Checkout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLERK___CHECKOUT__BOOKING = STAFF_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Clerk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLERK_OPERATION_COUNT = STAFF_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link RootElement.impl.JanitorImpl <em>Janitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.JanitorImpl
	 * @see RootElement.impl.RootElementPackageImpl#getJanitor()
	 * @generated
	 */
	int JANITOR = 10;

	/**
	 * The feature id for the '<em><b>Staff ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JANITOR__STAFF_ID = STAFF__STAFF_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JANITOR__NAME = STAFF__NAME;

	/**
	 * The number of structural features of the '<em>Janitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JANITOR_FEATURE_COUNT = STAFF_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Read Support Ticket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JANITOR___READ_SUPPORT_TICKET = STAFF___READ_SUPPORT_TICKET;

	/**
	 * The operation id for the '<em>Close Support Ticket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JANITOR___CLOSE_SUPPORT_TICKET = STAFF___CLOSE_SUPPORT_TICKET;

	/**
	 * The operation id for the '<em>Set Room Cleaned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JANITOR___SET_ROOM_CLEANED__BOOLEAN = STAFF___SET_ROOM_CLEANED__BOOLEAN;

	/**
	 * The operation id for the '<em>Add Dirty Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JANITOR___ADD_DIRTY_ROOM = STAFF_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Janitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JANITOR_OPERATION_COUNT = STAFF_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link RootElement.impl.ManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.ManagerImpl
	 * @see RootElement.impl.RootElementPackageImpl#getManager()
	 * @generated
	 */
	int MANAGER = 11;

	/**
	 * The feature id for the '<em><b>Staff ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__STAFF_ID = CLERK__STAFF_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__NAME = CLERK__NAME;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_FEATURE_COUNT = CLERK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Read Support Ticket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___READ_SUPPORT_TICKET = CLERK___READ_SUPPORT_TICKET;

	/**
	 * The operation id for the '<em>Close Support Ticket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___CLOSE_SUPPORT_TICKET = CLERK___CLOSE_SUPPORT_TICKET;

	/**
	 * The operation id for the '<em>Set Room Cleaned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___SET_ROOM_CLEANED__BOOLEAN = CLERK___SET_ROOM_CLEANED__BOOLEAN;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___CREATE_BOOKING = CLERK___CREATE_BOOKING;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___CHECK_IN__BOOKING = CLERK___CHECK_IN__BOOKING;

	/**
	 * The operation id for the '<em>Checkout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___CHECKOUT__BOOKING = CLERK___CHECKOUT__BOOKING;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___ADD_ROOM__ROOM = CLERK_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___REMOVE_ROOM__ROOM = CLERK_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___CREATE_ROOM_TYPE = CLERK_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Remove Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___REMOVE_ROOM_TYPE = CLERK_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Set Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___SET_ROOM_TYPE = CLERK_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Read Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___READ_FEEDBACK = CLERK_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_OPERATION_COUNT = CLERK_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link RootElement.impl.SysAdminImpl <em>Sys Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.SysAdminImpl
	 * @see RootElement.impl.RootElementPackageImpl#getSysAdmin()
	 * @generated
	 */
	int SYS_ADMIN = 12;

	/**
	 * The number of structural features of the '<em>Sys Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_ADMIN_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_ADMIN___ADD_ROOM__ROOM = 0;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_ADMIN___REMOVE_ROOM__ROOM = 1;

	/**
	 * The operation id for the '<em>Create Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_ADMIN___CREATE_ROOM_TYPE = 2;

	/**
	 * The operation id for the '<em>Remove Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_ADMIN___REMOVE_ROOM_TYPE = 3;

	/**
	 * The operation id for the '<em>Set Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_ADMIN___SET_ROOM_TYPE = 4;

	/**
	 * The number of operations of the '<em>Sys Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_ADMIN_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link RootElement.impl.HotelImpl <em>Hotel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.HotelImpl
	 * @see RootElement.impl.RootElementPackageImpl#getHotel()
	 * @generated
	 */
	int HOTEL = 13;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__STAFF = 0;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__FEEDBACK = 1;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__ROOM = 2;

	/**
	 * The number of structural features of the '<em>Hotel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Unread Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL___GET_UNREAD_FEEDBACK = 0;

	/**
	 * The number of operations of the '<em>Hotel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link RootElement.Guest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest</em>'.
	 * @see RootElement.Guest
	 * @generated
	 */
	EClass getGuest();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Guest#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see RootElement.Guest#getPhoneNumber()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_PhoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Guest#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see RootElement.Guest#getAddress()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_Address();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Guest#getNationality <em>Nationality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nationality</em>'.
	 * @see RootElement.Guest#getNationality()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_Nationality();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Guest#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RootElement.Guest#getName()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_Name();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Guest#getMail <em>Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mail</em>'.
	 * @see RootElement.Guest#getMail()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_Mail();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Guest#getSocialSecurityNumber <em>Social Security Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Social Security Number</em>'.
	 * @see RootElement.Guest#getSocialSecurityNumber()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_SocialSecurityNumber();

	/**
	 * Returns the meta object for the '{@link RootElement.Guest#createSupportTicket(java.lang.String, java.lang.String) <em>Create Support Ticket</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Support Ticket</em>' operation.
	 * @see RootElement.Guest#createSupportTicket(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGuest__CreateSupportTicket__String_String();

	/**
	 * Returns the meta object for class '{@link RootElement.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see RootElement.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Room#isOccupied <em>Is Occupied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Occupied</em>'.
	 * @see RootElement.Room#isOccupied()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_IsOccupied();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Room#getRoomID <em>Room ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room ID</em>'.
	 * @see RootElement.Room#getRoomID()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_RoomID();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Room#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Type</em>'.
	 * @see RootElement.Room#getRoomType()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_RoomType();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Room#isNeedCleaning <em>Need Cleaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Need Cleaning</em>'.
	 * @see RootElement.Room#isNeedCleaning()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_NeedCleaning();

	/**
	 * Returns the meta object for class '{@link RootElement.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type</em>'.
	 * @see RootElement.RoomType
	 * @generated
	 */
	EClass getRoomType();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.RoomType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RootElement.RoomType#getName()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Name();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.RoomType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see RootElement.RoomType#getAttributes()
	 * @see #getRoomType()
	 * @generated
	 */
	EReference getRoomType_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.RoomType#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see RootElement.RoomType#getPrice()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Price();

	/**
	 * Returns the meta object for class '{@link RootElement.RoomAttribute <em>Room Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Attribute</em>'.
	 * @see RootElement.RoomAttribute
	 * @generated
	 */
	EClass getRoomAttribute();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.RoomAttribute#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see RootElement.RoomAttribute#getId()
	 * @see #getRoomAttribute()
	 * @generated
	 */
	EAttribute getRoomAttribute_Id();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.RoomAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RootElement.RoomAttribute#getName()
	 * @see #getRoomAttribute()
	 * @generated
	 */
	EAttribute getRoomAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.RoomAttribute#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see RootElement.RoomAttribute#getDescription()
	 * @see #getRoomAttribute()
	 * @generated
	 */
	EAttribute getRoomAttribute_Description();

	/**
	 * Returns the meta object for class '{@link RootElement.Feedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback</em>'.
	 * @see RootElement.Feedback
	 * @generated
	 */
	EClass getFeedback();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Feedback#getFeedbackDescription <em>Feedback Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feedback Description</em>'.
	 * @see RootElement.Feedback#getFeedbackDescription()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_FeedbackDescription();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Feedback#getRating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rating</em>'.
	 * @see RootElement.Feedback#getRating()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_Rating();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Feedback#isRead <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read</em>'.
	 * @see RootElement.Feedback#isRead()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_Read();

	/**
	 * Returns the meta object for the '{@link RootElement.Feedback#markAsRead() <em>Mark As Read</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mark As Read</em>' operation.
	 * @see RootElement.Feedback#markAsRead()
	 * @generated
	 */
	EOperation getFeedback__MarkAsRead();

	/**
	 * Returns the meta object for class '{@link RootElement.Staff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff</em>'.
	 * @see RootElement.Staff
	 * @generated
	 */
	EClass getStaff();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Staff#getStaffID <em>Staff ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Staff ID</em>'.
	 * @see RootElement.Staff#getStaffID()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_StaffID();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Staff#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RootElement.Staff#getName()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Name();

	/**
	 * Returns the meta object for the '{@link RootElement.Staff#readSupportTicket() <em>Read Support Ticket</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Support Ticket</em>' operation.
	 * @see RootElement.Staff#readSupportTicket()
	 * @generated
	 */
	EOperation getStaff__ReadSupportTicket();

	/**
	 * Returns the meta object for the '{@link RootElement.Staff#closeSupportTicket() <em>Close Support Ticket</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Close Support Ticket</em>' operation.
	 * @see RootElement.Staff#closeSupportTicket()
	 * @generated
	 */
	EOperation getStaff__CloseSupportTicket();

	/**
	 * Returns the meta object for the '{@link RootElement.Staff#setRoomCleaned(boolean) <em>Set Room Cleaned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Room Cleaned</em>' operation.
	 * @see RootElement.Staff#setRoomCleaned(boolean)
	 * @generated
	 */
	EOperation getStaff__SetRoomCleaned__boolean();

	/**
	 * Returns the meta object for class '{@link RootElement.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see RootElement.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Booking#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see RootElement.Booking#getStartDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Booking#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see RootElement.Booking#getEndDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Booking#isCheckedIn <em>Checked In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked In</em>'.
	 * @see RootElement.Booking#isCheckedIn()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_CheckedIn();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Booking#isCheckedOut <em>Checked Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked Out</em>'.
	 * @see RootElement.Booking#isCheckedOut()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_CheckedOut();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Booking#getBookingID <em>Booking ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking ID</em>'.
	 * @see RootElement.Booking#getBookingID()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_BookingID();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Booking#getGuest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guest</em>'.
	 * @see RootElement.Booking#getGuest()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Guest();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.Booking#getRoomData <em>Room Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room Data</em>'.
	 * @see RootElement.Booking#getRoomData()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_RoomData();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Booking#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see RootElement.Booking#getPrice()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Price();

	/**
	 * Returns the meta object for the '{@link RootElement.Booking#setDate(java.util.Date) <em>Set Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Date</em>' operation.
	 * @see RootElement.Booking#setDate(java.util.Date)
	 * @generated
	 */
	EOperation getBooking__SetDate__Date();

	/**
	 * Returns the meta object for the '{@link RootElement.Booking#setDuration(java.util.Date) <em>Set Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Duration</em>' operation.
	 * @see RootElement.Booking#setDuration(java.util.Date)
	 * @generated
	 */
	EOperation getBooking__SetDuration__Date();

	/**
	 * Returns the meta object for the '{@link RootElement.Booking#setCheckedIn() <em>Set Checked In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Checked In</em>' operation.
	 * @see RootElement.Booking#setCheckedIn()
	 * @generated
	 */
	EOperation getBooking__SetCheckedIn();

	/**
	 * Returns the meta object for the '{@link RootElement.Booking#setCheckedOut() <em>Set Checked Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Checked Out</em>' operation.
	 * @see RootElement.Booking#setCheckedOut()
	 * @generated
	 */
	EOperation getBooking__SetCheckedOut();

	/**
	 * Returns the meta object for the '{@link RootElement.Booking#generateBookingID() <em>Generate Booking ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Booking ID</em>' operation.
	 * @see RootElement.Booking#generateBookingID()
	 * @generated
	 */
	EOperation getBooking__GenerateBookingID();

	/**
	 * Returns the meta object for class '{@link RootElement.RoomBookingData <em>Room Booking Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Booking Data</em>'.
	 * @see RootElement.RoomBookingData
	 * @generated
	 */
	EClass getRoomBookingData();

	/**
	 * Returns the meta object for the reference '{@link RootElement.RoomBookingData#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see RootElement.RoomBookingData#getRoom()
	 * @see #getRoomBookingData()
	 * @generated
	 */
	EReference getRoomBookingData_Room();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.RoomBookingData#getGuests <em>Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guests</em>'.
	 * @see RootElement.RoomBookingData#getGuests()
	 * @see #getRoomBookingData()
	 * @generated
	 */
	EAttribute getRoomBookingData_Guests();

	/**
	 * Returns the meta object for class '{@link RootElement.SupportTicket <em>Support Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support Ticket</em>'.
	 * @see RootElement.SupportTicket
	 * @generated
	 */
	EClass getSupportTicket();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.SupportTicket#getProblemDescription <em>Problem Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Problem Description</em>'.
	 * @see RootElement.SupportTicket#getProblemDescription()
	 * @see #getSupportTicket()
	 * @generated
	 */
	EAttribute getSupportTicket_ProblemDescription();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.SupportTicket#getRoomID <em>Room ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room ID</em>'.
	 * @see RootElement.SupportTicket#getRoomID()
	 * @see #getSupportTicket()
	 * @generated
	 */
	EAttribute getSupportTicket_RoomID();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.SupportTicket#getAddressTo <em>Address To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address To</em>'.
	 * @see RootElement.SupportTicket#getAddressTo()
	 * @see #getSupportTicket()
	 * @generated
	 */
	EAttribute getSupportTicket_AddressTo();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.SupportTicket#isFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see RootElement.SupportTicket#isFixed()
	 * @see #getSupportTicket()
	 * @generated
	 */
	EAttribute getSupportTicket_Fixed();

	/**
	 * Returns the meta object for class '{@link RootElement.Clerk <em>Clerk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clerk</em>'.
	 * @see RootElement.Clerk
	 * @generated
	 */
	EClass getClerk();

	/**
	 * Returns the meta object for the '{@link RootElement.Clerk#createBooking() <em>Create Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Booking</em>' operation.
	 * @see RootElement.Clerk#createBooking()
	 * @generated
	 */
	EOperation getClerk__CreateBooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Clerk#checkIn(RootElement.Booking) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see RootElement.Clerk#checkIn(RootElement.Booking)
	 * @generated
	 */
	EOperation getClerk__CheckIn__Booking();

	/**
	 * Returns the meta object for the '{@link RootElement.Clerk#checkout(RootElement.Booking) <em>Checkout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Checkout</em>' operation.
	 * @see RootElement.Clerk#checkout(RootElement.Booking)
	 * @generated
	 */
	EOperation getClerk__Checkout__Booking();

	/**
	 * Returns the meta object for class '{@link RootElement.Janitor <em>Janitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Janitor</em>'.
	 * @see RootElement.Janitor
	 * @generated
	 */
	EClass getJanitor();

	/**
	 * Returns the meta object for the '{@link RootElement.Janitor#addDirtyRoom() <em>Add Dirty Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Dirty Room</em>' operation.
	 * @see RootElement.Janitor#addDirtyRoom()
	 * @generated
	 */
	EOperation getJanitor__AddDirtyRoom();

	/**
	 * Returns the meta object for class '{@link RootElement.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see RootElement.Manager
	 * @generated
	 */
	EClass getManager();

	/**
	 * Returns the meta object for the '{@link RootElement.Manager#readFeedback() <em>Read Feedback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Feedback</em>' operation.
	 * @see RootElement.Manager#readFeedback()
	 * @generated
	 */
	EOperation getManager__ReadFeedback();

	/**
	 * Returns the meta object for class '{@link RootElement.SysAdmin <em>Sys Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sys Admin</em>'.
	 * @see RootElement.SysAdmin
	 * @generated
	 */
	EClass getSysAdmin();

	/**
	 * Returns the meta object for the '{@link RootElement.SysAdmin#addRoom(RootElement.Room) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see RootElement.SysAdmin#addRoom(RootElement.Room)
	 * @generated
	 */
	EOperation getSysAdmin__AddRoom__Room();

	/**
	 * Returns the meta object for the '{@link RootElement.SysAdmin#removeRoom(RootElement.Room) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see RootElement.SysAdmin#removeRoom(RootElement.Room)
	 * @generated
	 */
	EOperation getSysAdmin__RemoveRoom__Room();

	/**
	 * Returns the meta object for the '{@link RootElement.SysAdmin#createRoomType() <em>Create Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Room Type</em>' operation.
	 * @see RootElement.SysAdmin#createRoomType()
	 * @generated
	 */
	EOperation getSysAdmin__CreateRoomType();

	/**
	 * Returns the meta object for the '{@link RootElement.SysAdmin#removeRoomType() <em>Remove Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room Type</em>' operation.
	 * @see RootElement.SysAdmin#removeRoomType()
	 * @generated
	 */
	EOperation getSysAdmin__RemoveRoomType();

	/**
	 * Returns the meta object for the '{@link RootElement.SysAdmin#setRoomType() <em>Set Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Room Type</em>' operation.
	 * @see RootElement.SysAdmin#setRoomType()
	 * @generated
	 */
	EOperation getSysAdmin__SetRoomType();

	/**
	 * Returns the meta object for class '{@link RootElement.Hotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel</em>'.
	 * @see RootElement.Hotel
	 * @generated
	 */
	EClass getHotel();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.Hotel#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Staff</em>'.
	 * @see RootElement.Hotel#getStaff()
	 * @see #getHotel()
	 * @generated
	 */
	EReference getHotel_Staff();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.Hotel#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feedback</em>'.
	 * @see RootElement.Hotel#getFeedback()
	 * @see #getHotel()
	 * @generated
	 */
	EReference getHotel_Feedback();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.Hotel#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room</em>'.
	 * @see RootElement.Hotel#getRoom()
	 * @see #getHotel()
	 * @generated
	 */
	EReference getHotel_Room();

	/**
	 * Returns the meta object for the '{@link RootElement.Hotel#getUnreadFeedback() <em>Get Unread Feedback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Unread Feedback</em>' operation.
	 * @see RootElement.Hotel#getUnreadFeedback()
	 * @generated
	 */
	EOperation getHotel__GetUnreadFeedback();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RootElementFactory getRootElementFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link RootElement.impl.GuestImpl <em>Guest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.GuestImpl
		 * @see RootElement.impl.RootElementPackageImpl#getGuest()
		 * @generated
		 */
		EClass GUEST = eINSTANCE.getGuest();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__PHONE_NUMBER = eINSTANCE.getGuest_PhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__ADDRESS = eINSTANCE.getGuest_Address();

		/**
		 * The meta object literal for the '<em><b>Nationality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__NATIONALITY = eINSTANCE.getGuest_Nationality();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__NAME = eINSTANCE.getGuest_Name();

		/**
		 * The meta object literal for the '<em><b>Mail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__MAIL = eINSTANCE.getGuest_Mail();

		/**
		 * The meta object literal for the '<em><b>Social Security Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__SOCIAL_SECURITY_NUMBER = eINSTANCE.getGuest_SocialSecurityNumber();

		/**
		 * The meta object literal for the '<em><b>Create Support Ticket</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST___CREATE_SUPPORT_TICKET__STRING_STRING = eINSTANCE.getGuest__CreateSupportTicket__String_String();

		/**
		 * The meta object literal for the '{@link RootElement.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.RoomImpl
		 * @see RootElement.impl.RootElementPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Is Occupied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__IS_OCCUPIED = eINSTANCE.getRoom_IsOccupied();

		/**
		 * The meta object literal for the '<em><b>Room ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ROOM_ID = eINSTANCE.getRoom_RoomID();

		/**
		 * The meta object literal for the '<em><b>Room Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ROOM_TYPE = eINSTANCE.getRoom_RoomType();

		/**
		 * The meta object literal for the '<em><b>Need Cleaning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NEED_CLEANING = eINSTANCE.getRoom_NeedCleaning();

		/**
		 * The meta object literal for the '{@link RootElement.impl.RoomTypeImpl <em>Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.RoomTypeImpl
		 * @see RootElement.impl.RootElementPackageImpl#getRoomType()
		 * @generated
		 */
		EClass ROOM_TYPE = eINSTANCE.getRoomType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__NAME = eINSTANCE.getRoomType_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TYPE__ATTRIBUTES = eINSTANCE.getRoomType_Attributes();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__PRICE = eINSTANCE.getRoomType_Price();

		/**
		 * The meta object literal for the '{@link RootElement.impl.RoomAttributeImpl <em>Room Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.RoomAttributeImpl
		 * @see RootElement.impl.RootElementPackageImpl#getRoomAttribute()
		 * @generated
		 */
		EClass ROOM_ATTRIBUTE = eINSTANCE.getRoomAttribute();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ATTRIBUTE__ID = eINSTANCE.getRoomAttribute_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ATTRIBUTE__NAME = eINSTANCE.getRoomAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ATTRIBUTE__DESCRIPTION = eINSTANCE.getRoomAttribute_Description();

		/**
		 * The meta object literal for the '{@link RootElement.impl.FeedbackImpl <em>Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.FeedbackImpl
		 * @see RootElement.impl.RootElementPackageImpl#getFeedback()
		 * @generated
		 */
		EClass FEEDBACK = eINSTANCE.getFeedback();

		/**
		 * The meta object literal for the '<em><b>Feedback Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__FEEDBACK_DESCRIPTION = eINSTANCE.getFeedback_FeedbackDescription();

		/**
		 * The meta object literal for the '<em><b>Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__RATING = eINSTANCE.getFeedback_Rating();

		/**
		 * The meta object literal for the '<em><b>Read</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__READ = eINSTANCE.getFeedback_Read();

		/**
		 * The meta object literal for the '<em><b>Mark As Read</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEEDBACK___MARK_AS_READ = eINSTANCE.getFeedback__MarkAsRead();

		/**
		 * The meta object literal for the '{@link RootElement.impl.StaffImpl <em>Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.StaffImpl
		 * @see RootElement.impl.RootElementPackageImpl#getStaff()
		 * @generated
		 */
		EClass STAFF = eINSTANCE.getStaff();

		/**
		 * The meta object literal for the '<em><b>Staff ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__STAFF_ID = eINSTANCE.getStaff_StaffID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__NAME = eINSTANCE.getStaff_Name();

		/**
		 * The meta object literal for the '<em><b>Read Support Ticket</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF___READ_SUPPORT_TICKET = eINSTANCE.getStaff__ReadSupportTicket();

		/**
		 * The meta object literal for the '<em><b>Close Support Ticket</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF___CLOSE_SUPPORT_TICKET = eINSTANCE.getStaff__CloseSupportTicket();

		/**
		 * The meta object literal for the '<em><b>Set Room Cleaned</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF___SET_ROOM_CLEANED__BOOLEAN = eINSTANCE.getStaff__SetRoomCleaned__boolean();

		/**
		 * The meta object literal for the '{@link RootElement.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.BookingImpl
		 * @see RootElement.impl.RootElementPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__START_DATE = eINSTANCE.getBooking_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__END_DATE = eINSTANCE.getBooking_EndDate();

		/**
		 * The meta object literal for the '<em><b>Checked In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CHECKED_IN = eINSTANCE.getBooking_CheckedIn();

		/**
		 * The meta object literal for the '<em><b>Checked Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CHECKED_OUT = eINSTANCE.getBooking_CheckedOut();

		/**
		 * The meta object literal for the '<em><b>Booking ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BOOKING_ID = eINSTANCE.getBooking_BookingID();

		/**
		 * The meta object literal for the '<em><b>Guest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__GUEST = eINSTANCE.getBooking_Guest();

		/**
		 * The meta object literal for the '<em><b>Room Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__ROOM_DATA = eINSTANCE.getBooking_RoomData();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__PRICE = eINSTANCE.getBooking_Price();

		/**
		 * The meta object literal for the '<em><b>Set Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___SET_DATE__DATE = eINSTANCE.getBooking__SetDate__Date();

		/**
		 * The meta object literal for the '<em><b>Set Duration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___SET_DURATION__DATE = eINSTANCE.getBooking__SetDuration__Date();

		/**
		 * The meta object literal for the '<em><b>Set Checked In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___SET_CHECKED_IN = eINSTANCE.getBooking__SetCheckedIn();

		/**
		 * The meta object literal for the '<em><b>Set Checked Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___SET_CHECKED_OUT = eINSTANCE.getBooking__SetCheckedOut();

		/**
		 * The meta object literal for the '<em><b>Generate Booking ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___GENERATE_BOOKING_ID = eINSTANCE.getBooking__GenerateBookingID();

		/**
		 * The meta object literal for the '{@link RootElement.impl.RoomBookingDataImpl <em>Room Booking Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.RoomBookingDataImpl
		 * @see RootElement.impl.RootElementPackageImpl#getRoomBookingData()
		 * @generated
		 */
		EClass ROOM_BOOKING_DATA = eINSTANCE.getRoomBookingData();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_BOOKING_DATA__ROOM = eINSTANCE.getRoomBookingData_Room();

		/**
		 * The meta object literal for the '<em><b>Guests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_BOOKING_DATA__GUESTS = eINSTANCE.getRoomBookingData_Guests();

		/**
		 * The meta object literal for the '{@link RootElement.impl.SupportTicketImpl <em>Support Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.SupportTicketImpl
		 * @see RootElement.impl.RootElementPackageImpl#getSupportTicket()
		 * @generated
		 */
		EClass SUPPORT_TICKET = eINSTANCE.getSupportTicket();

		/**
		 * The meta object literal for the '<em><b>Problem Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORT_TICKET__PROBLEM_DESCRIPTION = eINSTANCE.getSupportTicket_ProblemDescription();

		/**
		 * The meta object literal for the '<em><b>Room ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORT_TICKET__ROOM_ID = eINSTANCE.getSupportTicket_RoomID();

		/**
		 * The meta object literal for the '<em><b>Address To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORT_TICKET__ADDRESS_TO = eINSTANCE.getSupportTicket_AddressTo();

		/**
		 * The meta object literal for the '<em><b>Fixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORT_TICKET__FIXED = eINSTANCE.getSupportTicket_Fixed();

		/**
		 * The meta object literal for the '{@link RootElement.impl.ClerkImpl <em>Clerk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.ClerkImpl
		 * @see RootElement.impl.RootElementPackageImpl#getClerk()
		 * @generated
		 */
		EClass CLERK = eINSTANCE.getClerk();

		/**
		 * The meta object literal for the '<em><b>Create Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLERK___CREATE_BOOKING = eINSTANCE.getClerk__CreateBooking();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLERK___CHECK_IN__BOOKING = eINSTANCE.getClerk__CheckIn__Booking();

		/**
		 * The meta object literal for the '<em><b>Checkout</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLERK___CHECKOUT__BOOKING = eINSTANCE.getClerk__Checkout__Booking();

		/**
		 * The meta object literal for the '{@link RootElement.impl.JanitorImpl <em>Janitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.JanitorImpl
		 * @see RootElement.impl.RootElementPackageImpl#getJanitor()
		 * @generated
		 */
		EClass JANITOR = eINSTANCE.getJanitor();

		/**
		 * The meta object literal for the '<em><b>Add Dirty Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JANITOR___ADD_DIRTY_ROOM = eINSTANCE.getJanitor__AddDirtyRoom();

		/**
		 * The meta object literal for the '{@link RootElement.impl.ManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.ManagerImpl
		 * @see RootElement.impl.RootElementPackageImpl#getManager()
		 * @generated
		 */
		EClass MANAGER = eINSTANCE.getManager();

		/**
		 * The meta object literal for the '<em><b>Read Feedback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANAGER___READ_FEEDBACK = eINSTANCE.getManager__ReadFeedback();

		/**
		 * The meta object literal for the '{@link RootElement.impl.SysAdminImpl <em>Sys Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.SysAdminImpl
		 * @see RootElement.impl.RootElementPackageImpl#getSysAdmin()
		 * @generated
		 */
		EClass SYS_ADMIN = eINSTANCE.getSysAdmin();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYS_ADMIN___ADD_ROOM__ROOM = eINSTANCE.getSysAdmin__AddRoom__Room();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYS_ADMIN___REMOVE_ROOM__ROOM = eINSTANCE.getSysAdmin__RemoveRoom__Room();

		/**
		 * The meta object literal for the '<em><b>Create Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYS_ADMIN___CREATE_ROOM_TYPE = eINSTANCE.getSysAdmin__CreateRoomType();

		/**
		 * The meta object literal for the '<em><b>Remove Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYS_ADMIN___REMOVE_ROOM_TYPE = eINSTANCE.getSysAdmin__RemoveRoomType();

		/**
		 * The meta object literal for the '<em><b>Set Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYS_ADMIN___SET_ROOM_TYPE = eINSTANCE.getSysAdmin__SetRoomType();

		/**
		 * The meta object literal for the '{@link RootElement.impl.HotelImpl <em>Hotel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.HotelImpl
		 * @see RootElement.impl.RootElementPackageImpl#getHotel()
		 * @generated
		 */
		EClass HOTEL = eINSTANCE.getHotel();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL__STAFF = eINSTANCE.getHotel_Staff();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL__FEEDBACK = eINSTANCE.getHotel_Feedback();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL__ROOM = eINSTANCE.getHotel_Room();

		/**
		 * The meta object literal for the '<em><b>Get Unread Feedback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL___GET_UNREAD_FEEDBACK = eINSTANCE.getHotel__GetUnreadFeedback();

	}

} //RootElementPackage
