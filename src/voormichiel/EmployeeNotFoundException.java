package voormichiel;
/**
 * A exception which can be thrown when a employee is not found.
 *
 */
public class EmployeeNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public EmployeeNotFoundException(String exception) {
		super(exception);
	}

}
