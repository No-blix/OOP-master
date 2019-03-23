package sample.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import sample.DataHandler.DataHandler;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public ComboBox AlfabeticCalculate;
    @FXML
    public ComboBox CurrencyOptionFirst;
    @FXML
    public ComboBox CurrencyOptionSecond;
    @FXML
    public TextField AmountFirst;
    @FXML
    public TextField AmountSecond;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> data = FXCollections.observableArrayList();

        for(int i = 0; i<DataHandler.sendFile().size(); i++){
            String splittUp = DataHandler.sendFile().get(i);
                String[] countries = splittUp.split(";");

           for(int k = 0; k < 1; k++ ){

               String country = countries[0];
               data.add(country);

               CurrencyOptionFirst.setItems(data);
               CurrencyOptionSecond.setItems(data);

           }
        }
    }
    @FXML
    public void CalculateCurrency(ActionEvent actionEvent) {
    }





}
