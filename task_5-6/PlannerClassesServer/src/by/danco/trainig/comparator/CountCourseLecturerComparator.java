package by.danco.trainig.comparator;

import java.util.Comparator;

import by.danco.training.modal.Lecturer;

public class CountCourseLecturerComparator implements Comparator<Lecturer>{

	@Override
	public int compare(Lecturer o1, Lecturer o2) {
		return Integer.compare(o1.getCourses().size(), o2.getCourses().size());
	}

}
