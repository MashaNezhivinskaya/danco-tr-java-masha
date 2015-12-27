package by.danco.training.dao.impl;

import java.util.Arrays;

import by.danco.trainig.comparator.CountCourseLecturerComparator;
import by.danco.trainig.comparator.NameLectureComparator;
import by.danco.trainig.comparator.NameLecturerComparator;
import by.danco.training.dao.api.ILecturerDao;
import by.danco.training.modal.Lecturer;

public class LecturerDaoImpl implements ILecturerDao {
	
	private Lecturer[] lecturers;
	
	

	public LecturerDaoImpl(Lecturer[] lecturers) {
		this.lecturers = lecturers;
	}

	@Override
	public void addRecord(Lecturer lecturer) {
		lecturers[getIndexNull()] = lecturer;

	}

	@Override
	public void deleteRecord(Lecturer lecturer) {
		lecturers[getIndexForId(lecturer.getId())] = null;

	}

	@Override
	public void updateRecord(Lecturer lecturer) {
		// TODO Auto-generated method stub

	}

	@Override
	public Lecturer getRecordById(Long id) {
		 return lecturers[getIndexForId(id)];
	}
	
	private int getIndexNull(){
		for(int i=0;i<lecturers.length;i++)
		{if(lecturers[i]==null){
			return i;
		}}
		return -1;
	}
	
	private int getIndexForId(Long id){
		for(int i=0;i<lecturers.length;i++)
		{
			if(lecturers[i]==null){
				continue;
			}
			if(lecturers[i].getId()==id){
				return i;
			}
			
		}
		return -1;
		
	}

	@Override
	public Lecturer[] getAll() {
		return lecturers;
	}

	@Override
	public Lecturer[] sortName() {
		 Arrays.sort(lecturers, new NameLecturerComparator());
		return lecturers;
	}

	@Override
	public Lecturer[] sortCountCourse() {
		 Arrays.sort(lecturers, new CountCourseLecturerComparator());
		return lecturers;
	}

	@Override
	public Integer getCount() {
		return lecturers.length;
	}

}
