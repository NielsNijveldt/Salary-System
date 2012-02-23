package GoodCode;

public class Employee {
	
	public EmployeeDTO data;
	
	public Employee(String name, EmployeeType type) {
		data = new EmployeeDTO(name,type);
	}
	
	public void raiseSalary() {
		data.salary = data.salary / 100 * (100+data.type.raiseSalaryPercentage) + data.type.bonus;
	}
	
	public boolean isNameTheSame(String othername) {
		if(this.data.name.equals(othername)) {
			return true;
		}
		return false;
	}
	
	public EmployeeType getEmployeeType() {
		return data.type;
	}
	
	public void changeSalary(double newSalary) {
		data.salary = newSalary;
	}
	public String toString() {
		return data.toString();
	}

}
