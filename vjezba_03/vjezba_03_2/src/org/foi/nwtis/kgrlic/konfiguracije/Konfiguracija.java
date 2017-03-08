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
public interface Konfiguracija {

    public void ucitajKonfiguraciju() throws NemaKonfiguracije, NeispravnaKonfiguracija;

    public void ucitajKonfiguraciju(String datoteka) throws NemaKonfiguracije, NeispravnaKonfiguracija;

    public void spremiKonfiguraciju() throws NemaKonfiguracije, NeispravnaKonfiguracija;

    public void spremiKonfiguraciju(String datoteka) throws NemaKonfiguracije, NeispravnaKonfiguracija;

    public void dodajKonfiguraciju(Properties postavke);

    public void kopirajKonfiguraciju(Properties postavke);

    public Properties dajSvePostavke();

    public boolean obrisiSvePostavke();

    public String dajPostavku(String postavka);

    public boolean spremiPostavku(String postavka, String vrijednost);

    public boolean azurirajPostavku(String postavka, String vrijednost);

    public boolean postojiPostavka(String postavka);

    public boolean obrisiPostavku(String postavka);

}
