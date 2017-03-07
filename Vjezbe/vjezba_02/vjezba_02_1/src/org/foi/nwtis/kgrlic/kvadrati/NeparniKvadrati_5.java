package org.foi.nwtis.kgrlic.kvadrati;

public class NeparniKvadrati_5 {
	protected int odBroja;
	protected int doBroja;
	
	public NeparniKvadrati_5(int odBroja, int doBroja) {
		this.odBroja = odBroja;
		this.doBroja = doBroja;
	}

	public static Ispisivac_1 kreirajIspisivac_1(int odBroja, int doBroja){
		Ispisivac_1 ispisivac_1 = null;  
		switch((int) System.currentTimeMillis()%3){
			
			case 0:
				ispisivac_1 = new NeparniKvadrati_3(odBroja, doBroja);
				break;
			
			case 1:
				ispisivac_1 = new NeparniKvadrati_4(odBroja, doBroja);
				break;

			case 2:
				ispisivac_1 = new KolikoJeSati();
				break;

		}
		
		return ispisivac_1;

	}
}
