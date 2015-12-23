package build.gui.util;

import java.util.HashMap;
import java.util.Map;

public class Settings {

	private static Map<String, String> data;
	
	private static void loadSetup(){
		data = new HashMap<String, String>();
		data.put("hotel.name", "Chalmers Hotel");
	}
	
	public static String getProperty(String name){
		if(data == null){
			 loadSetup();
		}
		
		return data.get(name);
	}
}
