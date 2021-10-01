public class Trompette extends Instrument{

    public Trompette(double poids, double prix) {
        super(poids,prix);
    }
    @Override
    public String toString() {
        return "Trompette : " + super.toString();
    }
    public String jouer() {
        return "La trompette " + super.jouer() + " : popopopoPOOOOPOPpoooo";
    }
}
