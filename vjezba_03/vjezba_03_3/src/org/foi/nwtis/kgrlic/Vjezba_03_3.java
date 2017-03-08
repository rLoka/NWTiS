package org.foi.nwtis.kgrlic;

import org.foi.nwtis.kgrlic.konfiguracije.Konfiguracija;
import org.foi.nwtis.kgrlic.konfiguracije.KonfiguracijaApstraktna;
import org.foi.nwtis.kgrlic.konfiguracije.NeispravnaKonfiguracija;
import org.foi.nwtis.kgrlic.konfiguracije.NemaKonfiguracije;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author grupa_3
 */
public class Vjezba_03_3 {
    public static void main(String args[]){
        if(args.length != 1){
            System.out.print("Nije dobro!");
        }    
        try {
            Konfiguracija konfiguracija = KonfiguracijaApstraktna.kreirajKonfiguraciju(args[0]);
        } catch (NeispravnaKonfiguracija | NemaKonfiguracije e) {
        }
    }   
}
