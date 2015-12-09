/**
 */
package RootElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.RoomStructure#getRooms <em>Rooms</em>}</li>
 *   <li>{@link RootElement.RoomStructure#getRoomtype <em>Roomtype</em>}</li>
 *   <li>{@link RootElement.RoomStructure#getRoomattribute <em>Roomattribute</em>}</li>
 * </ul>
 *
 * @see RootElement.RootElementPackage#getRoomStructure()
 * @model
 * @generated
 */
public interface RoomStructure extends RoomHandling, RoomTypeHandling, RoomAttributeHandling {
	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' reference list.
	 * The list contents are of type {@link RootElement.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' reference list.
	 * @see RootElement.RootElementPackage#getRoomStructure_Rooms()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Roomtype</b></em>' reference list.
	 * The list contents are of type {@link RootElement.RoomType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomtype</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomtype</em>' reference list.
	 * @see RootElement.RootElementPackage#getRoomStructure_Roomtype()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomType> getRoomtype();

	/**
	 * Returns the value of the '<em><b>Roomattribute</b></em>' reference list.
	 * The list contents are of type {@link RootElement.RoomAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomattribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomattribute</em>' reference list.
	 * @see RootElement.RootElementPackage#getRoomStructure_Roomattribute()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomAttribute> getRoomattribute();

} // RoomStructure
