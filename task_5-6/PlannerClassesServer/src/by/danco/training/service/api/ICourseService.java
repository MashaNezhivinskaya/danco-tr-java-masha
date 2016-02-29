package by.danco.training.service.api;

import java.util.Date;
import java.util.List;

import by.danco.training.modal.Course;

public interface ICourseService {
	
	public void addRecord(Course course);
	public void deleteRecord(Course course);
	public void updateRecord(Course course);
	public Course getRecordById(Long id);
	public List<Course> getAll();
	
	public List<Course> sortName();
	public List<Course> sortDateStart();
	public List<Course> sortCountStudent();
	public List<Course> sortSection();
	public List<Course> sortLecturer();
	
	public List<Course> sortNameStart();
	public List<Course> sortStartDateStart();
	public List<Course> sortCountStudentStart();
	public List<Course> sortSectionStart();
	public List<Course> sortLecturerStart();
	
	public List<Course> sortNameDate(Date date);
	public List<Course> sorttDateStartDate(Date date);
	public List<Course> sortCountStudentDate(Date date);
	public List<Course> sortSectionDate(Date date);
	public List<Course> sortLecturerDate(Date date);
	
	public Integer getCount();
	public List<Course> getLecturerDate(Date date1, Date date2);
	
	public Course cloneCourse(Long idCourse);

}
