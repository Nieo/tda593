/**
 */
package RootElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.BookingHandler#getBooking <em>Booking</em>}</li>
 *   <li>{@link RootElement.BookingHandler#getRoomFetcher <em>Room Fetcher</em>}</li>
 * </ul>
 *
 * @see RootElement.RootElementPackage#getBookingHandler()
 * @model
 * @generated
 */
public interface BookingHandler extends ReceptionHandling, MakeBooking {
	/**
	 * Returns the value of the '<em><b>Booking</b></em>' reference list.
	 * The list contents are of type {@link RootElement.Booking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking</em>' reference list.
	 * @see RootElement.RootElementPackage#getBookingHandler_Booking()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Booking> getBooking();

	/**
	 * Returns the value of the '<em><b>Room Fetcher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Fetcher</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Fetcher</em>' reference.
	 * @see #setRoomFetcher(RoomFetcher)
	 * @see RootElement.RootElementPackage#getBookingHandler_RoomFetcher()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomFetcher getRoomFetcher();

	/**
	 * Sets the value of the '{@link RootElement.BookingHandler#getRoomFetcher <em>Room Fetcher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Fetcher</em>' reference.
	 * @see #getRoomFetcher()
	 * @generated
	 */
	void setRoomFetcher(RoomFetcher value);

} // BookingHandler
