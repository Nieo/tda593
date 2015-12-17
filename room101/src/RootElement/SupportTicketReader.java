/**
 */
package RootElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Support Ticket Reader</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.RootElementPackage#getSupportTicketReader()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SupportTicketReader extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<SupportTicket> getUnfixedTickets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	EList<SupportTicket> getSupportTicketsForRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model supportTicketRequired="true" supportTicketOrdered="false"
	 * @generated
	 */
	void markAsCompleted(SupportTicket supportTicket);

} // SupportTicketReader
