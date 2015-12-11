/**
 */
package RootElement.impl;

import RootElement.RootElementPackage;
import RootElement.SupportTicket;
import RootElement.SupportTicketHandler;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Support Ticket Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.impl.SupportTicketHandlerImpl#getSupportticket <em>Supportticket</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupportTicketHandlerImpl extends MinimalEObjectImpl.Container implements SupportTicketHandler {
	/**
	 * The cached value of the '{@link #getSupportticket() <em>Supportticket</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportticket()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportTicket> supportticket;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportTicketHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.SUPPORT_TICKET_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportTicket> getSupportticket() {
		if (supportticket == null) {
			supportticket = new EObjectResolvingEList<SupportTicket>(SupportTicket.class, this, RootElementPackage.SUPPORT_TICKET_HANDLER__SUPPORTTICKET);
		}
		return supportticket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootElementPackage.SUPPORT_TICKET_HANDLER__SUPPORTTICKET:
				return getSupportticket();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RootElementPackage.SUPPORT_TICKET_HANDLER__SUPPORTTICKET:
				getSupportticket().clear();
				getSupportticket().addAll((Collection<? extends SupportTicket>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RootElementPackage.SUPPORT_TICKET_HANDLER__SUPPORTTICKET:
				getSupportticket().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RootElementPackage.SUPPORT_TICKET_HANDLER__SUPPORTTICKET:
				return supportticket != null && !supportticket.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SupportTicketHandlerImpl
