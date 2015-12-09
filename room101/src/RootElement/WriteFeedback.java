/**
 */
package RootElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.RootElementPackage#getWriteFeedback()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface WriteFeedback extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model feedbackDataType="org.eclipse.uml2.types.String" feedbackRequired="true" feedbackOrdered="false"
	 * @generated
	 */
	void giveFeedback(String feedback);

} // WriteFeedback
