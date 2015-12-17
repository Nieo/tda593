/**
 */
package RootElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Guest#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link RootElement.Guest#getNextDestination <em>Next Destination</em>}</li>
 *   <li>{@link RootElement.Guest#getNationality <em>Nationality</em>}</li>
 *   <li>{@link RootElement.Guest#getName <em>Name</em>}</li>
 *   <li>{@link RootElement.Guest#getMail <em>Mail</em>}</li>
 *   <li>{@link RootElement.Guest#getSocialSecurityNumber <em>Social Security Number</em>}</li>
 *   <li>{@link RootElement.Guest#getSupportTicketWriter <em>Support Ticket Writer</em>}</li>
 *   <li>{@link RootElement.Guest#getMakeBooking <em>Make Booking</em>}</li>
 *   <li>{@link RootElement.Guest#getFeedbackWriter <em>Feedback Writer</em>}</li>
 * </ul>
 *
 * @see RootElement.RootElementPackage#getGuest()
 * @model
 * @generated
 */
public interface Guest extends SupportTicketWriter, FeedbackWriter, MakeBooking {
	/**
	 * Returns the value of the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Number</em>' attribute.
	 * @see #setPhoneNumber(String)
	 * @see RootElement.RootElementPackage#getGuest_PhoneNumber()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPhoneNumber();

	/**
	 * Sets the value of the '{@link RootElement.Guest#getPhoneNumber <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Number</em>' attribute.
	 * @see #getPhoneNumber()
	 * @generated
	 */
	void setPhoneNumber(String value);

	/**
	 * Returns the value of the '<em><b>Next Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Destination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Destination</em>' attribute.
	 * @see #setNextDestination(String)
	 * @see RootElement.RootElementPackage#getGuest_NextDestination()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getNextDestination();

	/**
	 * Sets the value of the '{@link RootElement.Guest#getNextDestination <em>Next Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Destination</em>' attribute.
	 * @see #getNextDestination()
	 * @generated
	 */
	void setNextDestination(String value);

	/**
	 * Returns the value of the '<em><b>Nationality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nationality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nationality</em>' attribute.
	 * @see #setNationality(String)
	 * @see RootElement.RootElementPackage#getGuest_Nationality()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getNationality();

	/**
	 * Sets the value of the '{@link RootElement.Guest#getNationality <em>Nationality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nationality</em>' attribute.
	 * @see #getNationality()
	 * @generated
	 */
	void setNationality(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see RootElement.RootElementPackage#getGuest_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RootElement.Guest#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mail</em>' attribute.
	 * @see #setMail(String)
	 * @see RootElement.RootElementPackage#getGuest_Mail()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getMail();

	/**
	 * Sets the value of the '{@link RootElement.Guest#getMail <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail</em>' attribute.
	 * @see #getMail()
	 * @generated
	 */
	void setMail(String value);

	/**
	 * Returns the value of the '<em><b>Social Security Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Social Security Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Social Security Number</em>' attribute.
	 * @see #setSocialSecurityNumber(String)
	 * @see RootElement.RootElementPackage#getGuest_SocialSecurityNumber()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getSocialSecurityNumber();

	/**
	 * Sets the value of the '{@link RootElement.Guest#getSocialSecurityNumber <em>Social Security Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Social Security Number</em>' attribute.
	 * @see #getSocialSecurityNumber()
	 * @generated
	 */
	void setSocialSecurityNumber(String value);

	/**
	 * Returns the value of the '<em><b>Support Ticket Writer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Support Ticket Writer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support Ticket Writer</em>' reference.
	 * @see #setSupportTicketWriter(SupportTicketWriter)
	 * @see RootElement.RootElementPackage#getGuest_SupportTicketWriter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SupportTicketWriter getSupportTicketWriter();

	/**
	 * Sets the value of the '{@link RootElement.Guest#getSupportTicketWriter <em>Support Ticket Writer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support Ticket Writer</em>' reference.
	 * @see #getSupportTicketWriter()
	 * @generated
	 */
	void setSupportTicketWriter(SupportTicketWriter value);

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
	 * @see RootElement.RootElementPackage#getGuest_MakeBooking()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MakeBooking getMakeBooking();

	/**
	 * Sets the value of the '{@link RootElement.Guest#getMakeBooking <em>Make Booking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Make Booking</em>' reference.
	 * @see #getMakeBooking()
	 * @generated
	 */
	void setMakeBooking(MakeBooking value);

	/**
	 * Returns the value of the '<em><b>Feedback Writer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feedback Writer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback Writer</em>' reference.
	 * @see #setFeedbackWriter(FeedbackWriter)
	 * @see RootElement.RootElementPackage#getGuest_FeedbackWriter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FeedbackWriter getFeedbackWriter();

	/**
	 * Sets the value of the '{@link RootElement.Guest#getFeedbackWriter <em>Feedback Writer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback Writer</em>' reference.
	 * @see #getFeedbackWriter()
	 * @generated
	 */
	void setFeedbackWriter(FeedbackWriter value);

} // Guest
