package by.danco.trainig.comparator;

import java.util.Comparator;

import by.danco.training.modal.Lecture;

public class DateLectureComparator implements Comparator<Lecture>{

	@Override
	public int compare(Lecture o1, Lecture o2) {
		return o1.getDate().compareTo(o2.getDate());
	}

}
