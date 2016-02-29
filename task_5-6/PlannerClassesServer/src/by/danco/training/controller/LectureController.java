package by.danco.training.controller;

import java.util.Date;
import java.util.List;

import by.danco.training.modal.Lecture;
import by.danco.training.service.api.ILectureService;

public class LectureController {
	
	ILectureService lectureService;
	
	public LectureController(ILectureService lectureService) {
		this.lectureService = lectureService;
	}

	public void saveLecture(Lecture lecture){
		lectureService.addRecord(lecture);
	}
	
	public void removeCourse(Lecture lecture){
		lectureService.deleteRecord(lecture);
		}
	
	public Lecture getRecordById(Long id) {
		return lectureService.getRecordById(id);
	}

	public List<Lecture> getAll() {
		return lectureService.getAll();
	}

	public List<Lecture> sortDate() {
		return lectureService.sortDate();
	}

	public List<Lecture> sortName() {
		return lectureService.sortName();
	}

	public List<Lecture> getLectureDate(Date data) {
		return lectureService.getLectureDate(data);
	}


}
