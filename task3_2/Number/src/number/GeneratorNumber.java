package number;

import java.util.Random;

public class GeneratorNumber {
	
	static final int MAX=1000;
	static final int MIN=100;
	
	public int createNumber(){
		Random random = new Random();
		Integer number= random.nextInt(MAX - MIN) + MIN;
		System.out.println("Create number: "+number);
		return number;
		
	}

}
