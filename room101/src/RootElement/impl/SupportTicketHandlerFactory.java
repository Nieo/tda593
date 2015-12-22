package RootElement.impl;

import RootElement.SupportTicketHandler;
import RootElement.SupportTicketReader;
import RootElement.SupportTicketWriter;

/**
 * Factory to make sure the same instance of SupportTicketHandler is used.
 *
 * @author Patrik Haar
 */
public class SupportTicketHandlerFactory {

	private static SupportTicketHandler instance = null;
	
	private static SupportTicketHandler getInstance() {
		if (instance == null) {
			instance = new SupportTicketHandlerImpl();
		}
		return instance;
	}
	
	public static SupportTicketReader createSupportTicketReader() {
		return getInstance();
	}
	
	public static SupportTicketWriter createSupportTicketWriter() {
		return getInstance();
	}
}
