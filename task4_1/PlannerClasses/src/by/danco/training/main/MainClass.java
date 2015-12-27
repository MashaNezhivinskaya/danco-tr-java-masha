package by.danco.training.main;

import java.util.Date;

import by.danco.training.converter.ReadConverter;
import by.danco.training.converter.SaveConverter;
import by.danco.training.dao.api.ICourseDao;
import by.danco.training.dao.api.ILectureDao;
import by.danco.training.dao.api.ILecturerDao;
import by.danco.training.dao.api.IStudentDao;
import by.danco.training.dao.impl.CourseDaoImpl;
import by.danco.training.dao.impl.LectureDaoImpl;
import by.danco.training.dao.impl.LecturerDaoImpl;
import by.danco.training.dao.impl.StudentDaoImpl;
import by.danco.training.modal.Course;
import by.danco.training.modal.Lecture;
import by.danco.training.modal.Lecturer;
import by.danco.training.modal.Student;
import by.danco.training.service.api.ICourseService;
import by.danco.training.service.api.ILectureService;
import by.danco.training.service.api.ILecturerService;
import by.danco.training.service.api.IStudentService;
import by.danco.training.service.impl.CourseServiceImpl;
import by.danco.training.service.impl.LectureServiceImpl;
import by.danco.training.service.impl.LecturerServiceImpl;
import by.danco.training.service.impl.StudentServiceImpl;

public class MainClass {

	public static void main(String[] args) {
//	Student student = new Student((long) 1,"Vova","Ivanov","spec");
//	Lecture lecture = new Lecture((long) 10, "leccia1", new Date());
//	Lecturer lecturer = new Lecturer((long) 1, "lector", "ffgf", "dfdgdg");
//	Course course = new Course(2, 20, (long) 3, "Course", new Date(), new Date(), "fgfgfg");
//	
//	course.setLecturer(lecturer);
//	course.setStudent(student);
//	course.setLecture(lecture);
//	
//	Course[] courses = new Course[123];
//	Student[] students = new Student[123];
//	Lecturer[] lecturers = new Lecturer[123];
//	Lecture[] lectures = new Lecture[123];
//	
//	
//	ICourseDao cd = new CourseDaoImpl(courses);
//	IStudentDao sd = new StudentDaoImpl(students);
//	ILectureDao ld = new LectureDaoImpl(lectures);
//	ILecturerDao led =new LecturerDaoImpl(lecturers);
//	
//	ICourseService cs =new CourseServiceImpl(cd);
//	IStudentService ss = new StudentServiceImpl(sd);
//	ILectureService ls = new LectureServiceImpl(ld);
//	ILecturerService les = new LecturerServiceImpl(led);
//	
//	cs.addRecord(course);
//	ss.addRecord(student);
//	ls.addRecord(lecture);
//	les.addRecord(lecturer);
//	
//	SaveConverter sc = new SaveConverter();
//	sc.save(cs, ls, les, ss);
	
	ReadConverter readConverter = new ReadConverter();
	readConverter.readData();
		
	}

}
