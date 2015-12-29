/**
 */
package RootElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.RootElementPackage#getFeedbackWriter()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FeedbackWriter extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model feedbackDataType="org.eclipse.uml2.types.String" feedbackRequired="true" feedbackOrdered="false" ratingDataType="org.eclipse.uml2.types.Integer" ratingRequired="true" ratingOrdered="false"
	 * @generated
	 */
	void giveFeedback(String feedback, int rating);

} // FeedbackWriter
