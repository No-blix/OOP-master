package sample.Model;

public class Valuta {
    private String country, countryCode, valutaCode;
    private double valuta;

    public Valuta(String country, String countryCode, String valutaCode, double valuta) {
        this.country = country;
        this.countryCode = countryCode;
        this.valutaCode = valutaCode;
        this.valuta = valuta;
    }

    public double getValuta() {
        return valuta;
    }

    public void setValuta(double valuta) {
        this.valuta = valuta;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getValutaCode() {
        return valutaCode;
    }

    public void setValutaCode(String valutaCode) {
        this.valutaCode = valutaCode;
    }

}

