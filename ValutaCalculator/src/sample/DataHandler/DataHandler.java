package sample.DataHandler;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import org.w3c.dom.css.CSSValueList;

import java.io.*;
import java.util.Scanner;

public class DataHandler {


    private final static ObservableList<String> listReader = FXCollections.observableArrayList();

    public static ObservableList<String> getListReader(){
        if(listReader.isEmpty()){
            GenerateReader();
        }
        return listReader;
    }






    public static void GenerateReader(){
        String fileLocation = "../DataHandler/valutakurser.csv";
        String inputLine = "";
        try {
           Scanner scanner = new Scanner(new BufferedReader(new FileReader(fileLocation)));

           while (scanner.hasNext()){
               String data = scanner.next();

               System.out.println(data);
           }


            } catch (IOException e1) {
            e1.printStackTrace();
        }

    }

}


