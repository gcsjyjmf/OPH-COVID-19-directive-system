package assignment1;

/**
 * This class is a subclass of Action class. These are activities that happen on
 * everyday.
 * 
 * @author Fei Ma
 * @version 1.0.0
 * @since 11.0.13
 */
public class RegularAction extends Action {
	/**
	 * call a one-parameter constructor from superclass
	 * 
	 * @param desc describe what kind of activities happen
	 */
	public RegularAction(String desc) {
		super(desc);
	}

	/**
	 * * override occursOn() method, always output true
	 */
	public boolean occursOn(int year, int month, int day) {
		return true;
	}
}
