package by.danco.training.service.api;

import java.util.Date;

import by.danco.training.modal.Course;

public interface ICourseService {
	
	public void addRecord(Course course);
	public void deleteRecord(Course course);
	public void updateRecord(Course course);
	public Course getRecordById(Long id);
	public Course[] getAll();
	
	public Course[] sortName();
	public Course[] sortDateStart();
	public Course[] sortCountStudent();
	public Course[] sortSection();
	public Course[] sortLecturer();
	
	public Course[] sortNameStart();
	public Course[] sortStartDateStart();
	public Course[] sortCountStudentStart();
	public Course[] sortSectionStart();
	public Course[] sortLecturerStart();
	
	public Course[] sortNameDate(Date date);
	public Course[] sorttDateStartDate(Date date);
	public Course[] sortCountStudentDate(Date date);
	public Course[] sortSectionDate(Date date);
	public Course[] sortLecturerDate(Date date);
	
	public Integer getCount();
	public Course[] getLecturerDate(Date date1, Date date2);

}
