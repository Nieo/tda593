package RootElement.impl;

import RootElement.Payment;
import RootElement.PaymentHandler;

/**
 * Factory to make sure the same instance of PaymentHandler is used.
 *
 * @author Patrik Haar
 */
public class PaymentHandlerFactory {

	private static PaymentHandler instance = null;
	
	private static PaymentHandler getInstance() {
		if (instance == null) {
			instance = new PaymentHandlerImpl();
		}
		return instance;
	}
	
	public static Payment createPayment() {
		return getInstance();
	}
}
