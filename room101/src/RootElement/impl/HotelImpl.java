/**
 */
package RootElement.impl;

import RootElement.Feedback;
import RootElement.Hotel;
import RootElement.Room;
import RootElement.RootElementPackage;
import RootElement.Staff;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.impl.HotelImpl#getStaff <em>Staff</em>}</li>
 *   <li>{@link RootElement.impl.HotelImpl#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link RootElement.impl.HotelImpl#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HotelImpl extends MinimalEObjectImpl.Container implements Hotel {
	/**
	 * The cached value of the '{@link #getStaff() <em>Staff</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated
	 * @ordered
	 */
	protected EList<Staff> staff;

	/**
	 * The cached value of the '{@link #getFeedback() <em>Feedback</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedback()
	 * @generated
	 * @ordered
	 */
	protected EList<Feedback> feedback;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> room;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HotelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.HOTEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Staff> getStaff() {
		if (staff == null) {
			staff = new EObjectResolvingEList<Staff>(Staff.class, this, RootElementPackage.HOTEL__STAFF);
		}
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feedback> getFeedback() {
		if (feedback == null) {
			feedback = new EObjectResolvingEList<Feedback>(Feedback.class, this, RootElementPackage.HOTEL__FEEDBACK);
		}
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRoom() {
		if (room == null) {
			room = new EObjectResolvingEList<Room>(Room.class, this, RootElementPackage.HOTEL__ROOM);
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getUnreadFeedback() {
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
			case RootElementPackage.HOTEL__STAFF:
				return getStaff();
			case RootElementPackage.HOTEL__FEEDBACK:
				return getFeedback();
			case RootElementPackage.HOTEL__ROOM:
				return getRoom();
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
			case RootElementPackage.HOTEL__STAFF:
				getStaff().clear();
				getStaff().addAll((Collection<? extends Staff>)newValue);
				return;
			case RootElementPackage.HOTEL__FEEDBACK:
				getFeedback().clear();
				getFeedback().addAll((Collection<? extends Feedback>)newValue);
				return;
			case RootElementPackage.HOTEL__ROOM:
				getRoom().clear();
				getRoom().addAll((Collection<? extends Room>)newValue);
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
			case RootElementPackage.HOTEL__STAFF:
				getStaff().clear();
				return;
			case RootElementPackage.HOTEL__FEEDBACK:
				getFeedback().clear();
				return;
			case RootElementPackage.HOTEL__ROOM:
				getRoom().clear();
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
			case RootElementPackage.HOTEL__STAFF:
				return staff != null && !staff.isEmpty();
			case RootElementPackage.HOTEL__FEEDBACK:
				return feedback != null && !feedback.isEmpty();
			case RootElementPackage.HOTEL__ROOM:
				return room != null && !room.isEmpty();
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
			case RootElementPackage.HOTEL___GET_UNREAD_FEEDBACK:
				getUnreadFeedback();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //HotelImpl
