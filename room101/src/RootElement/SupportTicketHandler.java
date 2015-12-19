/**
 */
package RootElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Support Ticket Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.SupportTicketHandler#getSupportticket <em>Supportticket</em>}</li>
 * </ul>
 *
 * @see RootElement.RootElementPackage#getSupportTicketHandler()
 * @model
 * @generated
 */
public interface SupportTicketHandler extends SupportTicketReader, SupportTicketWriter {
	/**
	 * Returns the value of the '<em><b>Supportticket</b></em>' reference list.
	 * The list contents are of type {@link RootElement.SupportTicket}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supportticket</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supportticket</em>' reference list.
	 * @see RootElement.RootElementPackage#getSupportTicketHandler_Supportticket()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SupportTicket> getSupportticket();

} // SupportTicketHandler
