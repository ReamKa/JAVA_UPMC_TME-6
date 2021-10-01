public class Orchestre  {
    private Instrument [] tableau;
    private int nbInstrument = 0;

    public Orchestre(int nbInstrument){
        tableau = new Instrument[nbInstrument];
    }
    public Instrument ajouterInstrument (Instrument i){
        if (tableau.length == 0){
            System.out.println(" ON PEUT PAS AJOUTER D'INSTRUMENTS BOGOSS");
        }
        else {
            tableau[nbInstrument] = i;
            nbInstrument ++;
        }
        return i;
    }
    }
    /* Je ne sais pas comment faire jouer tous les instruments :(
    public Instrument jouer(Instrument[] tableau){
        int index = 0;
        System.out.println(tableau[index]);
        index ++;
        return jouer(Instrument[4] tableau);
    }*/


