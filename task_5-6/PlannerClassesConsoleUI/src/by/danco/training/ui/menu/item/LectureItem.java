package by.danco.training.ui.menu.item;

import java.util.Date;

import by.danco.training.facade.api.IFacade;
import by.danco.training.modal.Lecture;
import by.danco.training.ui.console.reader.ConsoleReader;
import by.danco.training.ui.console.writer.WriterForEntity;
import by.danco.training.ui.menu.Menu;
import by.danco.training.ui.menu.item.abstr.AbstractItem;

public class LectureItem extends AbstractItem{

	public LectureItem(Menu menu, IFacade facade) {
		super("Create Lecture", menu, facade);
	}

	@Override
	public Menu doWork() {
		try{
			String name = ConsoleReader.getLectureName();
			Date date = ConsoleReader.getLectureDate();
			facade.saveLecture(new Lecture(name, date));
				WriterForEntity.writeSuccessMessage("Lecture has been created.");
		}catch (Exception e){
			WriterForEntity.writeErrorMessage("Technical error.");
		}
		return this.menu;
	}

	

}
