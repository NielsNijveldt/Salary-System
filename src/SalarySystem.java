import java.util.ArrayList;


public class SalarySystem {
	
	private ArrayList empArray = new ArrayList();
	/*
	 * empArray what is it? it doesnt have a generic, its name implies that it is a array. emp doesnt say much.
	 * Solution give a generic <Employee> and better name.
	 */
	
	public void addColleague(Employee c) {
		empArray.add(c);
	}
	/*
	 * c wrong variable name. Method name is not well. Should be something like addEmployeeToList
	 */
	
	public Employee search(String s) {
		for (int i = 0; i < empArray.size(); i++)
			if (((Employee)empArray.get(i)).getName().equals(s)) return (Employee)empArray.get(i);
		return new Employee("no employee has been found",-1);
	}
	/*
	 * Error status should be replaced by Exceptions. More enters. Readability improves with a for(Object o : objects), this
	 * is much more readable and no int i has to be initalized. 
	 * 
	 */
	
	public void raiseSalary(Employee e) {
		// if emp is jr, then he gets 5% raise + 100
		// when emp is mr, he gets 6% + 100
		// when emp is sr, he gets 7% 
		switch (e.getLevel()) {
		case 0: 
			e.setSalary(e.getPay() * 105 + 10000);
			e.setSalary(e.getPay() / 100);
			System.out.println("Log message: employee " + e.getName() + " has new salary: " + e.getPay());
			break;
		case 1:
			e.setSalary(e.getPay() * 106+ 20000);
			e.setSalary(e.getPay() / 100);
			System.out.println("Log message: employee " + e.getName() + " has new salary: " + e.getPay());
			break;
		case 2:
			e.setSalary(e.getPay() * 107);
			e.setSalary(e.getPay() / 100);
			System.out.println("Log message: employee " + e.getName() + " has new salary: " + e.getPay());
			break;	
		}
	}
	/*
	 * e should have a btter name. Percentage per level should be saved some different way probaly create a new class with rank to do this.
	 * Handle Switch statements at the lowest abstraction level possible. Bonus comment is wrong, says mr bonus is 100 but really 
	 * bonus is 200.
	 */
	public SalarySystem() {
		Employee j = new Employee("Jaap",0);
		Employee m = new Employee("Fred",1);
		Employee s = new Employee("Hans",2);
		j.setSalary(1700.0);
		m.setSalary(2000);
		s.setSalary(2300);
		addColleague(j);
		addColleague(m);
		addColleague(s);
	}
	/*
	 * variable names.
	 */
	public void printAll() {
		for (Object e : empArray) {
			Employee e1 = (Employee)e;
			System.out.print(e.toString() + "\n");
		}
	}
	/*
	 * 
	 * Name isnt clrear and e1 is unused, can be removed.
	 */
	public static void main(String args[]) {
		// raise salary of all employees
		SalarySystem s = new SalarySystem();
		s.printAll();
		Employee e = s.search("Jaap");
		s.raiseSalary(e);
		e = s.search("Fred");
		s.raiseSalary(e);
		e = s.search("Hans");
		s.raiseSalary(e);
		s.printAll();		
	}
	/*
	 * Variable names.
	 */
	
}


