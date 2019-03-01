package sample.Model;
import java.util.ArrayList;
import java.util.Random;


public class Main {

    public static void main(String[] args) {


        Random random = new Random();

        Person person1 = new Person("Tom", "Hanks", 60, "For film");
        Person person2 = new Person("Mattia", "Leraio", 26, "For Tvserie");
        Person person3 = new Person("Tom", "Hanks", 60, "Skuespiller");
        Person person4 = new Person("Gerard", "Buttler", 35, "Skuespiller");

        Rolle rolle1 = new Rolle("Oliver", "Lock", person3);
        Rolle rolle2 = new Rolle("Mattia", "Lerario", person4);



        ArrayList<Episode> episoder = new ArrayList<>();

        ArrayList<Rolle> Roller = new ArrayList<>();

        Roller.add(rolle1);
        Roller.add(rolle2);

        double randTallFilm = random.nextInt(30)+20;

        Film film = new Film("En filmtittel", randTallFilm, "En beskrivelse", "02.02.02", person2);
        Film film2 = new Film("En ny tittel", randTallFilm, "En ny beskrivelse", "02.03.02,", person1);
        System.out.println(film);


        for(int k = 1; k<=5;k++){

            for(int i= 1; i<=20; i++){
                double randTall = random.nextInt(30)+20;
                Episode episode = new Episode("En episodetittel", randTall, "En beskrivelse", "02.02.02", i, k, person1);
                episoder.add(episode);
                episode.LeggTilMangeRoller(Roller);





                // Teller opp antall episoder & sesonger, for å sende det til listen episoder
            }
        }
        Tvserie tvserie = new Tvserie("En beskrivelse", "02.02.02","En tittel", episoder, 5);



        //Lager en ny episode for å sjekke om det regelen om antallsesonger fungerer, endrer du sesongstørrelsen til som er høyere en +1 vil du få error

            int randTest = random.nextInt(30)+20;
            Episode episodeTest1 = new Episode("En ny episodetittel", randTest, "En ny beskrivelse", "02.02.02", 1, 6, person1);
            //Episode episodeTest2 = new Episode("En  ny episodetittel", randTest, "En ny beskrivelse", "02.02.02", 1, 7, person2);
           // tvserie.LeggTilEpisode(episodeTest2);
            tvserie.LeggTilEpisode(episodeTest1);




            episodeTest1.LeggTilMangeRoller(Roller);



            System.out.println(Roller);
            System.out.println(tvserie.hentRolleBesetning());

           // episodeTest2.LeggTilEnRolle(rolle1);
           // episodeTest1.LeggTilEnRolle(rolle2);

           // System.out.println(episodeTest2);
           // System.out.println(episodeTest1);


            System.out.println(tvserie);



    }
}
