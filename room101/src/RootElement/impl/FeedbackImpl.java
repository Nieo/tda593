/**
 */
package RootElement.impl;

import RootElement.Feedback;
import RootElement.RootElementPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.impl.FeedbackImpl#getFeedbackDescription <em>Feedback Description</em>}</li>
 *   <li>{@link RootElement.impl.FeedbackImpl#getRating <em>Rating</em>}</li>
 *   <li>{@link RootElement.impl.FeedbackImpl#isRead <em>Read</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeedbackImpl extends MinimalEObjectImpl.Container implements Feedback {
	/**
	 * The default value of the '{@link #getFeedbackDescription() <em>Feedback Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String FEEDBACK_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeedbackDescription() <em>Feedback Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackDescription()
	 * @generated
	 * @ordered
	 */
	protected String feedbackDescription = FEEDBACK_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRating() <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating()
	 * @generated
	 * @ordered
	 */
	protected static final int RATING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRating() <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating()
	 * @generated
	 * @ordered
	 */
	protected int rating = RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #isRead() <em>Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRead()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRead() <em>Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRead()
	 * @generated
	 * @ordered
	 */
	protected boolean read = READ_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.FEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeedbackDescription() {
		return feedbackDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedbackDescription(String newFeedbackDescription) {
		String oldFeedbackDescription = feedbackDescription;
		feedbackDescription = newFeedbackDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.FEEDBACK__FEEDBACK_DESCRIPTION, oldFeedbackDescription, feedbackDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRating(int newRating) {
		int oldRating = rating;
		rating = newRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.FEEDBACK__RATING, oldRating, rating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRead() {
		return read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRead(boolean newRead) {
		boolean oldRead = read;
		read = newRead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.FEEDBACK__READ, oldRead, read));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootElementPackage.FEEDBACK__FEEDBACK_DESCRIPTION:
				return getFeedbackDescription();
			case RootElementPackage.FEEDBACK__RATING:
				return getRating();
			case RootElementPackage.FEEDBACK__READ:
				return isRead();
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
			case RootElementPackage.FEEDBACK__FEEDBACK_DESCRIPTION:
				setFeedbackDescription((String)newValue);
				return;
			case RootElementPackage.FEEDBACK__RATING:
				setRating((Integer)newValue);
				return;
			case RootElementPackage.FEEDBACK__READ:
				setRead((Boolean)newValue);
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
			case RootElementPackage.FEEDBACK__FEEDBACK_DESCRIPTION:
				setFeedbackDescription(FEEDBACK_DESCRIPTION_EDEFAULT);
				return;
			case RootElementPackage.FEEDBACK__RATING:
				setRating(RATING_EDEFAULT);
				return;
			case RootElementPackage.FEEDBACK__READ:
				setRead(READ_EDEFAULT);
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
			case RootElementPackage.FEEDBACK__FEEDBACK_DESCRIPTION:
				return FEEDBACK_DESCRIPTION_EDEFAULT == null ? feedbackDescription != null : !FEEDBACK_DESCRIPTION_EDEFAULT.equals(feedbackDescription);
			case RootElementPackage.FEEDBACK__RATING:
				return rating != RATING_EDEFAULT;
			case RootElementPackage.FEEDBACK__READ:
				return read != READ_EDEFAULT;
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
		result.append(" (feedbackDescription: ");
		result.append(feedbackDescription);
		result.append(", rating: ");
		result.append(rating);
		result.append(", read: ");
		result.append(read);
		result.append(')');
		return result.toString();
	}

} //FeedbackImpl
