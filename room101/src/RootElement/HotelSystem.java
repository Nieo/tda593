/**
 */
package RootElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel System</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.RootElementPackage#getHotelSystem()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface HotelSystem extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" staffIDDataType="org.eclipse.uml2.types.String" staffIDRequired="true" staffIDOrdered="false"
	 * @generated
	 */
	Staff getStaff(String staffID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" staffIDDataType="org.eclipse.uml2.types.String" staffIDRequired="true" staffIDOrdered="false"
	 * @generated
	 */
	Clerk getClerk(String staffID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" staffIDDataType="org.eclipse.uml2.types.String" staffIDRequired="true" staffIDOrdered="false"
	 * @generated
	 */
	Manager getManager(String staffID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	SysAdmin getSystemAdministrator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Guest getGuest();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getNationality();

} // HotelSystem
