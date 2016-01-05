/**
 */
package RootElement.impl;

import RootElement.Clerk;
import RootElement.Guest;
import RootElement.Hotel;
import RootElement.Manager;
import RootElement.RootElementPackage;

import RootElement.Staff;
import RootElement.SysAdmin;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HotelImpl extends MinimalEObjectImpl.Container implements Hotel {
	
	private String name = NAME_DEFAULT;
	
	private static final String NAME_DEFAULT = "Hotel Chalmers";
	
	private String nationality = NATIONALITY_DEFAULT;
	
	private static final String NATIONALITY_DEFAULT = "SE";
	
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
	 * Retrieves the name of this hotel
	 * @generated NOT
	 */
	public String getName() {
		return name;
	}

	/**
	 * Retrieves the nationality of this hotel
	 * @generated NOT
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Staff getStaff(String staffID) {
		Staff staff = new StaffImpl();
		staff.setStaffID(staffID);
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Clerk getClerk(String staffID) {
		Clerk clerk = new ClerkImpl();
		clerk.setStaffID(staffID);
		return clerk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Manager getManager(String staffID) {
		Manager manager = new ManagerImpl();
		manager.setStaffID(staffID);
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SysAdmin getSystemAdministrator() {
		SysAdmin sysAdmin = new SysAdminImpl();
		return sysAdmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Guest getGuest() {
		Guest guest = new GuestImpl();
		return guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RootElementPackage.HOTEL___GET_STAFF__STRING:
				return getStaff((String)arguments.get(0));
			case RootElementPackage.HOTEL___GET_CLERK__STRING:
				return getClerk((String)arguments.get(0));
			case RootElementPackage.HOTEL___GET_MANAGER__STRING:
				return getManager((String)arguments.get(0));
			case RootElementPackage.HOTEL___GET_SYSTEM_ADMINISTRATOR:
				return getSystemAdministrator();
			case RootElementPackage.HOTEL___GET_GUEST:
				return getGuest();
			case RootElementPackage.HOTEL___GET_NAME:
				return getName();
			case RootElementPackage.HOTEL___GET_NATIONALITY:
				return getNationality();
		}
		return super.eInvoke(operationID, arguments);
	}

} //HotelImpl
