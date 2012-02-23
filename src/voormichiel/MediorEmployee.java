package voormichiel;

public class MediorEmployee extends Employee {
	
	public MediorEmployee(String inputName, double inputSalery) {
		super(inputName, inputSalery);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void raiseSalary(double inSalary) {
		salery = ((inSalary * 106 + 20000) / 100); 
	}


	@Override
	public String raiseString() {
		return "Log message: employee " + name + " has new salary: " + salery;
	}


	@Override
	public String toString() {
		return "Medior Employee " + name + " has salary: " + salery;
	}

}
