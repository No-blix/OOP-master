package sample.DataHandler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.Model.Valuta;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class DataHandler {
   /* private String country, countryCode, currencyCode;
    private double currency;*/


    private final static ObservableList<Valuta> fileArray = FXCollections.observableArrayList();

    public static ObservableList<Valuta> sendFile(){
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
                 String[] inputLine2 = inputLine.split(";");
                 Valuta valuta = new Valuta(inputLine2[0], inputLine2[1], inputLine2[2], Double.valueOf(inputLine2[3]));

                 fileArray.add(valuta);
             }
         } catch (FileNotFoundException e) {
             e.printStackTrace();
        }
    }
}


