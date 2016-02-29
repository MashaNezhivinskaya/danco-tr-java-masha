package by.danco.training.dao.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import by.danco.trainig.comparator.CountStudentCourseComparator;
import by.danco.trainig.comparator.CourseDateStartComparator;
import by.danco.trainig.comparator.CourseNameComparator;
import by.danco.trainig.comparator.LecturerCourseComparator;
import by.danco.trainig.comparator.SectionCoureComparator;
import by.danco.training.dao.api.ICourseDao;
import by.danco.training.modal.Course;

public class CourseDaoImpl implements ICourseDao {
	
	static private long ID =1;
	private List<Course> courses;

	public CourseDaoImpl(List<Course> courses) {
		this.courses = courses;
	}
	
	@Override
	public Course cloneCourse(Course course){
		
		try {
			Course newCourse = course.clone();
			newCourse.setId(ID);
			ID++;
			courses.add(newCourse);
			return newCourse;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void addRecord(Course course) {
		course.setId(ID);
		ID++;
		courses.add(course);
	
	}

	@Override
	public void deleteRecord(Course course) {
		courses.remove(course);

	}

	@Override
	public void updateRecord(Course course) {
		// TODO Auto-generated method stub

	}

	@Override
	public Course getRecordById(Long id) {
		Course findCourse = null;
		for(Course course : courses){ 
			if(course.getId()== id){
				findCourse = course;}
		}
		return findCourse;
	}
	
	@Override
	public List<Course> getAll() {
		return courses;
	}

	@Override
	public List<Course> sortName() {
		Collections.sort(courses, new CourseNameComparator());
		return courses;
	}

	@Override
	public List<Course> sortDateStart() {
		Collections.sort(courses, new CourseDateStartComparator());
			return courses;
	}

	@Override
	public List<Course> sortCountStudent() {
		Collections.sort(courses, new CountStudentCourseComparator());
			return courses;
	}

	@Override
	public List<Course> sortSection() {
		Collections.sort(courses, new SectionCoureComparator());
			return courses;
	}

	@Override
	public List<Course> sortLecturer() {
		Collections.sort(courses, new LecturerCourseComparator());
			return courses;
	}

	@Override
	public List<Course> sortNameStart() {
		List<Course> newCourse = new ArrayList<>();
		for(Course course : courses ){
			if(new Date().after(course.getDateStart())){
				newCourse.add(course);
			}
		}
		Collections.sort(newCourse, new CourseNameComparator());
		return newCourse;
	}

	@Override
	public List<Course> sortStartDateStart() {
		List<Course> newCourse = new ArrayList<>();
		for(Course course : courses ){
			if(new Date().after(course.getDateStart())){
				newCourse.add(course);
			}
		}
		Collections.sort(newCourse, new CourseDateStartComparator());
		return newCourse;
	}

	@Override
	public List<Course> sortCountStudentStart() {
		List<Course> newCourse = new ArrayList<>();
		for(Course course : courses ){
			if(new Date().after(course.getDateStart())){
				newCourse.add(course);
			}
		}
		Collections.sort(newCourse, new CountStudentCourseComparator());
		return newCourse;
	}

	@Override
	public List<Course> sortSectionStart() {
		List<Course> newCourse = new ArrayList<>();
		for(Course course : courses ){
			if(new Date().after(course.getDateStart())){
				newCourse.add(course);
			}
		}
		Collections.sort(newCourse, new  SectionCoureComparator());
		return newCourse;
	}

	@Override
	public List<Course> sortLecturerStart() {
		 List<Course> newCourse = new ArrayList<>();
			for(Course course : courses ){
				if(new Date().after(course.getDateStart())){
					newCourse.add(course);
				}
			}
			Collections.sort(newCourse, new  LecturerCourseComparator());
			return newCourse;
		}

	@Override
	public List<Course> sortNameDate(Date date) {
		List<Course> newCourse = new ArrayList<>();
		for(Course course : courses ){
			if(date.after(course.getDateStart())){
				newCourse.add(course);
			}
		}
		Collections.sort(newCourse, new  CourseNameComparator());
		return newCourse;
	}

	@Override
	public List<Course> sorttDateStartDate(Date date) {
		 List<Course> newCourse = new ArrayList<>();
			for(Course course : courses ){
				if(date.after(course.getDateStart())){
					newCourse.add(course);
				}
			}
			Collections.sort(newCourse, new  CourseDateStartComparator());
			return newCourse;
	}

	@Override
	public List<Course> sortCountStudentDate(Date date) {
		  List<Course> newCourse = new ArrayList<>();
			for(Course course : courses ){
				if(date.after(course.getDateStart())){
					newCourse.add(course);
				}
			}
			Collections.sort(newCourse, new  CountStudentCourseComparator());
			return newCourse;
	}

	@Override
	public List<Course> sortSectionDate(Date date) {
		List<Course> newCourse = new ArrayList<>();
		for(Course course : courses ){
			if(date.after(course.getDateStart())){
				newCourse.add(course);
			}
		}
		Collections.sort(newCourse, new  SectionCoureComparator());
		return newCourse;
	}

	@Override
	public List<Course> sortLecturerDate(Date date) {
		  List<Course> newCourse = new ArrayList<>();
			for(Course course : courses ){
				if(date.after(course.getDateStart())){
					newCourse.add(course);
				}
			}
			Collections.sort(newCourse, new  LecturerCourseComparator());
			return newCourse;
	}

	@Override
	public Integer getCount() {
		return courses.size();
	}

	@Override
	public List<Course> getLecturerDate(Date date1, Date date2) {
		List<Course> newCourse = new ArrayList<>();
		for(Course course : courses ){
			if(date1.after(course.getDateStart())&&date2.after(course.getDateStart())){
				newCourse.add(course);
			}
		}
		return newCourse;
	}

}
