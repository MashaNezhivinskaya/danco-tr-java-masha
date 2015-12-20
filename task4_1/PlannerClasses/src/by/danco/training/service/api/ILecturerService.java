package by.danco.training.service.api;

import by.danco.training.modal.Lecturer;

public interface ILecturerService {
	
	public void addRecord(Lecturer lecturer);
	public void deleteRecord(Lecturer lecturer);
	public void updateRecord(Lecturer lecturer);
	public Lecturer getRecordById(Long id);
	public Lecturer[] getAll();

}
