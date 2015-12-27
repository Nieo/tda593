/**
 */
package RootElement;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Booking#getBookingID <em>Booking ID</em>}</li>
 *   <li>{@link RootElement.Booking#getRoombooking <em>Roombooking</em>}</li>
 *   <li>{@link RootElement.Booking#getGuest <em>Guest</em>}</li>
 *   <li>{@link RootElement.Booking#getServiceitem <em>Serviceitem</em>}</li>
 * </ul>
 *
 * @see RootElement.RootElementPackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking ID</em>' attribute.
	 * @see #setBookingID(String)
	 * @see RootElement.RootElementPackage#getBooking_BookingID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBookingID();

	/**
	 * Sets the value of the '{@link RootElement.Booking#getBookingID <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking ID</em>' attribute.
	 * @see #getBookingID()
	 * @generated
	 */
	void setBookingID(String value);

	/**
	 * Returns the value of the '<em><b>Roombooking</b></em>' reference list.
	 * The list contents are of type {@link RootElement.RoomBooking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roombooking</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roombooking</em>' reference list.
	 * @see RootElement.RootElementPackage#getBooking_Roombooking()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomBooking> getRoombooking();

	/**
	 * Returns the value of the '<em><b>Guest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest</em>' reference.
	 * @see #setGuest(Guest)
	 * @see RootElement.RootElementPackage#getBooking_Guest()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Guest getGuest();

	/**
	 * Sets the value of the '{@link RootElement.Booking#getGuest <em>Guest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guest</em>' reference.
	 * @see #getGuest()
	 * @generated
	 */
	void setGuest(Guest value);

	/**
	 * Returns the value of the '<em><b>Serviceitem</b></em>' reference list.
	 * The list contents are of type {@link RootElement.ServiceItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serviceitem</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviceitem</em>' reference list.
	 * @see RootElement.RootElementPackage#getBooking_Serviceitem()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ServiceItem> getServiceitem();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int calculateCost();

} // Booking
