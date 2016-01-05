package tests;

import java.lang.reflect.Field;

import RootElement.impl.BookingHandlerFactory;
import RootElement.impl.CleaningHandlerFactory;
import RootElement.impl.FeedbackHandlerFactory;
import RootElement.impl.HotelFactory;
import RootElement.impl.PaymentHandlerFactory;
import RootElement.impl.RoomSetupFactory;
import RootElement.impl.SupportTicketHandlerFactory;

public class HotelNullifier {

	public static void resetSystem(){
		try {
			resetField(BookingHandlerFactory.class.getDeclaredField("instance"));
			resetField(CleaningHandlerFactory.class.getDeclaredField("instance"));
			resetField(FeedbackHandlerFactory.class.getDeclaredField("instance"));
			resetField(HotelFactory.class.getDeclaredField("instance"));
			resetField(PaymentHandlerFactory.class.getDeclaredField("instance"));
			resetField(RoomSetupFactory.class.getDeclaredField("instance"));
			resetField(SupportTicketHandlerFactory.class.getDeclaredField("instance"));
		} catch (NoSuchFieldException | SecurityException e) {
			System.out.println("Error while retrieving field ("+e.getClass()+") : "+e.getMessage());
		}
	}
	
	private static void resetField(Field f){
		try {
			f.setAccessible(true);
			f.set(null, null);
		} catch (IllegalArgumentException e) {
			System.out.println("Got an IllegalArgumentException: "+e.getMessage());
		} catch (IllegalAccessException e) {
			System.out.println("Got an IllegalAccessException (wutwut): "+e.getMessage());
		}
	}
	
}
