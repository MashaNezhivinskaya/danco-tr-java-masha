package product.part;

import interfaces.IProductPart;

public class Body implements IProductPart {

	
	public Body() {
		System.out.println(this.toString()+" created.");
	}

	@Override
	public String toString() {
		return "BODY";
	}

}
