package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import sample.DataHandler.DataHandler;



public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../sample/View/ValutaWindow.fxml"));

        Image image = new Image(getClass().getResourceAsStream("../sample/icon/CalculatorIcon.png"));
        primaryStage.getIcons().add(image);

        primaryStage.setTitle("Valuta Calculator");

        primaryStage.setScene(new Scene(root, 600, 450));
        primaryStage.show();

        ObservableList<String> arrayListData = FXCollections.observableArrayList();


       /* for(int i = 0; i<DataHandler.sendFile().size(); i++){
            String splittUp = DataHandler.sendFile().get(i);

            String[] currencyInfo = splittUp.split(";");



            for(int k = 0; k<currencyInfo.length; k++){
                String info = currencyInfo[k];

                System.out.println(info);

            }

        }*/







    }
}