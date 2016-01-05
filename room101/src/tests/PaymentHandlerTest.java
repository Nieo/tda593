/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import RootElement.PaymentHandler;
import RootElement.impl.PaymentHandlerFactory;

/**
 * @author David
 *
 */
public class PaymentHandlerTest {
	
	private PaymentHandler paymentHandler;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		HotelNullifier.resetSystem();
		paymentHandler = (PaymentHandler) PaymentHandlerFactory.createPayment();	
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		paymentHandler = null;
	}

	/**
	 * Test method for {@link RootElement.impl.PaymentHandlerImpl#verifyCreditCard(java.lang.String)}.
	 */
	@Test
	public void testVerifyCreditCard() {
		assertFalse("Checks for unvalid credit card",paymentHandler.verifyCreditCard("This is not a credit card number"));
		assertFalse("Checks for unvalid credit card",paymentHandler.verifyCreditCard("123-12221-1212445-665"));
		assertFalse("Checks for unvalid credit card",paymentHandler.verifyCreditCard("----------------------"));
		assertFalse("Checks for unvalid credit card",paymentHandler.verifyCreditCard("1234567890"));
		assertTrue("Checks for a valid credit card",paymentHandler.verifyCreditCard("1234-5678-9101-1121"));
	}

	/**
	 * Test method for {@link RootElement.impl.PaymentHandlerImpl#debitCard(java.lang.String, int)}.
	 */
	@Test
	public void testDebitCard() {
		assertTrue("Tests for valid credit card and cost",paymentHandler.debitCard("1234-5678-9101-1121", 100 ));
	}

}
