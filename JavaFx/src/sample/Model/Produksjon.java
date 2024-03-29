package sample.Model;

import java.util.ArrayList;

public abstract class Produksjon {
    private String tittel;
    private String spilleTid;
    private String beskrivelse;
    private String utgivelsesDato;
    private String regisør;
    private ArrayList<Rolle> rolle = new ArrayList<>();



    public Produksjon(String tittel, String spilleTid, String beskrivelse, String utgivelsesDato, String regisør) {
        this.tittel = tittel;
        this.spilleTid = spilleTid;
        this.beskrivelse = beskrivelse;
        this.utgivelsesDato = utgivelsesDato;
        this.regisør = regisør;

    }

    public Produksjon(String tittel, String spilleTid, String beskrivelse, String utgivelsesDato) {
        this.tittel = tittel;
        this.spilleTid = spilleTid;
        this.beskrivelse = beskrivelse;
        this.utgivelsesDato = utgivelsesDato;
    }

    public ArrayList<Rolle> getRolle(){
        return rolle;
    }
    public String getRegisør(){
        return regisør;
    }
    public void setRegisør(){
        this.regisør = regisør;
    }

    public String getTittel(){return tittel;}

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public String getSpilleTid() {
        return spilleTid;
    }

    public void setSpilleTid(String spilleTid) {
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
