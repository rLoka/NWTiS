package org.foi.nwtis.kgrlic.kvadrati;

public class NeparniKvadrati_2 extends Kvadrati {
	protected int odBroja;
	protected int doBroja;
	
	public NeparniKvadrati_2(int odBroja, int doBroja) {
		super(odBroja, doBroja);
		this.odBroja = odBroja;
		this.doBroja = doBroja;
	}
	
	public void ispis() {
		for(int i=this.odBroja;i <= this.doBroja;i += 4) {
			if(i%2 == 1){
				System.out.printf("%3d * %3d = %3d\n", i, i, i*i);
			}			
		}
	}
}
