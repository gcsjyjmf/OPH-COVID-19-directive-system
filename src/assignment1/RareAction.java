package assignment1;

/**
 * This class is a subclass of Action class. These are activities that happen on
 * the specified month and day.
 * 
 * @author Fei Ma
 * @version 1.0.0
 * @since 11.0.13
 */
public class RareAction extends Action {
	/**
	 * call a one-parameter constructor from superclass, and create a constructor
	 * with three parameters
	 * 
	 * @param desc  describe what kind of activities happen
	 * @param month which month the activities happen on
	 * @param day   which day the activities happen on
	 */
	public RareAction(String desc, int month, int day) {
		super(desc);
		setDueDay(day);
		setDueMonth(month);

	}

	/**
	 * override occursOn() method, compare the value of day and month in this method
	 * with the Dueday and DueMonth in the parent class.
	 */

	public boolean occursOn(int year, int month, int day) {

		return ((getDueMonth() == month) && (getDueDay() == day));

	}

}
