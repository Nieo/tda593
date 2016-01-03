package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import RootElement.Guest;
import RootElement.HotelSystem;
import RootElement.Manager;
import RootElement.impl.HotelFactory;

public class FeedbackTest {

	private Manager manager;
	private Guest guest;
	
	@Before
	public void setUp() throws Exception {
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
	}

	private void testGiveFeedback(){
		// Create new feedback from a guest
		guest.giveFeedback("Nice room, terrible food.. " , 3);
		guest.giveFeedback("Should have stayed at home." , 0);
	}
	
	private void testReadFeedback(){
		// Reads the feedback and checks if the description and rating is correct
		assertTrue(manager.getAllFeedback().size() == 2);
		assertTrue(manager.getAllFeedback().get(0).getFeedbackDescription().equals("Nice room, terrible food.. "));
		assertTrue(manager.getAllFeedback().get(0).getRating() == 3);
	}
	
}
