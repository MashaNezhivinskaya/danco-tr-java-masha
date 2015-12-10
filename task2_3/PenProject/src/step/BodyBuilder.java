package step;

import product.part.Body;
import interfaces.ILineStep;
import interfaces.IProductPart;

public class BodyBuilder implements ILineStep {

   
	public BodyBuilder() {
		System.out.println(this.toString()+" creating.");
	}

	@Override
	public IProductPart buildProductPart() {
		return new Body();
	}
	
	@Override
	public String toString() {

		return "BODY_BUILDER";
	}

}
