/**
 */
package RootElement.impl;

import RootElement.Booking;
import RootElement.Receptionist;
import RootElement.RootElementPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receptionist</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ReceptionistImpl extends StaffImpl implements Receptionist {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceptionistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.RECEPTIONIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createBooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkIn(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkout(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RootElementPackage.RECEPTIONIST___CREATE_BOOKING:
				createBooking();
				return null;
			case RootElementPackage.RECEPTIONIST___CHECK_IN__BOOKING:
				checkIn((Booking)arguments.get(0));
				return null;
			case RootElementPackage.RECEPTIONIST___CHECKOUT__BOOKING:
				checkout((Booking)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReceptionistImpl
