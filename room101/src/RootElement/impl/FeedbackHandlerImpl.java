/**
 */
package RootElement.impl;

import RootElement.Feedback;
import RootElement.FeedbackHandler;
import RootElement.FeedbackWriter;
import RootElement.RootElementPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feedback Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * getAllFeedback()
 * 
 * </p>
 * <ul>
 *   <li>{@link RootElement.impl.FeedbackHandlerImpl#getFeedback <em>Feedback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeedbackHandlerImpl extends MinimalEObjectImpl.Container implements FeedbackHandler {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackHandlerImpl() {
		super();
		feedback = new BasicEList<Feedback>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.FEEDBACK_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feedback> getFeedback() {
		if (feedback == null) {
			feedback = new EObjectResolvingEList<Feedback>(Feedback.class, this, RootElementPackage.FEEDBACK_HANDLER__FEEDBACK);
		}
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feedback> getAllFeedback() {
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feedback> getUnreadFeedback() {
		EList<Feedback> unreadFeedback = new BasicEList<Feedback>();
		for(Feedback feedback: feedback){
			if(!feedback.isRead()){
				unreadFeedback.add(feedback);
			}
		}

		return unreadFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void giveFeedback(String feedback, int rating) {
		Feedback temp = new FeedbackImpl();
		temp.setFeedbackDescription(feedback);
		temp.setRating(rating);
		this.feedback.add(temp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootElementPackage.FEEDBACK_HANDLER__FEEDBACK:
				return getFeedback();
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
			case RootElementPackage.FEEDBACK_HANDLER__FEEDBACK:
				getFeedback().clear();
				getFeedback().addAll((Collection<? extends Feedback>)newValue);
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
			case RootElementPackage.FEEDBACK_HANDLER__FEEDBACK:
				getFeedback().clear();
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
			case RootElementPackage.FEEDBACK_HANDLER__FEEDBACK:
				return feedback != null && !feedback.isEmpty();
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
				case RootElementPackage.FEEDBACK_WRITER___GIVE_FEEDBACK__STRING_INT: return RootElementPackage.FEEDBACK_HANDLER___GIVE_FEEDBACK__STRING_INT;
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
			case RootElementPackage.FEEDBACK_HANDLER___GET_ALL_FEEDBACK:
				return getAllFeedback();
			case RootElementPackage.FEEDBACK_HANDLER___GET_UNREAD_FEEDBACK:
				return getUnreadFeedback();
			case RootElementPackage.FEEDBACK_HANDLER___GIVE_FEEDBACK__STRING_INT:
				giveFeedback((String)arguments.get(0), (Integer)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FeedbackHandlerImpl
