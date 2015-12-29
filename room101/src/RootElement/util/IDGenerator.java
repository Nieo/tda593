package RootElement.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Very simple ID generator that supports multiple static accessible
 * generators. Makes sure that an ID is never used twice.
 * 
 * For consistency, always use the name of the class as the name of the
 * generator unless another name is heavily required.
 * 
 * @author Matz Larsson
 *
 */

public class IDGenerator {

	private static Map<String, IDGenerator> generators = new HashMap<String, IDGenerator>();
	
	private int counter = 0;
	
	/**
	 * Retrive an instance of an ID generator with the given name.
	 * @param name The name of the generator.
	 * @return The existing generator with the given name or a newly created if none existed with the name
	 */
	public static IDGenerator getGenerator(String name){
		if(!generators.containsKey(name)){
			IDGenerator g = new IDGenerator();
			generators.put(name, g);
			return g;
		}else{
			return generators.get(name);
		}
	}
	
	/**
	 * Generates a new ID
	 * @return The new generated ID
	 */
	public int getNewID(){
		if(counter < 0){
			throw new IllegalStateException("Too many IDs have been fetched. Integer overflow.");
		}else{
			return counter++;
		}
	}
	
}
