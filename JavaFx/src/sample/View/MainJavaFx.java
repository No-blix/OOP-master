package sample.View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class MainJavaFx extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Film.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        Label label = new Label();
        TextField textField = new TextField();
        HBox hBox = new HBox(200);
        hBox.getChildren().addAll(label, textField);
        hBox.setSpacing(10);




    }


    public static void main(String[] args) {
        launch(args);
    }
}
