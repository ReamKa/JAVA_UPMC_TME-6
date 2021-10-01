public class Vehicule {
    protected static int id  = 0;
    protected int distance = 0;

    public Vehicule(){
        id++;
    }

    public String toString(){
        return "numéro ID:  " + id;
    }

    public double rouler (double distance){
        return distance;
    }
}
