/**
 */
package RootElement.impl;

import RootElement.PaymentHandler;
import RootElement.RootElementPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PaymentHandlerImpl extends MinimalEObjectImpl.Container implements PaymentHandler {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.PAYMENT_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Verifies credit card. Should follow the same form 
	 * as the regex described in the code.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean verifyCreditCard(String creditCard) {
		return creditCard.matches("([0-9]{4}[-]{1}){3,}[0-9]{4}");
	}

	/**
	 * <!-- begin-user-doc -->
	 * As we haven't implented a banking service, no amount is deducted from the banking account for a service.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean debitCard(String creditCard, int amount) {
		if(verifyCreditCard(creditCard))
			System.out.println(amount+" SEK was deducted from credit card:("+creditCard+")");
		return verifyCreditCard(creditCard) ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RootElementPackage.PAYMENT_HANDLER___VERIFY_CREDIT_CARD__STRING:
				return verifyCreditCard((String)arguments.get(0));
			case RootElementPackage.PAYMENT_HANDLER___DEBIT_CARD__STRING_INT:
				return debitCard((String)arguments.get(0), (Integer)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PaymentHandlerImpl
