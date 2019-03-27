package sample.Controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Callback;
import sample.DataHandler.DataHandler;
import sample.Model.Valuta;

import java.net.URL;
import java.util.ResourceBundle;


public class ValutaOversiktController implements Initializable {
    @FXML
    private ImageView firstFlag;
    @FXML
    private ImageView secondFlag;
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
    private void CalculateCurrency(ActionEvent actionEvent) {
        double tallEn = CurrencyOptionFirst.getValue().getValuta() * Double.valueOf(AmountFirst.getText());

        AmountSecond.setText(String.valueOf(tallEn / CurrencyOptionSecond.getValue().getValuta()));



    }
    @FXML
    public void alfabeticOrder(ActionEvent actionEvent) {
        int index = AlfabeticCalculate.getSelectionModel().getSelectedIndex();
        if(index == 0){
            CurrencyOptionFirst.setItems(Valuta.sortertListen(valutaListe, true));
            CurrencyOptionSecond.setItems(Valuta.sortertListen(valutaListe, true));
        }
        if(index == 1){
            CurrencyOptionFirst.setItems(Valuta.sortertListen(valutaListe, false));
            CurrencyOptionSecond.setItems(Valuta.sortertListen(valutaListe, false));
        }
        if(index == 2){
            CurrencyOptionFirst.setItems(Valuta.sorterKode(valutaListe, true));
            CurrencyOptionSecond.setItems(Valuta.sorterKode(valutaListe, true));
        }
        if(index == 3){
            CurrencyOptionFirst.setItems(Valuta.sorterKode(valutaListe, false));
            CurrencyOptionSecond.setItems(Valuta.sorterKode(valutaListe, false));
        }
    }

    @FXML
    private void comboPickerFirst(ActionEvent actionEvent) {
        if(CurrencyOptionFirst.getSelectionModel().getSelectedItem() == null){
            return;
        }
      firstFlag.setImage(new Image("https://www.countryflags.io/" + CurrencyOptionFirst.getSelectionModel().getSelectedItem().getCountryCode() + "/shiny/64.png"));

    }
    @FXML
    private void comboPickerSecond(ActionEvent actionEvent) {
        if(CurrencyOptionSecond.getSelectionModel().getSelectedItem() == null){
            return;
        }
      secondFlag.setImage(new Image("https://www.countryflags.io/" + CurrencyOptionSecond.getSelectionModel().getSelectedItem().getCountryCode() + "/shiny/64.png"));

    }
    private ObservableList<String> sortingList = FXCollections.observableArrayList("Land synkende", "Land stigende", "valutakode synkende", "valutakode stigende");

    private static ObservableList<Valuta> valutaListe = FXCollections.observableArrayList(DataHandler.sendFile());

    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {

        AlfabeticCalculate.setItems(sortingList);
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
        CurrencyOptionFirst.setButtonCell(new valutaCelle());
        CurrencyOptionSecond.setButtonCell(new valutaCelle());

        AmountFirst.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d\\.")) {
                    AmountFirst.setText(newValue.replaceAll("[^\\d.]", ""));
                }
            }
        });

        AmountSecond.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d\\.")) {
                    AmountSecond.setText(newValue.replaceAll("[^\\d.]", ""));
                }
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



