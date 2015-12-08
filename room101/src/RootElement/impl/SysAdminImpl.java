/**
 */
package RootElement.impl;

import RootElement.Room;
import RootElement.RootElementPackage;
import RootElement.SysAdmin;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sys Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SysAdminImpl extends MinimalEObjectImpl.Container implements SysAdmin {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SysAdminImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.SYS_ADMIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addRoom(Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeRoom(Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean createRoomType() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeRoomType() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomType() {
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
			case RootElementPackage.SYS_ADMIN___ADD_ROOM__ROOM:
				return addRoom((Room)arguments.get(0));
			case RootElementPackage.SYS_ADMIN___REMOVE_ROOM__ROOM:
				return removeRoom((Room)arguments.get(0));
			case RootElementPackage.SYS_ADMIN___CREATE_ROOM_TYPE:
				return createRoomType();
			case RootElementPackage.SYS_ADMIN___REMOVE_ROOM_TYPE:
				return removeRoomType();
			case RootElementPackage.SYS_ADMIN___SET_ROOM_TYPE:
				setRoomType();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SysAdminImpl
