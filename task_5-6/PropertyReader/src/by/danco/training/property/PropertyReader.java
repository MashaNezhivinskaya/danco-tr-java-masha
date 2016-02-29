package by.danco.training.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	private static PropertyReader propertyReader;
	private Properties properties;
	private FileInputStream fileInputStream;
	
	private PropertyReader() {
		
		properties = new Properties();
		File file = new File("prop.txt");

		try {
			fileInputStream = new FileInputStream(file);
			properties.load(fileInputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
	public static PropertyReader getInstance(){
		if (propertyReader == null) {
			propertyReader = new PropertyReader();
		}
		return propertyReader;	
	}

	public int getMaxStudentsCount(){
		String number = properties.getProperty("maxStudent");
		int value = 0;
		try{
			value = Integer.parseInt(number);
		} catch (Exception e) {

		}
		return value;
}
	
	
	
	

}
