package by.danco.training.ui.menu.item;

import by.danco.training.ui.menu.Menu;
import by.danco.training.ui.menu.item.abstr.AbstractItem;

public class TrekLectureItem extends AbstractItem{

	public TrekLectureItem(Menu menu) {
		super(menu.getNameMenu(), menu);
	}

	@Override
	public Menu doWork() {
		return this.menu;
	}

}
