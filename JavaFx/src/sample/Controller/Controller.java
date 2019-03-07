package sample.Controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import sample.Data.DataHandler;
import sample.Model.Film;
import sample.View.MainJavaFx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {



    @FXML
    private ListView listeVindu;
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listeVindu.setItems(DataHandler.hentFilmData());

    }

    public void klikkInfo(MouseEvent mouseEvent) {
        Film filmValgt = (Film) listeVindu.getSelectionModel().getSelectedItem();

        datoVindu.setText(filmValgt.getBeskrivelse());
        beskrivelseVindu.setText(filmValgt.getBeskrivelse());
        spilletidVindu.setText(filmValgt.getSpilleTid());

    }
    @FXML
    private void redigerKnapp(ActionEvent actionEvent) throws IOException {
        MainJavaFx main = MainJavaFx.getInstance();
        main.gaaTilNyttVindu();

        Film nyFilm = (Film) listeVindu.getSelectionModel().getSelectedItem();


    }
}

