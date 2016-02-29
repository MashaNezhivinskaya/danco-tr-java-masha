package by.danco.training.dao.api;

import java.util.List;

import by.danco.training.modal.Student;

public interface IStudentDao {
	
	public void addRecord(Student student);
	public void deleteRecord(Student student);
	public void updateRecord(Student student);
	public Student getRecordById(Long id);
	public List<Student> getAll();
	
	public Integer getCount();

}
