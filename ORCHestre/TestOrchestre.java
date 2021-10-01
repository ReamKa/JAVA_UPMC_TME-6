//import java.util.Scanner;

public class TestOrchestre {
    public static void main (String[] args){

        Orchestre un = new Orchestre(5);
        Instrument instrument = new Instrument(1,10);
        Piano piano = new Piano(3.5,30.7);
        Trompette trompette = new Trompette(4.1,40.1);
        Guitare guitare = new Guitare(5.5,50.5);

        un.ajouterInstrument(piano);
        un.ajouterInstrument(guitare);
        un.ajouterInstrument(trompette);

        System.out.println(piano.jouer());
        System.out.println(guitare.jouer());
        System.out.println(trompette.jouer());
        System.out.println("\n");

        //Ma solution remede quand on veut ajouter un nouvel instrument est de faire appel direct à l'utilisateur ...
        //Vaut mieux une solution ingenieuse qu'aucune non ?
       /*Scanner scanner = new Scanner(System.in);
           System.out.println("Voulez-vous ajouter un nouvel instrument ? Repondez par oui ou non.");
           String input = scanner.nextLine();
           String newInput = input.toLowerCase();
           if (newInput.equals("non")) {
               System.out.println("L'ORCHESTRE RESTE TEL QUEL!");
           } else if (newInput.length() != 3) {
               System.out.println("Oui ou Non. 3 lettres que je te dis !\nL'orchestre reste inchange.");
           } else if (!(newInput.equals("oui"))) {
               System.out.println("OooOoH pourquoi ... sOIT OUI SOIT NON QUE JE TE DIS.\nL'orchestre reste inchange.");
           } else {
               System.out.println("Entrez Le nom de votre instrument:");
               String nouvelInstrument = scanner.nextLine();
               System.out.println("Entrez son poids :");
               double poids = Double.valueOf(scanner.nextLine());
               System.out.println("Entrez son prix : \n");
               double prix = Double.valueOf(scanner.nextLine());

               Instrument instrument1 = new Instrument(poids, prix);
               un.ajouterInstrument(instrument1);
               System.out.println("Le nouvel instrument " + nouvelInstrument + instrument1.jouer() + "avec le reste de l'orchestre!");
           }*/
       }
    }
