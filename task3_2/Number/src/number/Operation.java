package number;

public class Operation  {



	public int combinationTwoNumber(Integer firstNumber,Integer secondNumber){
		String stringNumber = firstNumber.toString()+secondNumber.toString();
		return Integer.parseInt(stringNumber);
	}
	

	public int delete (int firstNumber,int secondNumber){
		return firstNumber-secondNumber;
	}
	

}
