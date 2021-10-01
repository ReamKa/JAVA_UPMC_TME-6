public class AMoteur extends Vehicule {
    protected int essence;
    protected int nbLitres;
    public AMoteur(){
        super();
    }
    public AMoteur(int essence, int nbLitres) {
        this.essence = essence;
        this.nbLitres = nbLitres;
    }

    public String toString(){
        return super.toString() + " avec un taux d'essence de " + essence + " litres.";
    }

    public void approvisionner (double nbLitres){
        nbLitres ++;
    }
    public boolean enPanne(){
        if (essence == 0){
            return true;
        }
        else return false;
    }
 }

