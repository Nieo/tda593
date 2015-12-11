/**
 */
package RootElement.impl;

import RootElement.DailyRoomBooking;
import RootElement.RootElementPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Daily Room Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.impl.DailyRoomBookingImpl#getNbrOfGuests <em>Nbr Of Guests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DailyRoomBookingImpl extends RoomBookingImpl implements DailyRoomBooking {
	/**
	 * The default value of the '{@link #getNbrOfGuests() <em>Nbr Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbrOfGuests()
	 * @generated
	 * @ordered
	 */
	protected static final int NBR_OF_GUESTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbrOfGuests() <em>Nbr Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbrOfGuests()
	 * @generated
	 * @ordered
	 */
	protected int nbrOfGuests = NBR_OF_GUESTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DailyRoomBookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.DAILY_ROOM_BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbrOfGuests() {
		return nbrOfGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbrOfGuests(int newNbrOfGuests) {
		int oldNbrOfGuests = nbrOfGuests;
		nbrOfGuests = newNbrOfGuests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.DAILY_ROOM_BOOKING__NBR_OF_GUESTS, oldNbrOfGuests, nbrOfGuests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootElementPackage.DAILY_ROOM_BOOKING__NBR_OF_GUESTS:
				return getNbrOfGuests();
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
			case RootElementPackage.DAILY_ROOM_BOOKING__NBR_OF_GUESTS:
				setNbrOfGuests((Integer)newValue);
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
			case RootElementPackage.DAILY_ROOM_BOOKING__NBR_OF_GUESTS:
				setNbrOfGuests(NBR_OF_GUESTS_EDEFAULT);
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
			case RootElementPackage.DAILY_ROOM_BOOKING__NBR_OF_GUESTS:
				return nbrOfGuests != NBR_OF_GUESTS_EDEFAULT;
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
		result.append(" (nbrOfGuests: ");
		result.append(nbrOfGuests);
		result.append(')');
		return result.toString();
	}

} //DailyRoomBookingImpl
