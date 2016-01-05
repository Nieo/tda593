package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import RootElement.Guest;
import RootElement.HotelSystem;
import RootElement.Manager;
import RootElement.impl.HotelFactory;
import junit.framework.AssertionFailedError;

public class FeedbackTest {

	private Manager manager;
	private Guest guest;

	@Before
	public void setUp() throws Exception {
		HotelNullifier.resetSystem();
		HotelSystem hs = HotelFactory.createHotelSystem();
		manager = hs.getManager("Manager");
		guest = hs.getGuest();
	}

	/**
	 * Test the following features: 
	 * - Guest adds feedback for the hotel with a description and a rating.
	 * - Manager reads the feedback.
	 * - Description and rating is correct for the feedback
	 */
	@Test
	public void test() {
		testGiveFeedback();
		testReadFeedback();
		testIncorrectRatingValue();
	}

	private void testIncorrectRatingValue(){
		
		//Tests valid rating value, should not normally throw AssertionFailedError
		try{
			guest.giveFeedback("", 1);
		} catch(IllegalArgumentException e){
			throw new AssertionFailedError();
		}
		
		//Tests lower rating bound
		try{	
			guest.giveFeedback("", 0);
		} catch(IllegalArgumentException e){
			assertTrue(true);
		}
		
		//Tests higher rating bound
		try{	
			guest.giveFeedback("", 11);
		} catch(IllegalArgumentException e){
			assertTrue(true);
		}	
	}

	private void testGiveFeedback(){
		// Create new feedback from a guest
		guest.giveFeedback("Nice room, terrible food.. " , 6);
		guest.giveFeedback("Should have stayed at home." , 1);
	}

	private void testReadFeedback(){
		// Reads the feedback and checks if the description and rating is correct
		assertEquals(2, manager.getAllFeedback().size());
		assertTrue(manager.getAllFeedback().get(0).getFeedbackDescription().equals("Nice room, terrible food.. "));
		assertTrue(manager.getAllFeedback().get(0).getRating() == 6);
	}

}
