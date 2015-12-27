package by.danco.training.dao.impl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

import by.danco.trainig.comparator.CountStudentCourseComparator;
import by.danco.trainig.comparator.CourseDateStartComparator;
import by.danco.trainig.comparator.CourseNameComparator;
import by.danco.trainig.comparator.LecturerCourseComparator;
import by.danco.trainig.comparator.SectionCoureComparator;
import by.danco.training.dao.api.ICourseDao;
import by.danco.training.modal.Course;

public class CourseDaoImpl implements ICourseDao {
	
	private Course[] courses;

	public CourseDaoImpl(Course[] courses) {
		this.courses = courses;
	}

	@Override
	public void addRecord(Course course) {
		courses[getIndexNull()] = course;
	
	}

	@Override
	public void deleteRecord(Course course) {
		courses[getIndexForId(course.getId())] = null;

	}

	@Override
	public void updateRecord(Course course) {
		// TODO Auto-generated method stub

	}

	@Override
	public Course getRecordById(Long id) {
		return courses[getIndexForId(id)];
	}
	
	private int getIndexNull(){
		for(int i=0;i<courses.length;i++)
		{if(courses[i]==null){
			return i;
		}}
		return -1;
	}
	
	private int getIndexForId(Long id){
		for(int i=0;i<courses.length;i++)
		{
			if(courses[i]==null){
				continue;
			}
			if(courses[i].getId()==id){
				return i;
			}
			
		}
		return -1;
		
	}

	@Override
	public Course[] getAll() {
		return courses;
	}

	@Override
	public Course[] sortName() {
	    Arrays.sort(courses, new CourseNameComparator());
		return courses;
	}

	@Override
	public Course[] sortDateStart() {
		  Arrays.sort(courses, new CourseDateStartComparator());
			return courses;
	}

	@Override
	public Course[] sortCountStudent() {
		  Arrays.sort(courses, new CountStudentCourseComparator());
			return courses;
	}

	@Override
	public Course[] sortSection() {
		  Arrays.sort(courses, new SectionCoureComparator());
			return courses;
	}

	@Override
	public Course[] sortLecturer() {
		  Arrays.sort(courses, new LecturerCourseComparator());
			return courses;
	}

	@Override
	public Course[] sortNameStart() {
		Arrays.sort(courses, new CourseNameComparator());
		Course[] course = new Course[courses.length];
		int y=0;
		for(int i=0;i<courses.length;i++){
			if(new Date().after(courses[i].getDateStart())){
				course[y]=courses[i];
				y++;
			}
		}
		return course;
	}

	@Override
	public Course[] sortStartDateStart() {
		Arrays.sort(courses, new CourseDateStartComparator());
		 Course[] course = new Course[courses.length];
			int y=0;
			for(int i=0;i<courses.length;i++){
				if(new Date().after(courses[i].getDateStart())){
					course[y]=courses[i];
					y++;
				}
			}
		return course;
	}

	@Override
	public Course[] sortCountStudentStart() {
		Arrays.sort(courses, new CountStudentCourseComparator());
		  Course[] course = new Course[courses.length];
			int y=0;
			for(int i=0;i<courses.length;i++){
				if(new Date().after(courses[i].getDateStart())){
					course[y]=courses[i];
					y++;
				}
			}
		return course;
	}

	@Override
	public Course[] sortSectionStart() {
		Arrays.sort(courses, new SectionCoureComparator());
		  Course[] course = new Course[courses.length];
			int y=0;
			for(int i=0;i<courses.length;i++){
				if(new Date().after(courses[i].getDateStart())){
					course[y]=courses[i];
					y++;
				}
			}
		return course;
	}

	@Override
	public Course[] sortLecturerStart() {
		 Arrays.sort(courses, new LecturerCourseComparator());
		  Course[] course = new Course[courses.length];
			int y=0;
			for(int i=0;i<courses.length;i++){
				if(new Date().after(courses[i].getDateStart())){
					course[y]=courses[i];
					y++;
				}
			}
		return course;
	}

	@Override
	public Course[] sortNameDate(Date date) {
		Arrays.sort(courses, new CourseNameComparator());
		Course[] course = new Course[courses.length];
		int y=0;
		for(int i=0;i<courses.length;i++){
			if(date.after(courses[i].getDateStart())){
				course[y]=courses[i];
				y++;
			}
		}
		return course;
	}

	@Override
	public Course[] sorttDateStartDate(Date date) {
		 Arrays.sort(courses, new CourseDateStartComparator());
		 Course[] course = new Course[courses.length];
			int y=0;
			for(int i=0;i<courses.length;i++){
				if(date.after(courses[i].getDateStart())){
					course[y]=courses[i];
					y++;
				}
			}
		return course;
	}

	@Override
	public Course[] sortCountStudentDate(Date date) {
		  Arrays.sort(courses, new CountStudentCourseComparator());
		  Course[] course = new Course[courses.length];
			int y=0;
			for(int i=0;i<courses.length;i++){
				if(date.after(courses[i].getDateStart())){
					course[y]=courses[i];
					y++;
				}
			}
		return course;
	}

	@Override
	public Course[] sortSectionDate(Date date) {
		  Arrays.sort(courses, new SectionCoureComparator());
		  Course[] course = new Course[courses.length];
			int y=0;
			for(int i=0;i<courses.length;i++){
				if(date.after(courses[i].getDateStart())){
					course[y]=courses[i];
					y++;
				}
			}
		return course;
	}

	@Override
	public Course[] sortLecturerDate(Date date) {
		  Arrays.sort(courses, new LecturerCourseComparator());
		  Course[] course = new Course[courses.length];
			int y=0;
			for(int i=0;i<courses.length;i++){
				if(date.after(courses[i].getDateStart())){
					course[y]=courses[i];
					y++;
				}
			}
		return course;
	}

	@Override
	public Integer getCount() {
		return courses.length;
	}

	@Override
	public Course[] getLecturerDate(Date date1, Date date2) {
		Course[] course = new Course[courses.length];
		int y=0;
		for(int i=0;i<courses.length;i++){
			if(date1.after(courses[i].getDateStart())&&date2.after(courses[i].getDateStart())){
				course[y]=courses[i];
				y++;
			}
		}
		return course;
	}

}
