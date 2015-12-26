/**
 */
package RootElement.impl;

import RootElement.Cleaning;
import RootElement.Room;
import RootElement.RootElementPackage;
import RootElement.Staff;

import RootElement.SupportTicket;
import RootElement.SupportTicketReader;
import RootElement.SupportTicketWriter;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.impl.StaffImpl#getStaffID <em>Staff ID</em>}</li>
 *   <li>{@link RootElement.impl.StaffImpl#getName <em>Name</em>}</li>
 *   <li>{@link RootElement.impl.StaffImpl#getCleaning <em>Cleaning</em>}</li>
 *   <li>{@link RootElement.impl.StaffImpl#getSupportTicketReader <em>Support Ticket Reader</em>}</li>
 *   <li>{@link RootElement.impl.StaffImpl#getSupportTicketWriter <em>Support Ticket Writer</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StaffImpl extends MinimalEObjectImpl.Container implements Staff {
	/**
	 * The default value of the '{@link #getStaffID() <em>Staff ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffID()
	 * @generated
	 * @ordered
	 */
	protected static final String STAFF_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStaffID() <em>Staff ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffID()
	 * @generated
	 * @ordered
	 */
	protected String staffID = STAFF_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getCleaning() <em>Cleaning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCleaning()
	 * @generated
	 * @ordered
	 */
	protected Cleaning cleaning;

	/**
	 * The cached value of the '{@link #getSupportTicketReader() <em>Support Ticket Reader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportTicketReader()
	 * @generated
	 * @ordered
	 */
	protected SupportTicketReader supportTicketReader;

	/**
	 * The cached value of the '{@link #getSupportTicketWriter() <em>Support Ticket Writer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportTicketWriter()
	 * @generated
	 * @ordered
	 */
	protected SupportTicketWriter supportTicketWriter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.STAFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStaffID() {
		return staffID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaffID(String newStaffID) {
		String oldStaffID = staffID;
		staffID = newStaffID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.STAFF__STAFF_ID, oldStaffID, staffID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.STAFF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cleaning getCleaning() {
		if (cleaning != null && cleaning.eIsProxy()) {
			InternalEObject oldCleaning = (InternalEObject)cleaning;
			cleaning = (Cleaning)eResolveProxy(oldCleaning);
			if (cleaning != oldCleaning) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootElementPackage.STAFF__CLEANING, oldCleaning, cleaning));
			}
		}
		return cleaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cleaning basicGetCleaning() {
		return cleaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCleaning(Cleaning newCleaning) {
		Cleaning oldCleaning = cleaning;
		cleaning = newCleaning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.STAFF__CLEANING, oldCleaning, cleaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportTicketReader getSupportTicketReader() {
		if (supportTicketReader != null && supportTicketReader.eIsProxy()) {
			InternalEObject oldSupportTicketReader = (InternalEObject)supportTicketReader;
			supportTicketReader = (SupportTicketReader)eResolveProxy(oldSupportTicketReader);
			if (supportTicketReader != oldSupportTicketReader) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootElementPackage.STAFF__SUPPORT_TICKET_READER, oldSupportTicketReader, supportTicketReader));
			}
		}
		return supportTicketReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportTicketReader basicGetSupportTicketReader() {
		return supportTicketReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportTicketReader(SupportTicketReader newSupportTicketReader) {
		SupportTicketReader oldSupportTicketReader = supportTicketReader;
		supportTicketReader = newSupportTicketReader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.STAFF__SUPPORT_TICKET_READER, oldSupportTicketReader, supportTicketReader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportTicketWriter getSupportTicketWriter() {
		if (supportTicketWriter != null && supportTicketWriter.eIsProxy()) {
			InternalEObject oldSupportTicketWriter = (InternalEObject)supportTicketWriter;
			supportTicketWriter = (SupportTicketWriter)eResolveProxy(oldSupportTicketWriter);
			if (supportTicketWriter != oldSupportTicketWriter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootElementPackage.STAFF__SUPPORT_TICKET_WRITER, oldSupportTicketWriter, supportTicketWriter));
			}
		}
		return supportTicketWriter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportTicketWriter basicGetSupportTicketWriter() {
		return supportTicketWriter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportTicketWriter(SupportTicketWriter newSupportTicketWriter) {
		SupportTicketWriter oldSupportTicketWriter = supportTicketWriter;
		supportTicketWriter = newSupportTicketWriter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.STAFF__SUPPORT_TICKET_WRITER, oldSupportTicketWriter, supportTicketWriter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkIfRoomCleaned(String roomID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getListOfUncleanRooms() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void markRoomAsCleaned(Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void newSupportTicket(String roomID, String description) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportTicket> getUnfixedTickets() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportTicket> getSupportTicketsForRoom(String roomID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void markAsCompleted(SupportTicket supportTicket) {
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
			case RootElementPackage.STAFF__STAFF_ID:
				return getStaffID();
			case RootElementPackage.STAFF__NAME:
				return getName();
			case RootElementPackage.STAFF__CLEANING:
				if (resolve) return getCleaning();
				return basicGetCleaning();
			case RootElementPackage.STAFF__SUPPORT_TICKET_READER:
				if (resolve) return getSupportTicketReader();
				return basicGetSupportTicketReader();
			case RootElementPackage.STAFF__SUPPORT_TICKET_WRITER:
				if (resolve) return getSupportTicketWriter();
				return basicGetSupportTicketWriter();
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
			case RootElementPackage.STAFF__STAFF_ID:
				setStaffID((String)newValue);
				return;
			case RootElementPackage.STAFF__NAME:
				setName((String)newValue);
				return;
			case RootElementPackage.STAFF__CLEANING:
				setCleaning((Cleaning)newValue);
				return;
			case RootElementPackage.STAFF__SUPPORT_TICKET_READER:
				setSupportTicketReader((SupportTicketReader)newValue);
				return;
			case RootElementPackage.STAFF__SUPPORT_TICKET_WRITER:
				setSupportTicketWriter((SupportTicketWriter)newValue);
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
			case RootElementPackage.STAFF__STAFF_ID:
				setStaffID(STAFF_ID_EDEFAULT);
				return;
			case RootElementPackage.STAFF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RootElementPackage.STAFF__CLEANING:
				setCleaning((Cleaning)null);
				return;
			case RootElementPackage.STAFF__SUPPORT_TICKET_READER:
				setSupportTicketReader((SupportTicketReader)null);
				return;
			case RootElementPackage.STAFF__SUPPORT_TICKET_WRITER:
				setSupportTicketWriter((SupportTicketWriter)null);
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
			case RootElementPackage.STAFF__STAFF_ID:
				return STAFF_ID_EDEFAULT == null ? staffID != null : !STAFF_ID_EDEFAULT.equals(staffID);
			case RootElementPackage.STAFF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RootElementPackage.STAFF__CLEANING:
				return cleaning != null;
			case RootElementPackage.STAFF__SUPPORT_TICKET_READER:
				return supportTicketReader != null;
			case RootElementPackage.STAFF__SUPPORT_TICKET_WRITER:
				return supportTicketWriter != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == SupportTicketWriter.class) {
			switch (baseOperationID) {
				case RootElementPackage.SUPPORT_TICKET_WRITER___NEW_SUPPORT_TICKET__STRING_STRING: return RootElementPackage.STAFF___NEW_SUPPORT_TICKET__STRING_STRING;
				default: return -1;
			}
		}
		if (baseClass == SupportTicketReader.class) {
			switch (baseOperationID) {
				case RootElementPackage.SUPPORT_TICKET_READER___GET_UNFIXED_TICKETS: return RootElementPackage.STAFF___GET_UNFIXED_TICKETS;
				case RootElementPackage.SUPPORT_TICKET_READER___GET_SUPPORT_TICKETS_FOR_ROOM__STRING: return RootElementPackage.STAFF___GET_SUPPORT_TICKETS_FOR_ROOM__STRING;
				case RootElementPackage.SUPPORT_TICKET_READER___MARK_AS_COMPLETED__SUPPORTTICKET: return RootElementPackage.STAFF___MARK_AS_COMPLETED__SUPPORTTICKET;
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
			case RootElementPackage.STAFF___CHECK_IF_ROOM_CLEANED__STRING:
				return checkIfRoomCleaned((String)arguments.get(0));
			case RootElementPackage.STAFF___GET_LIST_OF_UNCLEAN_ROOMS:
				return getListOfUncleanRooms();
			case RootElementPackage.STAFF___MARK_ROOM_AS_CLEANED__ROOM:
				markRoomAsCleaned((Room)arguments.get(0));
				return null;
			case RootElementPackage.STAFF___NEW_SUPPORT_TICKET__STRING_STRING:
				newSupportTicket((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case RootElementPackage.STAFF___GET_UNFIXED_TICKETS:
				return getUnfixedTickets();
			case RootElementPackage.STAFF___GET_SUPPORT_TICKETS_FOR_ROOM__STRING:
				return getSupportTicketsForRoom((String)arguments.get(0));
			case RootElementPackage.STAFF___MARK_AS_COMPLETED__SUPPORTTICKET:
				markAsCompleted((SupportTicket)arguments.get(0));
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
		result.append(" (staffID: ");
		result.append(staffID);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StaffImpl
