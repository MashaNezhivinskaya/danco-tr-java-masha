package main;

import company.ControlCompany;
import employee.*;

public class MainClass {

	public static void main(String[] args) {
	 
		ControlCompany company = new ControlCompany();
		BusinessAnalyst analyst =new BusinessAnalyst("Anna","Petrova",300);
		company.addEmployee(analyst);
		Designer designer = new Designer("Sveta","Petrova",350);
		company.addEmployee(designer);
		Developer developer1 = new Developer("Ivan","Petrov",250);
		company.addEmployee(developer1);
		Developer developer2 = new Developer("Zhenia","Petrov",250);
		company.addEmployee(developer2);
		Economist economist = new Economist("Vadim","Petrov",200);
		company.addEmployee(economist);
		ProjectManager projectManager = new ProjectManager("Olia","Petrova",388);
		company.addEmployee(projectManager);
		Tester tester = new Tester("Vika","Petrova",210);
		company.addEmployee(tester);
		
		int salary = company.getSalaryWork();
		System.out.println("SumSalary = "+ salary);

	}

}
