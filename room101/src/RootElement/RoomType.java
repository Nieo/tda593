/**
 */
package RootElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.RoomType#getName <em>Name</em>}</li>
 *   <li>{@link RootElement.RoomType#getPrice <em>Price</em>}</li>
 * </ul>
 *
 * @see RootElement.RootElementPackage#getRoomType()
 * @model
 * @generated
 */
public interface RoomType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see RootElement.RootElementPackage#getRoomType_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RootElement.RoomType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see RootElement.RootElementPackage#getRoomType_Price()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	int getPrice();

	/**
	 * Adds an attribute to this room type
	 * @generated
	 */
	boolean addRoomAttribute(RoomAttribute roomAttribute);
	
	/**
	 * Removes an attribute from this room type.
	 * @generated
	 */
	boolean removeRoomAttribute(RoomAttribute roomAttribute);

} // RoomType
