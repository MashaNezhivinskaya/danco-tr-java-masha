package by.danco.trainig.comparator;

import java.util.Comparator;

import by.danco.training.modal.Course;

public class SectionCoureComparator implements Comparator<Course>{

	@Override
	public int compare(Course o1, Course o2) {
		return o1.getSection().compareTo(o2.getSection());
	}
	
	

}
