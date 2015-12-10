package product.part;

import interfaces.IProductPart;

public class Spring implements IProductPart {
	
	public Spring() {
		System.out.println(this.toString()+" created.");
	}	
	
	@Override
	public String toString() {
		return "SPRING";
	}
}
