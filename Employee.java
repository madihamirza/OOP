public abstract class Employee 
{	
	protected String name;
	protected int empNum;
	protected String hireDate;

	public Employee(String name, int empNum, String hireDate) 
	{
		super();
		this.name = name;
		this.empNum = empNum;
		this.hireDate = hireDate;
	}

	public String getName() {
		return name;
	}

	public int getEmpNum() {
		return empNum;
	}

	public String getHireDate() {
		return hireDate;
	}
	
	public abstract double calculatePay();

	@Override
	public String toString()
	{
		return  "Employee Num : "+empNum+"\tName : "+name+"\tHireDate : "+hireDate;
	}
	
	

}


