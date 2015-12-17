/**
 */
package RootElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Feedback#getFeedbackDescription <em>Feedback Description</em>}</li>
 *   <li>{@link RootElement.Feedback#getRating <em>Rating</em>}</li>
 *   <li>{@link RootElement.Feedback#isRead <em>Read</em>}</li>
 * </ul>
 *
 * @see RootElement.RootElementPackage#getFeedback()
 * @model
 * @generated
 */
public interface Feedback extends EObject {
	/**
	 * Returns the value of the '<em><b>Feedback Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feedback Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback Description</em>' attribute.
	 * @see #setFeedbackDescription(String)
	 * @see RootElement.RootElementPackage#getFeedback_FeedbackDescription()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getFeedbackDescription();

	/**
	 * Sets the value of the '{@link RootElement.Feedback#getFeedbackDescription <em>Feedback Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback Description</em>' attribute.
	 * @see #getFeedbackDescription()
	 * @generated
	 */
	void setFeedbackDescription(String value);

	/**
	 * Returns the value of the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating</em>' attribute.
	 * @see #setRating(int)
	 * @see RootElement.RootElementPackage#getFeedback_Rating()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRating();

	/**
	 * Sets the value of the '{@link RootElement.Feedback#getRating <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rating</em>' attribute.
	 * @see #getRating()
	 * @generated
	 */
	void setRating(int value);

	/**
	 * Returns the value of the '<em><b>Read</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read</em>' attribute.
	 * @see #setRead(boolean)
	 * @see RootElement.RootElementPackage#getFeedback_Read()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isRead();

	/**
	 * Sets the value of the '{@link RootElement.Feedback#isRead <em>Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read</em>' attribute.
	 * @see #isRead()
	 * @generated
	 */
	void setRead(boolean value);

} // Feedback
