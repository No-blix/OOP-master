package sample.Controller;


import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

import static sample.View.MainJavaFx.primaryStage;


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

    private ObservableList<Film> filmListe; //= FXCollections.observableArrayList(DataHandler.hentFilmData());

    private Film valgtFilm;

    private static int index;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listeVindu.setItems(DataHandler.hentFilmData());
        filmListe = DataHandler.hentFilmData();
        listeVindu.getSelectionModel().select(0);
        Film valgtATM = listeVindu.getSelectionModel().getSelectedItem();

        //region setText
        beskrivelseVindu.setText(valgtATM.getBeskrivelse());
        datoVindu.setText(valgtATM.getUtgivelsesDato());
        spilletidVindu.setText(valgtATM.getSpilleTid());
        tittelVindu.setText(valgtATM.getTittel());

        //endregion

        listeVindu.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            beskrivelseVindu.setText(newValue.getBeskrivelse());
            datoVindu.setText(newValue.getUtgivelsesDato());
            spilletidVindu.setText(newValue.getSpilleTid());
            tittelVindu.setText(newValue.getTittel());
        });
    }


    public void gaaTilNyttVindu(ActionEvent event) {
        index = listeVindu.getSelectionModel().getSelectedIndex();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();


            fxmlLoader.setLocation(MainJavaFx.class.getResource("../View/manipulerFilm.fxml"));
            Parent nyttvindu = fxmlLoader.load();


            ManipulerFilmController manipulerFilmController = fxmlLoader.getController();

            manipulerFilmController.fyllInnInnholdet(tittelVindu.getText(), beskrivelseVindu.getText(), datoVindu.getText(), spilletidVindu.getText());



            Scene scene = new Scene(nyttvindu);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            //stage.initOwner(primaryStage);
            stage.setScene(scene);
            stage.showAndWait();
            //stage.show();

        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }


    }

    public void nyKnappTrykket() {
        FXMLLoader fxmlInnlaster = new FXMLLoader();
        fxmlInnlaster.setLocation(getClass().getResource("../View/nyFilm.fxml"));
        try {
            Parent rootNode = fxmlInnlaster.load();
            Stage nyFilmStage = new Stage();
            Scene nyFilmScene = new Scene(rootNode);

            nyFilmStage.setTitle("Ny Film");
            nyFilmStage.setScene(nyFilmScene);
            nyFilmStage.initOwner(primaryStage);
            nyFilmStage.initModality(Modality.WINDOW_MODAL);
            nyFilmStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void opprettFilm(Film film){

        //DataHandler.leggTilFilm(film);
        filmListe.add(film);

        FXMLLoader fxmlInnlaster = new FXMLLoader();
        fxmlInnlaster.setLocation(getClass().getResource("../View/Film.fxml"));

        try {
            Parent rootNode = fxmlInnlaster.load();
            Scene oppdatertScene = new Scene(rootNode);

            primaryStage.setScene(oppdatertScene);

            primaryStage.setTitle("Tittel");
            primaryStage.setScene(oppdatertScene);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void slettFilm(){
        listeVindu.getItems().remove(listeVindu.getSelectionModel().getSelectedItem());
    }


    public void endreFilmListe(Film film) {
            filmListe.set(index,film);

        System.out.println(index);
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("../View/Film.fxml"));

        try {
            Parent rootNode = fxmlLoader.load();
            Scene endretScene = new Scene(rootNode);
            primaryStage.setScene(endretScene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /*public void fyllUtInnhold(Film enFilm){
        if(enFilm != null){
            beskrivelseVindu.setText(enFilm.getBeskrivelse());
            datoVindu.setText(enFilm.getUtgivelsesDato());
            spilletidVindu.setText(enFilm.getSpilleTid());
            tittelVindu.setText(enFilm.getTittel());
            System.out.println(index);
        }
    }*/
}

