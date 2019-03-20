package sample.DataHandler;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataHandler {

    public void getFile(){
        GenerateReader();

        return GenerateReader();
    }



    public static void GenerateReader(){
        String csv = "valutakurser.csv";
        File file = new File(csv);

        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                String data = scanner.next();

                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}


