package org.foi.nwtis.kgrlic.kvadrati;

public class Kvadrati {
	protected int odBroja;
	protected int doBroja;
	
	public Kvadrati(int odBroja, int doBroja) {
		this.odBroja = odBroja;
		this.doBroja = doBroja;
	}
	
	public void ispis() {
		for(int i=this.odBroja;i <= this.doBroja;i++) {
			System.out.printf("%3d * %3d = %3d\n", i, i, i*i);
		}
	}
}
