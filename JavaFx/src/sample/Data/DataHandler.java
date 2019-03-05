package sample.Data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.Model.Film;

public class DataHandler {

    private final static ObservableList<Film> filmListe = FXCollections.observableArrayList();


    {

    }

    public static ObservableList<Film> hentFilmData() {
        if(filmListe.isEmpty()){
            genererFilmData();}

            return filmListe;

        }


        private static void genererFilmData() {


            filmListe.add(new Film("ShawHank Redemtion (1995)", "142 min", "beskrivelse", "02.02.02", "En person"));

            filmListe.add(new Film("Saving private Ryan (1998)", "170 min", "Beskrivelse", "dato", "En person"));

        }



}




