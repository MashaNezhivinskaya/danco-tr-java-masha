package by.danco.training.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import by.danco.training.dao.api.ICourseDao;
import by.danco.training.dao.api.ILectureDao;
import by.danco.training.dao.api.ILecturerDao;
import by.danco.training.dao.api.IStudentDao;
import by.danco.training.dao.impl.CourseDaoImpl;
import by.danco.training.dao.impl.LectureDaoImpl;
import by.danco.training.dao.impl.LecturerDaoImpl;
import by.danco.training.dao.impl.StudentDaoImpl;

import com.danco.training.TextFileWorker;

import by.danco.training.modal.Course;
import by.danco.training.modal.Lecture;
import by.danco.training.modal.Lecturer;
import by.danco.training.modal.Student;

public class ReadConverter {
	
	private IStudentDao studentDao = new StudentDaoImpl(new ArrayList<>()); 
	private ILecturerDao lecturerDao = new LecturerDaoImpl(new ArrayList<>()); 
	private ILectureDao lectureDao = new LectureDaoImpl(new ArrayList<>()); 
	private ICourseDao courseDao = new CourseDaoImpl(new ArrayList<>()); 
	private TextFileWorker textFileWorker= new TextFileWorker("e:/test.txt");;
	
	
	
	public ReadConverter(String pathFileWorker) {
		this.textFileWorker = new TextFileWorker(pathFileWorker);
	}

	private Student readStudent(String string)
	{
		
		String[] str = string.split("[;]");
		Student student = new Student(str[2],str[1],str[3]);
		return student;
	}
	
	private void convertStudents(String[] line)
	{
		for (int i=1; i<line.length-1; i++)
		{
			Student student = readStudent(line[i]);
			studentDao.addRecord(student);
		}
	}
	
	private Lecturer readLecturer(String string)
	{
		String[] str = string.split("[;]");
		Lecturer lecturer = new Lecturer(str[2],str[1],str[3]);
		return lecturer;
	}
	
	private void convertLecturers(String[] line)
	{
		for (int i=1; i<line.length-1; i++)
		{
			Lecturer lecturer = readLecturer(line[i]);
			lecturerDao.addRecord(lecturer);
		}
	}
	
	private Lecture readLecture(String string)
	{
		String[] str = string.split("[;]");
		Lecture lecture = new Lecture(str[1],new Date(Integer.parseInt(str[2].split("[-]")[0]),Integer.parseInt(str[2].split("[-]")[1]),Integer.parseInt(str[2].split("[-]")[2])));
		return lecture;
	}
	
	private void convertLectures(String[] line)
	{
		for (int i=1; i<line.length-1; i++)
		{
			Lecture lecture = readLecture(line[i]);
			lectureDao.addRecord(lecture);
		}
	}
	
	private Course readCourse(String string)
	{
		String[] str = string.split("[;]");
		Course course = new Course(Integer.parseInt(str[4]),Integer.parseInt(str[3]),str[1],new Date(Integer.parseInt(str[6].split("[-]")[0]),Integer.parseInt(str[6].split("[-]")[1]),Integer.parseInt(str[6].split("[-]")[2])),new Date(Integer.parseInt(str[7].split("[-]")[0]),Integer.parseInt(str[7].split("[-]")[1]),Integer.parseInt(str[7].split("[-]")[2])),str[2]);
		course.setLecturer(lecturerDao.getRecordById(Long.parseLong(str[5])));
		String[] students = str[8].trim().split("[ ]");
		for(int i=0;i<students.length;i++){
			if(students[i]!=null){
				course.setStudent(studentDao.getRecordById(Long.parseLong(students[i])));
			}
		}
		String[] lectures = str[9].trim().split("[ ]");
		for(int i=0;i<lectures.length;i++){
			if(lectures[i]!=null){
				course.setLecture(lectureDao.getRecordById(Long.parseLong(lectures[i])));
			}
		}

		return course;
	}
	
	private void convertCourses(String[] line)
	{
		for (int i=1; i<line.length-1; i++)
		{
			Course course = readCourse(line[i]);
			courseDao.addRecord(course);
		}
	}
	
	public int findStringPosition(String[] strings, String string, int start)
	{
		for (int i=start; i<strings.length; i++)
		{
			if (strings[i].equals(string))
			{
				return i;
			}
		}
		return -1;
	}
	
	public void readData(){
		
		String[] data = textFileWorker.readFromFile();
		
		
		int studentsStartIndex = findStringPosition(data, "students:{",0);
		int studentsEndIndex = findStringPosition(data, "}",0);
		convertStudents(Arrays.copyOfRange(data, studentsStartIndex, studentsEndIndex+1));
		
		int lectionsStartIndex  = findStringPosition(data, "lectures:{",0);
		int lectionsEndIndex = findStringPosition(data, "}",lectionsStartIndex);
		convertLectures(Arrays.copyOfRange(data, lectionsStartIndex, lectionsEndIndex+1));
		
		
		int lecturersStartIndex = findStringPosition(data, "lecturers:{",0);
		int lecturersEndIndex = findStringPosition(data, "}",lecturersStartIndex);
		convertLecturers(Arrays.copyOfRange(data, lecturersStartIndex, lecturersEndIndex+1));
		
	
		int coursesStartIndex = findStringPosition(data, "course:{",0);
		int coursesEndIndex = findStringPosition(data, "}",coursesStartIndex);	
		convertCourses(Arrays.copyOfRange(data, coursesStartIndex, coursesEndIndex+1));
		
	}	
	

}
