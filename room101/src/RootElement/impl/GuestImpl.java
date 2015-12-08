/**
 */
package RootElement.impl;

import RootElement.Guest;
import RootElement.RootElementPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.impl.GuestImpl#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link RootElement.impl.GuestImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link RootElement.impl.GuestImpl#getNationality <em>Nationality</em>}</li>
 *   <li>{@link RootElement.impl.GuestImpl#getName <em>Name</em>}</li>
 *   <li>{@link RootElement.impl.GuestImpl#getMail <em>Mail</em>}</li>
 *   <li>{@link RootElement.impl.GuestImpl#getSocialSecurityNumber <em>Social Security Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuestImpl extends MinimalEObjectImpl.Container implements Guest {
	/**
	 * The default value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected String phoneNumber = PHONE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNationality() <em>Nationality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationality()
	 * @generated
	 * @ordered
	 */
	protected static final String NATIONALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNationality() <em>Nationality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationality()
	 * @generated
	 * @ordered
	 */
	protected String nationality = NATIONALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMail() <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMail()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMail() <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMail()
	 * @generated
	 * @ordered
	 */
	protected String mail = MAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSocialSecurityNumber() <em>Social Security Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialSecurityNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SOCIAL_SECURITY_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSocialSecurityNumber() <em>Social Security Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialSecurityNumber()
	 * @generated
	 * @ordered
	 */
	protected String socialSecurityNumber = SOCIAL_SECURITY_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.GUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneNumber(String newPhoneNumber) {
		String oldPhoneNumber = phoneNumber;
		phoneNumber = newPhoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.GUEST__PHONE_NUMBER, oldPhoneNumber, phoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.GUEST__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNationality(String newNationality) {
		String oldNationality = nationality;
		nationality = newNationality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.GUEST__NATIONALITY, oldNationality, nationality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.GUEST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMail(String newMail) {
		String oldMail = mail;
		mail = newMail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.GUEST__MAIL, oldMail, mail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSocialSecurityNumber(String newSocialSecurityNumber) {
		String oldSocialSecurityNumber = socialSecurityNumber;
		socialSecurityNumber = newSocialSecurityNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.GUEST__SOCIAL_SECURITY_NUMBER, oldSocialSecurityNumber, socialSecurityNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createSupportTicket(String problemDescription, String roomid) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootElementPackage.GUEST__PHONE_NUMBER:
				return getPhoneNumber();
			case RootElementPackage.GUEST__ADDRESS:
				return getAddress();
			case RootElementPackage.GUEST__NATIONALITY:
				return getNationality();
			case RootElementPackage.GUEST__NAME:
				return getName();
			case RootElementPackage.GUEST__MAIL:
				return getMail();
			case RootElementPackage.GUEST__SOCIAL_SECURITY_NUMBER:
				return getSocialSecurityNumber();
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
			case RootElementPackage.GUEST__PHONE_NUMBER:
				setPhoneNumber((String)newValue);
				return;
			case RootElementPackage.GUEST__ADDRESS:
				setAddress((String)newValue);
				return;
			case RootElementPackage.GUEST__NATIONALITY:
				setNationality((String)newValue);
				return;
			case RootElementPackage.GUEST__NAME:
				setName((String)newValue);
				return;
			case RootElementPackage.GUEST__MAIL:
				setMail((String)newValue);
				return;
			case RootElementPackage.GUEST__SOCIAL_SECURITY_NUMBER:
				setSocialSecurityNumber((String)newValue);
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
			case RootElementPackage.GUEST__PHONE_NUMBER:
				setPhoneNumber(PHONE_NUMBER_EDEFAULT);
				return;
			case RootElementPackage.GUEST__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case RootElementPackage.GUEST__NATIONALITY:
				setNationality(NATIONALITY_EDEFAULT);
				return;
			case RootElementPackage.GUEST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RootElementPackage.GUEST__MAIL:
				setMail(MAIL_EDEFAULT);
				return;
			case RootElementPackage.GUEST__SOCIAL_SECURITY_NUMBER:
				setSocialSecurityNumber(SOCIAL_SECURITY_NUMBER_EDEFAULT);
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
			case RootElementPackage.GUEST__PHONE_NUMBER:
				return PHONE_NUMBER_EDEFAULT == null ? phoneNumber != null : !PHONE_NUMBER_EDEFAULT.equals(phoneNumber);
			case RootElementPackage.GUEST__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case RootElementPackage.GUEST__NATIONALITY:
				return NATIONALITY_EDEFAULT == null ? nationality != null : !NATIONALITY_EDEFAULT.equals(nationality);
			case RootElementPackage.GUEST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RootElementPackage.GUEST__MAIL:
				return MAIL_EDEFAULT == null ? mail != null : !MAIL_EDEFAULT.equals(mail);
			case RootElementPackage.GUEST__SOCIAL_SECURITY_NUMBER:
				return SOCIAL_SECURITY_NUMBER_EDEFAULT == null ? socialSecurityNumber != null : !SOCIAL_SECURITY_NUMBER_EDEFAULT.equals(socialSecurityNumber);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RootElementPackage.GUEST___CREATE_SUPPORT_TICKET__STRING_STRING:
				createSupportTicket((String)arguments.get(0), (String)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (phoneNumber: ");
		result.append(phoneNumber);
		result.append(", address: ");
		result.append(address);
		result.append(", nationality: ");
		result.append(nationality);
		result.append(", name: ");
		result.append(name);
		result.append(", mail: ");
		result.append(mail);
		result.append(", socialSecurityNumber: ");
		result.append(socialSecurityNumber);
		result.append(')');
		return result.toString();
	}

} //GuestImpl
