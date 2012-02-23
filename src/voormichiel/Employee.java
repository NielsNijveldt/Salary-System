package voormichiel;

/**
 * The employee is a abstract class. The class is intended to create new Employees
 *
 */
public abstract class Employee {
	
	protected String name;
	protected double salery;
	
	public Employee(String inputName, double inputSalery) {
		this.name = inputName;
		this.salery = inputSalery;
	}
	
	/**
	 * This method checks if the incoming string is the same as the name of the employee.
	 * @param othername 
	 * @return true if the same else false
	 */
	public boolean isNameTheSame(String othername) {
		if(this.name.equals(othername)) {
			return true;
		}
		return false;
	}
	
	/**
	 * this method raises the salary of a employee. 
	 * @param d the amount to raise the salray.
	 */
	public abstract void raiseSalary(double amount);
	
	public String getName() {
		return name;
	}
	
	public double getSalery() {
		return salery;
	}
	
	public abstract String raiseString();
	
	public abstract String toString();
}
