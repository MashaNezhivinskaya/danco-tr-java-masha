package by.danco.trainig.comparator;

import java.util.Comparator;

import by.danco.training.modal.Lecturer;

public class NameLecturerComparator implements Comparator<Lecturer>{

	@Override
	public int compare(Lecturer o1, Lecturer o2) {
		return o1.getNameLecturer().compareTo(o2.getNameLecturer());
	}

}
