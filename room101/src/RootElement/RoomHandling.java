/**
 */
package RootElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Handling</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.RootElementPackage#getRoomHandling()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RoomHandling extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomTypeRequired="true" roomTypeOrdered="false" roomNbrDataType="org.eclipse.uml2.types.Integer" roomNbrRequired="true" roomNbrOrdered="false"
	 * @generated
	 */
	Room addRoom(RoomType roomType, int roomNbr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" roomNbrDataType="org.eclipse.uml2.types.Integer" roomNbrRequired="true" roomNbrOrdered="false"
	 * @generated
	 */
	boolean removeRoom(int roomNbr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNbrDataType="org.eclipse.uml2.types.Integer" roomNbrRequired="true" roomNbrOrdered="false" newRoomTypeRequired="true" newRoomTypeOrdered="false" newRoomNbrDataType="org.eclipse.uml2.types.Integer" newRoomNbrRequired="true" newRoomNbrOrdered="false"
	 * @generated
	 */
	void editRoom(int roomNbr, RoomType newRoomType, int newRoomNbr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNbrDataType="org.eclipse.uml2.types.Integer" roomNbrRequired="true" roomNbrOrdered="false"
	 * @generated
	 */
	Room findRoom(int roomNbr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Room> getAllRooms();

} // RoomHandling
