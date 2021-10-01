public class Voiture extends AMoteur {
    private int nbPlaces;
    private int km;

    public Voiture(int nbPlaces, int km){
        super();
        this.nbPlaces = nbPlaces;
        this.km = km;
    }

    public String toString(){
        return super.toString() + " Il comporte " + nbPlaces + " places.";
    }
    public void transporter(int nbPlaces, int km) {
        if (enPanne()) {
            System.out.println("Plus d'essence ya zeh !");
        } else {
            System.out.println("La voiture " + id + " a transporte " + nbPlaces + " personnes sur " + km + " km.");
        }
    }
}
