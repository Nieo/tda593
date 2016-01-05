/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import RootElement.Clerk;
import RootElement.Guest;
import RootElement.HotelSystem;
import RootElement.SupportTicket;
import RootElement.impl.HotelFactory;

/**
 * @author Markus Norén
 *
 */
public class SupportTicketTest {
	
	private Clerk clerk;
	private Guest guest;
	

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		HotelSystem hs = HotelFactory.createHotelSystem();
		clerk = hs.getClerk("Clerk");
		guest = hs.getGuest();
	}


	/**
	 * 	 * Test the following features: 
	 * - Guest adds new support tickets for given room.
	 * - Staff member adds new support tickets for a given room.
	 * - Staff member reads all unfixed tickets.
	 * - Staff member reads all tickets for a room
	 * - Staff member completes a ticket
	 */
	@Test
	public void test() {
		testCreateTicket();
		testCompleteTicket();
	}
	
	private void testCreateTicket(){
		int previouslyUnfixedTickets = clerk.getUnfixedTickets().size();
		guest.newSupportTicket("5500", "out of coffee!");
		guest.newSupportTicket("6600", "broken radiator!");
		clerk.newSupportTicket("6600", "broken table!");
		assertTrue(clerk.getSupportTicketsForRoom("5500").size() == 1);
		assertTrue(clerk.getSupportTicketsForRoom("6600").size() == 2);
		assertTrue(clerk.getSupportTicketsForRoom("7700").size() == 0);
		assertEquals(3+previouslyUnfixedTickets, clerk.getUnfixedTickets().size());
	}
	
	private void testCompleteTicket(){
		int previouslyUnfixedTickets = clerk.getUnfixedTickets().size();
		SupportTicket ticketToComplete = clerk.getSupportTicketsForRoom("5500").get(0);
		clerk.markAsCompleted(ticketToComplete);
		assertTrue(ticketToComplete.isFixed());
		assertEquals(previouslyUnfixedTickets-1, clerk.getUnfixedTickets().size());
	}
	

}
