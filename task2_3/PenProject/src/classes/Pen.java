package classes;

import interfaces.IProduct;
import interfaces.IProductPart;

public class Pen implements IProduct {
	
	IProductPart firstPart;
	IProductPart secondPart;
	IProductPart thirdPart;
	

	public Pen() {

		System.out.println(this.toString()+" created!!!");
		
		
	}

	@Override
	public void installFirstPart(IProductPart productPart) {
		firstPart = productPart;
		System.out.println(firstPart.toString()+ " installed.");
	}

	@Override
	public void installSecondPart(IProductPart productPart) {
		secondPart = productPart;
		System.out.println(secondPart.toString()+ " installed.");

	}

	@Override
	public void installThirdPart(IProductPart productPart) {
		thirdPart = productPart;
		System.out.println(thirdPart.toString()+ " installed.");

	}
	
	@Override
	public String toString() {

		return "PEN";
	}

}
