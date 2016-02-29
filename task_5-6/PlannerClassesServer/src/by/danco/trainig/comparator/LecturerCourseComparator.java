package by.danco.trainig.comparator;

import java.util.Comparator;

import by.danco.training.modal.Course;

public class LecturerCourseComparator implements Comparator<Course>{

	@Override
	public int compare(Course o1, Course o2) {
		return o1.getLecturer().getNameLecturer().compareTo(o2.getLecturer().getNameLecturer());
	}

}
