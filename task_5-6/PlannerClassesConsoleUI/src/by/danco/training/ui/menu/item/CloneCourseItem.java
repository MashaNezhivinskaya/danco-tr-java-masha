package by.danco.training.ui.menu.item;
import by.danco.training.facade.api.IFacade;
import by.danco.training.ui.console.reader.ConsoleReader;
import by.danco.training.ui.console.writer.WriterForEntity;
import by.danco.training.ui.menu.Menu;
import by.danco.training.ui.menu.item.abstr.AbstractItem;

public class CloneCourseItem extends AbstractItem{

	public CloneCourseItem( Menu menu, IFacade facade) {
		super("Clone Course", menu, facade);
	}

	@Override
	public Menu doWork() {
		try{
			Long id = ConsoleReader.parseLong("Input id");
			facade.cloneCourse(id);
				WriterForEntity.writeSuccessMessage("Course has been cloned.");
				WriterForEntity.writerCourse(facade.cloneCourse(id));
		}catch (Exception e){
			WriterForEntity.writeErrorMessage("Technical error.");
		}
		return this.menu;
	}

}
