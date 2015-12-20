package by.danco.training.service.impl;

import by.danco.training.dao.api.IStudentDao;
import by.danco.training.modal.Student;
import by.danco.training.service.api.IStudentService;

public class StudentServiceImpl implements IStudentService {

private IStudentDao studentDao;
	
	public StudentServiceImpl(IStudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}

	@Override
	public void addRecord(Student student) {
		studentDao.addRecord(student);

	}

	@Override
	public void deleteRecord(Student student) {
		studentDao.deleteRecord(student);

	}

	@Override
	public void updateRecord(Student student) {
		studentDao.updateRecord(student);
	}

	@Override
	public Student getRecordById(Long id) {
		return studentDao.getRecordById(id);
	}

	@Override
	public Student[] getAll() {
		return studentDao.getAll();
	}

}
