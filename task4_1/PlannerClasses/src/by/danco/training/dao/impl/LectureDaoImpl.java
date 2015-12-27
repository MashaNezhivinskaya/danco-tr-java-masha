package by.danco.training.dao.impl;

import java.util.Arrays;
import java.util.Date;

import by.danco.trainig.comparator.CourseNameComparator;
import by.danco.trainig.comparator.DateLectureComparator;
import by.danco.trainig.comparator.NameLectureComparator;
import by.danco.training.dao.api.ILectureDao;
import by.danco.training.modal.Course;
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

	@Override
	public Lecture[] sortDate() {
		 Arrays.sort(lectures, new DateLectureComparator());
		return lectures;
	}

	@Override
	public Lecture[] sortName() {
		 Arrays.sort(lectures, new NameLectureComparator());
		return lectures;
	}

	@Override
	public Lecture[] getLectureDate(Date data) {
		Lecture[] lecture = new Lecture[lectures.length];
		int y=0;
		for(int i=0;i<lectures.length;i++){
			if(data.equals(lectures[i].getDate())){
				lecture[y]=lecture[i];
				y++;
			}
		}
		return lecture;
	}

}
