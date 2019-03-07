package sample.View;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sample.Controller.ManipulerFilmController;
import sample.Data.DataHandler;



import java.io.IOException;


public class MainJavaFx extends Application {
    public MainJavaFx(){
        applikasjon = this;
    }
    private static MainJavaFx applikasjon;
    private Stage primaryStage;



    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;

        gaaTilHovedVindu();
    }
    public void gaaTilHovedVindu() throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("film.fxml"));
            Parent nyttvindu = fxmlLoader.load();

            primaryStage.setTitle("Filmer");
            primaryStage.setScene(new Scene(nyttvindu, 700, 400));
            primaryStage.show();


            TableColumn<DataHandler, String> tittelRad = new TableColumn<>("tittel");
            tittelRad.setMinWidth(200);
            tittelRad.setCellValueFactory(new PropertyValueFactory<>("tittel"));
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }





    public static void main(String[] args) {
        launch(args);
    }




}
