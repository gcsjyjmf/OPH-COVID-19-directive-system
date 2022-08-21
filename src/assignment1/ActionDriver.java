package assignment1;

import java.lang.reflect.Field;

/**
 * This class is to test if the RegularAction class is a subclass of Action
 * class; if the RegularAction class have any extra fields; if the activities of
 * regularAction happen everyday.
 * 
 * @author Fei Ma
 * @version 1.0.0
 * @since 11.0.13
 *
 */
public class ActionDriver {
	/**
	 * use java reflection to compare the superclass and subclass. to show the
	 * length of the field array. to indicate if some action occurs on special day.
	 * 
	 * @param args String array
	 */
	public static void main(String[] args) {
		Class actionClass = Action.class;
		Class reguClass = RegularAction.class;
		Class supClass = reguClass.getSuperclass();
		System.out.println("RegularAction is just a subclass of Action:" + (supClass == actionClass));
		System.out.println("expected:" + (supClass == Action.class));
		Field[] noField = reguClass.getDeclaredFields();
		System.out.println("RegularAction activities have no extra fields:" + (noField.length == 0));
		System.out.println("Expected:" + (noField.length == 0));
		RegularAction regularAction = new RegularAction("Wash your hands");
		System.out.println("Looking at regular actions:" + regularAction.toString());
		System.out.println(regularAction.occursOn(2011, 05, 03));
		System.out.println("Expected:" + regularAction.occursOn(2011, 05, 03));

	}

}
