package by.danco.training.ui.menu.item;

import by.danco.training.facade.api.IFacade;
import by.danco.training.ui.console.reader.ConsoleReader;
import by.danco.training.ui.console.writer.WriterForEntity;
import by.danco.training.ui.menu.Menu;
import by.danco.training.ui.menu.item.abstr.AbstractItem;

public class AddStudentToCourseItem extends AbstractItem{
	
	public AddStudentToCourseItem( Menu menu, IFacade facade) {
		super("Add student to course", menu, facade);
	}

	@Override
	public Menu doWork() {
		try{
			Long idStudent = ConsoleReader.parseLong("Input id student");
			Long idCourse = ConsoleReader.parseLong("Input id course");
			facade.addStudentInCourse(idCourse, idStudent);;
				WriterForEntity.writeSuccessMessage("Student added in Course.");
		}catch (Exception e){
			WriterForEntity.writeErrorMessage("Technical error.");
		}
		return this.menu;
	}

}
