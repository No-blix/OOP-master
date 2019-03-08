package sample.Controller;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;
import sample.Data.DataHandler;
import sample.Model.Film;

import java.io.IOException;


public class ManipulerFilmController  {
    @FXML
    private TextArea nyBeskrivelse;
    @FXML
    private TextField nyTittel;
    @FXML
    private TextField nyDato;
    @FXML
    private TextField nySpilletid;
    @FXML
    private Button redigerKnapp;


    public int Index;

    private ObservableList<Film> nyttInnhold;




    public void initialize(){

       redigerKnapp.setOnAction(e -> redigerKnappKlikket());

    }


    public void angreKnappKlikket(){
        Stage denne = (Stage) nyTittel.getScene().getWindow();
        denne.close();
    }


    public void redigerKnappKlikket(){
        Film endretFilm = new Film(nyTittel.getText(),nySpilletid.getText(),nyBeskrivelse.getText(),nyDato.getText());
        System.out.println(endretFilm.getTittel() + endretFilm.getBeskrivelse() +  endretFilm.getUtgivelsesDato());


        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("../View/Film.fxml"));
        try {
            Parent rootNode = fxmlLoader.load();
            Controller controller = fxmlLoader.getController();
            System.out.println(controller);
            controller.endreFilmListe(endretFilm);
            Stage denne = (Stage) nyTittel.getScene().getWindow();
            denne.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }




    public void fyllInnInnholdet(String filmTittel, String filmBeskrivelse, String filmDato, String filmSpilleTid){
        this.nyBeskrivelse.setText(filmBeskrivelse);
        this.nyTittel.setText(filmTittel);
        this.nySpilletid.setText(filmSpilleTid);
        this.nyDato.setText(filmDato);
    }

}

