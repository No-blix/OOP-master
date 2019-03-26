package sample.Model;

import javafx.collections.ObservableList;
import sample.Controller.ValutaOversiktController;

import java.util.Comparator;

public class Valuta {
    private String country, countryCode, valutaCode;
    private double valuta;


    public Valuta(String country, String countryCode, String valutaCode, double valuta) {
        this.country = country;
        this.countryCode = countryCode;
        this.valutaCode = valutaCode;
        this.valuta = valuta;
    }

    public Valuta(double valuta) {
        this.valuta = valuta;
    }

    public Valuta(String countryCode) {
        this.countryCode = countryCode;
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


    public static ObservableList<Valuta> sortertListen(ObservableList<Valuta> liste, boolean stigende){
        if(stigende == true){
            liste.sort(new Comparator<Valuta>() {
                @Override
                public int compare(Valuta oldValue, Valuta newValue) {
                    return oldValue.getCountry().compareTo(newValue.getCountry());
                }
            });
        }
        else if(stigende == false){
            liste.sort(new Comparator<Valuta>() {
                @Override
                public int compare(Valuta oldValue, Valuta newValue) {
                    return newValue.getCountry().compareTo(oldValue.getCountry());
                }
            });
        }
        return liste;
    }
    public static ObservableList<Valuta> sorterKode(ObservableList<Valuta> liste, boolean stigende){
        if(stigende == true){
            liste.sort(new Comparator<Valuta>() {
                @Override
                public int compare(Valuta oldCode, Valuta newCode) {
                    return oldCode.getCountryCode().compareTo(newCode.getCountryCode());
                }
            });
        }
        else if(stigende == false){
            liste.sort(new Comparator<Valuta>() {
                @Override
                public int compare(Valuta o1dCode, Valuta newCode) {
                    return newCode.getCountryCode().compareTo(o1dCode.getCountryCode());
                }
            });
        }
        return liste;
    }
}

