/**
 */
package RootElement.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import RootElement.RoomAttribute;
import RootElement.RoomType;
import RootElement.RootElementPackage;

/**
 * An implementation of the model object '<em><b>Room Type</b></em>'.
 * The concept room type is a way to categorize rooms.
 * 
 * @author Matz Larsson
 */
public class RoomTypeImpl extends MinimalEObjectImpl.Container implements RoomType {
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
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * @generated NOT
	 * @ordered
	 */
	private int price = PRICE_EDEFAULT;

	/**
	 * The current attributes that this room type consists of
	 * @generated NOT
	 * @ordered
	 */
	private EList<RoomAttribute> roomAttributes;

	/**
	 * Creats a basic room type with the default parameters.
	 * Be sure to call {@link #setName(String)} and {@link #setPrice(int)}
	 * after gaining access to a room type object to initialize it.
	 * @generated
	 */
	protected RoomTypeImpl() {
		super();
		roomAttributes = new EObjectResolvingEList<RoomAttribute>(RoomAttribute.class, this, RootElementPackage.ROOM_TYPE__ROOM_ATTRIBUTES);
	}

	/**
	 * Retrieves the name of the room type
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the room type. The name should not be null
	 * or empty, otherwise an illegalargumentexception will be thrown
	 * @generated NOT
	 */
	public void setName(String newName) {
		if(newName != null && newName.length()>0){
			String oldName = name;
			name = newName;
			if (eNotificationRequired()){
				eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.ROOM_TYPE__NAME, oldName, name));
			}
		}else{
			throw new IllegalArgumentException("Invalid room type name, cannot be "+(newName==null?"null":"empty"));
		}
	}

	/**
	 * Retrieves the price of this kind of room type
	 * @generated
	 */
	public int getPrice() {
		return price;
	}
	
	 /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomAttribute> getRoomAttributes() {
		return ECollections.unmodifiableEList(roomAttributes);
	}

		/**
	 * Sets the price of the room type. The price cannot be
	 * less than zero.
	 * @generated NOT
	 */
	protected void setPrice(int price) {
		if(price >= 0){
			this.price = price;
		}else{
			throw new IllegalArgumentException("Invalid room type cose, cannot be less than zero");
		}
	}
	
	/**
	 * Adds the given room attribute to this room type
	 * @generated NOT
	 */
	public boolean addRoomAttribute(RoomAttribute attribute) {
		if(attribute != null && !roomAttributes.contains(attribute)){
			return roomAttributes.add(attribute);
		}
		
		return false;
	}

	/**
	 * Removes the given room attribute from this room type
	 * @generated NOT
	 */
	public boolean removeRoomAttribute(RoomAttribute attribute) {
		if(attribute != null){
			return roomAttributes.remove(attribute);
		}
		
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.ROOM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootElementPackage.ROOM_TYPE__NAME:
				return getName();
			case RootElementPackage.ROOM_TYPE__PRICE:
				return getPrice();
			case RootElementPackage.ROOM_TYPE__ROOM_ATTRIBUTES:
				return getRoomAttributes();
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
			case RootElementPackage.ROOM_TYPE__NAME:
				setName((String)newValue);
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
			case RootElementPackage.ROOM_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case RootElementPackage.ROOM_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RootElementPackage.ROOM_TYPE__PRICE:
				return price != PRICE_EDEFAULT;
			case RootElementPackage.ROOM_TYPE__ROOM_ATTRIBUTES:
				return roomAttributes != null && !roomAttributes.isEmpty();
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
			case RootElementPackage.ROOM_TYPE___ADD_ROOM_ATTRIBUTE__ROOMATTRIBUTE:
				return addRoomAttribute((RoomAttribute)arguments.get(0));
			case RootElementPackage.ROOM_TYPE___REMOVE_ROOM_ATTRIBUTE__ROOMATTRIBUTE:
				return removeRoomAttribute((RoomAttribute)arguments.get(0));
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
		result.append(" (name: ");
		result.append(name);
		result.append(", price: ");
		result.append(price);
		result.append(')');
		return result.toString();
	}

} //RoomTypeImpl
