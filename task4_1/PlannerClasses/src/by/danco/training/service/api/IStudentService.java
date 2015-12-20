package by.danco.training.service.api;

import by.danco.training.modal.Student;

public interface IStudentService {
	
	public void addRecord(Student student);
	public void deleteRecord(Student student);
	public void updateRecord(Student student);
	public Student getRecordById(Long id);
	public Student[] getAll();

}
