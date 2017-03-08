/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.nwtis.kgrlic.konfiguracije;

import java.util.Properties;

/**
 *
 * @author grupa_3
 */
public abstract class KonfiguracijaApstraktna implements Konfiguracija {

    String datoteka;
    Properties postavke;

    public KonfiguracijaApstraktna(String datoteka) {
    }

    @Override
    public void ucitajKonfiguraciju() throws NemaKonfiguracije, NeispravnaKonfiguracija {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ucitajKonfiguraciju(String datoteka) throws NemaKonfiguracije, NeispravnaKonfiguracija {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void spremiKonfiguraciju() throws NemaKonfiguracije, NeispravnaKonfiguracija {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void spremiKonfiguraciju(String datoteka) throws NemaKonfiguracije, NeispravnaKonfiguracija {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dodajKonfiguraciju(Properties postavke) {
        this.postavke.putAll(postavke);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void kopirajKonfiguraciju(Properties postavke) {
        this.postavke.clear();
        this.dodajKonfiguraciju(postavke);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Properties dajSvePostavke() {
        return this.postavke;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean obrisiSvePostavke() {
        if (this.postavke.isEmpty()) {
            return false;
        }
        this.postavke.clear();
        return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String dajPostavku(String postavka) {
        return this.postavke.getProperty(postavka);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean spremiPostavku(String postavka, String vrijednost) {
        if (this.postojiPostavka(postavka)) {
            return false;
        } else {
            this.postavke.setProperty(postavka, vrijednost);
            return true;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean azurirajPostavku(String postavka, String vrijednost) {
        if (!this.postojiPostavka(postavka)) {
            return false;
        } else {
            this.postavke.setProperty(postavka, vrijednost);
            return true;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean postojiPostavka(String postavka) {
        return this.postavke.contains(postavka);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean obrisiPostavku(String postavka) {
        if (!this.postojiPostavka(postavka)) {
            return false;
        } else {
            this.postavke.remove(postavka);
            return true;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static Konfiguracija kreirajKonfiguraciju(String datoteka) throws NemaKonfiguracije, NeispravnaKonfiguracija{
        if(datoteka == null || datoteka.length() == 0){
            throw new NeispravnaKonfiguracija("Naziv neispravan!");
        }
        
        Konfiguracija konfiguracija;
        
        if(datoteka.toLowerCase().endsWith(".txt")){
            konfiguracija = null;
        }
        else if(datoteka.toLowerCase().endsWith(".txt")){
            konfiguracija = null;
        }
        else{
            konfiguracija = null;
        }
        
        return konfiguracija;
    }
    //; - kreira praznu konfiguraciju na bazi ekstenzije datoteke. Ako datoteka ima ekstenziju .xml onda se koristi klasa KonfiguracijaXML, ako je .txt onda je KonfiguracijaTxt, inače KonfiguracijaBin. Metoda se kasnije implementira do kraja (nakon što se završe podklase).  Ako ne postoji datoteka izbacuje se iznimka NemaKonfiguracije, ako nije poznata konfiguracija izbacuje se iznimka NeispravnaKonfiguracija.
    //public static Konfiguracija preuzmiKonfiguraciju(String datoteka) throws NemaKonfiguracije, NeispravnaKonfiguracija{}// - vraća konfiguraciju na bazi ekstenzije datoteke. Ako datoteka ima ekstenziju .xml onda se koristi klasa KonfiguracijaXML, inače KonfiguracijaTxt. Metoda se kasnije implementira do kraja (nakon što se završe podklase). Ako ne postoji datoteka izbacuje se iznimka NemaKonfiguracije, ako nije poznata konfiguracija izbacuje se iznimka NeispravnaKonfiguracija.

}
