package step;

import product.part.Kernel;
import interfaces.ILineStep;
import interfaces.IProductPart;

public class KernelBuilder implements ILineStep {

	
	public KernelBuilder() {
		System.out.println(this.toString()+" creating.");
	}

	@Override
	public IProductPart buildProductPart() {
		
		return new Kernel();
	}
	

	@Override
	public String toString() {

		return "KERNEL_BUILDER";
	}


}
