/**
 */
package RootElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cleaning Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.CleaningHandler#getRoomFetcher <em>Room Fetcher</em>}</li>
 * </ul>
 *
 * @see RootElement.RootElementPackage#getCleaningHandler()
 * @model
 * @generated
 */
public interface CleaningHandler extends EObject {

	/**
	 * Returns the value of the '<em><b>Room Fetcher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Fetcher</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Fetcher</em>' reference.
	 * @see #setRoomFetcher(RoomFetcher)
	 * @see RootElement.RootElementPackage#getCleaningHandler_RoomFetcher()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomFetcher getRoomFetcher();

	/**
	 * Sets the value of the '{@link RootElement.CleaningHandler#getRoomFetcher <em>Room Fetcher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Fetcher</em>' reference.
	 * @see #getRoomFetcher()
	 * @generated
	 */
	void setRoomFetcher(RoomFetcher value);
} // CleaningHandler
