package sample.Model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Episode extends Produksjon implements Comparable<Episode>{
    private int episodeNummer;
    private int sesong;


    public int getSesong(){
        return sesong;
    }


    public Episode(String tittel, String spilleTid, String beskrivelse, String utgivelsesDato, int episodeNummer, int sesong, String regisør) {
        super(tittel, spilleTid, beskrivelse, utgivelsesDato, regisør);
        this.episodeNummer = episodeNummer;
        this.sesong = sesong;
    }

    public int getEpisodeNummer() {
        return episodeNummer;
    }

    public String getRegisør() {
        return super.getRegisør();
    }


    public String getBeskrivelse() {
        return super.getBeskrivelse();
    }


    public String getUtgivelsesDato() {
        return super.getUtgivelsesDato();
    }


    public String getSpilleTid() {
        return super.getSpilleTid();
    }


    public String getTittel() {
        return super.getTittel();
    }

    @Override
    public String toString(){
        return ("EpisodeNummer: " + episodeNummer+ "\n" + "Sesong: " + sesong + "\n" + "Tittel: " + super.getTittel()  + "\n" +
                 "Spilletid: "+ super.getSpilleTid() + "\n" + "Beskrivelse: " + super.getBeskrivelse() + "\n" + "Utgivelses dato: "
                + super.getUtgivelsesDato() + "\n" + "Regisør: " + super.getRegisør() + "\n" + "*********************************" + "\n" + super.getRolle() + "\n");

    }


    @Override
    public int compareTo(Episode episodeForskjell) {
        if(this.getSesong() < this.getEpisodeNummer()){
            return 1;
        }
        else if(this.getSesong() > this.getSesong()){
            return -1;
        }
        else {
            return 0;
        }
    }
}

