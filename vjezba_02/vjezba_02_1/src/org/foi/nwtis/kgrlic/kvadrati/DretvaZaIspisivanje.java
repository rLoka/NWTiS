package org.foi.nwtis.kgrlic.kvadrati;

import java.util.concurrent.ThreadLocalRandom;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DretvaZaIspisivanje extends Thread{
	String naziv;
	int brojPonavljanja;

	public DretvaZaIspisivanje(String naziv){
		super();
		this.naziv = naziv;
	}

	public void start(){
		this.brojPonavljanja = ThreadLocalRandom.current().nextInt(1, 20 + 1);
		super.start();
	}


	public void run(){	
		for(int i = 0; i < this.brojPonavljanja; i++){
			System.out.println(naziv);
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
			Date date = new Date();
			System.out.println(simpleDateFormat.format(date));
			try {
			    Thread.sleep((int)ThreadLocalRandom.current().nextInt(100, 1000 + 1));
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}			
		}

	}
}
