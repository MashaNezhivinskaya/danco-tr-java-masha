package by.danco.training.controller;

import java.util.List;

import by.danco.training.modal.Student;
import by.danco.training.service.api.IStudentService;

public class StudentController {
	
	IStudentService studentService;
	
	public StudentController(IStudentService studentService) {
		this.studentService = studentService;
	}
	
	public StudentController() {
	}

	public void saveLecture(Student student){
		studentService.addRecord(student);
	}
	
	public void removeCourse(Student student){
		studentService.deleteRecord(student);
		}

	public Student getRecordById(Long id) {
		return studentService.getRecordById(id);
	}

	public List<Student> getAll() {
		return studentService.getAll();
	}

	public Integer getCount() {
		return studentService.getCount();
	}


}
