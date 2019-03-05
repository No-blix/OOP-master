package sample.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import javafx.scene.input.MouseEvent;
import sample.Data.DataHandler;
import sample.Model.Film;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class Controller implements Initializable {



    @FXML
    private ListView<String> listeVindu = new ListView<>();
    @FXML
    private TextField datoVindu;
    @FXML
    private TextArea beskrivelseVindu;
    @FXML
    private TextField spilletidVindu;



    @FXML
    private void slettKnapp(ActionEvent actionEvent) {
    }
    @FXML
    private void nyKnapp(ActionEvent actionEvent) {
    }
    @FXML
    private void redigerKnapp(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ObservableList<String> filmtittler = FXCollections.observableArrayList();

        for(Film film : DataHandler.hentFilmData()){
            String filmliste = film.getTittel();
            filmtittler.add(filmliste);


        }
        listeVindu.setItems(filmtittler);

    }
    public void klikkinfo(MouseEvent mouseEvent) {


        ObservableList<Film> infoKapsel = FXCollections.observableArrayList();
        for (Film info : DataHandler.hentFilmData()) {
            String filmBeskrivelse = info.getBeskrivelse();
            String filmDato = info.getUtgivelsesDato();
            String filmSpilleTid = info.getSpilleTid();

           if(infoKapsel.size()==0){
               filmBeskrivelse.indexOf(0);
               filmDato.indexOf(0);
               filmSpilleTid.indexOf(0);
           }
           else if(infoKapsel.size()==1){
               filmBeskrivelse.indexOf(1);
               filmDato.indexOf(1);
               filmSpilleTid.indexOf(1);
           }
            beskrivelseVindu.setText(filmBeskrivelse);

        }

    }
}

