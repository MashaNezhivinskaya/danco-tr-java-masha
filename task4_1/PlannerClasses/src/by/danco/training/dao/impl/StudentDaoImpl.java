package by.danco.training.dao.impl;

import by.danco.training.dao.api.IStudentDao;
import by.danco.training.modal.Student;

public class StudentDaoImpl implements IStudentDao {
	
	private Student[] students;

	@Override
	public void addRecord(Student student) {
		students[getIndexNull()] = student;

	}

	@Override
	public void deleteRecord(Student student) {
		students[getIndexForId(student.getId())] = null;

	}

	@Override
	public void updateRecord(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public Student getRecordById(Long id) {
		 return students[getIndexForId(id)];
	}
	
	private int getIndexNull(){
		for(int i=0;i<students.length;i++)
		{if(students[i]==null){
			return i;
		}}
		return -1;
	}
	
	private int getIndexForId(Long id){
		for(int i=0;i<students.length;i++)
		{
			if(students[i]==null){
				continue;
			}
			if(students[i].getId()==id){
				return i;
			}
			
		}
		return -1;
		
	}

	@Override
	public Student[] getAll() {
		return students;
	}

}
