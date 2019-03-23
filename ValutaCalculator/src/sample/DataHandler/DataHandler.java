package sample.DataHandler;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class DataHandler {

    private final static ObservableList<String> fileArray = FXCollections.observableArrayList();

    public static ObservableList<String> sendFile(){
        if(fileArray.isEmpty()){
            generateFile();
        }
    return fileArray;
    }


     static void generateFile() {


        String fileLocation;
        fileLocation = "valutakurser.csv";


         try {
             Scanner scanner = new Scanner(new BufferedReader(new FileReader(fileLocation)));

             String inputLine = "";
             while(scanner.hasNextLine()){
                 inputLine = scanner.nextLine();

                inputLine.split(",");

                 fileArray.add(inputLine);


             }
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }


 }

}


