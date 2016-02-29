package by.danco.training.dao.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import by.danco.trainig.comparator.CountCourseLecturerComparator;
import by.danco.trainig.comparator.NameLecturerComparator;
import by.danco.training.dao.api.ILecturerDao;
import by.danco.training.modal.Lecture;
import by.danco.training.modal.Lecturer;

public class LecturerDaoImpl implements ILecturerDao {
	
	private List<Lecturer> lecturers;
	static private long ID =1;	
	

	public LecturerDaoImpl(List<Lecturer> lecturers) {
		this.lecturers = lecturers;
	}

	@Override
	public void addRecord(Lecturer lecturer) {
		lecturer.setId(ID);
		ID++;
		lecturers.add(lecturer);

	}

	@Override
	public void deleteRecord(Lecturer lecturer) {
		lecturers.remove(lecturer);

	}

	@Override
	public void updateRecord(Lecturer lecturer) {
		// TODO Auto-generated method stub

	}

	@Override
	public Lecturer getRecordById(Long id) {
		Lecturer findLecturer = null;
		for(Lecturer lecturer : lecturers){ 
			if(lecturer.getId()== id){
				findLecturer = lecturer;}
		}
		return findLecturer;
	}

	@Override
	public List<Lecturer> getAll() {
		return lecturers;
	}

	@Override
	public List<Lecturer> sortName() {
		Collections.sort(lecturers, new NameLecturerComparator());
		return lecturers;
	}

	@Override
	public List<Lecturer> sortCountCourse() {
		Collections.sort(lecturers, new CountCourseLecturerComparator());
		return lecturers;
	}

	@Override
	public Integer getCount() {
		return lecturers.size();
	}

}
