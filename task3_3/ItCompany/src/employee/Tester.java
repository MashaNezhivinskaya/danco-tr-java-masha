package employee;

import abstractclass.AbstractEmployee;

public class Tester extends AbstractEmployee{

	public Tester(String nameEmployee, String firstNameEmployee, int salary) {
		super(nameEmployee, firstNameEmployee, salary);
		System.out.println(nameEmployee+" salary  "+salary);
		
	}
	
	 @Override
	 public void doWork(){}

}
