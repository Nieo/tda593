package build;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ParseUtil {

	private static List<String[]> numbers = new LinkedList<String[]>();
	static{
		loadNumbers();
	}
	
	/**
	 * Reads the data concerning numbers from the file 'numbers.txt' in the
	 * 'data' folder
	 * @return List containing string arrays with the words representing 0 ... n
	 */
	private static void loadNumbers(){
		Scanner sc = null;
		try {
			sc = new Scanner(new File("data/numbers.txt"));
		} catch (FileNotFoundException e) {
			return;
		}
		
		while(sc.hasNextLine()){
			String s = sc.nextLine();
			if(!s.startsWith("#") && !s.trim().isEmpty()){		//Use # for comments
				numbers.add(s.split(" "));
			}
		}
		sc.close();
	}
	
	public static Integer getInt(String s){
		if(s == null){
			return null;
		}
		
		try{
			//Try regular parse
			return Integer.parseInt(s);
		}catch(NumberFormatException nfe){
			//Try textual matching instead
			for(String[] words : numbers){
				for(int i = 0; i<words.length; i++){
					if(s.equalsIgnoreCase(words[i])){
						return i;
					}
				}
			}
		}
		
		//Did not find anything with textual matching either
		return null;
	}

	//Use only for testing the functionality.
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			String s = sc.nextLine();
			if(s.equals("stop")){
				break;
			}else{
				Integer num = getInt(s);
				System.out.println("Result: "+(num==null?"-":num));
			}
		}
		sc.close();
	}
	
}
