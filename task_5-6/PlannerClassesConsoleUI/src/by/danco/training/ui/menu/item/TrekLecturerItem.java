package by.danco.training.ui.menu.item;

import by.danco.training.ui.menu.Menu;
import by.danco.training.ui.menu.item.abstr.AbstractItem;

public class TrekLecturerItem extends AbstractItem{

	public TrekLecturerItem(Menu menu) {
		super(menu.getNameMenu(), menu);
	}

	@Override
	public Menu doWork() {
		return this.menu;
	}

}
