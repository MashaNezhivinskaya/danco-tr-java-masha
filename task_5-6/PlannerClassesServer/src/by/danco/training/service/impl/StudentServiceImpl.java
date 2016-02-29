package by.danco.training.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.danco.training.dao.api.IStudentDao;
import by.danco.training.modal.Student;
import by.danco.training.service.api.IStudentService;

public class StudentServiceImpl implements IStudentService {

	private static final Logger LOGGER = LogManager.getLogger(StudentServiceImpl.class);
	
	private IStudentDao studentDao;
	
	public StudentServiceImpl(IStudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}
	
	public StudentServiceImpl() {
	}

	@Override
	public void addRecord(Student student) {
		
		try {
			studentDao.addRecord(student);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}

	}

	@Override
	public void deleteRecord(Student student) {
		
		try {
			studentDao.deleteRecord(student);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}

	}

	@Override
	public void updateRecord(Student student) {
		
		try {
			studentDao.updateRecord(student);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
	}

	@Override
	public Student getRecordById(Long id) {
		
		try {
			return studentDao.getRecordById(id);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Student> getAll() {
		
		try {
			return studentDao.getAll();
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public Integer getCount() {
		
		try {
			return studentDao.getCount();
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

}
