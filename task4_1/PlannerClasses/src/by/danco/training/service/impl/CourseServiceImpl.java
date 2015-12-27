package by.danco.training.service.impl;

import java.util.Date;

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

	@Override
	public Course[] sortName() {
		return courseDao.sortName();
	}

	@Override
	public Course[] sortDateStart() {
		return courseDao.sortDateStart();
	}

	@Override
	public Course[] sortCountStudent() {
		return courseDao.sortCountStudent();
	}

	@Override
	public Course[] sortSection() {
		return courseDao.sortSection();
	}

	@Override
	public Course[] sortLecturer() {
		return courseDao.sortLecturer();
	}

	@Override
	public Course[] sortNameStart() {
		return courseDao.sortNameStart();
	}

	@Override
	public Course[] sortStartDateStart() {
		return courseDao.sortStartDateStart();
	}

	@Override
	public Course[] sortCountStudentStart() {
		return courseDao.sortCountStudentStart();
	}

	@Override
	public Course[] sortSectionStart() {
		return courseDao.sortSectionStart();
	}

	@Override
	public Course[] sortLecturerStart() {
		return courseDao.sortLecturerStart();
	}

	@Override
	public Course[] sortNameDate(Date date) {
		return courseDao.sortNameDate(date);
	}

	@Override
	public Course[] sorttDateStartDate(Date date) {
		return courseDao.sorttDateStartDate(date);
	}

	@Override
	public Course[] sortCountStudentDate(Date date) {
		return courseDao.sortCountStudentDate(date);
	}

	@Override
	public Course[] sortSectionDate(Date date) {
		return courseDao.sortSectionDate(date);
	}

	@Override
	public Course[] sortLecturerDate(Date date) {
		return courseDao.sortLecturerDate(date);
	}

	@Override
	public Integer getCount() {
		return courseDao. getCount();
	}

	@Override
	public Course[] getLecturerDate(Date date1, Date date2) {
		return courseDao.getLecturerDate(date1, date2);
	}

}
