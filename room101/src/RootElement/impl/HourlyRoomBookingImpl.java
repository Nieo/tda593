/**
 */
package RootElement.impl;

import RootElement.HourlyRoomBooking;
import RootElement.RootElementPackage;

import java.util.concurrent.TimeUnit;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hourly Room Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HourlyRoomBookingImpl extends RoomBookingImpl implements HourlyRoomBooking {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HourlyRoomBookingImpl() {
		super();
	}
	
	/**
	 * Returns which time unit is used for this kind of booking.
	 * TimeUnit.HOURS will always be returned.
	 */
	protected TimeUnit getTimeUnit(){
		return TimeUnit.HOURS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.HOURLY_ROOM_BOOKING;
	}

} //HourlyRoomBookingImpl
