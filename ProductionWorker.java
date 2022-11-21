public class ProductionWorker extends Employee 
{

	private int shift;
	private int hoursWorked;
	private double hourlyPayment;

	public ProductionWorker(String name, int empNum, String hireDate, int shift, int hoursWorked, double hourlyPayment) 
	{
		super(name, empNum, hireDate);
		this.shift = shift;
		this.hoursWorked = hoursWorked;
		this.hourlyPayment = hourlyPayment;
	}

	public  int getShift() 
	{
		return shift;
	}

	public  int getHoursWorked() 
	{
		return hoursWorked;
	}

	public  double getHourlyPayment() 
	{
		return hourlyPayment;
	}

	public  void setShift(int shift) 
	{
		this.shift = shift;
	}

	public  void setHoursWorked(int hoursWorked) 
	{
		this.hoursWorked = hoursWorked;
	}

	public  void setHourlyPayment(double hourlyPayment) 
	{
		this.hourlyPayment = hourlyPayment;
	}

	@Override
	public double calculatePay() 
	{
		return hourlyPayment * hoursWorked;
	}
	

}