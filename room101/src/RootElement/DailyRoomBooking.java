/**
 */
package RootElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Daily Room Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.DailyRoomBooking#getNbrOfGuests <em>Nbr Of Guests</em>}</li>
 * </ul>
 *
 * @see RootElement.RootElementPackage#getDailyRoomBooking()
 * @model
 * @generated
 */
public interface DailyRoomBooking extends RoomBooking {
	/**
	 * Returns the value of the '<em><b>Nbr Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nbr Of Guests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nbr Of Guests</em>' attribute.
	 * @see #setNbrOfGuests(int)
	 * @see RootElement.RootElementPackage#getDailyRoomBooking_NbrOfGuests()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNbrOfGuests();

	/**
	 * Sets the value of the '{@link RootElement.DailyRoomBooking#getNbrOfGuests <em>Nbr Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbr Of Guests</em>' attribute.
	 * @see #getNbrOfGuests()
	 * @generated
	 */
	void setNbrOfGuests(int value);

} // DailyRoomBooking
