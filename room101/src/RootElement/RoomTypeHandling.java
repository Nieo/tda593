/**
 */
package RootElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Type Handling</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.RootElementPackage#getRoomTypeHandling()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RoomTypeHandling extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" costDataType="org.eclipse.uml2.types.Integer" costRequired="true" costOrdered="false"
	 * @generated
	 */
	RoomType addRoomType(String name, int cost);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" roomTypeRequired="true" roomTypeOrdered="false" newNameDataType="org.eclipse.uml2.types.String" newNameRequired="true" newNameOrdered="false" newCostDataType="org.eclipse.uml2.types.Integer" newCostRequired="true" newCostOrdered="false"
	 * @generated
	 */
	boolean editRoomType(RoomType roomType, String newName, int newCost);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	boolean removeRoomType(RoomType roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<RoomType> getAllRoomTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" roomTypeRequired="true" roomTypeOrdered="false" roomAttributeRequired="true" roomAttributeOrdered="false"
	 * @generated
	 */
	boolean addAttributeToRoomType(RoomType roomType, RoomAttribute roomAttribute);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" roomTypeRequired="true" roomTypeOrdered="false" roomAttributeRequired="true" roomAttributeOrdered="false"
	 * @generated
	 */
	boolean removeAttributeFromRoomType(RoomType roomType, RoomAttribute roomAttribute);

} // RoomTypeHandling