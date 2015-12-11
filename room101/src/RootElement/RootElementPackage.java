/**
 */
package RootElement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Next Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__NEXT_DESTINATION = 1;

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
	 * The feature id for the '<em><b>Need Cleaning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NEED_CLEANING = 2;

	/**
	 * The feature id for the '<em><b>Roomtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOMTYPE = 3;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Reserved Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___GET_RESERVED_ROOM = 0;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 1;

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
	 * The feature id for the '<em><b>Roomattribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__ROOMATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_FEATURE_COUNT = 4;

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
	 * The number of operations of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKING_ID = 0;

	/**
	 * The feature id for the '<em><b>Roombooking</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOMBOOKING = 1;

	/**
	 * The feature id for the '<em><b>Guest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__GUEST = 2;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Calculate Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___CALCULATE_COST = 0;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link RootElement.impl.RoomBookingImpl <em>Room Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.RoomBookingImpl
	 * @see RootElement.impl.RootElementPackageImpl#getRoomBooking()
	 * @generated
	 */
	int ROOM_BOOKING = 7;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__START_DATE = 0;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__END_DATE = 1;

	/**
	 * The feature id for the '<em><b>Booking Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__BOOKING_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__ROOM = 3;

	/**
	 * The number of structural features of the '<em>Room Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Calculate Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING___CALCULATE_COST = 0;

	/**
	 * The number of operations of the '<em>Room Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING_OPERATION_COUNT = 1;

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
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_TICKET__FIXED = 2;

	/**
	 * The number of structural features of the '<em>Support Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_TICKET_FEATURE_COUNT = 3;

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
	 * The number of operations of the '<em>Clerk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLERK_OPERATION_COUNT = STAFF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RootElement.impl.ManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.ManagerImpl
	 * @see RootElement.impl.RootElementPackageImpl#getManager()
	 * @generated
	 */
	int MANAGER = 10;

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
	int SYS_ADMIN = 11;

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
	 * The meta object id for the '{@link RootElement.MakeBooking <em>Make Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.MakeBooking
	 * @see RootElement.impl.RootElementPackageImpl#getMakeBooking()
	 * @generated
	 */
	int MAKE_BOOKING = 12;

	/**
	 * The number of structural features of the '<em>Make Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_BOOKING_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_BOOKING___CREATE_BOOKING = 0;

	/**
	 * The operation id for the '<em>Get Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_BOOKING___GET_AVAILABLE_ROOMS__DATE_DATE_INT_INT = 1;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_BOOKING___ADD_ROOM__BOOKING_ROOMTYPE_INT_INT = 2;

	/**
	 * The operation id for the '<em>Confirm Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_BOOKING___CONFIRM_BOOKING__BOOKING_STRING_STRING_STRING_STRING_INT_STRING = 3;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_BOOKING___CANCEL_BOOKING__BOOKING = 4;

	/**
	 * The number of operations of the '<em>Make Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_BOOKING_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link RootElement.Checkinout <em>Checkinout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Checkinout
	 * @see RootElement.impl.RootElementPackageImpl#getCheckinout()
	 * @generated
	 */
	int CHECKINOUT = 13;

	/**
	 * The number of structural features of the '<em>Checkinout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKINOUT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKINOUT___CHECK_IN__ROOMBOOKING = 0;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKINOUT___CHECK_OUT__ROOMBOOKING = 1;

	/**
	 * The operation id for the '<em>Find Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKINOUT___FIND_BOOKINGS__STRING = 2;

	/**
	 * The number of operations of the '<em>Checkinout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKINOUT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link RootElement.impl.BookingHandlerImpl <em>Booking Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.BookingHandlerImpl
	 * @see RootElement.impl.RootElementPackageImpl#getBookingHandler()
	 * @generated
	 */
	int BOOKING_HANDLER = 14;

	/**
	 * The feature id for the '<em><b>Booking</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER__BOOKING = 0;

	/**
	 * The number of structural features of the '<em>Booking Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Booking Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.RoomHandling <em>Room Handling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.RoomHandling
	 * @see RootElement.impl.RootElementPackageImpl#getRoomHandling()
	 * @generated
	 */
	int ROOM_HANDLING = 16;

	/**
	 * The number of structural features of the '<em>Room Handling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLING_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLING___ADD_ROOM__ROOMTYPE_INT = 0;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLING___REMOVE_ROOM__INT = 1;

	/**
	 * The operation id for the '<em>Edit Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLING___EDIT_ROOM__INT_ROOMTYPE_INT = 2;

	/**
	 * The operation id for the '<em>Find Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLING___FIND_ROOM__INT = 3;

	/**
	 * The operation id for the '<em>Get All Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLING___GET_ALL_ROOMS = 4;

	/**
	 * The number of operations of the '<em>Room Handling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLING_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link RootElement.impl.RoomStructureImpl <em>Room Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.RoomStructureImpl
	 * @see RootElement.impl.RootElementPackageImpl#getRoomStructure()
	 * @generated
	 */
	int ROOM_STRUCTURE = 15;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STRUCTURE__ROOMS = ROOM_HANDLING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roomtype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STRUCTURE__ROOMTYPE = ROOM_HANDLING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Roomattribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STRUCTURE__ROOMATTRIBUTE = ROOM_HANDLING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Room Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STRUCTURE_FEATURE_COUNT = ROOM_HANDLING_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STRUCTURE___ADD_ROOM__ROOMTYPE_INT = ROOM_HANDLING___ADD_ROOM__ROOMTYPE_INT;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STRUCTURE___REMOVE_ROOM__INT = ROOM_HANDLING___REMOVE_ROOM__INT;

	/**
	 * The operation id for the '<em>Edit Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STRUCTURE___EDIT_ROOM__INT_ROOMTYPE_INT = ROOM_HANDLING___EDIT_ROOM__INT_ROOMTYPE_INT;

	/**
	 * The operation id for the '<em>Find Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STRUCTURE___FIND_ROOM__INT = ROOM_HANDLING___FIND_ROOM__INT;

	/**
	 * The operation id for the '<em>Get All Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STRUCTURE___GET_ALL_ROOMS = ROOM_HANDLING___GET_ALL_ROOMS;

	/**
	 * The operation id for the '<em>Add Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STRUCTURE___ADD_ROOM_TYPE__STRING_INT = ROOM_HANDLING_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Edit Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STRUCTURE___EDIT_ROOM_TYPE__ROOMTYPE_STRING_INT = ROOM_HANDLING_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STRUCTURE___REMOVE_ROOM_TYPE__ROOMTYPE = ROOM_HANDLING_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STRUCTURE___GET_ALL_ROOM_TYPES = ROOM_HANDLING_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Attribute To Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STRUCTURE___ADD_ATTRIBUTE_TO_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE = ROOM_HANDLING_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Remove Attribute From Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STRUCTURE___REMOVE_ATTRIBUTE_FROM_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE = ROOM_HANDLING_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Add Room Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STRUCTURE___ADD_ROOM_ATTRIBUTE__STRING_STRING = ROOM_HANDLING_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Edit Room Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STRUCTURE___EDIT_ROOM_ATTRIBUTE__ROOMATTRIBUTE_STRING_STRING = ROOM_HANDLING_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Remove Room Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STRUCTURE___REMOVE_ROOM_ATTRIBUTE__ROOMATTRIBUTE = ROOM_HANDLING_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Room Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STRUCTURE_OPERATION_COUNT = ROOM_HANDLING_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link RootElement.RoomTypeHandling <em>Room Type Handling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.RoomTypeHandling
	 * @see RootElement.impl.RootElementPackageImpl#getRoomTypeHandling()
	 * @generated
	 */
	int ROOM_TYPE_HANDLING = 17;

	/**
	 * The number of structural features of the '<em>Room Type Handling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_HANDLING_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_HANDLING___ADD_ROOM_TYPE__STRING_INT = 0;

	/**
	 * The operation id for the '<em>Edit Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_HANDLING___EDIT_ROOM_TYPE__ROOMTYPE_STRING_INT = 1;

	/**
	 * The operation id for the '<em>Remove Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_HANDLING___REMOVE_ROOM_TYPE__ROOMTYPE = 2;

	/**
	 * The operation id for the '<em>Get All Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_HANDLING___GET_ALL_ROOM_TYPES = 3;

	/**
	 * The operation id for the '<em>Add Attribute To Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_HANDLING___ADD_ATTRIBUTE_TO_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE = 4;

	/**
	 * The operation id for the '<em>Remove Attribute From Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_HANDLING___REMOVE_ATTRIBUTE_FROM_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE = 5;

	/**
	 * The number of operations of the '<em>Room Type Handling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_HANDLING_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link RootElement.RoomAttributeHandling <em>Room Attribute Handling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.RoomAttributeHandling
	 * @see RootElement.impl.RootElementPackageImpl#getRoomAttributeHandling()
	 * @generated
	 */
	int ROOM_ATTRIBUTE_HANDLING = 18;

	/**
	 * The number of structural features of the '<em>Room Attribute Handling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ATTRIBUTE_HANDLING_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Room Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ATTRIBUTE_HANDLING___ADD_ROOM_ATTRIBUTE__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Edit Room Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ATTRIBUTE_HANDLING___EDIT_ROOM_ATTRIBUTE__ROOMATTRIBUTE_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Remove Room Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ATTRIBUTE_HANDLING___REMOVE_ROOM_ATTRIBUTE__ROOMATTRIBUTE = 2;

	/**
	 * The number of operations of the '<em>Room Attribute Handling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ATTRIBUTE_HANDLING_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link RootElement.impl.FeedbackHandlerImpl <em>Feedback Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.FeedbackHandlerImpl
	 * @see RootElement.impl.RootElementPackageImpl#getFeedbackHandler()
	 * @generated
	 */
	int FEEDBACK_HANDLER = 19;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_HANDLER__FEEDBACK = 0;

	/**
	 * The number of structural features of the '<em>Feedback Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_HANDLER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Feedback Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_HANDLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.impl.SupportTicketHandlerImpl <em>Support Ticket Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.SupportTicketHandlerImpl
	 * @see RootElement.impl.RootElementPackageImpl#getSupportTicketHandler()
	 * @generated
	 */
	int SUPPORT_TICKET_HANDLER = 20;

	/**
	 * The feature id for the '<em><b>Supportticket</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_TICKET_HANDLER__SUPPORTTICKET = 0;

	/**
	 * The number of structural features of the '<em>Support Ticket Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_TICKET_HANDLER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Support Ticket Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_TICKET_HANDLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.ReadFeedback <em>Read Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.ReadFeedback
	 * @see RootElement.impl.RootElementPackageImpl#getReadFeedback()
	 * @generated
	 */
	int READ_FEEDBACK = 21;

	/**
	 * The number of structural features of the '<em>Read Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_FEEDBACK_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get All Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_FEEDBACK___GET_ALL_FEEDBACK = 0;

	/**
	 * The operation id for the '<em>Get Unread Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_FEEDBACK___GET_UNREAD_FEEDBACK = 1;

	/**
	 * The number of operations of the '<em>Read Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_FEEDBACK_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link RootElement.WriteFeedback <em>Write Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.WriteFeedback
	 * @see RootElement.impl.RootElementPackageImpl#getWriteFeedback()
	 * @generated
	 */
	int WRITE_FEEDBACK = 22;

	/**
	 * The number of structural features of the '<em>Write Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_FEEDBACK_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Give Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_FEEDBACK___GIVE_FEEDBACK__STRING = 0;

	/**
	 * The number of operations of the '<em>Write Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_FEEDBACK_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link RootElement.WriteSupportTicket <em>Write Support Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.WriteSupportTicket
	 * @see RootElement.impl.RootElementPackageImpl#getWriteSupportTicket()
	 * @generated
	 */
	int WRITE_SUPPORT_TICKET = 23;

	/**
	 * The number of structural features of the '<em>Write Support Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_SUPPORT_TICKET_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>New Support Ticket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_SUPPORT_TICKET___NEW_SUPPORT_TICKET__ROOM_STRING = 0;

	/**
	 * The number of operations of the '<em>Write Support Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_SUPPORT_TICKET_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link RootElement.InteractWithSupportTicket <em>Interact With Support Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.InteractWithSupportTicket
	 * @see RootElement.impl.RootElementPackageImpl#getInteractWithSupportTicket()
	 * @generated
	 */
	int INTERACT_WITH_SUPPORT_TICKET = 24;

	/**
	 * The number of structural features of the '<em>Interact With Support Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACT_WITH_SUPPORT_TICKET_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Unfixed Tickets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACT_WITH_SUPPORT_TICKET___GET_UNFIXED_TICKETS = 0;

	/**
	 * The operation id for the '<em>Get Support Tickets For Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACT_WITH_SUPPORT_TICKET___GET_SUPPORT_TICKETS_FOR_ROOM__ROOM = 1;

	/**
	 * The operation id for the '<em>Mark As Completed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACT_WITH_SUPPORT_TICKET___MARK_AS_COMPLETED__SUPPORTTICKET = 2;

	/**
	 * The number of operations of the '<em>Interact With Support Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACT_WITH_SUPPORT_TICKET_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link RootElement.impl.CleaningHandlerImpl <em>Cleaning Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.CleaningHandlerImpl
	 * @see RootElement.impl.RootElementPackageImpl#getCleaningHandler()
	 * @generated
	 */
	int CLEANING_HANDLER = 25;

	/**
	 * The number of structural features of the '<em>Cleaning Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_HANDLER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Cleaning Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_HANDLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.RoomFetcher <em>Room Fetcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.RoomFetcher
	 * @see RootElement.impl.RootElementPackageImpl#getRoomFetcher()
	 * @generated
	 */
	int ROOM_FETCHER = 26;

	/**
	 * The number of structural features of the '<em>Room Fetcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FETCHER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Bookable Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FETCHER___GET_BOOKABLE_ROOMS = 0;

	/**
	 * The operation id for the '<em>Get All Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FETCHER___GET_ALL_ROOMS = 1;

	/**
	 * The number of operations of the '<em>Room Fetcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FETCHER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link RootElement.Cleaning <em>Cleaning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Cleaning
	 * @see RootElement.impl.RootElementPackageImpl#getCleaning()
	 * @generated
	 */
	int CLEANING = 27;

	/**
	 * The number of structural features of the '<em>Cleaning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Check If Room Cleaned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING___CHECK_IF_ROOM_CLEANED__STRING = 0;

	/**
	 * The operation id for the '<em>Get List Of Unclean Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING___GET_LIST_OF_UNCLEAN_ROOMS = 1;

	/**
	 * The operation id for the '<em>Mark Room As Cleaned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING___MARK_ROOM_AS_CLEANED__ROOM = 2;

	/**
	 * The number of operations of the '<em>Cleaning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link RootElement.Payment <em>Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Payment
	 * @see RootElement.impl.RootElementPackageImpl#getPayment()
	 * @generated
	 */
	int PAYMENT = 29;

	/**
	 * The number of structural features of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Verify Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT___VERIFY_CREDIT_CARD__STRING = 0;

	/**
	 * The operation id for the '<em>Debit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT___DEBIT_CARD__STRING_INT = 1;

	/**
	 * The number of operations of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link RootElement.impl.PaymentHandlerImpl <em>Payment Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.PaymentHandlerImpl
	 * @see RootElement.impl.RootElementPackageImpl#getPaymentHandler()
	 * @generated
	 */
	int PAYMENT_HANDLER = 28;

	/**
	 * The number of structural features of the '<em>Payment Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_HANDLER_FEATURE_COUNT = PAYMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Verify Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_HANDLER___VERIFY_CREDIT_CARD__STRING = PAYMENT___VERIFY_CREDIT_CARD__STRING;

	/**
	 * The operation id for the '<em>Debit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_HANDLER___DEBIT_CARD__STRING_INT = PAYMENT___DEBIT_CARD__STRING_INT;

	/**
	 * The number of operations of the '<em>Payment Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_HANDLER_OPERATION_COUNT = PAYMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RootElement.impl.DailyRoomBookingImpl <em>Daily Room Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.DailyRoomBookingImpl
	 * @see RootElement.impl.RootElementPackageImpl#getDailyRoomBooking()
	 * @generated
	 */
	int DAILY_ROOM_BOOKING = 30;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAILY_ROOM_BOOKING__START_DATE = ROOM_BOOKING__START_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAILY_ROOM_BOOKING__END_DATE = ROOM_BOOKING__END_DATE;

	/**
	 * The feature id for the '<em><b>Booking Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAILY_ROOM_BOOKING__BOOKING_STATUS = ROOM_BOOKING__BOOKING_STATUS;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAILY_ROOM_BOOKING__ROOM = ROOM_BOOKING__ROOM;

	/**
	 * The feature id for the '<em><b>Nbr Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAILY_ROOM_BOOKING__NBR_OF_GUESTS = ROOM_BOOKING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Daily Room Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAILY_ROOM_BOOKING_FEATURE_COUNT = ROOM_BOOKING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAILY_ROOM_BOOKING___CALCULATE_COST = ROOM_BOOKING___CALCULATE_COST;

	/**
	 * The number of operations of the '<em>Daily Room Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAILY_ROOM_BOOKING_OPERATION_COUNT = ROOM_BOOKING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RootElement.impl.HourlyRoomBookingImpl <em>Hourly Room Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.HourlyRoomBookingImpl
	 * @see RootElement.impl.RootElementPackageImpl#getHourlyRoomBooking()
	 * @generated
	 */
	int HOURLY_ROOM_BOOKING = 31;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOURLY_ROOM_BOOKING__START_DATE = ROOM_BOOKING__START_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOURLY_ROOM_BOOKING__END_DATE = ROOM_BOOKING__END_DATE;

	/**
	 * The feature id for the '<em><b>Booking Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOURLY_ROOM_BOOKING__BOOKING_STATUS = ROOM_BOOKING__BOOKING_STATUS;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOURLY_ROOM_BOOKING__ROOM = ROOM_BOOKING__ROOM;

	/**
	 * The number of structural features of the '<em>Hourly Room Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOURLY_ROOM_BOOKING_FEATURE_COUNT = ROOM_BOOKING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOURLY_ROOM_BOOKING___CALCULATE_COST = ROOM_BOOKING___CALCULATE_COST;

	/**
	 * The number of operations of the '<em>Hourly Room Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOURLY_ROOM_BOOKING_OPERATION_COUNT = ROOM_BOOKING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RootElement.BookingStatus <em>Booking Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.BookingStatus
	 * @see RootElement.impl.RootElementPackageImpl#getBookingStatus()
	 * @generated
	 */
	int BOOKING_STATUS = 32;


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
	 * Returns the meta object for the attribute '{@link RootElement.Guest#getNextDestination <em>Next Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Destination</em>'.
	 * @see RootElement.Guest#getNextDestination()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_NextDestination();

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
	 * Returns the meta object for the reference '{@link RootElement.Room#getRoomtype <em>Roomtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roomtype</em>'.
	 * @see RootElement.Room#getRoomtype()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Roomtype();

	/**
	 * Returns the meta object for the '{@link RootElement.Room#getReservedRoom() <em>Get Reserved Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reserved Room</em>' operation.
	 * @see RootElement.Room#getReservedRoom()
	 * @generated
	 */
	EOperation getRoom__GetReservedRoom();

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
	 * Returns the meta object for the reference list '{@link RootElement.RoomType#getRoomattribute <em>Roomattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roomattribute</em>'.
	 * @see RootElement.RoomType#getRoomattribute()
	 * @see #getRoomType()
	 * @generated
	 */
	EReference getRoomType_Roomattribute();

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
	 * Returns the meta object for class '{@link RootElement.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see RootElement.Booking
	 * @generated
	 */
	EClass getBooking();

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
	 * Returns the meta object for the reference list '{@link RootElement.Booking#getRoombooking <em>Roombooking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roombooking</em>'.
	 * @see RootElement.Booking#getRoombooking()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Roombooking();

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
	 * Returns the meta object for the '{@link RootElement.Booking#calculateCost() <em>Calculate Cost</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Cost</em>' operation.
	 * @see RootElement.Booking#calculateCost()
	 * @generated
	 */
	EOperation getBooking__CalculateCost();

	/**
	 * Returns the meta object for class '{@link RootElement.RoomBooking <em>Room Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Booking</em>'.
	 * @see RootElement.RoomBooking
	 * @generated
	 */
	EClass getRoomBooking();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.RoomBooking#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see RootElement.RoomBooking#getStartDate()
	 * @see #getRoomBooking()
	 * @generated
	 */
	EAttribute getRoomBooking_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.RoomBooking#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see RootElement.RoomBooking#getEndDate()
	 * @see #getRoomBooking()
	 * @generated
	 */
	EAttribute getRoomBooking_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.RoomBooking#getBookingStatus <em>Booking Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Status</em>'.
	 * @see RootElement.RoomBooking#getBookingStatus()
	 * @see #getRoomBooking()
	 * @generated
	 */
	EAttribute getRoomBooking_BookingStatus();

	/**
	 * Returns the meta object for the reference '{@link RootElement.RoomBooking#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see RootElement.RoomBooking#getRoom()
	 * @see #getRoomBooking()
	 * @generated
	 */
	EReference getRoomBooking_Room();

	/**
	 * Returns the meta object for the '{@link RootElement.RoomBooking#calculateCost() <em>Calculate Cost</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Cost</em>' operation.
	 * @see RootElement.RoomBooking#calculateCost()
	 * @generated
	 */
	EOperation getRoomBooking__CalculateCost();

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
	 * Returns the meta object for class '{@link RootElement.MakeBooking <em>Make Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Make Booking</em>'.
	 * @see RootElement.MakeBooking
	 * @generated
	 */
	EClass getMakeBooking();

	/**
	 * Returns the meta object for the '{@link RootElement.MakeBooking#createBooking() <em>Create Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Booking</em>' operation.
	 * @see RootElement.MakeBooking#createBooking()
	 * @generated
	 */
	EOperation getMakeBooking__CreateBooking();

	/**
	 * Returns the meta object for the '{@link RootElement.MakeBooking#getAvailableRooms(java.util.Date, java.util.Date, int, int) <em>Get Available Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Rooms</em>' operation.
	 * @see RootElement.MakeBooking#getAvailableRooms(java.util.Date, java.util.Date, int, int)
	 * @generated
	 */
	EOperation getMakeBooking__GetAvailableRooms__Date_Date_int_int();

	/**
	 * Returns the meta object for the '{@link RootElement.MakeBooking#addRoom(RootElement.Booking, RootElement.RoomType, int, int) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see RootElement.MakeBooking#addRoom(RootElement.Booking, RootElement.RoomType, int, int)
	 * @generated
	 */
	EOperation getMakeBooking__AddRoom__Booking_RoomType_int_int();

	/**
	 * Returns the meta object for the '{@link RootElement.MakeBooking#confirmBooking(RootElement.Booking, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String) <em>Confirm Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Confirm Booking</em>' operation.
	 * @see RootElement.MakeBooking#confirmBooking(RootElement.Booking, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String)
	 * @generated
	 */
	EOperation getMakeBooking__ConfirmBooking__Booking_String_String_String_String_int_String();

	/**
	 * Returns the meta object for the '{@link RootElement.MakeBooking#cancelBooking(RootElement.Booking) <em>Cancel Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booking</em>' operation.
	 * @see RootElement.MakeBooking#cancelBooking(RootElement.Booking)
	 * @generated
	 */
	EOperation getMakeBooking__CancelBooking__Booking();

	/**
	 * Returns the meta object for class '{@link RootElement.Checkinout <em>Checkinout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checkinout</em>'.
	 * @see RootElement.Checkinout
	 * @generated
	 */
	EClass getCheckinout();

	/**
	 * Returns the meta object for the '{@link RootElement.Checkinout#checkIn(RootElement.RoomBooking) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see RootElement.Checkinout#checkIn(RootElement.RoomBooking)
	 * @generated
	 */
	EOperation getCheckinout__CheckIn__RoomBooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Checkinout#checkOut(RootElement.RoomBooking) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see RootElement.Checkinout#checkOut(RootElement.RoomBooking)
	 * @generated
	 */
	EOperation getCheckinout__CheckOut__RoomBooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Checkinout#findBookings(java.lang.String) <em>Find Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Bookings</em>' operation.
	 * @see RootElement.Checkinout#findBookings(java.lang.String)
	 * @generated
	 */
	EOperation getCheckinout__FindBookings__String();

	/**
	 * Returns the meta object for class '{@link RootElement.BookingHandler <em>Booking Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Handler</em>'.
	 * @see RootElement.BookingHandler
	 * @generated
	 */
	EClass getBookingHandler();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.BookingHandler#getBooking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Booking</em>'.
	 * @see RootElement.BookingHandler#getBooking()
	 * @see #getBookingHandler()
	 * @generated
	 */
	EReference getBookingHandler_Booking();

	/**
	 * Returns the meta object for class '{@link RootElement.RoomStructure <em>Room Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Structure</em>'.
	 * @see RootElement.RoomStructure
	 * @generated
	 */
	EClass getRoomStructure();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.RoomStructure#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rooms</em>'.
	 * @see RootElement.RoomStructure#getRooms()
	 * @see #getRoomStructure()
	 * @generated
	 */
	EReference getRoomStructure_Rooms();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.RoomStructure#getRoomtype <em>Roomtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roomtype</em>'.
	 * @see RootElement.RoomStructure#getRoomtype()
	 * @see #getRoomStructure()
	 * @generated
	 */
	EReference getRoomStructure_Roomtype();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.RoomStructure#getRoomattribute <em>Roomattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roomattribute</em>'.
	 * @see RootElement.RoomStructure#getRoomattribute()
	 * @see #getRoomStructure()
	 * @generated
	 */
	EReference getRoomStructure_Roomattribute();

	/**
	 * Returns the meta object for class '{@link RootElement.RoomHandling <em>Room Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Handling</em>'.
	 * @see RootElement.RoomHandling
	 * @generated
	 */
	EClass getRoomHandling();

	/**
	 * Returns the meta object for the '{@link RootElement.RoomHandling#addRoom(RootElement.RoomType, int) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see RootElement.RoomHandling#addRoom(RootElement.RoomType, int)
	 * @generated
	 */
	EOperation getRoomHandling__AddRoom__RoomType_int();

	/**
	 * Returns the meta object for the '{@link RootElement.RoomHandling#removeRoom(int) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see RootElement.RoomHandling#removeRoom(int)
	 * @generated
	 */
	EOperation getRoomHandling__RemoveRoom__int();

	/**
	 * Returns the meta object for the '{@link RootElement.RoomHandling#editRoom(int, RootElement.RoomType, int) <em>Edit Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room</em>' operation.
	 * @see RootElement.RoomHandling#editRoom(int, RootElement.RoomType, int)
	 * @generated
	 */
	EOperation getRoomHandling__EditRoom__int_RoomType_int();

	/**
	 * Returns the meta object for the '{@link RootElement.RoomHandling#findRoom(int) <em>Find Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Room</em>' operation.
	 * @see RootElement.RoomHandling#findRoom(int)
	 * @generated
	 */
	EOperation getRoomHandling__FindRoom__int();

	/**
	 * Returns the meta object for the '{@link RootElement.RoomHandling#getAllRooms() <em>Get All Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Rooms</em>' operation.
	 * @see RootElement.RoomHandling#getAllRooms()
	 * @generated
	 */
	EOperation getRoomHandling__GetAllRooms();

	/**
	 * Returns the meta object for class '{@link RootElement.RoomTypeHandling <em>Room Type Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type Handling</em>'.
	 * @see RootElement.RoomTypeHandling
	 * @generated
	 */
	EClass getRoomTypeHandling();

	/**
	 * Returns the meta object for the '{@link RootElement.RoomTypeHandling#addRoomType(java.lang.String, int) <em>Add Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room Type</em>' operation.
	 * @see RootElement.RoomTypeHandling#addRoomType(java.lang.String, int)
	 * @generated
	 */
	EOperation getRoomTypeHandling__AddRoomType__String_int();

	/**
	 * Returns the meta object for the '{@link RootElement.RoomTypeHandling#editRoomType(RootElement.RoomType, java.lang.String, int) <em>Edit Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room Type</em>' operation.
	 * @see RootElement.RoomTypeHandling#editRoomType(RootElement.RoomType, java.lang.String, int)
	 * @generated
	 */
	EOperation getRoomTypeHandling__EditRoomType__RoomType_String_int();

	/**
	 * Returns the meta object for the '{@link RootElement.RoomTypeHandling#removeRoomType(RootElement.RoomType) <em>Remove Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room Type</em>' operation.
	 * @see RootElement.RoomTypeHandling#removeRoomType(RootElement.RoomType)
	 * @generated
	 */
	EOperation getRoomTypeHandling__RemoveRoomType__RoomType();

	/**
	 * Returns the meta object for the '{@link RootElement.RoomTypeHandling#getAllRoomTypes() <em>Get All Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Room Types</em>' operation.
	 * @see RootElement.RoomTypeHandling#getAllRoomTypes()
	 * @generated
	 */
	EOperation getRoomTypeHandling__GetAllRoomTypes();

	/**
	 * Returns the meta object for the '{@link RootElement.RoomTypeHandling#addAttributeToRoomType(RootElement.RoomType, RootElement.RoomAttribute) <em>Add Attribute To Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Attribute To Room Type</em>' operation.
	 * @see RootElement.RoomTypeHandling#addAttributeToRoomType(RootElement.RoomType, RootElement.RoomAttribute)
	 * @generated
	 */
	EOperation getRoomTypeHandling__AddAttributeToRoomType__RoomType_RoomAttribute();

	/**
	 * Returns the meta object for the '{@link RootElement.RoomTypeHandling#removeAttributeFromRoomType(RootElement.RoomType, RootElement.RoomAttribute) <em>Remove Attribute From Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Attribute From Room Type</em>' operation.
	 * @see RootElement.RoomTypeHandling#removeAttributeFromRoomType(RootElement.RoomType, RootElement.RoomAttribute)
	 * @generated
	 */
	EOperation getRoomTypeHandling__RemoveAttributeFromRoomType__RoomType_RoomAttribute();

	/**
	 * Returns the meta object for class '{@link RootElement.RoomAttributeHandling <em>Room Attribute Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Attribute Handling</em>'.
	 * @see RootElement.RoomAttributeHandling
	 * @generated
	 */
	EClass getRoomAttributeHandling();

	/**
	 * Returns the meta object for the '{@link RootElement.RoomAttributeHandling#addRoomAttribute(java.lang.String, java.lang.String) <em>Add Room Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room Attribute</em>' operation.
	 * @see RootElement.RoomAttributeHandling#addRoomAttribute(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getRoomAttributeHandling__AddRoomAttribute__String_String();

	/**
	 * Returns the meta object for the '{@link RootElement.RoomAttributeHandling#editRoomAttribute(RootElement.RoomAttribute, java.lang.String, java.lang.String) <em>Edit Room Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room Attribute</em>' operation.
	 * @see RootElement.RoomAttributeHandling#editRoomAttribute(RootElement.RoomAttribute, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getRoomAttributeHandling__EditRoomAttribute__RoomAttribute_String_String();

	/**
	 * Returns the meta object for the '{@link RootElement.RoomAttributeHandling#removeRoomAttribute(RootElement.RoomAttribute) <em>Remove Room Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room Attribute</em>' operation.
	 * @see RootElement.RoomAttributeHandling#removeRoomAttribute(RootElement.RoomAttribute)
	 * @generated
	 */
	EOperation getRoomAttributeHandling__RemoveRoomAttribute__RoomAttribute();

	/**
	 * Returns the meta object for class '{@link RootElement.FeedbackHandler <em>Feedback Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Handler</em>'.
	 * @see RootElement.FeedbackHandler
	 * @generated
	 */
	EClass getFeedbackHandler();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.FeedbackHandler#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feedback</em>'.
	 * @see RootElement.FeedbackHandler#getFeedback()
	 * @see #getFeedbackHandler()
	 * @generated
	 */
	EReference getFeedbackHandler_Feedback();

	/**
	 * Returns the meta object for class '{@link RootElement.SupportTicketHandler <em>Support Ticket Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support Ticket Handler</em>'.
	 * @see RootElement.SupportTicketHandler
	 * @generated
	 */
	EClass getSupportTicketHandler();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.SupportTicketHandler#getSupportticket <em>Supportticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supportticket</em>'.
	 * @see RootElement.SupportTicketHandler#getSupportticket()
	 * @see #getSupportTicketHandler()
	 * @generated
	 */
	EReference getSupportTicketHandler_Supportticket();

	/**
	 * Returns the meta object for class '{@link RootElement.ReadFeedback <em>Read Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Feedback</em>'.
	 * @see RootElement.ReadFeedback
	 * @generated
	 */
	EClass getReadFeedback();

	/**
	 * Returns the meta object for the '{@link RootElement.ReadFeedback#getAllFeedback() <em>Get All Feedback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Feedback</em>' operation.
	 * @see RootElement.ReadFeedback#getAllFeedback()
	 * @generated
	 */
	EOperation getReadFeedback__GetAllFeedback();

	/**
	 * Returns the meta object for the '{@link RootElement.ReadFeedback#getUnreadFeedback() <em>Get Unread Feedback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Unread Feedback</em>' operation.
	 * @see RootElement.ReadFeedback#getUnreadFeedback()
	 * @generated
	 */
	EOperation getReadFeedback__GetUnreadFeedback();

	/**
	 * Returns the meta object for class '{@link RootElement.WriteFeedback <em>Write Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Feedback</em>'.
	 * @see RootElement.WriteFeedback
	 * @generated
	 */
	EClass getWriteFeedback();

	/**
	 * Returns the meta object for the '{@link RootElement.WriteFeedback#giveFeedback(java.lang.String) <em>Give Feedback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Give Feedback</em>' operation.
	 * @see RootElement.WriteFeedback#giveFeedback(java.lang.String)
	 * @generated
	 */
	EOperation getWriteFeedback__GiveFeedback__String();

	/**
	 * Returns the meta object for class '{@link RootElement.WriteSupportTicket <em>Write Support Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Support Ticket</em>'.
	 * @see RootElement.WriteSupportTicket
	 * @generated
	 */
	EClass getWriteSupportTicket();

	/**
	 * Returns the meta object for the '{@link RootElement.WriteSupportTicket#newSupportTicket(RootElement.Room, java.lang.String) <em>New Support Ticket</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Support Ticket</em>' operation.
	 * @see RootElement.WriteSupportTicket#newSupportTicket(RootElement.Room, java.lang.String)
	 * @generated
	 */
	EOperation getWriteSupportTicket__NewSupportTicket__Room_String();

	/**
	 * Returns the meta object for class '{@link RootElement.InteractWithSupportTicket <em>Interact With Support Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interact With Support Ticket</em>'.
	 * @see RootElement.InteractWithSupportTicket
	 * @generated
	 */
	EClass getInteractWithSupportTicket();

	/**
	 * Returns the meta object for the '{@link RootElement.InteractWithSupportTicket#getUnfixedTickets() <em>Get Unfixed Tickets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Unfixed Tickets</em>' operation.
	 * @see RootElement.InteractWithSupportTicket#getUnfixedTickets()
	 * @generated
	 */
	EOperation getInteractWithSupportTicket__GetUnfixedTickets();

	/**
	 * Returns the meta object for the '{@link RootElement.InteractWithSupportTicket#getSupportTicketsForRoom(RootElement.Room) <em>Get Support Tickets For Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Support Tickets For Room</em>' operation.
	 * @see RootElement.InteractWithSupportTicket#getSupportTicketsForRoom(RootElement.Room)
	 * @generated
	 */
	EOperation getInteractWithSupportTicket__GetSupportTicketsForRoom__Room();

	/**
	 * Returns the meta object for the '{@link RootElement.InteractWithSupportTicket#markAsCompleted(RootElement.SupportTicket) <em>Mark As Completed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mark As Completed</em>' operation.
	 * @see RootElement.InteractWithSupportTicket#markAsCompleted(RootElement.SupportTicket)
	 * @generated
	 */
	EOperation getInteractWithSupportTicket__MarkAsCompleted__SupportTicket();

	/**
	 * Returns the meta object for class '{@link RootElement.CleaningHandler <em>Cleaning Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cleaning Handler</em>'.
	 * @see RootElement.CleaningHandler
	 * @generated
	 */
	EClass getCleaningHandler();

	/**
	 * Returns the meta object for class '{@link RootElement.RoomFetcher <em>Room Fetcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Fetcher</em>'.
	 * @see RootElement.RoomFetcher
	 * @generated
	 */
	EClass getRoomFetcher();

	/**
	 * Returns the meta object for the '{@link RootElement.RoomFetcher#getBookableRooms() <em>Get Bookable Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookable Rooms</em>' operation.
	 * @see RootElement.RoomFetcher#getBookableRooms()
	 * @generated
	 */
	EOperation getRoomFetcher__GetBookableRooms();

	/**
	 * Returns the meta object for the '{@link RootElement.RoomFetcher#getAllRooms() <em>Get All Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Rooms</em>' operation.
	 * @see RootElement.RoomFetcher#getAllRooms()
	 * @generated
	 */
	EOperation getRoomFetcher__GetAllRooms();

	/**
	 * Returns the meta object for class '{@link RootElement.Cleaning <em>Cleaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cleaning</em>'.
	 * @see RootElement.Cleaning
	 * @generated
	 */
	EClass getCleaning();

	/**
	 * Returns the meta object for the '{@link RootElement.Cleaning#checkIfRoomCleaned(java.lang.String) <em>Check If Room Cleaned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check If Room Cleaned</em>' operation.
	 * @see RootElement.Cleaning#checkIfRoomCleaned(java.lang.String)
	 * @generated
	 */
	EOperation getCleaning__CheckIfRoomCleaned__String();

	/**
	 * Returns the meta object for the '{@link RootElement.Cleaning#getListOfUncleanRooms() <em>Get List Of Unclean Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get List Of Unclean Rooms</em>' operation.
	 * @see RootElement.Cleaning#getListOfUncleanRooms()
	 * @generated
	 */
	EOperation getCleaning__GetListOfUncleanRooms();

	/**
	 * Returns the meta object for the '{@link RootElement.Cleaning#markRoomAsCleaned(RootElement.Room) <em>Mark Room As Cleaned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mark Room As Cleaned</em>' operation.
	 * @see RootElement.Cleaning#markRoomAsCleaned(RootElement.Room)
	 * @generated
	 */
	EOperation getCleaning__MarkRoomAsCleaned__Room();

	/**
	 * Returns the meta object for class '{@link RootElement.PaymentHandler <em>Payment Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Handler</em>'.
	 * @see RootElement.PaymentHandler
	 * @generated
	 */
	EClass getPaymentHandler();

	/**
	 * Returns the meta object for class '{@link RootElement.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment</em>'.
	 * @see RootElement.Payment
	 * @generated
	 */
	EClass getPayment();

	/**
	 * Returns the meta object for the '{@link RootElement.Payment#verifyCreditCard(java.lang.String) <em>Verify Credit Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verify Credit Card</em>' operation.
	 * @see RootElement.Payment#verifyCreditCard(java.lang.String)
	 * @generated
	 */
	EOperation getPayment__VerifyCreditCard__String();

	/**
	 * Returns the meta object for the '{@link RootElement.Payment#debitCard(java.lang.String, int) <em>Debit Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Debit Card</em>' operation.
	 * @see RootElement.Payment#debitCard(java.lang.String, int)
	 * @generated
	 */
	EOperation getPayment__DebitCard__String_int();

	/**
	 * Returns the meta object for class '{@link RootElement.DailyRoomBooking <em>Daily Room Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daily Room Booking</em>'.
	 * @see RootElement.DailyRoomBooking
	 * @generated
	 */
	EClass getDailyRoomBooking();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.DailyRoomBooking#getNbrOfGuests <em>Nbr Of Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nbr Of Guests</em>'.
	 * @see RootElement.DailyRoomBooking#getNbrOfGuests()
	 * @see #getDailyRoomBooking()
	 * @generated
	 */
	EAttribute getDailyRoomBooking_NbrOfGuests();

	/**
	 * Returns the meta object for class '{@link RootElement.HourlyRoomBooking <em>Hourly Room Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hourly Room Booking</em>'.
	 * @see RootElement.HourlyRoomBooking
	 * @generated
	 */
	EClass getHourlyRoomBooking();

	/**
	 * Returns the meta object for enum '{@link RootElement.BookingStatus <em>Booking Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Booking Status</em>'.
	 * @see RootElement.BookingStatus
	 * @generated
	 */
	EEnum getBookingStatus();

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
		 * The meta object literal for the '<em><b>Next Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__NEXT_DESTINATION = eINSTANCE.getGuest_NextDestination();

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
		 * The meta object literal for the '<em><b>Need Cleaning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NEED_CLEANING = eINSTANCE.getRoom_NeedCleaning();

		/**
		 * The meta object literal for the '<em><b>Roomtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ROOMTYPE = eINSTANCE.getRoom_Roomtype();

		/**
		 * The meta object literal for the '<em><b>Get Reserved Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___GET_RESERVED_ROOM = eINSTANCE.getRoom__GetReservedRoom();

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
		 * The meta object literal for the '<em><b>Roomattribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TYPE__ROOMATTRIBUTE = eINSTANCE.getRoomType_Roomattribute();

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
		 * The meta object literal for the '{@link RootElement.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.BookingImpl
		 * @see RootElement.impl.RootElementPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Booking ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BOOKING_ID = eINSTANCE.getBooking_BookingID();

		/**
		 * The meta object literal for the '<em><b>Roombooking</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__ROOMBOOKING = eINSTANCE.getBooking_Roombooking();

		/**
		 * The meta object literal for the '<em><b>Guest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__GUEST = eINSTANCE.getBooking_Guest();

		/**
		 * The meta object literal for the '<em><b>Calculate Cost</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___CALCULATE_COST = eINSTANCE.getBooking__CalculateCost();

		/**
		 * The meta object literal for the '{@link RootElement.impl.RoomBookingImpl <em>Room Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.RoomBookingImpl
		 * @see RootElement.impl.RootElementPackageImpl#getRoomBooking()
		 * @generated
		 */
		EClass ROOM_BOOKING = eINSTANCE.getRoomBooking();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_BOOKING__START_DATE = eINSTANCE.getRoomBooking_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_BOOKING__END_DATE = eINSTANCE.getRoomBooking_EndDate();

		/**
		 * The meta object literal for the '<em><b>Booking Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_BOOKING__BOOKING_STATUS = eINSTANCE.getRoomBooking_BookingStatus();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_BOOKING__ROOM = eINSTANCE.getRoomBooking_Room();

		/**
		 * The meta object literal for the '<em><b>Calculate Cost</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_BOOKING___CALCULATE_COST = eINSTANCE.getRoomBooking__CalculateCost();

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
		 * The meta object literal for the '{@link RootElement.MakeBooking <em>Make Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.MakeBooking
		 * @see RootElement.impl.RootElementPackageImpl#getMakeBooking()
		 * @generated
		 */
		EClass MAKE_BOOKING = eINSTANCE.getMakeBooking();

		/**
		 * The meta object literal for the '<em><b>Create Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAKE_BOOKING___CREATE_BOOKING = eINSTANCE.getMakeBooking__CreateBooking();

		/**
		 * The meta object literal for the '<em><b>Get Available Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAKE_BOOKING___GET_AVAILABLE_ROOMS__DATE_DATE_INT_INT = eINSTANCE.getMakeBooking__GetAvailableRooms__Date_Date_int_int();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAKE_BOOKING___ADD_ROOM__BOOKING_ROOMTYPE_INT_INT = eINSTANCE.getMakeBooking__AddRoom__Booking_RoomType_int_int();

		/**
		 * The meta object literal for the '<em><b>Confirm Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAKE_BOOKING___CONFIRM_BOOKING__BOOKING_STRING_STRING_STRING_STRING_INT_STRING = eINSTANCE.getMakeBooking__ConfirmBooking__Booking_String_String_String_String_int_String();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAKE_BOOKING___CANCEL_BOOKING__BOOKING = eINSTANCE.getMakeBooking__CancelBooking__Booking();

		/**
		 * The meta object literal for the '{@link RootElement.Checkinout <em>Checkinout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Checkinout
		 * @see RootElement.impl.RootElementPackageImpl#getCheckinout()
		 * @generated
		 */
		EClass CHECKINOUT = eINSTANCE.getCheckinout();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHECKINOUT___CHECK_IN__ROOMBOOKING = eINSTANCE.getCheckinout__CheckIn__RoomBooking();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHECKINOUT___CHECK_OUT__ROOMBOOKING = eINSTANCE.getCheckinout__CheckOut__RoomBooking();

		/**
		 * The meta object literal for the '<em><b>Find Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHECKINOUT___FIND_BOOKINGS__STRING = eINSTANCE.getCheckinout__FindBookings__String();

		/**
		 * The meta object literal for the '{@link RootElement.impl.BookingHandlerImpl <em>Booking Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.BookingHandlerImpl
		 * @see RootElement.impl.RootElementPackageImpl#getBookingHandler()
		 * @generated
		 */
		EClass BOOKING_HANDLER = eINSTANCE.getBookingHandler();

		/**
		 * The meta object literal for the '<em><b>Booking</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_HANDLER__BOOKING = eINSTANCE.getBookingHandler_Booking();

		/**
		 * The meta object literal for the '{@link RootElement.impl.RoomStructureImpl <em>Room Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.RoomStructureImpl
		 * @see RootElement.impl.RootElementPackageImpl#getRoomStructure()
		 * @generated
		 */
		EClass ROOM_STRUCTURE = eINSTANCE.getRoomStructure();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_STRUCTURE__ROOMS = eINSTANCE.getRoomStructure_Rooms();

		/**
		 * The meta object literal for the '<em><b>Roomtype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_STRUCTURE__ROOMTYPE = eINSTANCE.getRoomStructure_Roomtype();

		/**
		 * The meta object literal for the '<em><b>Roomattribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_STRUCTURE__ROOMATTRIBUTE = eINSTANCE.getRoomStructure_Roomattribute();

		/**
		 * The meta object literal for the '{@link RootElement.RoomHandling <em>Room Handling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.RoomHandling
		 * @see RootElement.impl.RootElementPackageImpl#getRoomHandling()
		 * @generated
		 */
		EClass ROOM_HANDLING = eINSTANCE.getRoomHandling();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_HANDLING___ADD_ROOM__ROOMTYPE_INT = eINSTANCE.getRoomHandling__AddRoom__RoomType_int();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_HANDLING___REMOVE_ROOM__INT = eINSTANCE.getRoomHandling__RemoveRoom__int();

		/**
		 * The meta object literal for the '<em><b>Edit Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_HANDLING___EDIT_ROOM__INT_ROOMTYPE_INT = eINSTANCE.getRoomHandling__EditRoom__int_RoomType_int();

		/**
		 * The meta object literal for the '<em><b>Find Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_HANDLING___FIND_ROOM__INT = eINSTANCE.getRoomHandling__FindRoom__int();

		/**
		 * The meta object literal for the '<em><b>Get All Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_HANDLING___GET_ALL_ROOMS = eINSTANCE.getRoomHandling__GetAllRooms();

		/**
		 * The meta object literal for the '{@link RootElement.RoomTypeHandling <em>Room Type Handling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.RoomTypeHandling
		 * @see RootElement.impl.RootElementPackageImpl#getRoomTypeHandling()
		 * @generated
		 */
		EClass ROOM_TYPE_HANDLING = eINSTANCE.getRoomTypeHandling();

		/**
		 * The meta object literal for the '<em><b>Add Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_TYPE_HANDLING___ADD_ROOM_TYPE__STRING_INT = eINSTANCE.getRoomTypeHandling__AddRoomType__String_int();

		/**
		 * The meta object literal for the '<em><b>Edit Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_TYPE_HANDLING___EDIT_ROOM_TYPE__ROOMTYPE_STRING_INT = eINSTANCE.getRoomTypeHandling__EditRoomType__RoomType_String_int();

		/**
		 * The meta object literal for the '<em><b>Remove Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_TYPE_HANDLING___REMOVE_ROOM_TYPE__ROOMTYPE = eINSTANCE.getRoomTypeHandling__RemoveRoomType__RoomType();

		/**
		 * The meta object literal for the '<em><b>Get All Room Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_TYPE_HANDLING___GET_ALL_ROOM_TYPES = eINSTANCE.getRoomTypeHandling__GetAllRoomTypes();

		/**
		 * The meta object literal for the '<em><b>Add Attribute To Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_TYPE_HANDLING___ADD_ATTRIBUTE_TO_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE = eINSTANCE.getRoomTypeHandling__AddAttributeToRoomType__RoomType_RoomAttribute();

		/**
		 * The meta object literal for the '<em><b>Remove Attribute From Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_TYPE_HANDLING___REMOVE_ATTRIBUTE_FROM_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE = eINSTANCE.getRoomTypeHandling__RemoveAttributeFromRoomType__RoomType_RoomAttribute();

		/**
		 * The meta object literal for the '{@link RootElement.RoomAttributeHandling <em>Room Attribute Handling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.RoomAttributeHandling
		 * @see RootElement.impl.RootElementPackageImpl#getRoomAttributeHandling()
		 * @generated
		 */
		EClass ROOM_ATTRIBUTE_HANDLING = eINSTANCE.getRoomAttributeHandling();

		/**
		 * The meta object literal for the '<em><b>Add Room Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_ATTRIBUTE_HANDLING___ADD_ROOM_ATTRIBUTE__STRING_STRING = eINSTANCE.getRoomAttributeHandling__AddRoomAttribute__String_String();

		/**
		 * The meta object literal for the '<em><b>Edit Room Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_ATTRIBUTE_HANDLING___EDIT_ROOM_ATTRIBUTE__ROOMATTRIBUTE_STRING_STRING = eINSTANCE.getRoomAttributeHandling__EditRoomAttribute__RoomAttribute_String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Room Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_ATTRIBUTE_HANDLING___REMOVE_ROOM_ATTRIBUTE__ROOMATTRIBUTE = eINSTANCE.getRoomAttributeHandling__RemoveRoomAttribute__RoomAttribute();

		/**
		 * The meta object literal for the '{@link RootElement.impl.FeedbackHandlerImpl <em>Feedback Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.FeedbackHandlerImpl
		 * @see RootElement.impl.RootElementPackageImpl#getFeedbackHandler()
		 * @generated
		 */
		EClass FEEDBACK_HANDLER = eINSTANCE.getFeedbackHandler();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_HANDLER__FEEDBACK = eINSTANCE.getFeedbackHandler_Feedback();

		/**
		 * The meta object literal for the '{@link RootElement.impl.SupportTicketHandlerImpl <em>Support Ticket Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.SupportTicketHandlerImpl
		 * @see RootElement.impl.RootElementPackageImpl#getSupportTicketHandler()
		 * @generated
		 */
		EClass SUPPORT_TICKET_HANDLER = eINSTANCE.getSupportTicketHandler();

		/**
		 * The meta object literal for the '<em><b>Supportticket</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORT_TICKET_HANDLER__SUPPORTTICKET = eINSTANCE.getSupportTicketHandler_Supportticket();

		/**
		 * The meta object literal for the '{@link RootElement.ReadFeedback <em>Read Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.ReadFeedback
		 * @see RootElement.impl.RootElementPackageImpl#getReadFeedback()
		 * @generated
		 */
		EClass READ_FEEDBACK = eINSTANCE.getReadFeedback();

		/**
		 * The meta object literal for the '<em><b>Get All Feedback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation READ_FEEDBACK___GET_ALL_FEEDBACK = eINSTANCE.getReadFeedback__GetAllFeedback();

		/**
		 * The meta object literal for the '<em><b>Get Unread Feedback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation READ_FEEDBACK___GET_UNREAD_FEEDBACK = eINSTANCE.getReadFeedback__GetUnreadFeedback();

		/**
		 * The meta object literal for the '{@link RootElement.WriteFeedback <em>Write Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.WriteFeedback
		 * @see RootElement.impl.RootElementPackageImpl#getWriteFeedback()
		 * @generated
		 */
		EClass WRITE_FEEDBACK = eINSTANCE.getWriteFeedback();

		/**
		 * The meta object literal for the '<em><b>Give Feedback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WRITE_FEEDBACK___GIVE_FEEDBACK__STRING = eINSTANCE.getWriteFeedback__GiveFeedback__String();

		/**
		 * The meta object literal for the '{@link RootElement.WriteSupportTicket <em>Write Support Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.WriteSupportTicket
		 * @see RootElement.impl.RootElementPackageImpl#getWriteSupportTicket()
		 * @generated
		 */
		EClass WRITE_SUPPORT_TICKET = eINSTANCE.getWriteSupportTicket();

		/**
		 * The meta object literal for the '<em><b>New Support Ticket</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WRITE_SUPPORT_TICKET___NEW_SUPPORT_TICKET__ROOM_STRING = eINSTANCE.getWriteSupportTicket__NewSupportTicket__Room_String();

		/**
		 * The meta object literal for the '{@link RootElement.InteractWithSupportTicket <em>Interact With Support Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.InteractWithSupportTicket
		 * @see RootElement.impl.RootElementPackageImpl#getInteractWithSupportTicket()
		 * @generated
		 */
		EClass INTERACT_WITH_SUPPORT_TICKET = eINSTANCE.getInteractWithSupportTicket();

		/**
		 * The meta object literal for the '<em><b>Get Unfixed Tickets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERACT_WITH_SUPPORT_TICKET___GET_UNFIXED_TICKETS = eINSTANCE.getInteractWithSupportTicket__GetUnfixedTickets();

		/**
		 * The meta object literal for the '<em><b>Get Support Tickets For Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERACT_WITH_SUPPORT_TICKET___GET_SUPPORT_TICKETS_FOR_ROOM__ROOM = eINSTANCE.getInteractWithSupportTicket__GetSupportTicketsForRoom__Room();

		/**
		 * The meta object literal for the '<em><b>Mark As Completed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERACT_WITH_SUPPORT_TICKET___MARK_AS_COMPLETED__SUPPORTTICKET = eINSTANCE.getInteractWithSupportTicket__MarkAsCompleted__SupportTicket();

		/**
		 * The meta object literal for the '{@link RootElement.impl.CleaningHandlerImpl <em>Cleaning Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.CleaningHandlerImpl
		 * @see RootElement.impl.RootElementPackageImpl#getCleaningHandler()
		 * @generated
		 */
		EClass CLEANING_HANDLER = eINSTANCE.getCleaningHandler();

		/**
		 * The meta object literal for the '{@link RootElement.RoomFetcher <em>Room Fetcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.RoomFetcher
		 * @see RootElement.impl.RootElementPackageImpl#getRoomFetcher()
		 * @generated
		 */
		EClass ROOM_FETCHER = eINSTANCE.getRoomFetcher();

		/**
		 * The meta object literal for the '<em><b>Get Bookable Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_FETCHER___GET_BOOKABLE_ROOMS = eINSTANCE.getRoomFetcher__GetBookableRooms();

		/**
		 * The meta object literal for the '<em><b>Get All Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_FETCHER___GET_ALL_ROOMS = eINSTANCE.getRoomFetcher__GetAllRooms();

		/**
		 * The meta object literal for the '{@link RootElement.Cleaning <em>Cleaning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Cleaning
		 * @see RootElement.impl.RootElementPackageImpl#getCleaning()
		 * @generated
		 */
		EClass CLEANING = eINSTANCE.getCleaning();

		/**
		 * The meta object literal for the '<em><b>Check If Room Cleaned</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLEANING___CHECK_IF_ROOM_CLEANED__STRING = eINSTANCE.getCleaning__CheckIfRoomCleaned__String();

		/**
		 * The meta object literal for the '<em><b>Get List Of Unclean Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLEANING___GET_LIST_OF_UNCLEAN_ROOMS = eINSTANCE.getCleaning__GetListOfUncleanRooms();

		/**
		 * The meta object literal for the '<em><b>Mark Room As Cleaned</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLEANING___MARK_ROOM_AS_CLEANED__ROOM = eINSTANCE.getCleaning__MarkRoomAsCleaned__Room();

		/**
		 * The meta object literal for the '{@link RootElement.impl.PaymentHandlerImpl <em>Payment Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.PaymentHandlerImpl
		 * @see RootElement.impl.RootElementPackageImpl#getPaymentHandler()
		 * @generated
		 */
		EClass PAYMENT_HANDLER = eINSTANCE.getPaymentHandler();

		/**
		 * The meta object literal for the '{@link RootElement.Payment <em>Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Payment
		 * @see RootElement.impl.RootElementPackageImpl#getPayment()
		 * @generated
		 */
		EClass PAYMENT = eINSTANCE.getPayment();

		/**
		 * The meta object literal for the '<em><b>Verify Credit Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT___VERIFY_CREDIT_CARD__STRING = eINSTANCE.getPayment__VerifyCreditCard__String();

		/**
		 * The meta object literal for the '<em><b>Debit Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT___DEBIT_CARD__STRING_INT = eINSTANCE.getPayment__DebitCard__String_int();

		/**
		 * The meta object literal for the '{@link RootElement.impl.DailyRoomBookingImpl <em>Daily Room Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.DailyRoomBookingImpl
		 * @see RootElement.impl.RootElementPackageImpl#getDailyRoomBooking()
		 * @generated
		 */
		EClass DAILY_ROOM_BOOKING = eINSTANCE.getDailyRoomBooking();

		/**
		 * The meta object literal for the '<em><b>Nbr Of Guests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAILY_ROOM_BOOKING__NBR_OF_GUESTS = eINSTANCE.getDailyRoomBooking_NbrOfGuests();

		/**
		 * The meta object literal for the '{@link RootElement.impl.HourlyRoomBookingImpl <em>Hourly Room Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.HourlyRoomBookingImpl
		 * @see RootElement.impl.RootElementPackageImpl#getHourlyRoomBooking()
		 * @generated
		 */
		EClass HOURLY_ROOM_BOOKING = eINSTANCE.getHourlyRoomBooking();

		/**
		 * The meta object literal for the '{@link RootElement.BookingStatus <em>Booking Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.BookingStatus
		 * @see RootElement.impl.RootElementPackageImpl#getBookingStatus()
		 * @generated
		 */
		EEnum BOOKING_STATUS = eINSTANCE.getBookingStatus();

	}

} //RootElementPackage
