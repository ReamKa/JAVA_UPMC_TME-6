public class Velo extends SansMoteur {
    private int nbVitesse;
    private String depart;
    private String arrivee;

    public Velo (int nbVitesse, String depart, String arrivee){
        super();
        this.nbVitesse = nbVitesse;
        this.depart = depart;
        this.arrivee = arrivee;
    }
    public String toString(){
        return super.toString() + " avec " + nbVitesse + " vitesses.";
    }

    public void transporter(String depart, String arrivee){
        System.out.println("Le velo "+ id + " a roule de " + depart + " a " + arrivee);
    }
}
