package sample.Data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.Model.Film;

public class DataHandler {

    private final static ObservableList<Film> filmListe = FXCollections.observableArrayList();{

    }

    public static ObservableList<Film> hentFilmData(Film filmer) {
        if (filmListe.isEmpty()) {
            genererFilmData();
            return filmListe;


        }
        return null;
    }
    private static void genererFilmData() {

        filmListe.add(new Film("ShawHank Redemption", "142 min", "Summaries. Two imprisoned men bond over a number of years," +
                " finding solace and eventual redemption through acts of common decency. Chronicles the experiences of a formerly " +
                "successful banker as a prisoner in the gloomy jailhouse of Shawshank after being found guilty of a crime he did not commit.", "6. januar 1995", "Frank Darabont"));
        filmListe.add(new Film("Forrest Gump", " 142 min", "Forrest Gump is a simple man with a low I.Q. but good intentions. He is running through childhood with his best and only friend Jenny. His 'mama' teaches him the ways of life and leaves him to choose his destiny." +
                " Forrest joins the army for service in Vietnam, finding new friends called Dan and Bubba, he wins medals, creates a famous shrimp fishing fleet, inspires people to jog," +
                " starts a ping-pong craze, creates the smiley, writes bumper stickers and songs, donates to people and meets the president several times. " +
                "However, this is all irrelevant to Forrest who can only think of his childhood sweetheart Jenny Curran," +
                " who has messed up her life. Although in the end all he wants to prove is that anyone can love anyone.", "30 September 1994", " Robert Zemeckis"));
        filmListe.add(new Film("Saving Private Ryan",  "112 min", "In Paris, the aristocratic and intellectual Philippe is a quadriplegic millionaire who is interviewing candidates for the position of his carer, with his red-haired secretary Magalie. Out of the blue," +
                " Driss cuts the line of candidates and brings a document from the Social Security and asks Phillipe to sign it to prove that he is seeking a job position so he can receive his unemployment benefit." +
                " Philippe challenges Driss, offering him a trial period of one month to gain experience helping him. " +
                "Then Driss can decide whether he would like to stay with him or not. Driss accepts the challenge and moves to the mansion, changing the boring life of Phillipe and his employees.", "9 November 2012", " Olivier Nakache, Éric Toledano"));

    }
}