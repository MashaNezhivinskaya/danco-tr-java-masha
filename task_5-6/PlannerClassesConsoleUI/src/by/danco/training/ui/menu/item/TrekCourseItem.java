package by.danco.training.ui.menu.item;

import by.danco.training.ui.menu.Menu;
import by.danco.training.ui.menu.item.abstr.AbstractItem;

public class TrekCourseItem extends AbstractItem{

	public TrekCourseItem(Menu menu) {
		super(menu.getNameMenu(), menu);
	}

	@Override
	public Menu doWork() {
		return this.menu;
	}

}
