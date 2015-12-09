/**
 */
package RootElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.FeedbackHandler#getFeedback <em>Feedback</em>}</li>
 * </ul>
 *
 * @see RootElement.RootElementPackage#getFeedbackHandler()
 * @model
 * @generated
 */
public interface FeedbackHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Feedback</b></em>' reference list.
	 * The list contents are of type {@link RootElement.Feedback}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feedback</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback</em>' reference list.
	 * @see RootElement.RootElementPackage#getFeedbackHandler_Feedback()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Feedback> getFeedback();

} // FeedbackHandler
