package RootElement.impl;

import RootElement.Cleaning;
import RootElement.CleaningHandler;

/**
 * Factory to make sure the same instance of CleaningHandler is used.
 *
 * @author Patrik Haar
 */
public class CleaningHandlerFactory {

	private static CleaningHandler instance = null;
	
	private static CleaningHandler getInstance() {
		if (instance == null) {
			instance = new CleaningHandlerImpl();
		}
		return instance;
	}
	
	public static Cleaning createCleaning() {
		return getInstance();
	}
}
