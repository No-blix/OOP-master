package sample.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import sample.Data.DataHandler;
import sample.Model.Film;
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
    private void slettKnapp(ActionEvent actionEvent) {
    }
    @FXML
    private void nyKnapp(ActionEvent actionEvent) {
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        listeVindu.setItems(DataHandler.hentFilmData());

    }
   @FXML
    public void klikkInfo(MouseEvent mouseEvent) {
        Film filmValgt = listeVindu.getSelectionModel().getSelectedItem();

                datoVindu.setText(filmValgt.getUtgivelsesDato());
                beskrivelseVindu.setText(filmValgt.getBeskrivelse());
                spilletidVindu.setText(filmValgt.getSpilleTid());

    }
    @FXML
    private void redigerKnapp(ActionEvent actionEvent) throws IOException {
        FXMLLoader nyttVindu = new FXMLLoader();

        nyttVindu.setLocation(getClass().getResource("HåndtereFilm.fxml"));

        Parent hovedLayout = nyttVindu.load();

        Scene scene = new Scene(hovedLayout);

        Stage stage = new Stage();

        stage.setScene(scene);

        stage.showAndWait();











    }
}


