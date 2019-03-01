package no.hiof.oliverl.Tvserie;

public class Rolle {
    private String rolleNavn;
    private String rolleEtternavn;
    private Person skuespiller;


    public Rolle(String rolleNavn, String rolleEtternavn, Person skuespiller) {
        this.rolleNavn = rolleNavn;
        this.rolleEtternavn = rolleEtternavn;
        this.skuespiller = skuespiller;
    }

    public String getRolleNavn() {
        return rolleNavn;
    }

    public void setRolleNavn(String rolleNavn) {
        this.rolleNavn = rolleNavn;
    }

    public String getRolleEtternavn() {
        return rolleEtternavn;
    }

    public void setRolleEtternavn(String rolleEtternavn) {
        this.rolleEtternavn = rolleEtternavn;
    }

    public Person getSkuespiller() {
        return skuespiller;
    }

    public void setSkuespiller(Person skuespiller) {
        this.skuespiller = skuespiller;
    }

    @Override
    public String toString(){
        return ("Rollenavn: " + rolleNavn + "\n" + "Rolle etternavn: " + rolleEtternavn + "\n" + "\n" + skuespiller + "\n" + "*******************" +"\n");
    }
}
