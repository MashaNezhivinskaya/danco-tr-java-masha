package by.danco.training.service.api;

import java.util.Date;
import java.util.List;

import by.danco.training.modal.Lecture;

public interface ILectureService {
	
	public void addRecord(Lecture lecturer);
	public void deleteRecord(Lecture lecturer);
	public void updateRecord(Lecture lecturer);
	public Lecture getRecordById(Long id);
	public List<Lecture> getAll();
	
	public List<Lecture> sortDate();
	public List<Lecture> sortName();
	public List<Lecture> getLectureDate(Date data);



}
