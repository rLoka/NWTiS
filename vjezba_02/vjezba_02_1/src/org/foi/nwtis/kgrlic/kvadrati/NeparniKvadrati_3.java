package org.foi.nwtis.kgrlic.kvadrati;

public class NeparniKvadrati_3 extends NeparniKvadrati_2 implements Ispisivac_1 {
	protected int odBroja;
	protected int doBroja;
	
	public NeparniKvadrati_3(int odBroja, int doBroja) {
		super(odBroja, doBroja);
		this.odBroja = odBroja;
		this.doBroja = doBroja;
	}

	public void ispisiPodatke(){
		this.ispis();
	}

	
	public void ispis() {
		for(int i=this.odBroja;i <= this.doBroja;i += 4) {
			if(i%2 == 1){
				System.out.printf("%3d * %3d = %3d\n", i, i, i*i);
			}			
		}
	}
}
