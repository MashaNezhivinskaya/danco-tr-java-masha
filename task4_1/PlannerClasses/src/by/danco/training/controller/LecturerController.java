package by.danco.training.controller;

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


}
