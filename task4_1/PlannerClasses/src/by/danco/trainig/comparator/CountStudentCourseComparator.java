package by.danco.trainig.comparator;

import java.util.Comparator;

import by.danco.training.modal.Course;

public class CountStudentCourseComparator implements Comparator<Course>{

	@Override
	public int compare(Course o1, Course o2) {
		return Integer.compare(o1.getCOUNT_STUDENT(), o2.getCOUNT_STUDENT());
	}

}
