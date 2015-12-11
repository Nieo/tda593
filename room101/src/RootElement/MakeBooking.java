/**
 */
package RootElement;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Make Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.RootElementPackage#getMakeBooking()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MakeBooking extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Booking createBooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false" nbrOfAdultsDataType="org.eclipse.uml2.types.Integer" nbrOfAdultsRequired="true" nbrOfAdultsOrdered="false" nbrOfChildrenDataType="org.eclipse.uml2.types.Integer" nbrOfChildrenRequired="true" nbrOfChildrenOrdered="false"
	 * @generated
	 */
	EList<RoomType> getAvailableRooms(Date startDate, Date endDate, int nbrOfAdults, int nbrOfChildren);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" bookingRequired="true" bookingOrdered="false" roomRequired="true" roomOrdered="false" nbrOfAdultsDataType="org.eclipse.uml2.types.Integer" nbrOfAdultsRequired="true" nbrOfAdultsOrdered="false" nbrOfChildrenDataType="org.eclipse.uml2.types.Integer" nbrOfChildrenRequired="true" nbrOfChildrenOrdered="false"
	 * @generated
	 */
	boolean addRoom(Booking booking, RoomType room, int nbrOfAdults, int nbrOfChildren);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" bookingRequired="true" bookingOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" phoneDataType="org.eclipse.uml2.types.String" phoneRequired="true" phoneOrdered="false" mailDataType="org.eclipse.uml2.types.String" mailRequired="true" mailOrdered="false" nationalityDataType="org.eclipse.uml2.types.String" nationalityRequired="true" nationalityOrdered="false" passportNrDataType="org.eclipse.uml2.types.Integer" passportNrRequired="true" passportNrOrdered="false" nextDestinationDataType="org.eclipse.uml2.types.String" nextDestinationRequired="true" nextDestinationOrdered="false"
	 * @generated
	 */
	boolean confirmBooking(Booking booking, String name, String phone, String mail, String nationality, int passportNr, String nextDestination);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	boolean cancelBooking(Booking booking);

} // MakeBooking
