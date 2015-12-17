/**
 */
package RootElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clerk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Clerk#getReceptionHandling <em>Reception Handling</em>}</li>
 *   <li>{@link RootElement.Clerk#getServiceItemHandling <em>Service Item Handling</em>}</li>
 *   <li>{@link RootElement.Clerk#getMakeBooking <em>Make Booking</em>}</li>
 *   <li>{@link RootElement.Clerk#getPayment <em>Payment</em>}</li>
 * </ul>
 *
 * @see RootElement.RootElementPackage#getClerk()
 * @model
 * @generated
 */
public interface Clerk extends Staff, ReceptionHandling, ServiceItemhandling, MakeBooking, Payment {

	/**
	 * Returns the value of the '<em><b>Reception Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reception Handling</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reception Handling</em>' reference.
	 * @see #setReceptionHandling(ReceptionHandling)
	 * @see RootElement.RootElementPackage#getClerk_ReceptionHandling()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ReceptionHandling getReceptionHandling();

	/**
	 * Sets the value of the '{@link RootElement.Clerk#getReceptionHandling <em>Reception Handling</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reception Handling</em>' reference.
	 * @see #getReceptionHandling()
	 * @generated
	 */
	void setReceptionHandling(ReceptionHandling value);

	/**
	 * Returns the value of the '<em><b>Service Item Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Item Handling</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Item Handling</em>' reference.
	 * @see #setServiceItemHandling(ServiceItemhandling)
	 * @see RootElement.RootElementPackage#getClerk_ServiceItemHandling()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ServiceItemhandling getServiceItemHandling();

	/**
	 * Sets the value of the '{@link RootElement.Clerk#getServiceItemHandling <em>Service Item Handling</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Item Handling</em>' reference.
	 * @see #getServiceItemHandling()
	 * @generated
	 */
	void setServiceItemHandling(ServiceItemhandling value);

	/**
	 * Returns the value of the '<em><b>Make Booking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Make Booking</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Make Booking</em>' reference.
	 * @see #setMakeBooking(MakeBooking)
	 * @see RootElement.RootElementPackage#getClerk_MakeBooking()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MakeBooking getMakeBooking();

	/**
	 * Sets the value of the '{@link RootElement.Clerk#getMakeBooking <em>Make Booking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Make Booking</em>' reference.
	 * @see #getMakeBooking()
	 * @generated
	 */
	void setMakeBooking(MakeBooking value);

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' reference.
	 * @see #setPayment(Payment)
	 * @see RootElement.RootElementPackage#getClerk_Payment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Payment getPayment();

	/**
	 * Sets the value of the '{@link RootElement.Clerk#getPayment <em>Payment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' reference.
	 * @see #getPayment()
	 * @generated
	 */
	void setPayment(Payment value);
} // Clerk
