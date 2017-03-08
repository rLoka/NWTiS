/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.nwtis;

import java.util.Enumeration;
import java.util.Properties;
import org.foi.nwtis.kgrlic.konfiguracije.Konfiguracija;
import org.foi.nwtis.kgrlic.konfiguracije.KonfiguracijaApstraktna;
import org.foi.nwtis.kgrlic.konfiguracije.NeispravnaKonfiguracija;
import org.foi.nwtis.kgrlic.konfiguracije.NemaKonfiguracije;

/**
 *
 * @author grupa_3
 */
public class Vjezba_03_4 {

    public static void main(String args[]) throws NemaKonfiguracije, NeispravnaKonfiguracija {
        /*
        1 argument: ispisuje se sadržaj konfiguracijske datoteke tj. nazivi i vrijednosti svih postavki
        2 argumenta: ispisuje se vrijednost upisane postavke iz konfiguracijske datoteke
        3 argumenata: kreira se (ako ne postoji) ili ažurira upisana postavka s pridruženom vrijednosti u konfiguracijskoj datoteci
         */
        switch (args.length) {
            case 1:
                Konfiguracija konfiguracija = KonfiguracijaApstraktna.preuzmiKonfiguraciju(args[0]);
                Properties postavke = konfiguracija.dajSvePostavke();
                for (Enumeration e = postavke.keys(); e.hasMoreElements();){
                    String k = (String) e.nextElement();                    
                }
                break;
            case 2:
                Konfiguracija konfiguracija = KonfiguracijaApstraktna.preuzmiKonfiguraciju(args[0]);
                break;
            case 3:
                System.out.print("Nije dobro!");
                break;
            default:
                break;
        }
    }
}
