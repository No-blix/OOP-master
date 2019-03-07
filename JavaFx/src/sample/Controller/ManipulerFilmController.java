package sample.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;



public class ManipulerFilmController  {
    @FXML
    private TextArea nyBeskrivelse;
    @FXML
    private TextField nyTittel;
    @FXML
    private TextField nyDato;
    @FXML
    private TextField nySpilletid;



    public int Index;


    public void initialize(){

    }


    public void fyllInnInnholdet(String filmTittel, String filmBeskrivelse, String filmDato, String filmSpilleTid, int index){
        this.nyBeskrivelse.setText(filmBeskrivelse);
        this.nyTittel.setText(filmTittel);
        this.nySpilletid.setText(filmSpilleTid);
        this.nyDato.setText(filmDato);

        this.Index = index;
    }
}
