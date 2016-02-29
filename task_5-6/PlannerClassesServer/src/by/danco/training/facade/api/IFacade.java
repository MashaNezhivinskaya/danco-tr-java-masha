package by.danco.training.facade.api;

import java.util.Date;
import java.util.List;

import by.danco.training.modal.Course;
import by.danco.training.modal.Lecture;
import by.danco.training.modal.Lecturer;
import by.danco.training.modal.Student;

public interface IFacade {
	
//course
	public void saveCourse(Course course);
	
	public void removeCourse(Course course);
	
	public void addLecturerInCourse(Course course, Lecturer lecturer);
	
	public void addLectureInCourse(Course course, Lecture lecture);
	
	public void addStudentInCourse(Long courseId, Long studentId);
	
	public void removeLectureInCourse(Course course, Lecture lecture);
	
	public void removeStudentInCourse(Course course, Student student);
	
	public Course getCourseById(Long id);
	
	public List<Course> getAllCourse();

	public List<Course> sortNameCourse();

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

	public Integer getCountCourse();

	public List<Course> getLecturerDate(Date date1, Date date2);
	
	public Course cloneCourse(Long idCourse);
	
//lecture
	
	public void saveLecture(Lecture lecture);
	
	public void removeCourse(Lecture lecture);
	
	public Lecture getLecturedById(Long id);

	public List<Lecture> getAllLecture();

	public List<Lecture> sortDate();

	public List<Lecture> sortNameLecture();

	public List<Lecture> getLectureDate(Date data);
	
//lecturer
	
	public void saveLecturer(Lecturer lecturer);
	
	public void removeCourse(Lecturer lecturer);

	public Lecturer getLecturerdById(Long id);

	public List<Lecturer> getAllLecturer();

	public List<Lecturer> sortNameLecturer();

	public List<Lecturer> sortCountCourse();

	public Integer getCountLecturer();
	
//student
	
	public void saveStudent(Student student);
	
	public void removeCourse(Student student);

	public Student getStudentById(Long id);

	public List<Student> getAllStudent();

	public Integer getCountStudent();
}
