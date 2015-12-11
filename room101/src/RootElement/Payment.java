/**
 */
package RootElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.RootElementPackage#getPayment()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Payment extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" creditCardDataType="org.eclipse.uml2.types.String" creditCardRequired="true" creditCardOrdered="false"
	 * @generated
	 */
	boolean verifyCreditCard(String creditCard);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" creditCardDataType="org.eclipse.uml2.types.String" creditCardRequired="true" creditCardOrdered="false" amountDataType="org.eclipse.uml2.types.Integer" amountRequired="true" amountOrdered="false"
	 * @generated
	 */
	boolean debitCard(String creditCard, int amount);

} // Payment
