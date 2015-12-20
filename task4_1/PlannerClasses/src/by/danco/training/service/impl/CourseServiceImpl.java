package by.danco.training.service.impl;

import by.danco.training.dao.api.ICourseDao;
import by.danco.training.modal.Course;
import by.danco.training.service.api.ICourseService;

public class CourseServiceImpl implements ICourseService {

	private ICourseDao courseDao;
	
	public CourseServiceImpl(ICourseDao courseDao) {
		super();
		this.courseDao = courseDao;
	}

	@Override
	public void addRecord(Course course) {
		courseDao.addRecord(course);

	}

	@Override
	public void deleteRecord(Course course) {
		courseDao.deleteRecord(course);

	}

	@Override
	public void updateRecord(Course course) {
		courseDao.updateRecord(course);
	}

	@Override
	public Course getRecordById(Long id) {
		return courseDao.getRecordById(id);
	}

	@Override
	public Course[] getAll() {
		return courseDao.getAll();
	}

}
