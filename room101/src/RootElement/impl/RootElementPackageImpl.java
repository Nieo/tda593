/**
 */
package RootElement.impl;

import RootElement.Booking;
import RootElement.BookingHandler;
import RootElement.BookingStatus;
import RootElement.Cleaning;
import RootElement.CleaningHandler;
import RootElement.Clerk;
import RootElement.DailyRoomBooking;
import RootElement.Feedback;
import RootElement.FeedbackHandler;
import RootElement.FeedbackReader;
import RootElement.FeedbackWriter;
import RootElement.Guest;
import RootElement.Hotel;
import RootElement.HotelSystem;
import RootElement.HourlyRoomBooking;
import RootElement.MakeBooking;
import RootElement.Manager;
import RootElement.Payment;
import RootElement.PaymentHandler;
import RootElement.ReceptionHandling;
import RootElement.Room;
import RootElement.RoomAttribute;
import RootElement.RoomAttributeHandling;
import RootElement.RoomBooking;
import RootElement.RoomFetcher;
import RootElement.RoomHandling;
import RootElement.RoomStructure;
import RootElement.RoomType;
import RootElement.RoomTypeHandling;
import RootElement.RootElementFactory;
import RootElement.RootElementPackage;
import RootElement.ServiceItem;
import RootElement.ServiceItemHandling;
import RootElement.Staff;
import RootElement.SupportTicket;
import RootElement.SupportTicketHandler;
import RootElement.SupportTicketReader;
import RootElement.SupportTicketWriter;
import RootElement.SysAdmin;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RootElementPackageImpl extends EPackageImpl implements RootElementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomBookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportTicketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clerkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sysAdminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass makeBookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receptionHandlingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceItemHandlingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomHandlingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomTypeHandlingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomAttributeHandlingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportTicketHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackReaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackWriterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportTicketWriterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportTicketReaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cleaningHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomFetcherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cleaningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dailyRoomBookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hourlyRoomBookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotelSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bookingStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see RootElement.RootElementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RootElementPackageImpl() {
		super(eNS_URI, RootElementFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RootElementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RootElementPackage init() {
		if (isInited) return (RootElementPackage)EPackage.Registry.INSTANCE.getEPackage(RootElementPackage.eNS_URI);

		// Obtain or create and register package
		RootElementPackageImpl theRootElementPackage = (RootElementPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RootElementPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RootElementPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theRootElementPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theRootElementPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRootElementPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RootElementPackage.eNS_URI, theRootElementPackage);
		return theRootElementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuest() {
		return guestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_PhoneNumber() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_NextDestination() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_Nationality() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_Name() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_Mail() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_SocialSecurityNumber() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuest_SupportTicketWriter() {
		return (EReference)guestEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuest_MakeBooking() {
		return (EReference)guestEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuest_FeedbackWriter() {
		return (EReference)guestEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_IsOccupied() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_RoomName() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_NeedCleaning() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_RoomType() {
		return (EReference)roomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomType() {
		return roomTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Name() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Price() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomType_RoomAttributes() {
		return (EReference)roomTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomType__AddRoomAttribute__RoomAttribute() {
		return roomTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomType__RemoveRoomAttribute__RoomAttribute() {
		return roomTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomAttribute() {
		return roomAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomAttribute_Id() {
		return (EAttribute)roomAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomAttribute_Name() {
		return (EAttribute)roomAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomAttribute_Description() {
		return (EAttribute)roomAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeedback() {
		return feedbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeedback_FeedbackDescription() {
		return (EAttribute)feedbackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeedback_Rating() {
		return (EAttribute)feedbackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeedback_Read() {
		return (EAttribute)feedbackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaff() {
		return staffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaff_StaffID() {
		return (EAttribute)staffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaff_Name() {
		return (EAttribute)staffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaff_Cleaning() {
		return (EReference)staffEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaff_SupportTicketReader() {
		return (EReference)staffEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaff_SupportTicketWriter() {
		return (EReference)staffEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooking() {
		return bookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_BookingID() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Roombooking() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Guest() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Serviceitem() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__CalculateCost() {
		return bookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomBooking() {
		return roomBookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomBooking_StartDate() {
		return (EAttribute)roomBookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomBooking_EndDate() {
		return (EAttribute)roomBookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomBooking_BookingStatus() {
		return (EAttribute)roomBookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomBooking_Room() {
		return (EReference)roomBookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomBooking__CalculateCost() {
		return roomBookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceItem() {
		return serviceItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceItem_Name() {
		return (EAttribute)serviceItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceItem_Description() {
		return (EAttribute)serviceItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceItem_Price() {
		return (EAttribute)serviceItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportTicket() {
		return supportTicketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportTicket_ProblemDescription() {
		return (EAttribute)supportTicketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportTicket_RoomID() {
		return (EAttribute)supportTicketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportTicket_Fixed() {
		return (EAttribute)supportTicketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClerk() {
		return clerkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClerk_ReceptionHandling() {
		return (EReference)clerkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClerk_ServiceItemHandling() {
		return (EReference)clerkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClerk_MakeBooking() {
		return (EReference)clerkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClerk_Payment() {
		return (EReference)clerkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManager() {
		return managerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManager_FeedbackReader() {
		return (EReference)managerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSysAdmin() {
		return sysAdminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMakeBooking() {
		return makeBookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMakeBooking__CreateBooking() {
		return makeBookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMakeBooking__GetAvailableRooms__Date_Date_int_int() {
		return makeBookingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMakeBooking__AddRoom__Booking_RoomType_int_int() {
		return makeBookingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMakeBooking__ConfirmBooking__Booking_String_String_String_String_int_String() {
		return makeBookingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMakeBooking__CancelBooking__Booking() {
		return makeBookingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMakeBooking__LookupBooking__String_String() {
		return makeBookingEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceptionHandling() {
		return receptionHandlingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceptionHandling__CheckIn__RoomBooking() {
		return receptionHandlingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceptionHandling__CheckOut__RoomBooking() {
		return receptionHandlingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceptionHandling__FindBookings__String() {
		return receptionHandlingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceptionHandling__FindActiveBooking__String() {
		return receptionHandlingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceItemHandling() {
		return serviceItemHandlingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceItemHandling__AddServiceItem__Booking_String_String_int() {
		return serviceItemHandlingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceItemHandling__RemoveServiceItem__Booking_ServiceItem() {
		return serviceItemHandlingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceItemHandling__FindAllServiceItems__Booking() {
		return serviceItemHandlingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingHandler() {
		return bookingHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingHandler_Booking() {
		return (EReference)bookingHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingHandler_RoomFetcher() {
		return (EReference)bookingHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomStructure() {
		return roomStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomStructure_Rooms() {
		return (EReference)roomStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomStructure_RoomTypes() {
		return (EReference)roomStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomStructure_RoomAttributes() {
		return (EReference)roomStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomHandling() {
		return roomHandlingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomHandling__AddRoom__RoomType_String() {
		return roomHandlingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomHandling__RemoveRoom__String() {
		return roomHandlingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomHandling__EditRoom__Room_RoomType_String() {
		return roomHandlingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomHandling__FindRoom__String() {
		return roomHandlingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomHandling__GetAllRooms() {
		return roomHandlingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomTypeHandling() {
		return roomTypeHandlingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomTypeHandling__AddRoomType__String_int() {
		return roomTypeHandlingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomTypeHandling__EditRoomType__RoomType_String_int() {
		return roomTypeHandlingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomTypeHandling__RemoveRoomType__RoomType() {
		return roomTypeHandlingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomTypeHandling__GetAllRoomTypes() {
		return roomTypeHandlingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomTypeHandling__AddAttributeToRoomType__RoomType_RoomAttribute() {
		return roomTypeHandlingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomTypeHandling__RemoveAttributeFromRoomType__RoomType_RoomAttribute() {
		return roomTypeHandlingEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomTypeHandling__FindRoomType__String() {
		return roomTypeHandlingEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomAttributeHandling() {
		return roomAttributeHandlingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomAttributeHandling__AddRoomAttribute__String_String() {
		return roomAttributeHandlingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomAttributeHandling__EditRoomAttribute__RoomAttribute_String_String() {
		return roomAttributeHandlingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomAttributeHandling__RemoveRoomAttribute__RoomAttribute() {
		return roomAttributeHandlingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomAttributeHandling__GetAllRoomAttributes() {
		return roomAttributeHandlingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomAttributeHandling__FindRoomAttribute__String() {
		return roomAttributeHandlingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeedbackHandler() {
		return feedbackHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedbackHandler_Feedback() {
		return (EReference)feedbackHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportTicketHandler() {
		return supportTicketHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportTicketHandler_Supportticket() {
		return (EReference)supportTicketHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeedbackReader() {
		return feedbackReaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeedbackReader__GetAllFeedback() {
		return feedbackReaderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeedbackReader__GetUnreadFeedback() {
		return feedbackReaderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeedbackWriter() {
		return feedbackWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeedbackWriter__GiveFeedback__String_int() {
		return feedbackWriterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportTicketWriter() {
		return supportTicketWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSupportTicketWriter__NewSupportTicket__String_String() {
		return supportTicketWriterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportTicketReader() {
		return supportTicketReaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSupportTicketReader__GetUnfixedTickets() {
		return supportTicketReaderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSupportTicketReader__GetSupportTicketsForRoom__String() {
		return supportTicketReaderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSupportTicketReader__MarkAsCompleted__SupportTicket() {
		return supportTicketReaderEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCleaningHandler() {
		return cleaningHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCleaningHandler_RoomFetcher() {
		return (EReference)cleaningHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomFetcher() {
		return roomFetcherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomFetcher__GetBookableRooms() {
		return roomFetcherEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomFetcher__GetAllCleanableRooms() {
		return roomFetcherEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomFetcher__GetAvailableRooms() {
		return roomFetcherEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCleaning() {
		return cleaningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCleaning__CheckIfRoomCleaned__String() {
		return cleaningEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCleaning__GetListOfUncleanRooms() {
		return cleaningEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCleaning__MarkRoomAsCleaned__Room() {
		return cleaningEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentHandler() {
		return paymentHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayment() {
		return paymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPayment__VerifyCreditCard__String() {
		return paymentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPayment__DebitCard__String_int() {
		return paymentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDailyRoomBooking() {
		return dailyRoomBookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDailyRoomBooking_NbrOfGuests() {
		return (EAttribute)dailyRoomBookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHourlyRoomBooking() {
		return hourlyRoomBookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotelSystem() {
		return hotelSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHotelSystem__GetStaff__String() {
		return hotelSystemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHotelSystem__GetClerk__String() {
		return hotelSystemEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHotelSystem__GetManager__String() {
		return hotelSystemEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHotelSystem__GetSystemAdministrator() {
		return hotelSystemEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHotelSystem__GetGuest() {
		return hotelSystemEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotel() {
		return hotelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_Name() {
		return (EAttribute)hotelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBookingStatus() {
		return bookingStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootElementFactory getRootElementFactory() {
		return (RootElementFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		guestEClass = createEClass(GUEST);
		createEAttribute(guestEClass, GUEST__PHONE_NUMBER);
		createEAttribute(guestEClass, GUEST__NEXT_DESTINATION);
		createEAttribute(guestEClass, GUEST__NATIONALITY);
		createEAttribute(guestEClass, GUEST__NAME);
		createEAttribute(guestEClass, GUEST__MAIL);
		createEAttribute(guestEClass, GUEST__SOCIAL_SECURITY_NUMBER);
		createEReference(guestEClass, GUEST__SUPPORT_TICKET_WRITER);
		createEReference(guestEClass, GUEST__MAKE_BOOKING);
		createEReference(guestEClass, GUEST__FEEDBACK_WRITER);

		supportTicketWriterEClass = createEClass(SUPPORT_TICKET_WRITER);
		createEOperation(supportTicketWriterEClass, SUPPORT_TICKET_WRITER___NEW_SUPPORT_TICKET__STRING_STRING);

		makeBookingEClass = createEClass(MAKE_BOOKING);
		createEOperation(makeBookingEClass, MAKE_BOOKING___CREATE_BOOKING);
		createEOperation(makeBookingEClass, MAKE_BOOKING___GET_AVAILABLE_ROOMS__DATE_DATE_INT_INT);
		createEOperation(makeBookingEClass, MAKE_BOOKING___ADD_ROOM__BOOKING_ROOMTYPE_INT_INT);
		createEOperation(makeBookingEClass, MAKE_BOOKING___CONFIRM_BOOKING__BOOKING_STRING_STRING_STRING_STRING_INT_STRING);
		createEOperation(makeBookingEClass, MAKE_BOOKING___CANCEL_BOOKING__BOOKING);
		createEOperation(makeBookingEClass, MAKE_BOOKING___LOOKUP_BOOKING__STRING_STRING);

		bookingEClass = createEClass(BOOKING);
		createEAttribute(bookingEClass, BOOKING__BOOKING_ID);
		createEReference(bookingEClass, BOOKING__ROOMBOOKING);
		createEReference(bookingEClass, BOOKING__GUEST);
		createEReference(bookingEClass, BOOKING__SERVICEITEM);
		createEOperation(bookingEClass, BOOKING___CALCULATE_COST);

		roomBookingEClass = createEClass(ROOM_BOOKING);
		createEAttribute(roomBookingEClass, ROOM_BOOKING__START_DATE);
		createEAttribute(roomBookingEClass, ROOM_BOOKING__END_DATE);
		createEAttribute(roomBookingEClass, ROOM_BOOKING__BOOKING_STATUS);
		createEReference(roomBookingEClass, ROOM_BOOKING__ROOM);
		createEOperation(roomBookingEClass, ROOM_BOOKING___CALCULATE_COST);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__IS_OCCUPIED);
		createEAttribute(roomEClass, ROOM__ROOM_NAME);
		createEAttribute(roomEClass, ROOM__NEED_CLEANING);
		createEReference(roomEClass, ROOM__ROOM_TYPE);

		roomTypeEClass = createEClass(ROOM_TYPE);
		createEAttribute(roomTypeEClass, ROOM_TYPE__NAME);
		createEAttribute(roomTypeEClass, ROOM_TYPE__PRICE);
		createEReference(roomTypeEClass, ROOM_TYPE__ROOM_ATTRIBUTES);
		createEOperation(roomTypeEClass, ROOM_TYPE___ADD_ROOM_ATTRIBUTE__ROOMATTRIBUTE);
		createEOperation(roomTypeEClass, ROOM_TYPE___REMOVE_ROOM_ATTRIBUTE__ROOMATTRIBUTE);

		roomAttributeEClass = createEClass(ROOM_ATTRIBUTE);
		createEAttribute(roomAttributeEClass, ROOM_ATTRIBUTE__ID);
		createEAttribute(roomAttributeEClass, ROOM_ATTRIBUTE__NAME);
		createEAttribute(roomAttributeEClass, ROOM_ATTRIBUTE__DESCRIPTION);

		serviceItemEClass = createEClass(SERVICE_ITEM);
		createEAttribute(serviceItemEClass, SERVICE_ITEM__NAME);
		createEAttribute(serviceItemEClass, SERVICE_ITEM__DESCRIPTION);
		createEAttribute(serviceItemEClass, SERVICE_ITEM__PRICE);

		feedbackWriterEClass = createEClass(FEEDBACK_WRITER);
		createEOperation(feedbackWriterEClass, FEEDBACK_WRITER___GIVE_FEEDBACK__STRING_INT);

		feedbackEClass = createEClass(FEEDBACK);
		createEAttribute(feedbackEClass, FEEDBACK__FEEDBACK_DESCRIPTION);
		createEAttribute(feedbackEClass, FEEDBACK__RATING);
		createEAttribute(feedbackEClass, FEEDBACK__READ);

		staffEClass = createEClass(STAFF);
		createEAttribute(staffEClass, STAFF__STAFF_ID);
		createEAttribute(staffEClass, STAFF__NAME);
		createEReference(staffEClass, STAFF__CLEANING);
		createEReference(staffEClass, STAFF__SUPPORT_TICKET_READER);
		createEReference(staffEClass, STAFF__SUPPORT_TICKET_WRITER);

		cleaningEClass = createEClass(CLEANING);
		createEOperation(cleaningEClass, CLEANING___CHECK_IF_ROOM_CLEANED__STRING);
		createEOperation(cleaningEClass, CLEANING___GET_LIST_OF_UNCLEAN_ROOMS);
		createEOperation(cleaningEClass, CLEANING___MARK_ROOM_AS_CLEANED__ROOM);

		supportTicketReaderEClass = createEClass(SUPPORT_TICKET_READER);
		createEOperation(supportTicketReaderEClass, SUPPORT_TICKET_READER___GET_UNFIXED_TICKETS);
		createEOperation(supportTicketReaderEClass, SUPPORT_TICKET_READER___GET_SUPPORT_TICKETS_FOR_ROOM__STRING);
		createEOperation(supportTicketReaderEClass, SUPPORT_TICKET_READER___MARK_AS_COMPLETED__SUPPORTTICKET);

		supportTicketEClass = createEClass(SUPPORT_TICKET);
		createEAttribute(supportTicketEClass, SUPPORT_TICKET__PROBLEM_DESCRIPTION);
		createEAttribute(supportTicketEClass, SUPPORT_TICKET__ROOM_ID);
		createEAttribute(supportTicketEClass, SUPPORT_TICKET__FIXED);

		clerkEClass = createEClass(CLERK);
		createEReference(clerkEClass, CLERK__RECEPTION_HANDLING);
		createEReference(clerkEClass, CLERK__SERVICE_ITEM_HANDLING);
		createEReference(clerkEClass, CLERK__MAKE_BOOKING);
		createEReference(clerkEClass, CLERK__PAYMENT);

		receptionHandlingEClass = createEClass(RECEPTION_HANDLING);
		createEOperation(receptionHandlingEClass, RECEPTION_HANDLING___CHECK_IN__ROOMBOOKING);
		createEOperation(receptionHandlingEClass, RECEPTION_HANDLING___CHECK_OUT__ROOMBOOKING);
		createEOperation(receptionHandlingEClass, RECEPTION_HANDLING___FIND_BOOKINGS__STRING);
		createEOperation(receptionHandlingEClass, RECEPTION_HANDLING___FIND_ACTIVE_BOOKING__STRING);

		serviceItemHandlingEClass = createEClass(SERVICE_ITEM_HANDLING);
		createEOperation(serviceItemHandlingEClass, SERVICE_ITEM_HANDLING___ADD_SERVICE_ITEM__BOOKING_STRING_STRING_INT);
		createEOperation(serviceItemHandlingEClass, SERVICE_ITEM_HANDLING___REMOVE_SERVICE_ITEM__BOOKING_SERVICEITEM);
		createEOperation(serviceItemHandlingEClass, SERVICE_ITEM_HANDLING___FIND_ALL_SERVICE_ITEMS__BOOKING);

		paymentEClass = createEClass(PAYMENT);
		createEOperation(paymentEClass, PAYMENT___VERIFY_CREDIT_CARD__STRING);
		createEOperation(paymentEClass, PAYMENT___DEBIT_CARD__STRING_INT);

		managerEClass = createEClass(MANAGER);
		createEReference(managerEClass, MANAGER__FEEDBACK_READER);

		sysAdminEClass = createEClass(SYS_ADMIN);

		roomAttributeHandlingEClass = createEClass(ROOM_ATTRIBUTE_HANDLING);
		createEOperation(roomAttributeHandlingEClass, ROOM_ATTRIBUTE_HANDLING___ADD_ROOM_ATTRIBUTE__STRING_STRING);
		createEOperation(roomAttributeHandlingEClass, ROOM_ATTRIBUTE_HANDLING___EDIT_ROOM_ATTRIBUTE__ROOMATTRIBUTE_STRING_STRING);
		createEOperation(roomAttributeHandlingEClass, ROOM_ATTRIBUTE_HANDLING___REMOVE_ROOM_ATTRIBUTE__ROOMATTRIBUTE);
		createEOperation(roomAttributeHandlingEClass, ROOM_ATTRIBUTE_HANDLING___GET_ALL_ROOM_ATTRIBUTES);
		createEOperation(roomAttributeHandlingEClass, ROOM_ATTRIBUTE_HANDLING___FIND_ROOM_ATTRIBUTE__STRING);

		roomHandlingEClass = createEClass(ROOM_HANDLING);
		createEOperation(roomHandlingEClass, ROOM_HANDLING___ADD_ROOM__ROOMTYPE_STRING);
		createEOperation(roomHandlingEClass, ROOM_HANDLING___REMOVE_ROOM__STRING);
		createEOperation(roomHandlingEClass, ROOM_HANDLING___EDIT_ROOM__ROOM_ROOMTYPE_STRING);
		createEOperation(roomHandlingEClass, ROOM_HANDLING___FIND_ROOM__STRING);
		createEOperation(roomHandlingEClass, ROOM_HANDLING___GET_ALL_ROOMS);

		roomTypeHandlingEClass = createEClass(ROOM_TYPE_HANDLING);
		createEOperation(roomTypeHandlingEClass, ROOM_TYPE_HANDLING___ADD_ROOM_TYPE__STRING_INT);
		createEOperation(roomTypeHandlingEClass, ROOM_TYPE_HANDLING___EDIT_ROOM_TYPE__ROOMTYPE_STRING_INT);
		createEOperation(roomTypeHandlingEClass, ROOM_TYPE_HANDLING___REMOVE_ROOM_TYPE__ROOMTYPE);
		createEOperation(roomTypeHandlingEClass, ROOM_TYPE_HANDLING___GET_ALL_ROOM_TYPES);
		createEOperation(roomTypeHandlingEClass, ROOM_TYPE_HANDLING___ADD_ATTRIBUTE_TO_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE);
		createEOperation(roomTypeHandlingEClass, ROOM_TYPE_HANDLING___REMOVE_ATTRIBUTE_FROM_ROOM_TYPE__ROOMTYPE_ROOMATTRIBUTE);
		createEOperation(roomTypeHandlingEClass, ROOM_TYPE_HANDLING___FIND_ROOM_TYPE__STRING);

		feedbackReaderEClass = createEClass(FEEDBACK_READER);
		createEOperation(feedbackReaderEClass, FEEDBACK_READER___GET_ALL_FEEDBACK);
		createEOperation(feedbackReaderEClass, FEEDBACK_READER___GET_UNREAD_FEEDBACK);

		bookingHandlerEClass = createEClass(BOOKING_HANDLER);
		createEReference(bookingHandlerEClass, BOOKING_HANDLER__BOOKING);
		createEReference(bookingHandlerEClass, BOOKING_HANDLER__ROOM_FETCHER);

		roomFetcherEClass = createEClass(ROOM_FETCHER);
		createEOperation(roomFetcherEClass, ROOM_FETCHER___GET_BOOKABLE_ROOMS);
		createEOperation(roomFetcherEClass, ROOM_FETCHER___GET_ALL_CLEANABLE_ROOMS);
		createEOperation(roomFetcherEClass, ROOM_FETCHER___GET_AVAILABLE_ROOMS);

		roomStructureEClass = createEClass(ROOM_STRUCTURE);
		createEReference(roomStructureEClass, ROOM_STRUCTURE__ROOMS);
		createEReference(roomStructureEClass, ROOM_STRUCTURE__ROOM_TYPES);
		createEReference(roomStructureEClass, ROOM_STRUCTURE__ROOM_ATTRIBUTES);

		feedbackHandlerEClass = createEClass(FEEDBACK_HANDLER);
		createEReference(feedbackHandlerEClass, FEEDBACK_HANDLER__FEEDBACK);

		supportTicketHandlerEClass = createEClass(SUPPORT_TICKET_HANDLER);
		createEReference(supportTicketHandlerEClass, SUPPORT_TICKET_HANDLER__SUPPORTTICKET);

		cleaningHandlerEClass = createEClass(CLEANING_HANDLER);
		createEReference(cleaningHandlerEClass, CLEANING_HANDLER__ROOM_FETCHER);

		paymentHandlerEClass = createEClass(PAYMENT_HANDLER);

		dailyRoomBookingEClass = createEClass(DAILY_ROOM_BOOKING);
		createEAttribute(dailyRoomBookingEClass, DAILY_ROOM_BOOKING__NBR_OF_GUESTS);

		hourlyRoomBookingEClass = createEClass(HOURLY_ROOM_BOOKING);

		hotelSystemEClass = createEClass(HOTEL_SYSTEM);
		createEOperation(hotelSystemEClass, HOTEL_SYSTEM___GET_STAFF__STRING);
		createEOperation(hotelSystemEClass, HOTEL_SYSTEM___GET_CLERK__STRING);
		createEOperation(hotelSystemEClass, HOTEL_SYSTEM___GET_MANAGER__STRING);
		createEOperation(hotelSystemEClass, HOTEL_SYSTEM___GET_SYSTEM_ADMINISTRATOR);
		createEOperation(hotelSystemEClass, HOTEL_SYSTEM___GET_GUEST);

		hotelEClass = createEClass(HOTEL);
		createEAttribute(hotelEClass, HOTEL__NAME);

		// Create enums
		bookingStatusEEnum = createEEnum(BOOKING_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		guestEClass.getESuperTypes().add(this.getSupportTicketWriter());
		guestEClass.getESuperTypes().add(this.getFeedbackWriter());
		guestEClass.getESuperTypes().add(this.getMakeBooking());
		staffEClass.getESuperTypes().add(this.getCleaning());
		staffEClass.getESuperTypes().add(this.getSupportTicketWriter());
		staffEClass.getESuperTypes().add(this.getSupportTicketReader());
		clerkEClass.getESuperTypes().add(this.getStaff());
		clerkEClass.getESuperTypes().add(this.getReceptionHandling());
		clerkEClass.getESuperTypes().add(this.getServiceItemHandling());
		clerkEClass.getESuperTypes().add(this.getMakeBooking());
		clerkEClass.getESuperTypes().add(this.getPayment());
		managerEClass.getESuperTypes().add(this.getClerk());
		managerEClass.getESuperTypes().add(this.getSysAdmin());
		managerEClass.getESuperTypes().add(this.getFeedbackReader());
		sysAdminEClass.getESuperTypes().add(this.getRoomAttributeHandling());
		sysAdminEClass.getESuperTypes().add(this.getRoomHandling());
		sysAdminEClass.getESuperTypes().add(this.getRoomTypeHandling());
		bookingHandlerEClass.getESuperTypes().add(this.getReceptionHandling());
		bookingHandlerEClass.getESuperTypes().add(this.getMakeBooking());
		bookingHandlerEClass.getESuperTypes().add(this.getServiceItemHandling());
		roomStructureEClass.getESuperTypes().add(this.getRoomHandling());
		roomStructureEClass.getESuperTypes().add(this.getRoomTypeHandling());
		roomStructureEClass.getESuperTypes().add(this.getRoomAttributeHandling());
		roomStructureEClass.getESuperTypes().add(this.getRoomFetcher());
		feedbackHandlerEClass.getESuperTypes().add(this.getFeedbackReader());
		feedbackHandlerEClass.getESuperTypes().add(this.getFeedbackWriter());
		supportTicketHandlerEClass.getESuperTypes().add(this.getSupportTicketReader());
		supportTicketHandlerEClass.getESuperTypes().add(this.getSupportTicketWriter());
		cleaningHandlerEClass.getESuperTypes().add(this.getCleaning());
		paymentHandlerEClass.getESuperTypes().add(this.getPayment());
		dailyRoomBookingEClass.getESuperTypes().add(this.getRoomBooking());
		hourlyRoomBookingEClass.getESuperTypes().add(this.getRoomBooking());
		hotelEClass.getESuperTypes().add(this.getHotelSystem());

		// Initialize classes, features, and operations; add parameters
		initEClass(guestEClass, Guest.class, "Guest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuest_PhoneNumber(), theTypesPackage.getString(), "phoneNumber", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_NextDestination(), theTypesPackage.getString(), "nextDestination", null, 0, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_Nationality(), theTypesPackage.getString(), "nationality", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_Name(), theTypesPackage.getString(), "name", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_Mail(), theTypesPackage.getString(), "mail", null, 0, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_SocialSecurityNumber(), theTypesPackage.getString(), "socialSecurityNumber", null, 0, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGuest_SupportTicketWriter(), this.getSupportTicketWriter(), null, "supportTicketWriter", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGuest_MakeBooking(), this.getMakeBooking(), null, "makeBooking", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGuest_FeedbackWriter(), this.getFeedbackWriter(), null, "feedbackWriter", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(supportTicketWriterEClass, SupportTicketWriter.class, "SupportTicketWriter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getSupportTicketWriter__NewSupportTicket__String_String(), null, "newSupportTicket", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(makeBookingEClass, MakeBooking.class, "MakeBooking", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getMakeBooking__CreateBooking(), this.getBooking(), "createBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMakeBooking__GetAvailableRooms__Date_Date_int_int(), this.getRoomType(), "getAvailableRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "nbrOfAdults", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "nbrOfChildren", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMakeBooking__AddRoom__Booking_RoomType_int_int(), theTypesPackage.getBoolean(), "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "nbrOfAdults", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "nbrOfChildren", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMakeBooking__ConfirmBooking__Booking_String_String_String_String_int_String(), theTypesPackage.getBoolean(), "confirmBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "phone", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "mail", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "nationality", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "passportNr", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "nextDestination", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMakeBooking__CancelBooking__Booking(), theTypesPackage.getBoolean(), "cancelBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMakeBooking__LookupBooking__String_String(), this.getBooking(), "lookupBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "phoneNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooking_BookingID(), theTypesPackage.getString(), "bookingID", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Roombooking(), this.getRoomBooking(), null, "roombooking", null, 0, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Guest(), this.getGuest(), null, "guest", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Serviceitem(), this.getServiceItem(), null, "serviceitem", null, 0, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getBooking__CalculateCost(), theTypesPackage.getInteger(), "calculateCost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomBookingEClass, RoomBooking.class, "RoomBooking", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomBooking_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, RoomBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomBooking_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, RoomBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomBooking_BookingStatus(), this.getBookingStatus(), "bookingStatus", "NONE", 1, 1, RoomBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomBooking_Room(), this.getRoom(), null, "room", null, 1, 1, RoomBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getRoomBooking__CalculateCost(), theTypesPackage.getInteger(), "calculateCost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_IsOccupied(), theTypesPackage.getBoolean(), "isOccupied", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_RoomName(), theTypesPackage.getString(), "roomName", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_NeedCleaning(), theTypesPackage.getBoolean(), "needCleaning", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_RoomType(), this.getRoomType(), null, "roomType", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomTypeEClass, RoomType.class, "RoomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomType_Name(), theTypesPackage.getString(), "name", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_Price(), theTypesPackage.getInteger(), "price", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomType_RoomAttributes(), this.getRoomAttribute(), null, "roomAttributes", null, 0, -1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRoomType__AddRoomAttribute__RoomAttribute(), ecorePackage.getEBoolean(), "addRoomAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomAttribute(), "roomAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomType__RemoveRoomAttribute__RoomAttribute(), ecorePackage.getEBoolean(), "removeRoomAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomAttribute(), "roomAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomAttributeEClass, RoomAttribute.class, "RoomAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomAttribute_Id(), theTypesPackage.getInteger(), "id", null, 1, 1, RoomAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomAttribute_Name(), theTypesPackage.getString(), "name", null, 1, 1, RoomAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomAttribute_Description(), theTypesPackage.getString(), "description", null, 1, 1, RoomAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceItemEClass, ServiceItem.class, "ServiceItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceItem_Name(), theTypesPackage.getString(), "name", null, 1, 1, ServiceItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceItem_Description(), theTypesPackage.getString(), "description", null, 1, 1, ServiceItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceItem_Price(), theTypesPackage.getInteger(), "price", null, 1, 1, ServiceItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(feedbackWriterEClass, FeedbackWriter.class, "FeedbackWriter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getFeedbackWriter__GiveFeedback__String_int(), null, "giveFeedback", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "feedback", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "rating", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(feedbackEClass, Feedback.class, "Feedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeedback_FeedbackDescription(), theTypesPackage.getString(), "feedbackDescription", null, 1, 1, Feedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeedback_Rating(), theTypesPackage.getInteger(), "rating", null, 1, 1, Feedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeedback_Read(), theTypesPackage.getBoolean(), "read", "false", 1, 1, Feedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(staffEClass, Staff.class, "Staff", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaff_StaffID(), theTypesPackage.getString(), "staffID", null, 1, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaff_Name(), theTypesPackage.getString(), "name", null, 1, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStaff_Cleaning(), this.getCleaning(), null, "cleaning", null, 1, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStaff_SupportTicketReader(), this.getSupportTicketReader(), null, "supportTicketReader", null, 1, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStaff_SupportTicketWriter(), this.getSupportTicketWriter(), null, "supportTicketWriter", null, 1, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cleaningEClass, Cleaning.class, "Cleaning", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getCleaning__CheckIfRoomCleaned__String(), theTypesPackage.getBoolean(), "checkIfRoomCleaned", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCleaning__GetListOfUncleanRooms(), this.getRoom(), "getListOfUncleanRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCleaning__MarkRoomAsCleaned__Room(), null, "markRoomAsCleaned", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(supportTicketReaderEClass, SupportTicketReader.class, "SupportTicketReader", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSupportTicketReader__GetUnfixedTickets(), this.getSupportTicket(), "getUnfixedTickets", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getSupportTicketReader__GetSupportTicketsForRoom__String(), this.getSupportTicket(), "getSupportTicketsForRoom", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getSupportTicketReader__MarkAsCompleted__SupportTicket(), null, "markAsCompleted", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getSupportTicket(), "supportTicket", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(supportTicketEClass, SupportTicket.class, "SupportTicket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupportTicket_ProblemDescription(), theTypesPackage.getString(), "problemDescription", null, 1, 1, SupportTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSupportTicket_RoomID(), theTypesPackage.getString(), "roomID", null, 1, 1, SupportTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSupportTicket_Fixed(), theTypesPackage.getBoolean(), "fixed", "false", 1, 1, SupportTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(clerkEClass, Clerk.class, "Clerk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClerk_ReceptionHandling(), this.getReceptionHandling(), null, "receptionHandling", null, 1, 1, Clerk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClerk_ServiceItemHandling(), this.getServiceItemHandling(), null, "serviceItemHandling", null, 1, 1, Clerk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClerk_MakeBooking(), this.getMakeBooking(), null, "makeBooking", null, 1, 1, Clerk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClerk_Payment(), this.getPayment(), null, "payment", null, 1, 1, Clerk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(receptionHandlingEClass, ReceptionHandling.class, "ReceptionHandling", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getReceptionHandling__CheckIn__RoomBooking(), theTypesPackage.getBoolean(), "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReceptionHandling__CheckOut__RoomBooking(), theTypesPackage.getBoolean(), "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReceptionHandling__FindBookings__String(), this.getBooking(), "findBookings", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReceptionHandling__FindActiveBooking__String(), this.getBooking(), "findActiveBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(serviceItemHandlingEClass, ServiceItemHandling.class, "ServiceItemHandling", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getServiceItemHandling__AddServiceItem__Booking_String_String_int(), null, "addServiceItem", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getServiceItemHandling__RemoveServiceItem__Booking_ServiceItem(), null, "removeServiceItem", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getServiceItem(), "serviceItem", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getServiceItemHandling__FindAllServiceItems__Booking(), this.getServiceItem(), "findAllServiceItems", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(paymentEClass, Payment.class, "Payment", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPayment__VerifyCreditCard__String(), theTypesPackage.getBoolean(), "verifyCreditCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "creditCard", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPayment__DebitCard__String_int(), theTypesPackage.getBoolean(), "debitCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "creditCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "amount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(managerEClass, Manager.class, "Manager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManager_FeedbackReader(), this.getFeedbackReader(), null, "feedbackReader", null, 1, 1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sysAdminEClass, SysAdmin.class, "SysAdmin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roomAttributeHandlingEClass, RoomAttributeHandling.class, "RoomAttributeHandling", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getRoomAttributeHandling__AddRoomAttribute__String_String(), this.getRoomAttribute(), "addRoomAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomAttributeHandling__EditRoomAttribute__RoomAttribute_String_String(), theTypesPackage.getBoolean(), "editRoomAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomAttribute(), "roomAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "newName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "newDescription", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomAttributeHandling__RemoveRoomAttribute__RoomAttribute(), theTypesPackage.getBoolean(), "removeRoomAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomAttribute(), "roomAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoomAttributeHandling__GetAllRoomAttributes(), this.getRoomAttribute(), "getAllRoomAttributes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomAttributeHandling__FindRoomAttribute__String(), this.getRoomAttribute(), "findRoomAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomHandlingEClass, RoomHandling.class, "RoomHandling", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getRoomHandling__AddRoom__RoomType_String(), this.getRoom(), "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomHandling__RemoveRoom__String(), theTypesPackage.getBoolean(), "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomHandling__EditRoom__Room_RoomType_String(), theTypesPackage.getBoolean(), "editRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "newRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "newRoomName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomHandling__FindRoom__String(), this.getRoom(), "findRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoomHandling__GetAllRooms(), this.getRoom(), "getAllRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomTypeHandlingEClass, RoomTypeHandling.class, "RoomTypeHandling", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getRoomTypeHandling__AddRoomType__String_int(), this.getRoomType(), "addRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "cost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomTypeHandling__EditRoomType__RoomType_String_int(), theTypesPackage.getBoolean(), "editRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "newName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "newCost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomTypeHandling__RemoveRoomType__RoomType(), theTypesPackage.getBoolean(), "removeRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoomTypeHandling__GetAllRoomTypes(), this.getRoomType(), "getAllRoomTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomTypeHandling__AddAttributeToRoomType__RoomType_RoomAttribute(), theTypesPackage.getBoolean(), "addAttributeToRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomAttribute(), "roomAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomTypeHandling__RemoveAttributeFromRoomType__RoomType_RoomAttribute(), theTypesPackage.getBoolean(), "removeAttributeFromRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomAttribute(), "roomAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomTypeHandling__FindRoomType__String(), this.getRoomType(), "findRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(feedbackReaderEClass, FeedbackReader.class, "FeedbackReader", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getFeedbackReader__GetAllFeedback(), this.getFeedback(), "getAllFeedback", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getFeedbackReader__GetUnreadFeedback(), this.getFeedback(), "getUnreadFeedback", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingHandlerEClass, BookingHandler.class, "BookingHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookingHandler_Booking(), this.getBooking(), null, "booking", null, 0, -1, BookingHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingHandler_RoomFetcher(), this.getRoomFetcher(), null, "roomFetcher", null, 1, 1, BookingHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomFetcherEClass, RoomFetcher.class, "RoomFetcher", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getRoomFetcher__GetBookableRooms(), this.getRoom(), "getBookableRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoomFetcher__GetAllCleanableRooms(), this.getRoom(), "getAllCleanableRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoomFetcher__GetAvailableRooms(), this.getRoom(), "getAvailableRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomStructureEClass, RoomStructure.class, "RoomStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomStructure_Rooms(), this.getRoom(), null, "rooms", null, 0, -1, RoomStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomStructure_RoomTypes(), this.getRoomType(), null, "roomTypes", null, 0, -1, RoomStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomStructure_RoomAttributes(), this.getRoomAttribute(), null, "roomAttributes", null, 0, -1, RoomStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(feedbackHandlerEClass, FeedbackHandler.class, "FeedbackHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeedbackHandler_Feedback(), this.getFeedback(), null, "feedback", null, 0, -1, FeedbackHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(supportTicketHandlerEClass, SupportTicketHandler.class, "SupportTicketHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSupportTicketHandler_Supportticket(), this.getSupportTicket(), null, "supportticket", null, 0, -1, SupportTicketHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cleaningHandlerEClass, CleaningHandler.class, "CleaningHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCleaningHandler_RoomFetcher(), this.getRoomFetcher(), null, "roomFetcher", null, 1, 1, CleaningHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(paymentHandlerEClass, PaymentHandler.class, "PaymentHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dailyRoomBookingEClass, DailyRoomBooking.class, "DailyRoomBooking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDailyRoomBooking_NbrOfGuests(), theTypesPackage.getInteger(), "nbrOfGuests", null, 1, 1, DailyRoomBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hourlyRoomBookingEClass, HourlyRoomBooking.class, "HourlyRoomBooking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hotelSystemEClass, HotelSystem.class, "HotelSystem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHotelSystem__GetStaff__String(), this.getStaff(), "getStaff", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "staffID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHotelSystem__GetClerk__String(), this.getClerk(), "getClerk", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "staffID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHotelSystem__GetManager__String(), this.getManager(), "getManager", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "staffID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getHotelSystem__GetSystemAdministrator(), this.getSysAdmin(), "getSystemAdministrator", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getHotelSystem__GetGuest(), this.getGuest(), "getGuest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(hotelEClass, Hotel.class, "Hotel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHotel_Name(), theTypesPackage.getString(), "name", null, 1, 1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(bookingStatusEEnum, BookingStatus.class, "BookingStatus");
		addEEnumLiteral(bookingStatusEEnum, BookingStatus.NONE);
		addEEnumLiteral(bookingStatusEEnum, BookingStatus.BOOKED);
		addEEnumLiteral(bookingStatusEEnum, BookingStatus.CHECKED_IN);
		addEEnumLiteral(bookingStatusEEnum, BookingStatus.CHECKED_OUT);

		// Create resource
		createResource(eNS_URI);
	}

} //RootElementPackageImpl
