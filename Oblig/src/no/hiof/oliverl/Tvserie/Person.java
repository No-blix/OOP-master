package no.hiof.oliverl.Tvserie;

public class Person {
    private String navn;
    private String etterNavn;
    private int alder;



    public Person(String navn, String etterNavn, int alder, String regFor) {
        this.navn = navn;
        this.etterNavn = etterNavn;
        this.alder = alder;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getEtterNavn() {
        return etterNavn;
    }

    public void setEtterNavn(String etterNavn) {
        this.etterNavn = etterNavn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }
    @Override
    public String toString(){
        return ("\n" + "Navn: " + navn + "\n" + "Etternavn: " + etterNavn + "\n" + "Alder: " + alder  + "\n");
    }

}
