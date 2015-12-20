package by.danco.training.modal;

import java.util.Date;

public class Course {
	
	private final int COUNT_STUDENT;
	private final int COUNT_LECTURE;
	
	private Long id;
	private String nameCourse;
	private Date dateStart;
	private Date dateStop;
	private String section;	
	
	private Lecturer lecturer;
	private Student[] students;
	private Lecture[] lectures;
	
	public Course(int countStudent, int countLecture, Long id, String nameCourse, Date dateStart, Date dateStop,
			String section) {

		COUNT_STUDENT = countStudent;
		COUNT_LECTURE = countLecture;
		this.id = id;
		this.nameCourse = nameCourse;
		this.dateStart = dateStart;
		this.dateStop = dateStop;
		this.section = section;
		this.students = new Student[COUNT_STUDENT];
		this.lectures = new Lecture[COUNT_LECTURE];
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


	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
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

	public Lecture[] getLectures() {
		return lectures;
	}

	public void setLectures(Lecture[] lectures) {
		this.lectures = lectures;
	}

	public int getCOUNT_LECTURE() {
		return COUNT_LECTURE;
	}
	
	
	
	public void setStudent(Student student){
		for(int i=0;;i++)
		{if(students[i]==null){
			students[i]=student;
			break;
		}}
	}
	
	public void setLecture(Lecture lecture){
		for(int i=0;;i++)
		{if(lectures[i]==null){
			lectures[i]=lecture;
			break;
		}}
	}
	
	public void deteteStudent(Student student){
		for(int i=0;i<students.length;i++)
		{if(students[i]!=null&&students[i].getId()==student.getId()){
			students[i]=null;
			break;
		}}
	}
	
	public void deteteLecture(Lecture lecture){
		for(int i=0;i<students.length;i++)
		{if(lectures[i]!=null&&students[i].getId()==lecture.getId()){
			lectures[i]=null;
			break;
		}}
	}
	

}
