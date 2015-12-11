/**
 */
package RootElement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see RootElement.RootElementPackage
 * @generated
 */
public interface RootElementFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RootElementFactory eINSTANCE = RootElement.impl.RootElementFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Guest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guest</em>'.
	 * @generated
	 */
	Guest createGuest();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Type</em>'.
	 * @generated
	 */
	RoomType createRoomType();

	/**
	 * Returns a new object of class '<em>Room Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Attribute</em>'.
	 * @generated
	 */
	RoomAttribute createRoomAttribute();

	/**
	 * Returns a new object of class '<em>Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feedback</em>'.
	 * @generated
	 */
	Feedback createFeedback();

	/**
	 * Returns a new object of class '<em>Booking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking</em>'.
	 * @generated
	 */
	Booking createBooking();

	/**
	 * Returns a new object of class '<em>Support Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Support Ticket</em>'.
	 * @generated
	 */
	SupportTicket createSupportTicket();

	/**
	 * Returns a new object of class '<em>Clerk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clerk</em>'.
	 * @generated
	 */
	Clerk createClerk();

	/**
	 * Returns a new object of class '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manager</em>'.
	 * @generated
	 */
	Manager createManager();

	/**
	 * Returns a new object of class '<em>Sys Admin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sys Admin</em>'.
	 * @generated
	 */
	SysAdmin createSysAdmin();

	/**
	 * Returns a new object of class '<em>Booking Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Handler</em>'.
	 * @generated
	 */
	BookingHandler createBookingHandler();

	/**
	 * Returns a new object of class '<em>Room Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Structure</em>'.
	 * @generated
	 */
	RoomStructure createRoomStructure();

	/**
	 * Returns a new object of class '<em>Feedback Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feedback Handler</em>'.
	 * @generated
	 */
	FeedbackHandler createFeedbackHandler();

	/**
	 * Returns a new object of class '<em>Support Ticket Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Support Ticket Handler</em>'.
	 * @generated
	 */
	SupportTicketHandler createSupportTicketHandler();

	/**
	 * Returns a new object of class '<em>Cleaning Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cleaning Handler</em>'.
	 * @generated
	 */
	CleaningHandler createCleaningHandler();

	/**
	 * Returns a new object of class '<em>Payment Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Handler</em>'.
	 * @generated
	 */
	PaymentHandler createPaymentHandler();

	/**
	 * Returns a new object of class '<em>Daily Room Booking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Daily Room Booking</em>'.
	 * @generated
	 */
	DailyRoomBooking createDailyRoomBooking();

	/**
	 * Returns a new object of class '<em>Hourly Room Booking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hourly Room Booking</em>'.
	 * @generated
	 */
	HourlyRoomBooking createHourlyRoomBooking();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RootElementPackage getRootElementPackage();

} //RootElementFactory
