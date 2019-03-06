package sample.View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sample.Data.DataHandler;
import sample.Model.Film;


public class MainJavaFx extends Application {




    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Film.fxml"));
        
        primaryStage.setTitle("Filmer");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();

        // Film tittel rad

        TableColumn<DataHandler, String> tittelRad = new TableColumn<>("tittel");
        tittelRad.setMinWidth(200);
        tittelRad.setCellValueFactory(new PropertyValueFactory<>("tittel"));


    }


    public static void main(String[] args) {
        launch(args);
    }
}
