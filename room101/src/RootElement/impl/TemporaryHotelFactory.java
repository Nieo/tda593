package RootElement.impl;

import RootElement.Hotel;

/**
 * NOTE: THIS IS ONLY FOR TEMPORARY USE.
 * FIXME REMOVE THIS CLASS BEFORE HAND-IN
 * FIXME REMOVE THIS CLASS BEFORE HAND-IN
 * FIXME REMOVE THIS CLASS BEFORE HAND-IN
 * FIXME REMOVE THIS CLASS BEFORE HAND-IN
 * FIXME REMOVE THIS CLASS BEFORE HAND-IN
 * FIXME REMOVE THIS CLASS BEFORE HAND-IN
 * @author Matz
 *
 */

public class TemporaryHotelFactory {

	private static Hotel instance;
	
	public static Hotel getHotel(){
		if(instance == null){
			instance = new HotelImpl();
		}
		
		return instance;
	}
	
}
