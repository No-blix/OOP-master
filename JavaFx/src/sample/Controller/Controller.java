package sample.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import sample.Data.DataHandler;
import sample.Model.Film;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {



    @FXML
    private ListView<Film> listeVindu;
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

        listeVindu.setItems(DataHandler.hentFilmData().sorted().get(0).getTittel());

    }
}

