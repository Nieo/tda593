package build;

import java.util.Scanner;

public class Tmp {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input;
		while(!(input = sc.nextLine()).equals("stop")){
			System.out.println("Phone: "+(phone(input)?"Yes":"No"));
			System.out.println("Mail: "+(mail(input)?"Yes":"No"));
		}
		sc.close();
	}
	
	private static boolean phone(String phone){
		phone = phone.replaceAll("\\s", "");
		return phone.matches("^[0-9]{3,4}[-]*[0-9]{6,7}$");
	}
	
	private static boolean mail(String mail){
		return mail.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
	}
}
