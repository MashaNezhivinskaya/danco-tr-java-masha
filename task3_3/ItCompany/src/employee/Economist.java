package employee;

import abstractclass.AbstractEmployee;

public class Economist extends AbstractEmployee{

	public Economist(String nameEmployee, String firstNameEmployee, int salary) {
		super(nameEmployee, firstNameEmployee, salary);
		System.out.println(nameEmployee+" salary  "+salary);
		
	}
	 
	 @Override
	 public void doWork(){}
	 
	 public void setSalaryWork(AbstractEmployee employee){} 
}
