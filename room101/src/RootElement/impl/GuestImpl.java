/**
 */
package RootElement.impl;

import RootElement.Booking;
import RootElement.FeedbackWriter;
import RootElement.Guest;
import RootElement.MakeBooking;
import RootElement.RoomType;
import RootElement.RootElementPackage;
import RootElement.SupportTicketWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link RootElement.impl.GuestImpl#getNextDestination <em>Next Destination</em>}</li>
 *   <li>{@link RootElement.impl.GuestImpl#getNationality <em>Nationality</em>}</li>
 *   <li>{@link RootElement.impl.GuestImpl#getName <em>Name</em>}</li>
 *   <li>{@link RootElement.impl.GuestImpl#getMail <em>Mail</em>}</li>
 *   <li>{@link RootElement.impl.GuestImpl#getSocialSecurityNumber <em>Social Security Number</em>}</li>
 *   <li>{@link RootElement.impl.GuestImpl#getSupportTicketWriter <em>Support Ticket Writer</em>}</li>
 *   <li>{@link RootElement.impl.GuestImpl#getMakeBooking <em>Make Booking</em>}</li>
 *   <li>{@link RootElement.impl.GuestImpl#getFeedbackWriter <em>Feedback Writer</em>}</li>
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
	 * The default value of the '{@link #getNextDestination() <em>Next Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextDestination()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_DESTINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextDestination() <em>Next Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextDestination()
	 * @generated
	 * @ordered
	 */
	protected String nextDestination = NEXT_DESTINATION_EDEFAULT;

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
	 * The cached value of the '{@link #getSupportTicketWriter() <em>Support Ticket Writer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportTicketWriter()
	 * @generated
	 * @ordered
	 */
	protected SupportTicketWriter supportTicketWriter;

	/**
	 * The cached value of the '{@link #getMakeBooking() <em>Make Booking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMakeBooking()
	 * @generated
	 * @ordered
	 */
	protected MakeBooking makeBooking;

	/**
	 * The cached value of the '{@link #getFeedbackWriter() <em>Feedback Writer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackWriter()
	 * @generated
	 * @ordered
	 */
	protected FeedbackWriter feedbackWriter;

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
	public String getNextDestination() {
		return nextDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextDestination(String newNextDestination) {
		String oldNextDestination = nextDestination;
		nextDestination = newNextDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.GUEST__NEXT_DESTINATION, oldNextDestination, nextDestination));
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
	public SupportTicketWriter getSupportTicketWriter() {
		if (supportTicketWriter != null && supportTicketWriter.eIsProxy()) {
			InternalEObject oldSupportTicketWriter = (InternalEObject)supportTicketWriter;
			supportTicketWriter = (SupportTicketWriter)eResolveProxy(oldSupportTicketWriter);
			if (supportTicketWriter != oldSupportTicketWriter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootElementPackage.GUEST__SUPPORT_TICKET_WRITER, oldSupportTicketWriter, supportTicketWriter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.GUEST__SUPPORT_TICKET_WRITER, oldSupportTicketWriter, supportTicketWriter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MakeBooking getMakeBooking() {
		if (makeBooking != null && makeBooking.eIsProxy()) {
			InternalEObject oldMakeBooking = (InternalEObject)makeBooking;
			makeBooking = (MakeBooking)eResolveProxy(oldMakeBooking);
			if (makeBooking != oldMakeBooking) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootElementPackage.GUEST__MAKE_BOOKING, oldMakeBooking, makeBooking));
			}
		}
		return makeBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MakeBooking basicGetMakeBooking() {
		return makeBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMakeBooking(MakeBooking newMakeBooking) {
		MakeBooking oldMakeBooking = makeBooking;
		makeBooking = newMakeBooking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.GUEST__MAKE_BOOKING, oldMakeBooking, makeBooking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackWriter getFeedbackWriter() {
		if (feedbackWriter != null && feedbackWriter.eIsProxy()) {
			InternalEObject oldFeedbackWriter = (InternalEObject)feedbackWriter;
			feedbackWriter = (FeedbackWriter)eResolveProxy(oldFeedbackWriter);
			if (feedbackWriter != oldFeedbackWriter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RootElementPackage.GUEST__FEEDBACK_WRITER, oldFeedbackWriter, feedbackWriter));
			}
		}
		return feedbackWriter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackWriter basicGetFeedbackWriter() {
		return feedbackWriter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedbackWriter(FeedbackWriter newFeedbackWriter) {
		FeedbackWriter oldFeedbackWriter = feedbackWriter;
		feedbackWriter = newFeedbackWriter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.GUEST__FEEDBACK_WRITER, oldFeedbackWriter, feedbackWriter));
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
	public void giveFeedback(String feedback, int rating) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking createBooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> getAvailableRooms(Date startDate, Date endDate, int nbrOfAdults, int nbrOfChildren) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addRoom(Booking booking, RoomType room, int nbrOfAdults, int nbrOfChildren) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean confirmBooking(Booking booking, String name, String phone, String mail, String nationality, int passportNr, String nextDestination) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean cancelBooking(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking lookupBooking(String name, String phoneNumber) {
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
			case RootElementPackage.GUEST__NEXT_DESTINATION:
				return getNextDestination();
			case RootElementPackage.GUEST__NATIONALITY:
				return getNationality();
			case RootElementPackage.GUEST__NAME:
				return getName();
			case RootElementPackage.GUEST__MAIL:
				return getMail();
			case RootElementPackage.GUEST__SOCIAL_SECURITY_NUMBER:
				return getSocialSecurityNumber();
			case RootElementPackage.GUEST__SUPPORT_TICKET_WRITER:
				if (resolve) return getSupportTicketWriter();
				return basicGetSupportTicketWriter();
			case RootElementPackage.GUEST__MAKE_BOOKING:
				if (resolve) return getMakeBooking();
				return basicGetMakeBooking();
			case RootElementPackage.GUEST__FEEDBACK_WRITER:
				if (resolve) return getFeedbackWriter();
				return basicGetFeedbackWriter();
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
			case RootElementPackage.GUEST__NEXT_DESTINATION:
				setNextDestination((String)newValue);
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
			case RootElementPackage.GUEST__SUPPORT_TICKET_WRITER:
				setSupportTicketWriter((SupportTicketWriter)newValue);
				return;
			case RootElementPackage.GUEST__MAKE_BOOKING:
				setMakeBooking((MakeBooking)newValue);
				return;
			case RootElementPackage.GUEST__FEEDBACK_WRITER:
				setFeedbackWriter((FeedbackWriter)newValue);
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
			case RootElementPackage.GUEST__NEXT_DESTINATION:
				setNextDestination(NEXT_DESTINATION_EDEFAULT);
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
			case RootElementPackage.GUEST__SUPPORT_TICKET_WRITER:
				setSupportTicketWriter((SupportTicketWriter)null);
				return;
			case RootElementPackage.GUEST__MAKE_BOOKING:
				setMakeBooking((MakeBooking)null);
				return;
			case RootElementPackage.GUEST__FEEDBACK_WRITER:
				setFeedbackWriter((FeedbackWriter)null);
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
			case RootElementPackage.GUEST__NEXT_DESTINATION:
				return NEXT_DESTINATION_EDEFAULT == null ? nextDestination != null : !NEXT_DESTINATION_EDEFAULT.equals(nextDestination);
			case RootElementPackage.GUEST__NATIONALITY:
				return NATIONALITY_EDEFAULT == null ? nationality != null : !NATIONALITY_EDEFAULT.equals(nationality);
			case RootElementPackage.GUEST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RootElementPackage.GUEST__MAIL:
				return MAIL_EDEFAULT == null ? mail != null : !MAIL_EDEFAULT.equals(mail);
			case RootElementPackage.GUEST__SOCIAL_SECURITY_NUMBER:
				return SOCIAL_SECURITY_NUMBER_EDEFAULT == null ? socialSecurityNumber != null : !SOCIAL_SECURITY_NUMBER_EDEFAULT.equals(socialSecurityNumber);
			case RootElementPackage.GUEST__SUPPORT_TICKET_WRITER:
				return supportTicketWriter != null;
			case RootElementPackage.GUEST__MAKE_BOOKING:
				return makeBooking != null;
			case RootElementPackage.GUEST__FEEDBACK_WRITER:
				return feedbackWriter != null;
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
		if (baseClass == FeedbackWriter.class) {
			switch (baseOperationID) {
				case RootElementPackage.FEEDBACK_WRITER___GIVE_FEEDBACK__STRING_INT: return RootElementPackage.GUEST___GIVE_FEEDBACK__STRING_INT;
				default: return -1;
			}
		}
		if (baseClass == MakeBooking.class) {
			switch (baseOperationID) {
				case RootElementPackage.MAKE_BOOKING___CREATE_BOOKING: return RootElementPackage.GUEST___CREATE_BOOKING;
				case RootElementPackage.MAKE_BOOKING___GET_AVAILABLE_ROOMS__DATE_DATE_INT_INT: return RootElementPackage.GUEST___GET_AVAILABLE_ROOMS__DATE_DATE_INT_INT;
				case RootElementPackage.MAKE_BOOKING___ADD_ROOM__BOOKING_ROOMTYPE_INT_INT: return RootElementPackage.GUEST___ADD_ROOM__BOOKING_ROOMTYPE_INT_INT;
				case RootElementPackage.MAKE_BOOKING___CONFIRM_BOOKING__BOOKING_STRING_STRING_STRING_STRING_INT_STRING: return RootElementPackage.GUEST___CONFIRM_BOOKING__BOOKING_STRING_STRING_STRING_STRING_INT_STRING;
				case RootElementPackage.MAKE_BOOKING___CANCEL_BOOKING__BOOKING: return RootElementPackage.GUEST___CANCEL_BOOKING__BOOKING;
				case RootElementPackage.MAKE_BOOKING___LOOKUP_BOOKING__STRING_STRING: return RootElementPackage.GUEST___LOOKUP_BOOKING__STRING_STRING;
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
			case RootElementPackage.GUEST___NEW_SUPPORT_TICKET__STRING_STRING:
				newSupportTicket((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case RootElementPackage.GUEST___GIVE_FEEDBACK__STRING_INT:
				giveFeedback((String)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case RootElementPackage.GUEST___CREATE_BOOKING:
				return createBooking();
			case RootElementPackage.GUEST___GET_AVAILABLE_ROOMS__DATE_DATE_INT_INT:
				return getAvailableRooms((Date)arguments.get(0), (Date)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case RootElementPackage.GUEST___ADD_ROOM__BOOKING_ROOMTYPE_INT_INT:
				return addRoom((Booking)arguments.get(0), (RoomType)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case RootElementPackage.GUEST___CONFIRM_BOOKING__BOOKING_STRING_STRING_STRING_STRING_INT_STRING:
				return confirmBooking((Booking)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (Integer)arguments.get(5), (String)arguments.get(6));
			case RootElementPackage.GUEST___CANCEL_BOOKING__BOOKING:
				return cancelBooking((Booking)arguments.get(0));
			case RootElementPackage.GUEST___LOOKUP_BOOKING__STRING_STRING:
				return lookupBooking((String)arguments.get(0), (String)arguments.get(1));
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
		result.append(", nextDestination: ");
		result.append(nextDestination);
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
