public class Piano extends Instrument {

    public Piano(double poids, double prix) {
        super(poids, prix);
    }
    @Override
    public String toString() {
        return "Piano : " + super.toString();
    }
    public String jouer() {
        return  "Le piano" + super.jouer() + " :ting ting ting tINNNNNNNG";
    }
}
