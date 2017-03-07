package org.foi.nwtis.kgrlic.kvadrati;

import java.util.Date;

public class KolikoJeSati implements Ispisivac_1 {

	public void ispisiPodatke(){
		Date date = new Date();
		System.out.print(date.getTime());
	}
}
