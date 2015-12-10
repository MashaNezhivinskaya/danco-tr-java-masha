package product.part;

import interfaces.IProductPart;

public class Kernel implements IProductPart {
	
	public Kernel() {
		System.out.println(this.toString()+" created.");
	}
	
	@Override
	public String toString() {
		return "KERNEL";
	}

}
