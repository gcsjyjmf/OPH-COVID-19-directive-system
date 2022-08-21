package assignment1;

/**
 * This class is a subclass of Action class. These are activities that happen on
 * the same day every month.
 * 
 * @author Fei Ma
 * @version 1.0.0
 * @since 11.0.13
 */

public class OccasionalAction extends Action {
	/**
	 * call a one-parameter constructor from superclass, and create a constructor
	 * with two parameters
	 * 
	 * @param desc describe what kind of activities happen
	 * @param day  which day the activities happen on
	 */
	public OccasionalAction(String desc, int day) {
		super(desc);
		setDueDay(day);
	}

	/**
	 * override occursOn() method, compare the value of day in this method with the
	 * Dueday in the parent class.
	 * 
	 */
	public boolean occursOn(int year, int month, int day) {
		return (getDueDay() == day);
	}

}
