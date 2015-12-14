package employee;

import abstractclass.AbstractEmployee;

public class Designer extends AbstractEmployee{

	public Designer(String nameEmployee, String firstNameEmployee, int salary) {
		super(nameEmployee, firstNameEmployee, salary);
		System.out.println(nameEmployee+" salary  "+salary);
	}
	
	 @Override
	 public void doWork(){}

}
