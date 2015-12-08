/**
 */
package RootElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Hotel#getStaff <em>Staff</em>}</li>
 *   <li>{@link RootElement.Hotel#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link RootElement.Hotel#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see RootElement.RootElementPackage#getHotel()
 * @model
 * @generated
 */
public interface Hotel extends EObject {
	/**
	 * Returns the value of the '<em><b>Staff</b></em>' reference list.
	 * The list contents are of type {@link RootElement.Staff}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' reference list.
	 * @see RootElement.RootElementPackage#getHotel_Staff()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Staff> getStaff();

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
	 * @see RootElement.RootElementPackage#getHotel_Feedback()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Feedback> getFeedback();

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference list.
	 * The list contents are of type {@link RootElement.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference list.
	 * @see RootElement.RootElementPackage#getHotel_Room()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Room> getRoom();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getUnreadFeedback();

} // Hotel
