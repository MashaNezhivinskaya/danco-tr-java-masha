package by.danco.trainig.comparator;

import java.util.Comparator;
import java.util.stream.Collector;

import by.danco.training.modal.Course;

public class CourseNameComparator implements Comparator<Course>{

	@Override
	public int compare(Course o1, Course o2) {
		return o1.getNameCourse().compareTo(o2.getNameCourse());
	}
	
	

}
