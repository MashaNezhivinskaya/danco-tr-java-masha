package employee;

import abstractclass.AbstractEmployee;

public class ProjectManager extends AbstractEmployee{

	public ProjectManager(String nameEmployee, String firstNameEmployee, int salary) {
		super(nameEmployee, firstNameEmployee, salary);
		System.out.println(nameEmployee+" salary  "+salary);
		}
	
	@Override
	public void doWork(){}

}
