package sample.Data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import sample.Model.Film;

import java.util.Random;

public class DataHandler {

    private final static ObservableList<Film> filmListe = FXCollections.observableArrayList();{

    }

    public static ObservableList<Film> hentFilmData(Film filmer) {
            genererFilmData();
            return filmListe;


        }


        private static ObservableList<Film> genererFilmData() {


            filmListe.add(new Film("ShawHank Redemtion (1995)", "142 min", "beskrivelse", "02.02.02", "En person"));

            filmListe.add(new Film("Saving private Ryan (1998)", "170 min", "Beskrivelse", "dato", "En person"));

            return filmListe;

        }


}




