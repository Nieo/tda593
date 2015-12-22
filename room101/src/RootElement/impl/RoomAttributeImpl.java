/**
 */
package RootElement.impl;

import RootElement.RoomAttribute;
import RootElement.RootElementPackage;
import RootElement.util.IDGenerator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * An implementation of the model object '<em><b>Room Attribute</b></em>'.
 * 
 * A room attribute is a part of a room type. Each attribute can belong to
 * one, several or none types. The ID of each attribute should be unique
 * and cannot be changed after creation.
 * 
 * @author Matz Larsson
 */
public class RoomAttributeImpl extends MinimalEObjectImpl.Container implements RoomAttribute {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * @generated NOT
	 * @ordered
	 */
	private int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * @generated NOT
	 * @ordered
	 */
	private String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * @generated NOT
	 * @ordered
	 */
	private String description = DESCRIPTION_EDEFAULT;

	/**
	 * Creates a basic room attribute with a new unique ID.
	 * @generated NOT
	 */
	protected RoomAttributeImpl() {
		super();
		this.id = IDGenerator.getGenerator("RoomAttribute").getNewID();
	}

	/**
	 * Retrieves the ID of this room attribute
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * Retrieves the name of this attribute
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the room attribute. The name cannot be null or
	 * empty, or an illegalstateexception will be thrown.
	 * @generated NOT
	 */
	public void setName(String newName) {
		if(newName != null){
			String oldName = name;
			name = newName;
			if (eNotificationRequired()){
				eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.ROOM_ATTRIBUTE__NAME, oldName, name));
			}
		}else{
			throw new IllegalArgumentException("Invalid room attribute name, cannot be "+(newName==null?"null":"empty"));
		}
	}

	/**
	 * Retrieves the description of this attribute
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description of the room attribute. The description
	 * cannot be null, or an illegalstateexception will be thrown.
	 * @generated NOT
	 */
	public void setDescription(String newDescription) {
		if(newDescription != null){
			String oldDescription = description;
			description = newDescription;
			if (eNotificationRequired()){
				eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.ROOM_ATTRIBUTE__DESCRIPTION, oldDescription, description));
			}
		}else{
			throw new IllegalStateException("Invalid description, cannot be null");
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.ROOM_ATTRIBUTE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootElementPackage.ROOM_ATTRIBUTE__ID:
				return getId();
			case RootElementPackage.ROOM_ATTRIBUTE__NAME:
				return getName();
			case RootElementPackage.ROOM_ATTRIBUTE__DESCRIPTION:
				return getDescription();
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
			case RootElementPackage.ROOM_ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case RootElementPackage.ROOM_ATTRIBUTE__DESCRIPTION:
				setDescription((String)newValue);
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
			case RootElementPackage.ROOM_ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RootElementPackage.ROOM_ATTRIBUTE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case RootElementPackage.ROOM_ATTRIBUTE__ID:
				return id != ID_EDEFAULT;
			case RootElementPackage.ROOM_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RootElementPackage.ROOM_ATTRIBUTE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //RoomAttributeImpl
