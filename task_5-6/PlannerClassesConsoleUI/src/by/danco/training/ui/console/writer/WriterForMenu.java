package by.danco.training.ui.console.writer;

import java.util.List;

import by.danco.training.ui.menu.Menu;
import by.danco.training.ui.menu.item.abstr.AbstractItem;

public class WriterForMenu {
	
	public static void getMenu(Menu menu){
		
		System.out.println("MenuName:"+ menu.getNameMenu());
		
		List<AbstractItem> items = menu.getItems();
		
		for(int i=0; i<items.size(); i++){
			System.out.println(i+1+")"+items.get(i).getName());
		}
	}

}
