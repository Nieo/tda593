package RootElement.impl;

import RootElement.FeedbackHandler;
import RootElement.FeedbackReader;
import RootElement.FeedbackWriter;

/**
 * Factory to make sure the same instance of FeedbackHandler is used.
 *
 * @author Patrik Haar
 */
public class FeedbackHandlerFactory {

	private static FeedbackHandler instance = null;
	
	private static FeedbackHandler getInstance() {
		if (instance == null) {
			instance = new FeedbackHandlerImpl();
		}
		return instance;
	}
	
	public static FeedbackReader createFeedbackReader() {
		return getInstance();
	}
	
	public static FeedbackWriter createFeedbackWriter() {
		return getInstance();
	}
}
