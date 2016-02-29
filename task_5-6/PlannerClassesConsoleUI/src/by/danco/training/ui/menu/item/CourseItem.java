package by.danco.training.ui.menu.item;

import java.util.Date;

import by.danco.training.facade.api.IFacade;
import by.danco.training.modal.Course;
import by.danco.training.ui.console.reader.ConsoleReader;
import by.danco.training.ui.console.writer.WriterForEntity;
import by.danco.training.ui.menu.Menu;
import by.danco.training.ui.menu.item.abstr.AbstractItem;

public class CourseItem extends AbstractItem{

	public CourseItem(Menu menu, IFacade facade) {
		super("Create course", menu, facade);
	}

	@Override
	public Menu doWork() {
		try{
			String name = ConsoleReader.getNameCourse();
			Date dateStart = ConsoleReader.getStartDateCourse();
			Date dateStop = ConsoleReader.getStopDateCourse();
			Integer countStudent = ConsoleReader.getCountStudent();
			Integer countLecture = ConsoleReader.getCountLecture();
			String section = ConsoleReader.getSection();
			facade.saveCourse(new Course(countStudent, countLecture, name,dateStart,dateStop,section));
				WriterForEntity.writeSuccessMessage("Lecture has been created.");
		}catch (Exception e){
			WriterForEntity.writeErrorMessage("Technical error.");
		}
		return this.menu;
	}

}
