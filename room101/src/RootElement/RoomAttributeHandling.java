/**
 */
package RootElement;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Attribute Handling</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.RootElementPackage#getRoomAttributeHandling()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RoomAttributeHandling extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	RoomAttribute addRoomAttribute(String name, String description) throws IllegalArgumentException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" roomAttributeRequired="true" roomAttributeOrdered="false" newNameDataType="org.eclipse.uml2.types.String" newNameRequired="true" newNameOrdered="false" newDescriptionDataType="org.eclipse.uml2.types.String" newDescriptionRequired="true" newDescriptionOrdered="false"
	 * @generated
	 */
	boolean editRoomAttribute(RoomAttribute roomAttribute, String newName, String newDescription);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" roomAttributeRequired="true" roomAttributeOrdered="false"
	 * @generated
	 */
	boolean removeRoomAttribute(RoomAttribute roomAttribute);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<RoomAttribute> getAllRoomAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	EList<RoomAttribute> findRoomAttribute(String name);

} // RoomAttributeHandling
