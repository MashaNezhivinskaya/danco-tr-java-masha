package by.danco.training.dao.impl;

import java.util.List;

import by.danco.training.dao.api.IStudentDao;
import by.danco.training.modal.Student;

public class StudentDaoImpl implements IStudentDao {
	
	
	private List<Student> students;
	static private long ID =1;
	
	
	public StudentDaoImpl(List<Student> students) {
		this.students = students;
	}
	
	public StudentDaoImpl() {
		
	}

	@Override
	public void addRecord(Student student) {
		student.setId(ID);
		ID++;
		students.add(student);

	}

	@Override
	public void deleteRecord(Student student) {
		students.remove(student);

	}

	@Override
	public void updateRecord(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public Student getRecordById(Long id) {
		Student findStudent = null;
		for(Student student : students){ 
			if(student.getId()== id){
				findStudent = student;}
		}
		return findStudent;
	}
	
	@Override
	public List<Student> getAll() {
		return students;
	}

	@Override
	public Integer getCount() {
		return students.size();
	}

}
