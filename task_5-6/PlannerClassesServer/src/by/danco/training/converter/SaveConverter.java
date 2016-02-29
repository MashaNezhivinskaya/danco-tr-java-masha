package by.danco.training.converter;

import java.text.SimpleDateFormat;


import java.util.List;

import com.danco.training.TextFileWorker;

import by.danco.training.modal.Course;
import by.danco.training.modal.Lecture;
import by.danco.training.modal.Lecturer;
import by.danco.training.modal.Student;
import by.danco.training.service.api.ICourseService;
import by.danco.training.service.api.ILectureService;
import by.danco.training.service.api.ILecturerService;
import by.danco.training.service.api.IStudentService;

public class SaveConverter {
	
	private TextFileWorker textFileWorker;
	
	
	public SaveConverter(String pathFileWorker) {
		this.textFileWorker = new TextFileWorker(pathFileWorker);
	}

	private String[] convertStudents(List<Student> studens){
		
		String[] result = new String[studens.size()+2];
		result[0]="students:{";
		int y=1;
		for(Student student : studens){
			if(student!=null){
				result[y]=convertStudent(student);
				y++;
			}
		}
		result[studens.size()+1]="}";
		return result;
		
	}
	
	private String convertStudent(Student student){
		StringBuilder st = new StringBuilder();
		st.append(student.getId());
		st.append(';');
		st.append(student.getFirstNameStudent());
		st.append(';');
		st.append(student.getNameStudent());
		st.append(';');
		st.append(student.getSpecialty());
		
		return st.toString();
	}
	
	private String[] convertLectures(List<Lecture> lectures){
		
		String[] result = new String[lectures.size()+2];
		result[0]="lectures:{";
		int y=1;
		for(Lecture lecture : lectures){
			if(lecture!=null){
				result[y]=convertLecture(lecture);
				y++;
			}
		}
		result[lectures.size()+1]="}";
		return result;
		
	}
	
	private String convertLecture(Lecture lecture){
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		StringBuilder st = new StringBuilder();
		st.append(lecture.getId());
		st.append(';');
		st.append(lecture.getNameLecture());
		st.append(';');
		st.append(format1.format(lecture.getDate()));
		
		return st.toString();
	}
	
	private String[] convertLecturers(List<Lecturer> lecturers){
		
		String[] result = new String[lecturers.size()+2];
		result[0]="lecturers:{";
		int y=1;
		for(Lecturer lecturer : lecturers){
			if(lecturer!=null){
				result[y]=convertLecturer(lecturer);
				y++;
			}
		}
		result[lecturers.size()+1]="}";
		return result;
		
	}
	
	private String convertLecturer(Lecturer lecturer){
		
		StringBuilder st = new StringBuilder();
		st.append(lecturer.getId());
		st.append(';');
		st.append(lecturer.getFirstNameLecturer());
		st.append(';');
		st.append(lecturer.getNameLecturer());
		st.append(';');
		st.append(lecturer.getSpecialization());
		st.append(';');
		st.append(lecturer.getSpecialization());
		for(Course course : lecturer.getCourses())
		{
			if (course != null)
			{
				st.append(" ");
				st.append(course.getId());
			}
		}
		
		return st.toString();
	}
	
	private String[] convertCourses(List<Course> courses){
		
		String[] result = new String[courses.size()+2];
		result[0]="course:{";
		int y=1;
		for(Course course : courses){
			if(course!=null){
				result[y]=convertCourse(course);
				y++;
			}
		}
		result[courses.size()+1]="}";
		return result;
		
	}
	
	private String convertCourse(Course course){
		
		StringBuilder st = new StringBuilder();
		st.append(course.getId());
		st.append(';');
		st.append(course.getNameCourse());
		st.append(';');
		st.append(course.getSection());
		st.append(';');
		st.append(course.getCOUNT_LECTURE());
		st.append(';');
		st.append(course.getCOUNT_STUDENT());
		st.append(';');
		st.append(course.getLecturer().getId());
		st.append(';');
		
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		st.append(format1.format(course.getDateStart()));
		st.append(';');
		st.append(format1.format(course.getDateStop()));
		st.append(';'); 
		
		for(Student student : course.getStudents())
		{
			if (student != null)
			{
				st.append(" ");
				st.append(student.getId());
			}
		}
		st.append(';');
		for(Lecture lecture : course.getLectures())
		{
			if (lecture != null)
			{
				st.append(" ");
				st.append(lecture.getId());
			}
		}
		
		return st.toString();
	}
	
	public void save(ICourseService courseService, ILectureService lectureService, ILecturerService lecturerService, IStudentService studentService ){
		
		String[] data = new String[1000];
		
		System.arraycopy(convertStudents(studentService.getAll()), 0, data, 0, studentService.getAll().size()+2);
		
		System.arraycopy(convertLectures(lectureService.getAll()), 0, data, studentService.getAll().size()+2, lectureService.getAll().size()+2);
		
		System.arraycopy(convertLecturers(lecturerService.getAll()), 0, data, studentService.getAll().size()+lectureService.getAll().size()+4, lecturerService.getAll().size()+2);
		
		System.arraycopy(convertCourses(courseService.getAll()), 0, data, studentService.getAll().size()+lectureService.getAll().size()+lecturerService.getAll().size()+6, courseService.getAll().size()+2);
		
		textFileWorker.writeToFile(deleteNull(data));
	}
	
	private String[] deleteNull(String[] data){
		
		int count=0;
		for(String line:data){
			if(line!=null){
				count++;
			}
				
		}
		String[] newData = new String[count];
		int i = 0;
		for(String line:data){
			if(line!=null){
				newData[i]=line;
				i++;
			}
		}
		return newData;
	}
	
	

}
