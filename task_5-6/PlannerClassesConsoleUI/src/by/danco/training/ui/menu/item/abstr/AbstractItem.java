package by.danco.training.ui.menu.item.abstr;

import by.danco.training.facade.api.IFacade;
import by.danco.training.ui.menu.Menu;

public abstract class AbstractItem {
	
	protected String name;
	protected IFacade facade;
	protected Menu menu;
	
	protected AbstractItem(String name, Menu menu, IFacade facade) {
		this.name = name;
		this.facade = facade;
		this.menu = menu;
	}
	
	protected AbstractItem(String name, Menu menu) {
		this.name = name;
		this.menu = menu;
	}
	
	public abstract Menu doWork();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IFacade getFacade() {
		return facade;
	}

	public void setFacade(IFacade facade) {
		this.facade = facade;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	
	

}
