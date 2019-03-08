package sample.Model;


public class Film extends Produksjon implements Comparable<Film> {


    public Film(String tittel, String spilleTid, String beskrivelse, String utgivelsesDato, String regisør ) {
        super(tittel, spilleTid, beskrivelse, utgivelsesDato, regisør);
    }

    public Film(String filmTittel, String filmSpilleTid, String filmBeskrivelse, String filmDato) {
        super(filmTittel, filmSpilleTid, filmBeskrivelse, filmDato);
    }

    public String getTittel(){return super.getTittel();}

    public String getRegisør() {
        return super.getRegisør();
    }


    public String getUtgivelsesDato() {
        return super.getUtgivelsesDato();
    }


    public String getBeskrivelse() {
        return super.getBeskrivelse();
    }


    public String getSpilleTid() {
        return super.getSpilleTid();
    }






    @Override
    public String toString(){
        return (super.getTittel());
        //+ "\n" + "Spilletid: " + super.getSpilleTid() + " min" + "\n" + "Beskrivelse: " + super.getBeskrivelse() + "\n" + "Utgivelsesdato: " + super.getUtgivelsesDato() + "\n" + "Regisør: " + super.getRegisør());
    }

    @Override
    public int compareTo(Film tittelForskjell) {
        return this.getTittel().toLowerCase().compareTo(tittelForskjell.getTittel().toLowerCase());
    }
}
