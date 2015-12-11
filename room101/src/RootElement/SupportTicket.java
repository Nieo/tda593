/**
 */
package RootElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Support Ticket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.SupportTicket#getProblemDescription <em>Problem Description</em>}</li>
 *   <li>{@link RootElement.SupportTicket#getRoomID <em>Room ID</em>}</li>
 *   <li>{@link RootElement.SupportTicket#isFixed <em>Fixed</em>}</li>
 * </ul>
 *
 * @see RootElement.RootElementPackage#getSupportTicket()
 * @model
 * @generated
 */
public interface SupportTicket extends EObject {
	/**
	 * Returns the value of the '<em><b>Problem Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Description</em>' attribute.
	 * @see #setProblemDescription(String)
	 * @see RootElement.RootElementPackage#getSupportTicket_ProblemDescription()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getProblemDescription();

	/**
	 * Sets the value of the '{@link RootElement.SupportTicket#getProblemDescription <em>Problem Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem Description</em>' attribute.
	 * @see #getProblemDescription()
	 * @generated
	 */
	void setProblemDescription(String value);

	/**
	 * Returns the value of the '<em><b>Room ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room ID</em>' attribute.
	 * @see #setRoomID(String)
	 * @see RootElement.RootElementPackage#getSupportTicket_RoomID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getRoomID();

	/**
	 * Sets the value of the '{@link RootElement.SupportTicket#getRoomID <em>Room ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room ID</em>' attribute.
	 * @see #getRoomID()
	 * @generated
	 */
	void setRoomID(String value);

	/**
	 * Returns the value of the '<em><b>Fixed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed</em>' attribute.
	 * @see #setFixed(boolean)
	 * @see RootElement.RootElementPackage#getSupportTicket_Fixed()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isFixed();

	/**
	 * Sets the value of the '{@link RootElement.SupportTicket#isFixed <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed</em>' attribute.
	 * @see #isFixed()
	 * @generated
	 */
	void setFixed(boolean value);

} // SupportTicket
