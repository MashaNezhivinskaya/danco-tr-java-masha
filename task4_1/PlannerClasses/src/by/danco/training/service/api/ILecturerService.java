package by.danco.training.service.api;

import java.util.Date;

import by.danco.training.modal.Lecture;
import by.danco.training.modal.Lecturer;

public interface ILecturerService {
	
	public void addRecord(Lecturer lecturer);
	public void deleteRecord(Lecturer lecturer);
	public void updateRecord(Lecturer lecturer);
	public Lecturer getRecordById(Long id);
	public Lecturer[] getAll();
	
	public Lecturer[] sortName();
	public Lecturer[] sortCountCourse();
	public Integer getCount();
	
}
