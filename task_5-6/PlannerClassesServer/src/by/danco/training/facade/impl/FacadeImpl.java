package by.danco.training.facade.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import by.danco.training.controller.CourseController;
import by.danco.training.controller.LectureController;
import by.danco.training.controller.LecturerController;
import by.danco.training.controller.StudentController;
import by.danco.training.dao.api.ICourseDao;
import by.danco.training.dao.impl.CourseDaoImpl;
import by.danco.training.dao.impl.LectureDaoImpl;
import by.danco.training.dao.impl.StudentDaoImpl;
import by.danco.training.facade.api.IFacade;
import by.danco.training.modal.Course;
import by.danco.training.modal.Lecture;
import by.danco.training.modal.Lecturer;
import by.danco.training.modal.Student;
import by.danco.training.property.PropertyReader;
import by.danco.training.service.impl.CourseServiceImpl;
import by.danco.training.service.impl.StudentServiceImpl;
import by.danco.training.service.impl.LectureServiceImpl;

public class FacadeImpl implements IFacade{
	
	private CourseController courseController;
	private LectureController lectureController;
	private LecturerController lecturerController;
	private StudentController studentController;
	private Integer maxStudent;
	
	public FacadeImpl(CourseController courseController, LectureController lectureController,
			LecturerController lecturerController, StudentController studentController) {

		this.courseController = courseController;
		this.lectureController = lectureController;
		this.lecturerController = lecturerController;
		this.studentController = studentController;
	}

//course
	
	public FacadeImpl() {
		this.studentController = new StudentController(new StudentServiceImpl(new StudentDaoImpl(new ArrayList<Student>())));
		this.courseController = new CourseController(new CourseServiceImpl(new CourseDaoImpl(new ArrayList<Course>())),new StudentServiceImpl(new StudentDaoImpl(new ArrayList<Student>())));
		this.lectureController = new LectureController(new LectureServiceImpl(new LectureDaoImpl(new ArrayList<Lecture>())));
	}

	@Override
	public void saveCourse(Course course) {
		courseController.saveCourse(course);
		
	}

	@Override
	public void removeCourse(Course course) {
		courseController.removeCourse(course);
		
	}

	@Override
	public void addLecturerInCourse(Course course, Lecturer lecturer) {
		courseController.addLecturerInCourse(course, lecturer);
		
	}

	@Override
	public void addLectureInCourse(Course course, Lecture lecture) {
		courseController.addLectureInCourse(course, lecture);
		
	}

	@Override
	public void addStudentInCourse(Long courseId, Long studentId) {
		maxStudent = PropertyReader.getInstance().getMaxStudentsCount();
		courseController.addStudentInCourse(courseId, studentId, maxStudent);
		
	}

	@Override
	public void removeLectureInCourse(Course course, Lecture lecture) {
		courseController.removeLectureInCourse(course, lecture);
		
	}

	@Override
	public void removeStudentInCourse(Course course, Student student) {
		courseController.removeStudentInCourse(course, student);
		
	}

	@Override
	public Course getCourseById(Long id) {
		return courseController.getRecordById(id);
	}

	@Override
	public List<Course> getAllCourse() {
		return courseController.getAll();
	}

	@Override
	public List<Course> sortNameCourse() {
		return courseController.sortName();
	}

	@Override
	public List<Course> sortDateStart() {
		return courseController.sortDateStart();
	}

	@Override
	public List<Course> sortCountStudent() {
		return courseController.sortCountStudent();
	}

	@Override
	public List<Course> sortSection() {
		return courseController.sortSection();
	}

	@Override
	public List<Course> sortLecturer() {
		return courseController.sortLecturer();
	}

	@Override
	public List<Course> sortNameStart() {
		return courseController.sortNameStart();
	}

	@Override
	public List<Course> sortStartDateStart() {
		return courseController.sortStartDateStart();
	}

	@Override
	public List<Course> sortCountStudentStart() {
		return courseController.sortCountStudentStart();
	}

	@Override
	public List<Course> sortSectionStart() {
		return courseController.sortSectionStart();
	}

	@Override
	public List<Course> sortLecturerStart() {
		return courseController.sortLecturerStart();
	}

	@Override
	public List<Course> sortNameDate(Date date) {
		return courseController.sortNameDate(date);
	}

	@Override
	public List<Course> sorttDateStartDate(Date date) {
		return courseController.sorttDateStartDate(date);
	}

	@Override
	public List<Course> sortCountStudentDate(Date date) {
		return courseController.sortCountStudentDate(date);
	}

	@Override
	public List<Course> sortSectionDate(Date date) {
		return courseController.sortSectionDate(date);
	}

	@Override
	public List<Course> sortLecturerDate(Date date) {
		return courseController.sortLecturerDate(date);
	}

	@Override
	public Integer getCountCourse() {
		return courseController.getCount();
	}

	@Override
	public List<Course> getLecturerDate(Date date1, Date date2) {
		return courseController.getLecturerDate(date1, date2);
	}

//lecture	

	@Override
	public void saveLecture(Lecture lecture) {
		lectureController.saveLecture(lecture);
		
	}

	@Override
	public void removeCourse(Lecture lecture) {
		lectureController.removeCourse(lecture);
		
	}

	@Override
	public Lecture getLecturedById(Long id) {
		return lectureController.getRecordById(id);
	}

	@Override
	public List<Lecture> getAllLecture() {
		return lectureController.getAll();
	}

	@Override
	public List<Lecture> sortDate() {
		return lectureController.sortDate();
	}

	@Override
	public List<Lecture> sortNameLecture() {
		return lectureController.sortName();
	}

	@Override
	public List<Lecture> getLectureDate(Date data) {
		return lectureController.getLectureDate(data);
	}

//lecturer
	
	@Override
	public void saveLecturer(Lecturer lecturer) {
		lecturerController.saveLecture(lecturer);
		
	}

	@Override
	public void removeCourse(Lecturer lecturer) {
		lecturerController.removeCourse(lecturer);
		
	}

	@Override
	public Lecturer getLecturerdById(Long id) {
		return lecturerController.getRecordById(id);
	}

	@Override
	public List<Lecturer> getAllLecturer() {
		return lecturerController.getAll();
	}

	@Override
	public List<Lecturer> sortNameLecturer() {
		return lecturerController.sortName();
	}

	@Override
	public List<Lecturer> sortCountCourse() {
		return lecturerController.sortCountCourse();
	}

	@Override
	public Integer getCountLecturer() {
		return lecturerController.getCount();
	}

//student
	
	@Override
	public void saveStudent(Student student) {
		studentController.saveLecture(student);
		
	}

	@Override
	public void removeCourse(Student student) {
		studentController.removeCourse(student);
		
	}

	@Override
	public Student getStudentById(Long id) {
		return studentController.getRecordById(id);
	}

	@Override
	public List<Student> getAllStudent() {
		return studentController.getAll();
	}

	@Override
	public Integer getCountStudent() {
		return studentController.getCount();
	}

	@Override
	public Course cloneCourse(Long idCourse) {
		return courseController.cloneCourse(idCourse);
	}
	
	
	

}
