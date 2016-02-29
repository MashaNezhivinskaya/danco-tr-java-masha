package by.danco.training.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.danco.training.dao.api.ILecturerDao;
import by.danco.training.modal.Lecturer;
import by.danco.training.service.api.ILecturerService;

public class LecturerServiceImpl implements ILecturerService{
	
	private static final Logger LOGGER = LogManager.getLogger(LecturerServiceImpl.class);
	
	private ILecturerDao lecturerDao;
	
	public LecturerServiceImpl(ILecturerDao lecturerDao) {
		super();
		this.lecturerDao = lecturerDao;
	}

	@Override
	public void addRecord(Lecturer lecturer) {
		
		try {
			lecturerDao.addRecord(lecturer);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}

	}

	@Override
	public void deleteRecord(Lecturer lecturer) {
	
		try {
			lecturerDao.deleteRecord(lecturer);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}

	}

	@Override
	public void updateRecord(Lecturer lecturer) {
		
		try {
			lecturerDao.updateRecord(lecturer);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
	}

	@Override
	public Lecturer getRecordById(Long id) {
		
		try {
			return lecturerDao.getRecordById(id);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Lecturer> getAll() {
		
		try {
			return lecturerDao.getAll();
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Lecturer> sortName() {
		
		try {
			return lecturerDao.sortName();
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Lecturer> sortCountCourse() {
		
		try {
			return lecturerDao.sortCountCourse();
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public Integer getCount() {
		
		try {
			return lecturerDao.getCount();
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}


}
