package org.foi.nwtis.kgrlic;

import org.foi.nwtis.kgrlic.kvadrati.*;

public class Vjezba_02_1 {

	public static void main(String args[]) {
		if(args.length != 3) {
			System.out.println("Broj argumenta ne odgovara");		
		}
		
		int odBroja = Integer.parseInt(args[0]);
		int doBroja = Integer.parseInt(args[1]);

		int vrsta = Integer.parseInt(args[2]);
		Kvadrati kvad = null;
		NeparniKvadrati_3 kvad_2 = null;
		Ispisivac_1 kvad_3 = null;
		Ispisivac_2 kvad_4 = null;
		
		switch(vrsta) {
		case 0:
			kvad = new Kvadrati(odBroja, doBroja);
			kvad.ispis();
			break;

		case 1:
			kvad = new NeparniKvadrati_1(odBroja, doBroja);
			kvad.ispis();
			break;

		case 2:
			kvad = new NeparniKvadrati_2(odBroja, doBroja);
			kvad.ispis();
			break;

		case 3:
			kvad_2 = new NeparniKvadrati_3(odBroja, doBroja);
			kvad_2.ispisiPodatke();
			break;

		case 4:
			kvad_3 = new NeparniKvadrati_3(odBroja, doBroja);
			kvad_3.ispisiPodatke();
			break;

		case 5:
			kvad_4 = new NeparniKvadrati_4(odBroja, doBroja);
			kvad_4.ispisiPodatkeLinijski();
			break;

		case 6:
			kvad = new NeparniKvadrati_4(odBroja, doBroja);
			kvad.ispis();
			break;

		case 7:
			kvad_3 = new NeparniKvadrati_4(odBroja, doBroja);
			kvad_3.ispisiPodatke();
			break;


		case 8:
			kvad_4 = new NeparniKvadrati_4(odBroja, doBroja);
			kvad_4.ispisiPodatkeLinijski();
			break;

		case 9:
			for(int i = 0; i < 10; i++){
				try{
					Ispisivac_1 kvad_5 = NeparniKvadrati_5.kreirajIspisivac_1(odBroja, doBroja);
					kvad_5.ispisiPodatke();
					System.out.println(kvad_5.getClass().getName());
				}
				catch (Exception e){
					i--;
					continue;
				}
			}	
			break;
		case 10:
			kvad_3 = new KolkoDretvi();
			kvad_3.ispisiPodatke();
			break;

		default:
			System.out.println("Argumenti ne odgovaraju");
		}
			
	}
}
		
		
