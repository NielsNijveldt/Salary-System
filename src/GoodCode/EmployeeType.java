package GoodCode;

public enum EmployeeType {
	JUNIOR(5.0 , 100),
	MEDIOR(6.0 , 200),
	SENIOR(7.0 , 0);
	
	public double raiseSalaryPercentage;
	public double bonus;
	
	EmployeeType(double raiseSalaryPercentage, double bonus) {
		this.raiseSalaryPercentage = raiseSalaryPercentage;
		this.bonus = bonus;
	}
	
}