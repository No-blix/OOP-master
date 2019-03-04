package sample.Model;

public class Film extends Produksjon implements Comparable<Film>{


    public Film(String tittel, double spilleTid, String beskrivelse, String utgivelsesDato, String regisør ) {
        super(tittel, spilleTid, beskrivelse, utgivelsesDato, regisør);
    }

    public Person getRegisør() {
        return super.getRegisør();
    }


    public String getUtgivelsesDato() {
        return super.getUtgivelsesDato();
    }


    public String getBeskrivelse() {
        return super.getBeskrivelse();
    }


    public double getSpilleTid() {
        return super.getSpilleTid();
    }


    public String getTittel() {
        return super.getTittel();
    }

    @Override
    public String toString(){
        return ("Tittel: " + super.getTittel() + "\n" + "Spilletid: " + super.getSpilleTid() + " min" + "\n" + "Beskrivelse: " + super.getBeskrivelse() +
                "\n" + "Utgivelsesdato: " + super.getUtgivelsesDato() + "\n" + "Regisør: " + super.getRegisør());
    }

    @Override
    public int compareTo(Film filmTittel) {
        return this.getTittel().toLowerCase().compareTo(filmTittel.getTittel().toLowerCase());
    }
}
