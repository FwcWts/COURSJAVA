package lebreton.airbnb.logement;

import lebreton.airbnb.utilisateurs.Hote;
import lebreton.airbnb.utilisateurs.Personne;

public abstract class Logement {

    //Attributs
    private Hote hote;
    private int tarifParNuit;
    private String adresse;
    private int superficie;
    private int nbVoyageursMax;


    //Constructeur
    public Logement(Hote paramHote, int paramTarifParNuit, String paramAdresse, int paramSuperficie, int paramNbVoyageursMax){
        hote = paramHote;
        tarifParNuit = paramTarifParNuit;
        adresse = paramAdresse;
        superficie = paramSuperficie;
        nbVoyageursMax = paramNbVoyageursMax;
    }

    //Méthode
    public void afficher(){
        hote.afficher();
        System.out.println("----------------------------------------");
        System.out.println("Le logement est situé au " + adresse);
        System.out.println("Superficie : " + superficie + " m²");
        System.out.println("----------------------------------------");
    }



    public int getNbVoyageursMax() {
        return nbVoyageursMax;
    }

    //Méthode => Getters + Setters
    public int getTarifParNuit() {
        return tarifParNuit;
    }
}
