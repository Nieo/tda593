/**
 */
package RootElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Staff#getStaffID <em>Staff ID</em>}</li>
 *   <li>{@link RootElement.Staff#getName <em>Name</em>}</li>
 *   <li>{@link RootElement.Staff#getCleaning <em>Cleaning</em>}</li>
 *   <li>{@link RootElement.Staff#getSupportTicketReader <em>Support Ticket Reader</em>}</li>
 *   <li>{@link RootElement.Staff#getSupportTicketWriter <em>Support Ticket Writer</em>}</li>
 * </ul>
 *
 * @see RootElement.RootElementPackage#getStaff()
 * @model
 * @generated
 */
public interface Staff extends Cleaning, SupportTicketWriter, SupportTicketReader {
	/**
	 * Returns the value of the '<em><b>Staff ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff ID</em>' attribute.
	 * @see #setStaffID(String)
	 * @see RootElement.RootElementPackage#getStaff_StaffID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getStaffID();

	/**
	 * Sets the value of the '{@link RootElement.Staff#getStaffID <em>Staff ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staff ID</em>' attribute.
	 * @see #getStaffID()
	 * @generated
	 */
	void setStaffID(String value);

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
	 * @see RootElement.RootElementPackage#getStaff_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RootElement.Staff#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cleaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cleaning</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cleaning</em>' reference.
	 * @see #setCleaning(Cleaning)
	 * @see RootElement.RootElementPackage#getStaff_Cleaning()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Cleaning getCleaning();

	/**
	 * Sets the value of the '{@link RootElement.Staff#getCleaning <em>Cleaning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cleaning</em>' reference.
	 * @see #getCleaning()
	 * @generated
	 */
	void setCleaning(Cleaning value);

	/**
	 * Returns the value of the '<em><b>Support Ticket Reader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Support Ticket Reader</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support Ticket Reader</em>' reference.
	 * @see #setSupportTicketReader(SupportTicketReader)
	 * @see RootElement.RootElementPackage#getStaff_SupportTicketReader()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SupportTicketReader getSupportTicketReader();

	/**
	 * Sets the value of the '{@link RootElement.Staff#getSupportTicketReader <em>Support Ticket Reader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support Ticket Reader</em>' reference.
	 * @see #getSupportTicketReader()
	 * @generated
	 */
	void setSupportTicketReader(SupportTicketReader value);

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
	 * @see RootElement.RootElementPackage#getStaff_SupportTicketWriter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SupportTicketWriter getSupportTicketWriter();

	/**
	 * Sets the value of the '{@link RootElement.Staff#getSupportTicketWriter <em>Support Ticket Writer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support Ticket Writer</em>' reference.
	 * @see #getSupportTicketWriter()
	 * @generated
	 */
	void setSupportTicketWriter(SupportTicketWriter value);

} // Staff
