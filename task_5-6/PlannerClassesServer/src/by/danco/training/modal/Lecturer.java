package by.danco.training.modal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Lecturer implements Serializable{
	
	private static final long serialVersionUID = -3345484958784869576L;
	
	private Long id;
	private String nameLecturer;
	private String firstNameLecturer;
	private String specialization;
	private List<Course> courses = new ArrayList<>();
	
	
	public Lecturer(String nameLecturer, String firstNameLecturer, String specialization)
	{
		this.nameLecturer = nameLecturer;
		this.firstNameLecturer = firstNameLecturer;
		this.specialization = specialization;
	}
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public List<Course> getCourses() {
		return courses;
	}


	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}


	public String getNameLecturer() {
		return nameLecturer;
	}
	public void setNameLecturer(String nameLecturer) {
		this.nameLecturer = nameLecturer;
	}
	public String getFirstNameLecturer() {
		return firstNameLecturer;
	}
	public void setFirstNameLecturer(String firstNameLecturer) {
		this.firstNameLecturer = firstNameLecturer;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	

}
