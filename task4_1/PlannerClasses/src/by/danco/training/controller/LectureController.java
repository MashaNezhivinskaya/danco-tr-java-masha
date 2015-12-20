package by.danco.training.controller;

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

}
