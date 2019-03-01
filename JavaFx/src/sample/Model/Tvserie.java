package sample.Model;

// har jobbet sammen med ulike grupper, og sittet i øvinngstimer
import java.util.ArrayList;

public class Tvserie implements Comparable<Tvserie>{
    private String beskrivelse;
    private String utgivelsesDato;
    private String tittel;
    private double gjennomsnittligSpilletid;
    private int antallSesonger;
    private ArrayList<Episode> episodeListe = new ArrayList<>();


    public Tvserie(){

    }
    //Kontruktør for tvserie

    public Tvserie(String beskrivelse, String utgivelsesDato, String tittel, ArrayList<Episode> episodeListe, int antallSesonger){
        this.beskrivelse = beskrivelse;
        this.utgivelsesDato = utgivelsesDato;
        this.tittel = tittel;
        this.episodeListe = episodeListe;
        double tot = 0;
        for(Episode ep : episodeListe) {
            tot += ep.getSpilleTid();
        }
        this.gjennomsnittligSpilletid = tot / episodeListe.size();
        this.antallSesonger = antallSesonger;



    }

    public String getTittel() {
        return tittel;
    }

    public ArrayList<Rolle> hentRolleBesetning(){
        ArrayList<Rolle> rolleBesetning = new ArrayList<>();
        for(Episode ep:episodeListe){
            rolleBesetning.addAll(ep.getRolle());
        }
        return rolleBesetning;

    }
    public int getAntallSesonger(){ return antallSesonger; }

    private double getGjennomsnittligSpilletid(double gjennomsnittligSpilletid){
        return gjennomsnittligSpilletid;
    }



    //setter opp regel for hvordan antall sesonger skal behandles

    public void LeggTilEpisode(Episode episode) {
            for(int i = 0; i<episodeListe.size(); i++){
                if(episodeListe.get(i) == null && episode.getSesong() <= antallSesonger){
                    episodeListe.add(episode);
                }
                else if(episode.getSesong() == getAntallSesonger()+1){
                    episodeListe.add(episode);
                    antallSesonger++;
                }
                else if(episode.getSesong()> getAntallSesonger()+1){
                    System.out.println("ERROR");
                    break;
                }
            }
        }


    @Override
        public String toString () {
            return ("Tittel: " + tittel + "\n" + "Utgivelsesdato: " + utgivelsesDato + "\n" + "Beskrivelse: " + beskrivelse + "\n" + "Gjennomsnittlig spilletid: " + gjennomsnittligSpilletid + "\n" +
                    "Episode liste: " + "\n" + "\n" + episodeListe + "\n");
        }


    @Override
    public int compareTo(Tvserie tittelForskjell) {
        return this.getTittel().toLowerCase().compareTo(tittelForskjell.getTittel().toLowerCase());
    }
}

