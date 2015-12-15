package number;

public class CalculateController {
	
	private Operation operation = new Operation();
	
	public int getValue(Integer first,Integer second,Integer thierd){
		
		int resultCombination = operation.combinationTwoNumber(first, second);
		int result = operation.delete(resultCombination, thierd);
		return result;
		
		
	}

}
