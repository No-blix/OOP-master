package sample.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.util.Callback;
import sample.DataHandler.DataHandler;
import sample.Model.Valuta;

import java.net.URL;
import java.util.ResourceBundle;



public class ValutaOversiktController implements Initializable {
    @FXML
    private ComboBox AlfabeticCalculate;
    @FXML
    private ComboBox<Valuta> CurrencyOptionFirst;
    @FXML
    private ComboBox<Valuta> CurrencyOptionSecond;
    @FXML
    private TextField AmountFirst;
    @FXML
    private TextField AmountSecond;
    @FXML
    private ListCell<Valuta> valutaListCell = new ListCell<>();
    @FXML
    public void CalculateCurrency(ActionEvent actionEvent) {
    }


    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ObservableList<Valuta> valutaListe = FXCollections.observableArrayList(DataHandler.sendFile());

        CurrencyOptionFirst.setItems(valutaListe);
        CurrencyOptionSecond.setItems(valutaListe);

        CurrencyOptionSecond.setCellFactory(new Callback<ListView<Valuta>, ListCell<Valuta>>() {
            @Override
            public ListCell<Valuta> call(ListView<Valuta> listView) {
                return new valutaCelle();
            }

        });

        CurrencyOptionFirst.setCellFactory(new Callback<ListView<Valuta>, ListCell<Valuta>>() {
            @Override
            public ListCell<Valuta> call(ListView<Valuta> listView) {
                return new valutaCelle();
            }
        });
    }

    private static class valutaCelle extends ListCell<Valuta>  {

        @Override
        public void updateItem(Valuta enValuta, boolean empty) {
            super.updateItem(enValuta, empty);

            if(empty || enValuta == null){
                setText(null);
            }
            else{
                setText(enValuta.getCountry() + "-" + enValuta.getCountryCode());
            }
        }
    }
}
