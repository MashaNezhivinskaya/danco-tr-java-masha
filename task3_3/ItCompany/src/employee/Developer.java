package employee;

import java.util.List;

import abstractclass.AbstractEmployee;

public class Developer extends AbstractEmployee{

	public Developer(String nameEmployee, String firstNameEmployee, int salary) {
		super(nameEmployee, firstNameEmployee, salary);
		System.out.println(nameEmployee+" salary  "+salary);
		}
	
    @Override
	public void doWork(){}
	
    public List <String> getProject(){
    	return null;
    }

	
}
