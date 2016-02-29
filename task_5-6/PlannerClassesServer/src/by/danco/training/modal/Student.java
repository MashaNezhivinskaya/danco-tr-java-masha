package by.danco.training.modal;

import java.io.Serializable;

public class Student implements Serializable{
	
	private static final long serialVersionUID = -8498314526998299742L;
	
	private  Long id;
	private String nameStudent;
	private String firstNameStudent;
	private String specialty;
	
	
	public Student(String nameStudent, String firstNameStudent, String specialty) {
		this.nameStudent = nameStudent;
		this.firstNameStudent = firstNameStudent;
		this.specialty = specialty;
	}	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNameStudent() {
		return nameStudent;
	}
	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}
	public String getFirstNameStudent() {
		return firstNameStudent;
	}
	public void setFirstNameStudent(String firstNameStudent) {
		this.firstNameStudent = firstNameStudent;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
	

}
