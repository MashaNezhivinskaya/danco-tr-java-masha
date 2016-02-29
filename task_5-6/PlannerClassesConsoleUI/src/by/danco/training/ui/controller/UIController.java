package by.danco.training.ui.controller;

import by.danco.training.ui.console.reader.ConsoleReader;
import by.danco.training.ui.console.writer.WriterForMenu;
import by.danco.training.ui.menu.Menu;
import by.danco.training.ui.menu.item.abstr.AbstractItem;

public class UIController {

	public UIController() {
		
	}

	public void run(Menu currentMenu){
		AbstractItem currentMenuItem = null;
		int indexItem = 0;
		while(currentMenu != null){
			WriterForMenu.getMenu(currentMenu);
			indexItem = getIndexItem();	
			
			currentMenuItem = currentMenu.getIndexMenu(indexItem);
			if (currentMenuItem == null){
				continue;
			}
			
			currentMenu = currentMenuItem.doWork();
		}
	}
	
	public int getIndexItem() {
		return ConsoleReader.getMenuMode();
	}

}
