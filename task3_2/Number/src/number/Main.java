package number;

public class Main {
	
	public static void main(String[] args) {
		GeneratorNumber number = new GeneratorNumber();
		
		Integer first = number.createNumber();
		Integer second = number.createNumber();
		Integer thierd =number.createNumber();
		
				
		CalculateController calculate = new CalculateController();
		
		Integer result =calculate.getValue(first, second, thierd);
		
		System.out.println("Result= "+result);		

	}

}
