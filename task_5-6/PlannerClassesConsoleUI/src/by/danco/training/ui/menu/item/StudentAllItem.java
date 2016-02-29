package by.danco.training.ui.menu.item;


import java.util.List;

import by.danco.training.facade.api.IFacade;
import by.danco.training.modal.Student;
import by.danco.training.ui.console.writer.WriterForEntity;
import by.danco.training.ui.menu.Menu;
import by.danco.training.ui.menu.item.abstr.AbstractItem;

public class StudentAllItem extends AbstractItem{

	public StudentAllItem(Menu menu, IFacade facade) {
		super("All student:", menu, facade);
	}

	@Override
	public Menu doWork() {
		try {
			List<Student> students = facade.getAllStudent();
			WriterForEntity.writeListStudents(students);
		} catch (Exception e) {
			WriterForEntity.writeErrorMessage("Technical error.");
		}
		return this.menu;
	}

}
