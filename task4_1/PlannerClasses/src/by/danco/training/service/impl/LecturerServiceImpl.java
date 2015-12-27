package by.danco.training.service.impl;

import java.util.Date;

import by.danco.training.dao.api.ILecturerDao;
import by.danco.training.modal.Lecture;
import by.danco.training.modal.Lecturer;
import by.danco.training.service.api.ILecturerService;

public class LecturerServiceImpl implements ILecturerService{
	
private ILecturerDao lecturerDao;
	
	public LecturerServiceImpl(ILecturerDao lecturerDao) {
		super();
		this.lecturerDao = lecturerDao;
	}

	@Override
	public void addRecord(Lecturer lecturer) {
		lecturerDao.addRecord(lecturer);

	}

	@Override
	public void deleteRecord(Lecturer lecturer) {
		lecturerDao.deleteRecord(lecturer);

	}

	@Override
	public void updateRecord(Lecturer lecturer) {
		lecturerDao.updateRecord(lecturer);
	}

	@Override
	public Lecturer getRecordById(Long id) {
		return lecturerDao.getRecordById(id);
	}

	@Override
	public Lecturer[] getAll() {
		return lecturerDao.getAll();
	}

	@Override
	public Lecturer[] sortName() {
		return lecturerDao.sortName();
	}

	@Override
	public Lecturer[] sortCountCourse() {
		return lecturerDao.sortCountCourse();
	}

	@Override
	public Integer getCount() {
		return lecturerDao.getCount();
	}


}
