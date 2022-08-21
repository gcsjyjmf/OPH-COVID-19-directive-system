package assignment1;

/**
 * This is the Action Superclass class that provides a catalog of actions to be
 * carried out in view of COVID-19 OPH protocols.
 * 
 * @author Fei Ma
 * @version 1.0.0
 * @since 11.0.13
 */
public abstract class Action {
	/**
	 * description of Action.
	 */
	private String description;
	/**
	 * the year Action happen on.
	 */
	private int dueYear;
	/**
	 * the month Action happen on.
	 */
	private int dueMonth;
	/**
	 * the day Action happen on.
	 */
	private int dueDay;

	/**
	 * Constructs an action without a description.
	 */
	public Action() {
		description = "";
	}

	/**
	 * Constructs an action with a description.
	 * 
	 * @param desc describe what kind of activities happen
	 */
	public Action(String desc) {
		description = desc;
	}

	/**
	 * Constructor that takes the due date elemsnts (dueYear, dueMonth, dueDay)
	 * 
	 * @param year  which year the activities happen on
	 * @param month which month the activities happen on
	 * @param day   which day the activities happen on
	 */
	public Action(int year, int month, int day) {
		dueYear = year;
		dueMonth = month;
		dueDay = day;
	}

	/**
	 * Sets the description of this action.
	 * 
	 * @param description the text description of the action
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * get the dueMonth of action
	 * 
	 * @return the Month action should happen on.
	 */
	public int getDueMonth() {
		return dueMonth;
	}

	/**
	 * set the dueMonth of action
	 * 
	 * @param dueMonth the Month action should happen on
	 */
	public void setDueMonth(int dueMonth) {
		this.dueMonth = dueMonth;
	}

	/**
	 * get the dueDay of action
	 * 
	 * @return the Day action should happen on.
	 */
	public int getDueDay() {
		return dueDay;
	}

	/**
	 * set the dueDay of action
	 * 
	 * @param dueDay the Day action should happen on.
	 */
	public void setDueDay(int dueDay) {
		this.dueDay = dueDay;
	}

	/**
	 * Determines if this action occurs on the specified date.
	 * 
	 * @param year  the year
	 * @param month the month
	 * @param day   the day
	 * @return true if the action activity occurs on the specified date.
	 */
	public abstract boolean occursOn(int year, int month, int day);

	/**
	 * Converts action activity to string description.
	 * 
	 */
	public String toString() {
		return description;
	}
}
