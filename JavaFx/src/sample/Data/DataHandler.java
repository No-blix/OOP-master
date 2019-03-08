package sample.Data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.Model.Film;

public class DataHandler {

    private final static ObservableList<Film> filmListe = FXCollections.observableArrayList();

    public static ObservableList<Film> hentFilmData() {
        if (filmListe.isEmpty()) {
            genererFilmData();
        }

        return filmListe;
    }

    private static void genererFilmData() {


        filmListe.add(new Film("Shawshank Redemtion (1995)", "142 min", "Frihetens regn (originaltittel: " +
                "The Shawshank Redemption) er en amerikansk dramafilm fra 1994, skrevet og regissert av Frank Darabont " +
                "og basert på novellen Rita Hayworth and Shawshank Redemption av Stephen King. Hovedrollene innehas av Tim Robbins (Andy Dufresne) og Morgan Freeman (Ellis Redding).\n" +
                "\n" +
                "Filmen skildrer hovedsakelig Andys liv i fengsel etter at han er dømt for mordet på sin hustru og hennes elsker, til tross for at han hevder å være uskyldig.", "6. januar 1995", "En person"));

        filmListe.add(new Film("Saving private Ryan (1998)", "170 min", "Redd menig Ryan (orig. Saving Private Ryan) er en amerikansk drama- og krigsfilm fra 1998 regissert og produsert av Steven Spielberg. " +
                "Filmens handling er satt til invasjonen av Normandie i andre verdenskrig. Filmen er spesielt kjent for de første tyve minuttene som omhandler landgangen på Omaha Beach på D-dagen. Etter det handler den om jakten på en" +
                " menig fra den amerikanske 101st Airborne Division. Denne soldaten er menig James Francis Ryan fra Iowa i USA.", "9. oktober 1998", "En person"));

    }

    public static void leggTilFilm(Film film) {
        filmListe.add(film);
    }
}





