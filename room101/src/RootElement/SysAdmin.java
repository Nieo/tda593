/**
 */
package RootElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sys Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.SysAdmin#getRoomAttributeHandling <em>Room Attribute Handling</em>}</li>
 *   <li>{@link RootElement.SysAdmin#getRoomHandling <em>Room Handling</em>}</li>
 *   <li>{@link RootElement.SysAdmin#getRoomTypeHandling <em>Room Type Handling</em>}</li>
 * </ul>
 *
 * @see RootElement.RootElementPackage#getSysAdmin()
 * @model
 * @generated
 */
public interface SysAdmin extends RoomAttributeHandling, RoomHandling, RoomTypeHandling {

	/**
	 * Returns the value of the '<em><b>Room Attribute Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Attribute Handling</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Attribute Handling</em>' reference.
	 * @see #setRoomAttributeHandling(RoomAttributeHandling)
	 * @see RootElement.RootElementPackage#getSysAdmin_RoomAttributeHandling()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomAttributeHandling getRoomAttributeHandling();

	/**
	 * Sets the value of the '{@link RootElement.SysAdmin#getRoomAttributeHandling <em>Room Attribute Handling</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Attribute Handling</em>' reference.
	 * @see #getRoomAttributeHandling()
	 * @generated
	 */
	void setRoomAttributeHandling(RoomAttributeHandling value);

	/**
	 * Returns the value of the '<em><b>Room Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Handling</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Handling</em>' reference.
	 * @see #setRoomHandling(RoomHandling)
	 * @see RootElement.RootElementPackage#getSysAdmin_RoomHandling()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomHandling getRoomHandling();

	/**
	 * Sets the value of the '{@link RootElement.SysAdmin#getRoomHandling <em>Room Handling</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Handling</em>' reference.
	 * @see #getRoomHandling()
	 * @generated
	 */
	void setRoomHandling(RoomHandling value);

	/**
	 * Returns the value of the '<em><b>Room Type Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type Handling</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type Handling</em>' reference.
	 * @see #setRoomTypeHandling(RoomTypeHandling)
	 * @see RootElement.RootElementPackage#getSysAdmin_RoomTypeHandling()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomTypeHandling getRoomTypeHandling();

	/**
	 * Sets the value of the '{@link RootElement.SysAdmin#getRoomTypeHandling <em>Room Type Handling</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type Handling</em>' reference.
	 * @see #getRoomTypeHandling()
	 * @generated
	 */
	void setRoomTypeHandling(RoomTypeHandling value);

} // SysAdmin
