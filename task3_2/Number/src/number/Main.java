package number;

import java.util.Random;

public class Main {
	
	static final int MAX=1000;
	static final int MIN=100;

	public static void main(String[] args) {
		Random random = new Random();
		
		Integer first = random.nextInt(MAX - MIN) + MIN;
		Integer second = random.nextInt(MAX - MIN) + MIN;
		Integer thierd =random.nextInt(MAX - MIN) + MIN;
		
		System.out.println("first="+first);
		System.out.println("second="+second);
		System.out.println("thierd="+thierd);
		
		Operation operation = new Operation();
		
		int resultCombination = operation.combinationTwoNumber(first, second);
		System.out.println("resultCombination="+resultCombination);
		
		int combination = operation.combination(first, second);
		System.out.println("combination="+combination);
		
		int result = operation.delete(resultCombination, thierd);
		
		System.out.println("result="+result);
		

	}

}
