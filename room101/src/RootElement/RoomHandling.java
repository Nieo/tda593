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
	 * @model required="true" ordered="false" roomTypeRequired="true" roomTypeOrdered="false" roomNameDataType="org.eclipse.uml2.types.String" roomNameRequired="true" roomNameOrdered="false"
	 * @generated
	 */
	Room addRoom(RoomType roomType, String roomName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" roomNameDataType="org.eclipse.uml2.types.String" roomNameRequired="true" roomNameOrdered="false"
	 * @generated
	 */
	boolean removeRoom(String roomName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNameDataType="org.eclipse.uml2.types.String" roomNameRequired="true" roomNameOrdered="false" newRoomTypeRequired="true" newRoomTypeOrdered="false" newRoomNameDataType="org.eclipse.uml2.types.String" newRoomNameRequired="true" newRoomNameOrdered="false"
	 * @generated
	 */
	boolean editRoom(String roomName, RoomType newRoomType, String newRoomName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNameDataType="org.eclipse.uml2.types.String" roomNameRequired="true" roomNameOrdered="false"
	 * @generated
	 */
	Room findRoom(String roomName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Room> getAllRooms();

} // RoomHandling
