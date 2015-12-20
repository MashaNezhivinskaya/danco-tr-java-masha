package by.danco.training.dao.impl;

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

}
