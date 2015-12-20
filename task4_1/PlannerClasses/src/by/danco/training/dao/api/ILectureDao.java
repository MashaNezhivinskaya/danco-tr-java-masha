package by.danco.training.dao.api;

import by.danco.training.modal.Lecture;

public interface ILectureDao {
	
	public void addRecord(Lecture lecture);
	public void deleteRecord(Lecture lecture);
	public void updateRecord(Lecture lecture);
	public Lecture getRecordById(Long id);
	public Lecture[] getAll();

}
