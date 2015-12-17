/**
 */
package RootElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback Reader</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.RootElementPackage#getFeedbackReader()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FeedbackReader extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Feedback> getAllFeedback();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Feedback> getUnreadFeedback();

} // FeedbackReader
