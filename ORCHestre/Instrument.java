public class Instrument {
    protected double poids;
    protected double prix;

    public Instrument(double poids, double prix){
        this.poids = poids;
        this.prix = prix;
    }
    public String toString(){
        return "Je pese " + poids + " kilos et je coute: " +prix + " euros.";
    }
    public String jouer(){
        return " joue ";
    }
}
