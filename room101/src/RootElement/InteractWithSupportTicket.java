/**
 */
package RootElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interact With Support Ticket</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.RootElementPackage#getInteractWithSupportTicket()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface InteractWithSupportTicket extends EObject {
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

} // InteractWithSupportTicket
