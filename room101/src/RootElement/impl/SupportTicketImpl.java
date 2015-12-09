/**
 */
package RootElement.impl;

import RootElement.RootElementPackage;
import RootElement.SupportTicket;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Support Ticket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.impl.SupportTicketImpl#getProblemDescription <em>Problem Description</em>}</li>
 *   <li>{@link RootElement.impl.SupportTicketImpl#getRoomID <em>Room ID</em>}</li>
 *   <li>{@link RootElement.impl.SupportTicketImpl#getAddressTo <em>Address To</em>}</li>
 *   <li>{@link RootElement.impl.SupportTicketImpl#isFixed <em>Fixed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupportTicketImpl extends MinimalEObjectImpl.Container implements SupportTicket {
	/**
	 * The default value of the '{@link #getProblemDescription() <em>Problem Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String PROBLEM_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProblemDescription() <em>Problem Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemDescription()
	 * @generated
	 * @ordered
	 */
	protected String problemDescription = PROBLEM_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoomID() <em>Room ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomID()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoomID() <em>Room ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomID()
	 * @generated
	 * @ordered
	 */
	protected String roomID = ROOM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressTo() <em>Address To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressTo()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressTo() <em>Address To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressTo()
	 * @generated
	 * @ordered
	 */
	protected String addressTo = ADDRESS_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #isFixed() <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIXED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFixed() <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixed()
	 * @generated
	 * @ordered
	 */
	protected boolean fixed = FIXED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportTicketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.SUPPORT_TICKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProblemDescription() {
		return problemDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemDescription(String newProblemDescription) {
		String oldProblemDescription = problemDescription;
		problemDescription = newProblemDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.SUPPORT_TICKET__PROBLEM_DESCRIPTION, oldProblemDescription, problemDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomID() {
		return roomID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomID(String newRoomID) {
		String oldRoomID = roomID;
		roomID = newRoomID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.SUPPORT_TICKET__ROOM_ID, oldRoomID, roomID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddressTo() {
		return addressTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressTo(String newAddressTo) {
		String oldAddressTo = addressTo;
		addressTo = newAddressTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.SUPPORT_TICKET__ADDRESS_TO, oldAddressTo, addressTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFixed() {
		return fixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixed(boolean newFixed) {
		boolean oldFixed = fixed;
		fixed = newFixed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.SUPPORT_TICKET__FIXED, oldFixed, fixed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootElementPackage.SUPPORT_TICKET__PROBLEM_DESCRIPTION:
				return getProblemDescription();
			case RootElementPackage.SUPPORT_TICKET__ROOM_ID:
				return getRoomID();
			case RootElementPackage.SUPPORT_TICKET__ADDRESS_TO:
				return getAddressTo();
			case RootElementPackage.SUPPORT_TICKET__FIXED:
				return isFixed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RootElementPackage.SUPPORT_TICKET__PROBLEM_DESCRIPTION:
				setProblemDescription((String)newValue);
				return;
			case RootElementPackage.SUPPORT_TICKET__ROOM_ID:
				setRoomID((String)newValue);
				return;
			case RootElementPackage.SUPPORT_TICKET__ADDRESS_TO:
				setAddressTo((String)newValue);
				return;
			case RootElementPackage.SUPPORT_TICKET__FIXED:
				setFixed((Boolean)newValue);
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
			case RootElementPackage.SUPPORT_TICKET__PROBLEM_DESCRIPTION:
				setProblemDescription(PROBLEM_DESCRIPTION_EDEFAULT);
				return;
			case RootElementPackage.SUPPORT_TICKET__ROOM_ID:
				setRoomID(ROOM_ID_EDEFAULT);
				return;
			case RootElementPackage.SUPPORT_TICKET__ADDRESS_TO:
				setAddressTo(ADDRESS_TO_EDEFAULT);
				return;
			case RootElementPackage.SUPPORT_TICKET__FIXED:
				setFixed(FIXED_EDEFAULT);
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
			case RootElementPackage.SUPPORT_TICKET__PROBLEM_DESCRIPTION:
				return PROBLEM_DESCRIPTION_EDEFAULT == null ? problemDescription != null : !PROBLEM_DESCRIPTION_EDEFAULT.equals(problemDescription);
			case RootElementPackage.SUPPORT_TICKET__ROOM_ID:
				return ROOM_ID_EDEFAULT == null ? roomID != null : !ROOM_ID_EDEFAULT.equals(roomID);
			case RootElementPackage.SUPPORT_TICKET__ADDRESS_TO:
				return ADDRESS_TO_EDEFAULT == null ? addressTo != null : !ADDRESS_TO_EDEFAULT.equals(addressTo);
			case RootElementPackage.SUPPORT_TICKET__FIXED:
				return fixed != FIXED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (problemDescription: ");
		result.append(problemDescription);
		result.append(", roomID: ");
		result.append(roomID);
		result.append(", addressTo: ");
		result.append(addressTo);
		result.append(", fixed: ");
		result.append(fixed);
		result.append(')');
		return result.toString();
	}

} //SupportTicketImpl
