package build;

import java.util.Scanner;

import RootElement.Clerk;
import RootElement.Guest;
import RootElement.Hotel;
import RootElement.Manager;
import RootElement.SysAdmin;

public class Main {

	private Scanner in;
	
	private Hotel hotel;
	private Guest guest;
	private Clerk clerk;
	private Manager manager;
	private SysAdmin sysAdmin;
	
	public Main() {
		in = new Scanner(System.in);
		
		System.out.println("Welcome to the best hotel booking system in the world!");
		loginSelect();
		System.out.println("Exiting the hotel booking system...");
		
		in.close();
	}
	
	private void loginSelect() {
		int input = -1;
		while (input != 0) {
			System.out.println("Who do you want to log in as?");
			System.out.println("1:\tGuest\n2:\tStaff\n3:\tClerk\n4:\tManager\n5:\tSystem Administrator\nOr 0 to exit\n");
			try {
				input = in.nextInt();
			} catch (Exception e) {
				System.out.println("Only digits 0-5 is allowed.");
				continue;
			}
			switch (input) {
			case 1:
				guestLoggedIn();
				break;
			case 2:
				staffLoggedIn();
				break;
			case 3:
				clerkLoggedIn();
				break;
			case 4:
				managerLoggedIn();
				break;
			case 5:
				sysAdminLoggedIn();
				break;
			default:
				System.out.println(input + " is not on the list.\n");
			}
		}
	}
	
	private void guestLoggedIn() {
		System.out.println("Logged in as a Guest!");
		if (guest == null) {
			guest = hotel.getGuest();
		}
	}
	
	private void staffLoggedIn() {
		System.out.println("Logged in as a Staff!");
	}
	
	private void clerkLoggedIn() {
		System.out.println("Logged in as a Clerk!");
	}
	
	private void managerLoggedIn() {
		System.out.println("Logged in as a Manager!");
	}
	
	private void sysAdminLoggedIn() {
		System.out.println("Logged in as a System Administrator!");
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
