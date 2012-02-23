public class Employee {
	private int k = 0; // kind of employee, 0 means junior, 1 is medior, 2 is senior
	/*
	 * Bad naming, too short and doesnt say anything about the meaning of the variable.
	 * Create a enum for the different types of employees and give the variable a better name.
	 */
	private String name;
	private double sal;
	/*
	 * The name of the variable
	 * is wrong, is abbreviated from saldo to sal should just be saldo or salary. (be consistent in language).
	 */
	
	public Employee() {
		this.k = 0;
		/*
		 * Is by default 0 but is here set to 0 again.
		 */
		name = "";
		sal = 0;
	}
	/*
	 * This constructor is superfluous.
	 */
	
	public Employee(String n, int k) {
		name = n; this.k = k;
	}
	
	public void setKind(int k) {
		this.k = k;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLevel() {
		return k;
	}
	
	public void setSalary(double s) {
		sal = s;
	}
	
	public double getPay() {
		return sal;
	}
	
	/*
	 * Getters and setters are kind of overkill since this is a datastructure so you can just make all attributes private.
	 * This will then be the DataTransferObject.
	 * There should then be Employee Object which will contain all the methods.
	 */
	
	public String toString() {
		String r="";
		if (k == 0) r+="Normal ";
		if (k == 1) r+="Junior ";
		if (k == 2) r+="Medior ";
		r += "employee " + name + " has salary " + sal;
		return r;
	}

}
