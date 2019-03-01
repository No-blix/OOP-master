package sample.Data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.Model.Film;
import sample.Model.Person;


import java.util.Collection;
import java.util.Random;

public class DataHandler {

    private final static ObservableList<Film> filmListe = FXCollections.observableArrayList();{

    }

    public static ObservableList<Film> hentFilmData(Film film){
        return filmListe;

    }



}
