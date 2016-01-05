/**
 */
package RootElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reception Handling</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.RootElementPackage#getReceptionHandling()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ReceptionHandling extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	Room checkIn(RoomBooking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	boolean checkOut(RoomBooking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	EList<Booking> findBookings(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNameDataType="org.eclipse.uml2.types.String" roomNameRequired="true" roomNameOrdered="false"
	 * @generated
	 */
	Booking findActiveBooking(String roomName);

} // ReceptionHandling
