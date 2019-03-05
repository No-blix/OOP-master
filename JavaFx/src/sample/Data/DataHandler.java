package sample.Data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.Model.Film;

import java.util.ArrayList;

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


            filmListe.add(new Film("Shawshank Redemtion (1995)", "142 min", "Beskrivelse for film 1", "02.02.02", "En person"));

            filmListe.add(new Film("Saving private Ryan (1998)", "170 min", "Beskrivelse for film 2", "dato", "En person"));

        }





}




