/**
 */
package RootElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Itemhandling</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.RootElementPackage#getServiceItemhandling()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ServiceItemhandling extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	void addServiceItem(String name, String description, int price);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model serviceItemRequired="true" serviceItemOrdered="false"
	 * @generated
	 */
	void removeServiceItem(ServiceItem serviceItem);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	ServiceItem findAllServiceItems(Booking booking);

} // ServiceItemhandling
