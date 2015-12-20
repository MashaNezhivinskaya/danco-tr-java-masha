package by.danco.training.modal;


public class Lecturer {
	
	private Long id;
	private String nameLecturer;
	private String firstNameLecturer;
	private String specialization;
	private Course[] courses = new Course[100];
	
	
	public Lecturer(Long id, String nameLecturer, String firstNameLecturer, String specialization)
	{	this.id = id;
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


	public Course[] getCourses() {
		return courses;
	}


	public void setCourses(Course[] courses) {
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
