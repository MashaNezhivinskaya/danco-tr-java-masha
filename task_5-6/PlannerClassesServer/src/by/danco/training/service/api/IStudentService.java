package by.danco.training.service.api;

import java.util.List;

import by.danco.training.modal.Student;

public interface IStudentService {
	
	public void addRecord(Student student);
	public void deleteRecord(Student student);
	public void updateRecord(Student student);
	public Student getRecordById(Long id);
	public List<Student> getAll();
	
	public Integer getCount();

}
