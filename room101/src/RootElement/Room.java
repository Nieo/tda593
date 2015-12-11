/**
 */
package RootElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Room#isOccupied <em>Is Occupied</em>}</li>
 *   <li>{@link RootElement.Room#getRoomID <em>Room ID</em>}</li>
 *   <li>{@link RootElement.Room#isNeedCleaning <em>Need Cleaning</em>}</li>
 *   <li>{@link RootElement.Room#getRoomtype <em>Roomtype</em>}</li>
 * </ul>
 *
 * @see RootElement.RootElementPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Occupied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Occupied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Occupied</em>' attribute.
	 * @see #setIsOccupied(boolean)
	 * @see RootElement.RootElementPackage#getRoom_IsOccupied()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isOccupied();

	/**
	 * Sets the value of the '{@link RootElement.Room#isOccupied <em>Is Occupied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Occupied</em>' attribute.
	 * @see #isOccupied()
	 * @generated
	 */
	void setIsOccupied(boolean value);

	/**
	 * Returns the value of the '<em><b>Room ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room ID</em>' attribute.
	 * @see #setRoomID(String)
	 * @see RootElement.RootElementPackage#getRoom_RoomID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getRoomID();

	/**
	 * Sets the value of the '{@link RootElement.Room#getRoomID <em>Room ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room ID</em>' attribute.
	 * @see #getRoomID()
	 * @generated
	 */
	void setRoomID(String value);

	/**
	 * Returns the value of the '<em><b>Need Cleaning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Need Cleaning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Need Cleaning</em>' attribute.
	 * @see #setNeedCleaning(boolean)
	 * @see RootElement.RootElementPackage#getRoom_NeedCleaning()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNeedCleaning();

	/**
	 * Sets the value of the '{@link RootElement.Room#isNeedCleaning <em>Need Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Need Cleaning</em>' attribute.
	 * @see #isNeedCleaning()
	 * @generated
	 */
	void setNeedCleaning(boolean value);

	/**
	 * Returns the value of the '<em><b>Roomtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomtype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomtype</em>' reference.
	 * @see #setRoomtype(RoomType)
	 * @see RootElement.RootElementPackage#getRoom_Roomtype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomType getRoomtype();

	/**
	 * Sets the value of the '{@link RootElement.Room#getRoomtype <em>Roomtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomtype</em>' reference.
	 * @see #getRoomtype()
	 * @generated
	 */
	void setRoomtype(RoomType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getReservedRoom();

} // Room
