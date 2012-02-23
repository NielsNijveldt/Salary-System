package voormichiel;
import java.util.ArrayList;
import java.util.List;


public class SalarySystem {

	private List<Employee> employees = new ArrayList<Employee>();

	public void saveEmployee(Employee employee) {
		employees.add(employee);
	}

	public Employee searchEmployeeByName(String name) throws EmployeeNotFoundException {
		for(Employee employee : employees) {
			if(employee.isNameTheSame(name)) {
				return employee;
			}
		}
		throw new EmployeeNotFoundException("No user found with name " + name);
	}

	public SalarySystem() {
		Employee junior = new JuniorEmployee("Jaap", 1700.0);
		Employee medior = new MediorEmployee("Fred",2000);
		Employee senior = new SeniorEmployee("Hans",2300);
		saveEmployee(junior);
		saveEmployee(medior);
		saveEmployee(senior);
	}
	public void raiseSalary(Employee employee) {
		employee.raiseSalary(employee.getSalery());
		System.out.println(employee.raiseString());
	}
	
	public void printAllEmployees() {
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	public static void main(String args[]) {
		SalarySystem salarySystem = new SalarySystem();
		salarySystem.printAllEmployees();
		try {
			Employee employee = salarySystem.searchEmployeeByName("Jaap");
			salarySystem.raiseSalary(employee);
			employee = salarySystem.searchEmployeeByName("Fred");
			salarySystem.raiseSalary(employee);
			employee = salarySystem.searchEmployeeByName("Hans");
			salarySystem.raiseSalary(employee);
			//employee = salarySystem.searchEmployeeByName("Han");
			//salarySystem.raiseSalary(employee);
		} catch (EmployeeNotFoundException e) {
			System.out.println("Log: System failed to find employee. " + e);
		}
		salarySystem.printAllEmployees();
	}
}


