package assignment1;

import java.lang.reflect.Field;

/**
 * This class is to test if the OccasionalAction class and RareAction class are
 * subclasses of Action class; if the OccasionalAction class and RareAction
 * class have any extra fields.
 * 
 * @author Fei Ma
 * @version 1.0.0
 * @since 11.0.13
 *
 */
public class ActionDrive2 {
	/**
	 * use java reflection to compare the superclass and subclass. to show the
	 * length of the field array.
	 * 
	 * @param args String array
	 */
	public static void main(String[] args) {
		Class actionClass = Action.class;
		Class occaClass = OccasionalAction.class;
		Class supClass = occaClass.getSuperclass();
		Class rareClass = RareAction.class;
		Class supClass1 = rareClass.getSuperclass();
		System.out.println("OccasionalAction is subclass of Action:" + (supClass == actionClass));
		System.out.println("expected:" + (supClass == Action.class));
		System.out.println("RareAction is subclass of Action:" + (supClass1 == actionClass));
		System.out.println("expected:" + (supClass1 == Action.class));
		Field[] noField = occaClass.getDeclaredFields();
		System.out.println("OccasionalAction have no extra fields:" + (noField.length == 0));
		System.out.println("Expected:" + (noField.length == 0));
		Field[] noField1 = rareClass.getDeclaredFields();
		System.out.println("RareAction have no extra fields:" + (noField1.length == 0));
		System.out.println("Expected:" + (noField1.length == 0));

	}

}
