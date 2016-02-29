package by.danco.training.ui.main;

import by.danco.training.facade.impl.FacadeImpl;
import by.danco.training.modal.Course;
import by.danco.training.modal.Lecture;
import by.danco.training.modal.Lecturer;
import by.danco.training.modal.Student;
import by.danco.training.ui.builder.MenuBuilder;
import by.danco.training.ui.controller.UIController;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		UIController controller = new UIController();
		MenuBuilder menuBuilder = new MenuBuilder(new FacadeImpl());
		controller.run(menuBuilder.createMenu());
	}

}
