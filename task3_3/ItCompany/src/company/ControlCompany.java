package company;

import abstractclass.AbstractEmployee;

public class ControlCompany {
	
	private static final int COUNT_MAS = 15;
	private AbstractEmployee[] emploies =new AbstractEmployee[COUNT_MAS];

	public ControlCompany() {
		
	}
	
	public void addEmployee(AbstractEmployee abstractEmployee ){
		for(int i=0;;i++)
		{if(emploies[i]==null){
			emploies[i]=abstractEmployee;
			System.out.println(abstractEmployee.getNameEmployee()+" add!");
			break;
		}}
	}
	
	public int getSalaryWork(){
		int sumSalary=0;
		for(AbstractEmployee employee:emploies){
			if(employee!=null){
			sumSalary = sumSalary + employee.getSalary();}
		}
	return sumSalary;
	}
	
	

}
