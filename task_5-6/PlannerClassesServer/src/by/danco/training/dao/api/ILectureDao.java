package by.danco.training.dao.api;

import java.util.Date;
import java.util.List;

import by.danco.training.modal.Lecture;

public interface ILectureDao {
	
	public void addRecord(Lecture lecture);
	public void deleteRecord(Lecture lecture);
	public void updateRecord(Lecture lecture);
	public Lecture getRecordById(Long id);
	public List<Lecture> getAll();
	
	public List<Lecture> sortDate();
	public List<Lecture> sortName();
	public List<Lecture> getLectureDate(Date data);

}
