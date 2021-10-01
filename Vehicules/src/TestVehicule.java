
public class TestVehicule {
    public static void main (String [] args){

        //Tests de Vélo
        Velo un = new Velo(3,"Paris", "Sarajevo");
        System.out.println(un.toString());
        un.transporter("Paris", "Sarajevo");
        System.out.println("Il a roulé: " + un.rouler(50) + " km");

        //Tests de Camion
        Camion camion = new Camion(500, "fleurs", 700);
        System.out.println(camion.toString());
        camion.essence = 0;
        camion.transporter("fleurs",100);
        camion.essence = 50;
        camion.transporter("fleurs",100);

        //Tests de voiture
        Voiture voiture = new Voiture(5,100);
        System.out.println(voiture.toString());
        voiture.approvisionner(5);
        voiture.essence = 200;
        voiture.transporter(4,100);




    }


}
