/**
 */
package RootElement.impl;

import RootElement.Manager;
import RootElement.Room;
import RootElement.RootElementPackage;
import RootElement.SysAdmin;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ManagerImpl extends ClerkImpl implements Manager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.MANAGER;
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
	public void readFeedback() {
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == SysAdmin.class) {
			switch (baseOperationID) {
				case RootElementPackage.SYS_ADMIN___ADD_ROOM__ROOM: return RootElementPackage.MANAGER___ADD_ROOM__ROOM;
				case RootElementPackage.SYS_ADMIN___REMOVE_ROOM__ROOM: return RootElementPackage.MANAGER___REMOVE_ROOM__ROOM;
				case RootElementPackage.SYS_ADMIN___CREATE_ROOM_TYPE: return RootElementPackage.MANAGER___CREATE_ROOM_TYPE;
				case RootElementPackage.SYS_ADMIN___REMOVE_ROOM_TYPE: return RootElementPackage.MANAGER___REMOVE_ROOM_TYPE;
				case RootElementPackage.SYS_ADMIN___SET_ROOM_TYPE: return RootElementPackage.MANAGER___SET_ROOM_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RootElementPackage.MANAGER___ADD_ROOM__ROOM:
				return addRoom((Room)arguments.get(0));
			case RootElementPackage.MANAGER___REMOVE_ROOM__ROOM:
				return removeRoom((Room)arguments.get(0));
			case RootElementPackage.MANAGER___CREATE_ROOM_TYPE:
				return createRoomType();
			case RootElementPackage.MANAGER___REMOVE_ROOM_TYPE:
				return removeRoomType();
			case RootElementPackage.MANAGER___SET_ROOM_TYPE:
				setRoomType();
				return null;
			case RootElementPackage.MANAGER___READ_FEEDBACK:
				readFeedback();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ManagerImpl
