package number;

public class Operation {

	private static final int NUM = 1000;

	public Operation() {
		
	}
	
	public int combinationTwoNumber(Integer firstNumber,Integer secondNumber){
		String stringNumber = firstNumber.toString()+secondNumber.toString();
		return Integer.parseInt(stringNumber);
	}
	
	public int combination(Integer firstNumber,Integer secondNumber){
		
		return firstNumber*NUM+secondNumber;
	}
	
	public int delete (int firstNumber,int secondNumber){
		return firstNumber-secondNumber;
	}
	

}
