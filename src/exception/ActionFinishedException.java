package exception;

/**
 * Exception returned when a action is finished
 * 
 * @author dimitri remy
 * 
 */
public class ActionFinishedException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the class
	 */
	public ActionFinishedException() {

	}

	/**
	 * Builder from this class
	 * 
	 * @param m
	 *            String returned by this exception
	 */
	public ActionFinishedException(String m) {
		super(m);
	}
}
