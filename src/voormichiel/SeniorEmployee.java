package voormichiel;

public class SeniorEmployee extends Employee {
	
	public SeniorEmployee(String inputName, double inputSalery) {
		super(inputName, inputSalery);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void raiseSalary(double inSalary) {
		salery = ((inSalary * 107) / 100); 
	}


	@Override
	public String raiseString() {
		return "Log message: employee " + name + " has new salary: " + salery;
	}


	@Override
	public String toString() {
		return "Senior Employee " + name + " has salary: " + salery;
	}

}
