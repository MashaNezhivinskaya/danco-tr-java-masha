package by.danco.training.ui.menu;

import java.util.ArrayList;
import java.util.List;

import by.danco.training.ui.menu.item.abstr.AbstractItem;

public class Menu {

	protected String nameMenu;
	protected List<AbstractItem> items;

	public Menu(String nameMenu) {
		this.nameMenu = nameMenu;
		this.items = new ArrayList<AbstractItem>();
	}

	public void addItem(AbstractItem item) {
		items.add(item);
	}

	public AbstractItem getIndexMenu(int number) {
		
		if (number > 0 && items.size() >= number) {
			return items.get(number-1);
		}
		return null;
	}

	public String getNameMenu() {
		return nameMenu;
	}

	public void setNameMenu(String nameMenu) {
		this.nameMenu = nameMenu;
	}

	public List<AbstractItem> getItems() {
		return items;
	}

	public void setItems(List<AbstractItem> items) {
		this.items = items;
	}

}
