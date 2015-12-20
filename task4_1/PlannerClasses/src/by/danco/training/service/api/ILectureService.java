package by.danco.training.service.api;

import by.danco.training.modal.Lecture;

public interface ILectureService {
	
	public void addRecord(Lecture lecturer);
	public void deleteRecord(Lecture lecturer);
	public void updateRecord(Lecture lecturer);
	public Lecture getRecordById(Long id);
	public Lecture[] getAll();


}
