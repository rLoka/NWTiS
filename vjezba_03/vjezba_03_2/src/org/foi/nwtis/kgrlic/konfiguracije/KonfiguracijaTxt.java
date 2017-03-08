/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.nwtis.kgrlic.konfiguracije;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author grupa_3
 */
public class KonfiguracijaTxt extends KonfiguracijaApstraktna {

    public KonfiguracijaTxt(String datoteka) {
        super(datoteka);
    }

    @Override
    public boolean obrisiPostavku(String postavka) {
        return super.obrisiPostavku(postavka); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean postojiPostavka(String postavka) {
        return super.postojiPostavka(postavka); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean azurirajPostavku(String postavka, String vrijednost) {
        return super.azurirajPostavku(postavka, vrijednost); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean spremiPostavku(String postavka, String vrijednost) {
        return super.spremiPostavku(postavka, vrijednost); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String dajPostavku(String postavka) {
        return super.dajPostavku(postavka); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean obrisiSvePostavke() {
        return super.obrisiSvePostavke(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Properties dajSvePostavke() {
        return super.dajSvePostavke(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void kopirajKonfiguraciju(Properties postavke) {
        super.kopirajKonfiguraciju(postavke); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dodajKonfiguraciju(Properties postavke) {
        super.dodajKonfiguraciju(postavke); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void spremiKonfiguraciju(String datoteka) throws NemaKonfiguracije, NeispravnaKonfiguracija {
        super.spremiKonfiguraciju(datoteka); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void spremiKonfiguraciju() throws NemaKonfiguracije, NeispravnaKonfiguracija {      
        
        if(this.datoteka == null || this.datoteka.length() == 0){
            throw new NeispravnaKonfiguracija("Naziv neispravan!");
        }
        
        File file = new File(this.datoteka);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            this.postavke.store(fileOutputStream, "NWTIS kgrlic - " + new Date());
        } catch (IOException ex) {
            Logger.getLogger(KonfiguracijaTxt.class.getName()).log(Level.SEVERE, null, ex);
            throw new NemaKonfiguracije("Spremanje datoteke nije uspjelo!");
        }
    }

    @Override
    public void ucitajKonfiguraciju(String datoteka) throws NemaKonfiguracije, NeispravnaKonfiguracija {
        this.datoteka = datoteka;
        this.spremiKonfiguraciju();
    }

    @Override
    public void ucitajKonfiguraciju() throws NemaKonfiguracije, NeispravnaKonfiguracija {
        if(this.datoteka == null || this.datoteka.length() == 0){
            throw new NeispravnaKonfiguracija("Naziv neispravan!");
        }
        
        File file = new File(this.datoteka);

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            this.postavke.load(fileInputStream);
        } catch (IOException ex) {
            Logger.getLogger(KonfiguracijaTxt.class.getName()).log(Level.SEVERE, null, ex);
            throw new NemaKonfiguracije("Ucitavanje datoteke nije uspjelo!");
        }
    } 
    
}
