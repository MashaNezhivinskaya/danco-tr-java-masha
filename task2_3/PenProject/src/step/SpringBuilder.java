package step;

import product.part.Spring;
import interfaces.ILineStep;
import interfaces.IProductPart;

public class SpringBuilder implements ILineStep {

	
	public SpringBuilder() {
		System.out.println(this.toString()+" creating.");
	}

	@Override
	public IProductPart buildProductPart() {
		return new Spring();
	}
	
	
	@Override
	public String toString() {

		return "SPRING_BUILDER";
	}

}
