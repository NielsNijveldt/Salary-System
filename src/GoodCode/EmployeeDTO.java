package GoodCode;

public class EmployeeDTO {
	public EmployeeType type;
	public String name;
	public double salary;
	
	public EmployeeDTO(String name, EmployeeType type) {
		this.name = name;
		this.type = type;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(type.toString().toLowerCase() + " employee " + name + " has salary " + salary);
		return builder.toString();
	}


}
