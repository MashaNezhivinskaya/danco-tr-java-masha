package by.danco.training.service.api;

import java.util.Date;

import by.danco.training.modal.Lecture;
import by.danco.training.modal.Lecturer;

public interface ILectureService {
	
	public void addRecord(Lecture lecturer);
	public void deleteRecord(Lecture lecturer);
	public void updateRecord(Lecture lecturer);
	public Lecture getRecordById(Long id);
	public Lecture[] getAll();
	
	public Lecture[] sortDate();
	public Lecture[] sortName();
	public Lecture[] getLectureDate(Date data);



}
