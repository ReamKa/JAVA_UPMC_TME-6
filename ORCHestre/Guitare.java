public class Guitare extends Instrument {

    public Guitare(double poids, double prix) {
        super(poids,prix);
    }
    @Override
    public String toString() {
        return "Guitare : " + super.toString();
    }
    public String jouer() {
        return "La guitare" + super.jouer() + " : WAAAAAAAAAA";
    }
}