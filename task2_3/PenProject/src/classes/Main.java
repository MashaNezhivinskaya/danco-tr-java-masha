package classes;

import step.BodyBuilder;
import step.KernelBuilder;
import step.SpringBuilder;
import interfaces.IAssemblyLine;
import interfaces.IProduct;

public class Main {

	public static void main(String[] args) {
		
		IAssemblyLine penAssemblyLine = new PenAssemblyLine(new BodyBuilder(),new SpringBuilder(), new KernelBuilder());
		IProduct pen = penAssemblyLine.assembleProduct(new Pen());

	}

}
