package by.danco.training.modal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Course implements Serializable, Cloneable{
	
	private static final long serialVersionUID = 1L;
	
	private final int COUNT_STUDENT;
	private final int COUNT_LECTURE;
	
	private Long id;
	private String nameCourse;
	private Date dateStart;
	private Date dateStop;
	private String section;	
	
	private Lecturer lecturer;
	private List<Student> students;
	private List<Lecture> lectures;
	
	public Course(int countStudent, int countLecture, String nameCourse, Date dateStart, Date dateStop,
			String section) {

		COUNT_STUDENT = countStudent;
		COUNT_LECTURE = countLecture;
		this.nameCourse = nameCourse;
		this.dateStart = dateStart;
		this.dateStop = dateStop;
		this.section = section;
		this.students = new ArrayList<>();
		this.lectures = new ArrayList<>();
	}
	
	public Course clone() throws CloneNotSupportedException {
         return (Course)super.clone();
   }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameCourse() {
		return nameCourse;
	}

	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getDateStop() {
		return dateStop;
	}

	public void setDateStop(Date dateStop) {
		this.dateStop = dateStop;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}


	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}


	public int getCOUNT_STUDENT() {
		return COUNT_STUDENT;
	}

	public Lecturer getLecturer() {
		return lecturer;
	}

	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}

	public List<Lecture> getLectures() {
		return lectures;
	}

	public void setLectures(List<Lecture> lectures) {
		this.lectures = lectures;
	}

	public int getCOUNT_LECTURE() {
		return COUNT_LECTURE;
	}
	
	
	
	public void setStudent(Student student){
		students.add(student);
	}
	
	public void setLecture(Lecture lecture){
	    lectures.add(lecture);
	}
	
	public void deteteStudent(Student student){
		students.remove(student);
	}
	
	public void deteteLecture(Lecture lecture){
		lectures.remove(lecture);
	}
	

}
