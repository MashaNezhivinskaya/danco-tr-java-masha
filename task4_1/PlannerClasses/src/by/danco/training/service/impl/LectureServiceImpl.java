package by.danco.training.service.impl;

import java.util.Date;

import by.danco.training.dao.api.ILectureDao;
import by.danco.training.modal.Lecture;
import by.danco.training.service.api.ILectureService;

public class LectureServiceImpl implements ILectureService {

private ILectureDao lectureDao;
	
	public LectureServiceImpl(ILectureDao lectureDao) {
		super();
		this.lectureDao = lectureDao;
	}

	@Override
	public void addRecord(Lecture lecture) {
		lectureDao.addRecord(lecture);

	}

	@Override
	public void deleteRecord(Lecture lecture) {
		lectureDao.deleteRecord(lecture);

	}

	@Override
	public void updateRecord(Lecture lecture) {
		lectureDao.updateRecord(lecture);
	}

	@Override
	public Lecture getRecordById(Long id) {
		return lectureDao.getRecordById(id);
	}

	@Override
	public Lecture[] getAll() {
		return lectureDao.getAll();
	}

	@Override
	public Lecture[] sortDate() {
		return lectureDao.sortDate();
	}

	@Override
	public Lecture[] sortName() {
		return lectureDao.sortName() ;
	}

	@Override
	public Lecture[] getLectureDate(Date data) {
		return lectureDao.getLectureDate(data);
	}

}
