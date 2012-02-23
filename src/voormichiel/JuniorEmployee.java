package voormichiel;

/**
 * The JuniorEmployee percentage of 5 to raise
 *
 */
public class JuniorEmployee extends Employee {
	
	public JuniorEmployee(String inputName, double inputSalery) {
		super(inputName, inputSalery);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void raiseSalary(double inSalary) {
		salery = ((inSalary * 105 + 10000) / 100); 
	}


	@Override
	public String raiseString() {
		return "Log message: employee " + name + " has new salary: " + salery;
	}


	@Override
	public String toString() {
		return "Junior Employee " + name + " has salary: " + salery;
	}

}
