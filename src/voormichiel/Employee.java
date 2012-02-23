package voormichiel;

public abstract class Employee {
	
	protected String name;
	protected double salery;
	
	public Employee(String inputName, double inputSalery) {
		this.name = inputName;
		this.salery = inputSalery;
	}
	
	
	public boolean isNameTheSame(String othername) {
		if(this.name.equals(othername)) {
			return true;
		}
		return false;
	}
	
	public abstract void raiseSalary(double d);
	
	public String getName() {
		return name;
	}
	
	public double getSalery() {
		return salery;
	}
	
	public abstract String raiseString();
	
	public abstract String toString();
}
