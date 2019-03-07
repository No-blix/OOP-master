package sample.Controller;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.Data.DataHandler;
import sample.Model.Film;


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
    public void redigerKnappKlikket(){

        }




    public void fyllInnInnholdet(String filmTittel, String filmBeskrivelse, String filmDato, String filmSpilleTid, int index){
        this.nyBeskrivelse.setText(filmBeskrivelse);
        this.nyTittel.setText(filmTittel);
        this.nySpilletid.setText(filmSpilleTid);
        this.nyDato.setText(filmDato);

        this.Index = index;


    }

}

