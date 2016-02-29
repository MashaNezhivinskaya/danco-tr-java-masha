package by.danco.training.ui.menu.item;

import by.danco.training.facade.api.IFacade;

import by.danco.training.ui.console.reader.ConsoleReader;
import by.danco.training.ui.console.writer.WriterForEntity;
import by.danco.training.ui.menu.Menu;
import by.danco.training.ui.menu.item.abstr.AbstractItem;

public class StudentGetIdItem extends AbstractItem{

	public StudentGetIdItem(Menu menu, IFacade facade) {
		super("Get student by Id", menu, facade);
	}

	@Override
	public Menu doWork() {
		try{
			Long id = ConsoleReader.parseLong("Input id:");
				WriterForEntity.writerStudent(facade.getStudentById(id));
		}catch (Exception e){
			WriterForEntity.writeErrorMessage("Technical error.");
		}
		return this.menu;
	}
	

}
