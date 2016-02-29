package by.danco.training.dao.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import by.danco.trainig.comparator.DateLectureComparator;
import by.danco.trainig.comparator.NameLectureComparator;
import by.danco.training.dao.api.ILectureDao;
import by.danco.training.modal.Course;
import by.danco.training.modal.Lecture;

public class LectureDaoImpl implements ILectureDao {
	
	private List<Lecture> lectures;
	static private long ID =1;
	
	public LectureDaoImpl(List<Lecture> lectures) {
		super();
		this.lectures = lectures;
	}

	@Override
	public void addRecord(Lecture lecture) {
		lecture.setId(ID);
		ID++;
		lectures.add(lecture);

	}

	@Override
	public void deleteRecord(Lecture lecture) {
		lectures.remove(lecture);

	}

	@Override
	public void updateRecord(Lecture lecture) {
		// TODO Auto-generated method stub

	}

	@Override
	public Lecture getRecordById(Long id) {
		Lecture findLecture = null;
		for(Lecture lecture : lectures){ 
			if(lecture.getId()== id){
				findLecture = lecture;}
		}
		return findLecture;
	}
	

	@Override
	public List<Lecture> getAll() {
		return lectures;
	}

	@Override
	public List<Lecture> sortDate() {
		Collections.sort(lectures, new DateLectureComparator());
		return lectures;
	}

	@Override
	public List<Lecture> sortName() {
		Collections.sort(lectures, new NameLectureComparator());
		return lectures;
	}

	@Override
	public List<Lecture> getLectureDate(Date data) {
		List<Lecture> newLecture = new ArrayList<>();
		for(Lecture lecture : lectures){
			if(data.equals(lecture.getDate())){
				newLecture.add(lecture);
			}
		}
		return newLecture;
	}

}
