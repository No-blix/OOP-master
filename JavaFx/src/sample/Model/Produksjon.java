package sample.Model;

import java.util.ArrayList;

public class Produksjon {
    private String tittel;
    private double spilleTid;
    private String beskrivelse;
    private String utgivelsesDato;
    private Person regisør;
    private ArrayList<Rolle> rolle = new ArrayList<>();



    public Produksjon(String tittel, double spilleTid, String beskrivelse, String utgivelsesDato, Person regisør) {
        this.tittel = tittel;
        this.spilleTid = spilleTid;
        this.beskrivelse = beskrivelse;
        this.utgivelsesDato = utgivelsesDato;
        this.regisør = regisør;

    }

    public ArrayList<Rolle> getRolle(){
        return rolle;
    }
    public Person getRegisør(){
        return regisør;
    }
    public void setRegisør(){
        this.regisør = regisør;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public double getSpilleTid() {
        return spilleTid;
    }

    public void setSpilleTid(double spilleTid) {
        this.spilleTid = spilleTid;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public String getUtgivelsesDato() {
        return utgivelsesDato;
    }

    public void setUtgivelsesDato(String utgivelsesDato) {
        this.utgivelsesDato = utgivelsesDato;
    }
    public void LeggTilEnRolle(Rolle enRolle) {
        rolle.add(enRolle);
    }
    public void LeggTilMangeRoller(ArrayList<Rolle> flereRoller){
        rolle.addAll(flereRoller);
    }

}
