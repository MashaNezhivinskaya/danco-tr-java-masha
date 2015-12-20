package by.danco.training.controller;

import by.danco.training.modal.Student;
import by.danco.training.service.api.IStudentService;

public class StudentController {
	
	IStudentService studentService;
	
	public StudentController(IStudentService studentService) {
		this.studentService = studentService;
	}

	public void saveLecture(Student student){
		studentService.addRecord(student);
	}
	
	public void removeCourse(Student student){
		studentService.deleteRecord(student);
		}

	


}
