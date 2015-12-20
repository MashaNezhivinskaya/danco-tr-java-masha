package by.danco.training.dao.api;

import by.danco.training.modal.Lecturer;

public interface ILecturerDao {
	
	public void addRecord(Lecturer lecturer);
	public void deleteRecord(Lecturer lecturer);
	public void updateRecord(Lecturer lecturer);
	public Lecturer getRecordById(Long id);
	public Lecturer[] getAll();

}
