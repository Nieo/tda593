/**
 */
package RootElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Manager#getFeedbackReader <em>Feedback Reader</em>}</li>
 * </ul>
 *
 * @see RootElement.RootElementPackage#getManager()
 * @model
 * @generated
 */
public interface Manager extends Clerk, SysAdmin, FeedbackReader {

	/**
	 * Returns the value of the '<em><b>Feedback Reader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feedback Reader</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback Reader</em>' reference.
	 * @see #setFeedbackReader(FeedbackReader)
	 * @see RootElement.RootElementPackage#getManager_FeedbackReader()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FeedbackReader getFeedbackReader();

	/**
	 * Sets the value of the '{@link RootElement.Manager#getFeedbackReader <em>Feedback Reader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback Reader</em>' reference.
	 * @see #getFeedbackReader()
	 * @generated
	 */
	void setFeedbackReader(FeedbackReader value);

} // Manager
