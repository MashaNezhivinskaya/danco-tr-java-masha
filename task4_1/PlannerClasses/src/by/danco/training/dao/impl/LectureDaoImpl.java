package by.danco.training.dao.impl;

import by.danco.training.dao.api.ILectureDao;
import by.danco.training.modal.Lecture;

public class LectureDaoImpl implements ILectureDao {
	
	private Lecture[] lectures;
	
	public LectureDaoImpl(Lecture[] lectures) {
		super();
		this.lectures = lectures;
	}

	@Override
	public void addRecord(Lecture lecture) {
		lectures[getIndexNull()] = lecture;

	}

	@Override
	public void deleteRecord(Lecture lecture) {
		lectures[getIndexForId(lecture.getId())] = null;

	}

	@Override
	public void updateRecord(Lecture lecture) {
		// TODO Auto-generated method stub

	}

	@Override
	public Lecture getRecordById(Long id) {
	    return lectures[getIndexForId(id)];
	}
	
	private int getIndexNull(){
		for(int i=0;i<lectures.length;i++)
		{if(lectures[i]==null){
			return i;
		}}
		return -1;
	}
	
	private int getIndexForId(Long id){
		for(int i=0;i<lectures.length;i++)
		{
			if(lectures[i]==null){
				continue;
			}
			if(lectures[i].getId()==id){
				return i;
			}
			
		}
		return -1;
		
	}

	@Override
	public Lecture[] getAll() {
		return lectures;
	}

}
