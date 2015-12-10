package classes;

import interfaces.IAssemblyLine;
import interfaces.ILineStep;
import interfaces.IProduct;

public class PenAssemblyLine implements IAssemblyLine {
	
	ILineStep firstBuilder;
	ILineStep secondBuilder;
	ILineStep thirdBuilder;
	
	public PenAssemblyLine(ILineStep firstBuilder, ILineStep secondBuilder, ILineStep thirdBuilder) {
		this.firstBuilder = firstBuilder;
		this.secondBuilder = secondBuilder;
		this.thirdBuilder = thirdBuilder;
		
		System.out.println(this.toString()+" created!");
	}

	@Override
	public IProduct assembleProduct(IProduct product) {
		product.installFirstPart(firstBuilder.buildProductPart());
		product.installSecondPart(secondBuilder.buildProductPart());
		product.installThirdPart(thirdBuilder.buildProductPart());
		System.out.println(product.toString()+" assembled!!!");
		return product;
	}
	
	@Override
	public String toString() {
		return "PEN_ASSEMBLY_LINE";
	}

}
