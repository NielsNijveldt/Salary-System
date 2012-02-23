package GoodCode;
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
	public void raiseSalary(Employee employee) {
		employee.raiseSalary();
		System.out.println("Log message: employee " + employee.data.name + " has new salary: " + employee.data.salary);
	}
	public SalarySystem() {
		Employee e = new Employee("Jaap",EmployeeType.JUNIOR);
		Employee m = new Employee("Fred",EmployeeType.MEDIOR);
		Employee s = new Employee("Hans",EmployeeType.SENIOR);
		e.changeSalary(1700.0);
		m.changeSalary(2000);
		s.changeSalary(2300);
		saveEmployee(e);
		saveEmployee(m);
		saveEmployee(s);
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
			employee = salarySystem.searchEmployeeByName("Han");
			salarySystem.raiseSalary(employee);
		} catch (EmployeeNotFoundException e) {
			System.out.println("Log: System failed to find employee. " + e);
		}
		salarySystem.printAllEmployees();
	}
}


