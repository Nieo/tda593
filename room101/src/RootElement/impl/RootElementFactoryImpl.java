/**
 */
package RootElement.impl;

import RootElement.*;

import org.eclipse.emf.ecore.EClass;
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
			case RootElementPackage.ROOM: return createRoom();
			case RootElementPackage.ROOM_TYPE: return createRoomType();
			case RootElementPackage.ROOM_ATTRIBUTE: return createRoomAttribute();
			case RootElementPackage.FEEDBACK: return createFeedback();
			case RootElementPackage.BOOKING: return createBooking();
			case RootElementPackage.ROOM_BOOKING_DATA: return createRoomBookingData();
			case RootElementPackage.SUPPORT_TICKET: return createSupportTicket();
			case RootElementPackage.CLERK: return createClerk();
			case RootElementPackage.JANITOR: return createJanitor();
			case RootElementPackage.MANAGER: return createManager();
			case RootElementPackage.SYS_ADMIN: return createSysAdmin();
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
	public RoomBookingData createRoomBookingData() {
		RoomBookingDataImpl roomBookingData = new RoomBookingDataImpl();
		return roomBookingData;
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
	public Janitor createJanitor() {
		JanitorImpl janitor = new JanitorImpl();
		return janitor;
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
	public Hotel createHotel() {
		HotelImpl hotel = new HotelImpl();
		return hotel;
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
