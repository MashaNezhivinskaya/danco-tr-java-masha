package by.danco.training.service.api;

import by.danco.training.modal.Course;

public interface ICourseService {
	
	public void addRecord(Course course);
	public void deleteRecord(Course course);
	public void updateRecord(Course course);
	public Course getRecordById(Long id);
	public Course[] getAll();

}
