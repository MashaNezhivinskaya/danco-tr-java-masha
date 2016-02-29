package by.danco.training.ui.menu.item;

import by.danco.training.facade.api.IFacade;
import by.danco.training.modal.Student;
import by.danco.training.ui.console.reader.ConsoleReader;
import by.danco.training.ui.console.writer.WriterForEntity;
import by.danco.training.ui.menu.Menu;
import by.danco.training.ui.menu.item.abstr.AbstractItem;

public class StudentItem extends AbstractItem{
	
	public StudentItem(Menu menu, IFacade facade) {
		super("Create student.", menu, facade);
	}

	@Override
	public Menu doWork() {
		try{
			String name = ConsoleReader.getStudentName();
			String lastname = ConsoleReader.getStudentLastName();
			String specialty = ConsoleReader.getStudentSpecialty();
			facade.saveStudent(new Student(name, lastname,specialty));
				WriterForEntity.writeSuccessMessage("Student has been created.");
		}catch (Exception e){
			WriterForEntity.writeErrorMessage("Technical error.");
		}
		return this.menu;
	}


}
