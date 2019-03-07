package sample.Controller;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.Data.DataHandler;
import sample.Model.Film;
import sample.View.MainJavaFx;

import java.io.IOException;
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
    private Label tittelVindu;

    private ObservableList<Film> filmListe;

    private Film valgtFilm;

    private int Index;



    @FXML
    private void slettKnapp(ActionEvent actionEvent) {
    }
    @FXML
    private void nyKnapp(ActionEvent actionEvent) {
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listeVindu.setItems(DataHandler.hentFilmData());
        filmListe = DataHandler.hentFilmData();
        fyllUtInnhold(filmListe.get(0));

        listeVindu.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Film>() {
            @Override
            public void changed(ObservableValue<? extends Film> observableValue, Film gammelFilm, Film nyFilm) {
                fyllUtInnhold(nyFilm);
                valgtFilm = nyFilm;
            }
        });
    }

    public void gaaTilNyttVindu(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();


            fxmlLoader.setLocation(MainJavaFx.class.getResource("../View/manipulerFilm.fxml"));
            Parent nyttvindu = fxmlLoader.load();


            ManipulerFilmController manipulerFilmController = fxmlLoader.getController();
            manipulerFilmController.fyllInnInnholdet(tittelVindu.getText(), beskrivelseVindu.getText(), datoVindu.getText(), spilletidVindu.getText(), listeVindu.getSelectionModel().getSelectedIndex());


            Scene scene = new Scene(nyttvindu);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }


    }

    public void fyllUtInnhold(Film enFilm){
        if(enFilm != null){
            beskrivelseVindu.setText(enFilm.getBeskrivelse());
            datoVindu.setText(enFilm.getUtgivelsesDato());
            spilletidVindu.setText(enFilm.getSpilleTid());
            tittelVindu.setText(enFilm.getTittel());
        }
    }
}

