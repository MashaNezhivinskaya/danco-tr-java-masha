package by.danco.training.ui.console.writer;

import java.util.List;

import by.danco.training.modal.Course;
import by.danco.training.modal.Lecture;
import by.danco.training.modal.Lecturer;
import by.danco.training.modal.Student;

public class WriterForEntity {
	
	public static void writerCourse(Course course){
		
		System.out.println("Course");
		System.out.println("____________________");
		System.out.println("Id:" + course.getId());
		System.out.println("Name course:" + course.getNameCourse());
		System.out.println("Count lecture:" + course.getCOUNT_LECTURE());
		System.out.println("Count student:" + course.getCOUNT_STUDENT());
		System.out.println("Start date:" + course.getDateStart().getDay() + "." + course.getDateStart().getMonth() + "." + course.getDateStart().getYear());
		System.out.println("Finish date:" + course.getDateStop().getDay() + "." + course.getDateStop().getMonth() + "." + course.getDateStop().getYear());
	}
	
	public static void writeListCourses(List<Course>courses){
		
		for(Course course : courses){
			writerCourse(course);
		}
	}
	
	public static void writerLecture(Lecture lecture){
		
		System.out.println("Lecture");
		System.out.println("____________________");
		System.out.println("Id:" + lecture.getId());
		System.out.println("Name lecture:" + lecture.getNameLecture());
		System.out.println("Date lecture:" + lecture.getDate().getDay() + "." + lecture.getDate().getMonth() + "." + lecture.getDate().getYear());
	}
	
   public static void writeListLectures(List<Lecture>lectures){
		
		for(Lecture lecture : lectures){
			writerLecture(lecture);
		}
	}
	
	public static void writerLecturer(Lecturer lecturer){
		
		System.out.println("Lecturer");
		System.out.println("____________________");
		System.out.println("Id:" + lecturer.getId());
		System.out.println("FirstName lecturer:" + lecturer.getNameLecturer());
		System.out.println("LastName lecturer:" + lecturer.getFirstNameLecturer());
		System.out.println("Specialization lecturer:" + lecturer.getSpecialization());
	}
	
	public static void writeListLecturers(List<Lecturer>lecturers){
		
		for(Lecturer lecturer : lecturers){
			writerLecturer(lecturer);
		}
	}
	
	public static void writerStudent(Student student){
		
		System.out.println("Student");
		System.out.println("____________________");
		System.out.println("Id:" + student.getId());
		System.out.println("FirstName student:" + student.getNameStudent());
		System.out.println("LastName student:" + student.getFirstNameStudent());
		System.out.println("Speciality student:" + student.getSpecialty());
	}
	
	public static void writeListStudents(List<Student>students){
		
		for(Student student : students){
			writerStudent(student);
		}
	}
	
	public static void writeErrorMessage(String message){
		
		System.out.println("Error message:" + message);
	}
	
	public static void writeSuccessMessage(String message){
		
		System.out.println(message);
	}
	
}
