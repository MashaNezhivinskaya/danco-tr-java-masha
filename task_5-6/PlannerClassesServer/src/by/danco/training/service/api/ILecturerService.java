package by.danco.training.service.api;

import java.util.List;

import by.danco.training.modal.Lecturer;

public interface ILecturerService {
	
	public void addRecord(Lecturer lecturer);
	public void deleteRecord(Lecturer lecturer);
	public void updateRecord(Lecturer lecturer);
	public Lecturer getRecordById(Long id);
	public List<Lecturer> getAll();
	
	public List<Lecturer> sortName();
	public List<Lecturer> sortCountCourse();
	public Integer getCount();
	
}
