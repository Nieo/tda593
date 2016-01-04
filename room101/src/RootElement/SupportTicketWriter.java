/**
 */
package RootElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Support Ticket Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.RootElementPackage#getSupportTicketWriter()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SupportTicketWriter extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNameDataType="org.eclipse.uml2.types.String" roomNameRequired="true" roomNameOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	void newSupportTicket(String roomName, String description);

} // SupportTicketWriter
