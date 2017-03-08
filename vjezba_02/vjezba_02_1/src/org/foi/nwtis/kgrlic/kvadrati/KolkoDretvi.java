package org.foi.nwtis.kgrlic.kvadrati;

import java.util.concurrent.ThreadLocalRandom;

public class KolkoDretvi implements Ispisivac_1 {

	int brojDretvi;

	public void ispisiPodatke(){
		this.brojDretvi = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		for(int i = 0; i < this.brojDretvi; i++){
			DretvaZaIspisivanje dretvaZaIspisivanje = new DretvaZaIspisivanje("kgrlic_" + i);
			dretvaZaIspisivanje.start();
		}
	}
}
