package sample.Data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.Model.Film;
import sample.Model.Person;
import sample.Model.*;

import java.util.Random;

public class DataHandler {

    private final static ObservableList<Film> filmListe = FXCollections.observableArrayList();{

    }

    public static ObservableList<Film> hentFilmData(Film filmer) {
        //if (filmListe.isEmpty()) {
            genererFilmData();

            return filmListe;


        }


        private static void genererFilmData(){

            Random ranNum = new Random();

            double random = ranNum.nextInt(20)+30;

            filmListe.add(new Film("ShawHank Redemtion", random, "beskrivelse", "02.02.02", "En person" ));

            filmListe.add(new Film("Saving private Ryan", random, "Beskrivelse", "dato", "person"));

        }
    }



