package sample.Controller;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.Data.DataHandler;
import sample.Model.Film;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;



public class ManipulerFilmController implements Initializable {
    @FXML
    private TextArea nyBeskrivelse;
    @FXML
    private TextField nyTittel;
    @FXML
    private TextField nyDato;
    @FXML
    private TextField nySpilletid;

    private ObservableList<Film> filmListe;

    private int valgtFilm = 0;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        filmListe = DataHandler.hentFilmData();
        if(valgtFilm < filmListe.size()){

            Film enFilm = filmListe.get(valgtFilm);
            fyllUtInnhold(enFilm);
        }
        this.valgtFilm = filmListe.indexOf(valgtFilm);
    }
    public void fyllUtInnhold(Film enFilm){
        if(enFilm != null){
            nyBeskrivelse.setText(enFilm.getBeskrivelse());
            nyDato.setText(enFilm.getUtgivelsesDato());
            nySpilletid.setText(enFilm.getSpilleTid());
            nyTittel.setText(enFilm.getTittel());
        }
    }
    @FXML
    public void velgFilmFraListe(ActionEvent actionEvent){

    }
    /*@FXML
    public void hvilkenFilm1(ActionEvent actionEvent){
        if(valgtFilm+1 < filmListe.size()){
            fyllUtInnhold(filmListe.get(valgtFilm+1));
            valgtFilm++;

        }
    }
    @FXML
    public void hvilkenFilm2(ActionEvent actionEvent){
        if(valgtFilm-1 >= 0){
            fyllUtInnhold(filmListe.get(valgtFilm-1));
            valgtFilm--;
        }
    }*/

}
