public class Camion extends AMoteur {
    private double volumeTransporte;
    private String materiaux;
    private int km;

    public Camion(double volumeTransporte, String materiaux, int km){
        super();
        this.volumeTransporte = volumeTransporte;
        this.materiaux = materiaux;
        this.km = km;
    }
    public String toString(){
        return super.toString() + " Le volume transporté est de " + volumeTransporte + " litres.";
    }
    public void transporter(String materiaux, int km){
        if (enPanne()){
            System.out.println("Plus d'essence ya zeh!");
        } else {
            System.out.println("Le camion " + id + " a transporte des " + materiaux + " sur " + km + "km.");
        }
    }
}

