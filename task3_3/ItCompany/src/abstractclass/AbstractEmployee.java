package abstractclass;

public abstract class AbstractEmployee {
	
	private String nameEmployee;
	private String firstNameEmployee;
	private int salary;
		
	protected AbstractEmployee(String nameEmployee, String firstNameEmployee, int salary) {
		this.nameEmployee = nameEmployee;
		this.firstNameEmployee = firstNameEmployee;
		this.salary = salary;
	}

		
	public void doWork(){}

	public String getNameEmployee() {
		return nameEmployee;
	}


	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}


	public String getFirstNameEmployee() {
		return firstNameEmployee;
	}


	public void setFirstNameEmployee(String firstNameEmployee) {
		this.firstNameEmployee = firstNameEmployee;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

}
