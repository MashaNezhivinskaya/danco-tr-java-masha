package by.danco.training.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.danco.training.dao.api.ILectureDao;
import by.danco.training.modal.Lecture;
import by.danco.training.service.api.ILectureService;

public class LectureServiceImpl implements ILectureService {

	private static final Logger LOGGER = LogManager.getLogger(LectureServiceImpl.class);
	
	private ILectureDao lectureDao;
	
	public LectureServiceImpl(ILectureDao lectureDao) {
		super();
		this.lectureDao = lectureDao;
	}

	@Override
	public void addRecord(Lecture lecture) {
		
		try {
			lectureDao.addRecord(lecture);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}

	}

	@Override
	public void deleteRecord(Lecture lecture) {
		
		try {
			lectureDao.deleteRecord(lecture);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}

	}

	@Override
	public void updateRecord(Lecture lecture) {
		lectureDao.updateRecord(lecture);
		try {
			lectureDao.updateRecord(lecture);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
	}

	@Override
	public Lecture getRecordById(Long id) {
	
		try {
			return lectureDao.getRecordById(id);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Lecture> getAll() {
		
		try {
			return lectureDao.getAll();
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Lecture> sortDate() {
		
		try {
			return lectureDao.sortDate();
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Lecture> sortName() {
		
		try {
			return lectureDao.sortName();
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Lecture> getLectureDate(Date data) {
		
		try {
			return lectureDao.getLectureDate(data);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

}
