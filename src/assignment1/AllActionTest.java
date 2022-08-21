package assignment1;

import java.util.Scanner;

/**
 * This class is to demonstrate the Action class and subclasses. Create an array
 * of action objects with different action activities, use a for loop through
 * the array to decide if the activities would occur on the input date.
 * 
 * @author Fei Ma
 * @version 1.0.0
 * @since 11.0.13
 */
public class AllActionTest {
	/**
	 * new an array of Action objects which includes three types of object and five
	 * different description if the description occur on the date of user input,
	 * call the toString method and print it
	 * 
	 * @param args String array
	 */
	public static void main(String[] args) {
		boolean condition;
		String ifcon = "y";
		Action[] action = new Action[5];
		action[0] = new RegularAction("Wash your hands.");
		action[1] = new OccasionalAction("Take a PCR test.", 01);
		action[2] = new RareAction("Get a booster shot.", 12, 15);
		action[3] = new RareAction("Get a booster shot.", 06, 01);
		action[4] = new RegularAction("Sit two meters apart.");
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a date (like 2018 01 30):");
			String date = scanner.nextLine();
			String sy = date.substring(0, 4);
			String sm = date.substring(5, 7);
			String sd = date.substring(8, 10);
			int iyear = Integer.parseInt(sy);
			int imonth = Integer.parseInt(sm);
			int iday = Integer.parseInt(sd);
			System.out.println("These are your actions on " + sm + "/" + sd + "/" + sy + ":");
			for (int i = 0; i < action.length; i++) {
				if (action[i].occursOn(iyear, imonth, iday)) {
					System.out.println(action[i].toString());
				}
			}
			Scanner keyboard = new Scanner(System.in);
			ifcon = keyboard.nextLine();
		} while (ifcon.equalsIgnoreCase("y"));
	}
}
