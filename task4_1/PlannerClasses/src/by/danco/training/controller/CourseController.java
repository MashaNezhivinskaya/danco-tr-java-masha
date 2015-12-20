package by.danco.training.controller;

import by.danco.training.modal.Course;
import by.danco.training.modal.Lecture;
import by.danco.training.modal.Lecturer;
import by.danco.training.modal.Student;
import by.danco.training.service.api.ICourseService;

public class CourseController {
	
	ICourseService courseService;
	
	public CourseController(ICourseService courseService) {
		this.courseService = courseService;
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
	
	public void addStudentInCourse(Course course, Student student){
		course.setStudent(student);		
		courseService.updateRecord(course);
	}
	
	public void removeLectureInCourse(Course course, Lecture lecture){
		course.deteteLecture(lecture);;		
		courseService.updateRecord(course);
	}
	
	public void removeStudentInCourse(Course course, Student student){
		course.deteteStudent(student);		
		courseService.updateRecord(course);
	}
	

}
