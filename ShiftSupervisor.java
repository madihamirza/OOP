public class ShiftSupervisor extends Employee {

	private double salary;
	private double bonus;

	public ShiftSupervisor(String name, int empNum, String hireDate, double salary, double bonus) {
		super(name, empNum, hireDate);
		this.salary = salary;
		this.bonus = bonus;
	}

	public final double getSalary() {
		return salary;
	}

	public final double getBonus() {
		return bonus;
	}

	public final void setSalary(double salary) {
		this.salary = salary;
	}

	public final void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double calculatePay() {
		return salary + bonus;

	}

	@Override
	public String toString() {
		return super.toString() + "\tSalary : " + salary + "\tBonus : " + bonus;
	}

}
