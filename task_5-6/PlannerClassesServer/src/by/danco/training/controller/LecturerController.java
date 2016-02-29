package by.danco.training.controller;

import java.util.List;

import by.danco.training.modal.Lecturer;
import by.danco.training.service.api.ILecturerService;

public class LecturerController {
	
	ILecturerService lecturerService;
	
	public LecturerController(ILecturerService lecturerService) {
		this.lecturerService = lecturerService;
	}

	public void saveLecture(Lecturer lecturer){
		lecturerService.addRecord(lecturer);
	}
	
	public void removeCourse(Lecturer lecturer){
		lecturerService.deleteRecord(lecturer);
	}

	public Lecturer getRecordById(Long id) {
		return lecturerService.getRecordById(id);
	}

	public List<Lecturer> getAll() {
		return lecturerService.getAll();
	}

	public List<Lecturer> sortName() {
		return lecturerService.sortName();
	}

	public List<Lecturer> sortCountCourse() {
		return lecturerService.sortCountCourse();
	}

	public Integer getCount() {
		return lecturerService.getCount();
	}

}
