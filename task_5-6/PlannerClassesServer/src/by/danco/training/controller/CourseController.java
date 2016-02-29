package by.danco.training.controller;

import java.util.Date;
import java.util.List;

import by.danco.training.modal.Course;
import by.danco.training.modal.Lecture;
import by.danco.training.modal.Lecturer;
import by.danco.training.modal.Student;
import by.danco.training.service.api.ICourseService;
import by.danco.training.service.api.IStudentService;

public class CourseController {
	
	
	ICourseService courseService;
	IStudentService studentService;
	
	public CourseController(ICourseService courseService,IStudentService studentService) {
		this.courseService = courseService;
		this.studentService = studentService;
	}

	public void saveCourse(Course course){
		courseService.addRecord(course);
	}
	
	public void removeCourse(Course course){
		courseService.deleteRecord(course);
	}
	
	public void addLecturerInCourse(Course course, Lecturer lecturer){
		course.setLecturer(lecturer);		
		courseService.updateRecord(course);
	}
	
	public void addLectureInCourse(Course course, Lecture lecture){
		course.setLecture(lecture);		
		courseService.updateRecord(course);
	}
	
	public void addStudentInCourse(Long courseId, Long studentId ,Integer maxStudent){
		
		if(courseService.getCount()< maxStudent){
			Student student = studentService.getRecordById(studentId);
		courseService.getRecordById(courseId).setStudent(student);		
		}
		else {
			System.out.println("Error!!! There is no place!");
		}
	}
	
	public void removeLectureInCourse(Course course, Lecture lecture){
		course.deteteLecture(lecture);;		
		courseService.updateRecord(course);
	}
	
	public void removeStudentInCourse(Course course, Student student){
		course.deteteStudent(student);		
		courseService.updateRecord(course);
	}
	
	public Course getRecordById(Long id) {
		return courseService.getRecordById(id);
	}

	public List<Course> getAll() {
		return courseService.getAll();
	}

	public List<Course> sortName() {
		return courseService.sortName();
	}

	public List<Course> sortDateStart() {
		return courseService.sortDateStart();
	}

	public List<Course> sortCountStudent() {
		return courseService.sortCountStudent();
	}

	public List<Course> sortSection() {
		return courseService.sortSection();
	}

	public List<Course> sortLecturer() {
		return courseService.sortLecturer();
	}

	public List<Course> sortNameStart() {
		return courseService.sortNameStart();
	}

	public List<Course> sortStartDateStart() {
		return courseService.sortStartDateStart();
	}

	public List<Course> sortCountStudentStart() {
		return courseService.sortCountStudentStart();
	}

	public List<Course> sortSectionStart() {
		return courseService.sortSectionStart();
	}

	public List<Course> sortLecturerStart() {
		return courseService.sortLecturerStart();
	}

	public List<Course> sortNameDate(Date date) {
		return courseService.sortNameDate(date);
	}

	public List<Course> sorttDateStartDate(Date date) {
		return courseService.sorttDateStartDate(date);
	}

	public List<Course> sortCountStudentDate(Date date) {
		return courseService.sortCountStudentDate(date);
	}

	public List<Course> sortSectionDate(Date date) {
		return courseService.sortSectionDate(date);
	}
	
	public List<Course> sortLecturerDate(Date date) {
		return courseService.sortLecturerDate(date);
	}

	public Integer getCount() {
		return courseService.getCount();
	}

	public List<Course> getLecturerDate(Date date1, Date date2) {
		return courseService.getLecturerDate(date1, date2);
	}
	
	public Course cloneCourse(Long idCourse){
		return courseService.cloneCourse(idCourse);
	}
	

}
