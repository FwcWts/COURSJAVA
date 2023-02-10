package lebreton.airbnb.reservations;

import lebreton.airbnb.logement.Logement;
import lebreton.airbnb.outils.Utile;
import lebreton.airbnb.outils.MaDate;

import java.util.Date;

public abstract class Sejour implements SejourInterface {
    //Attributs
    private Date dateArrivee;
    protected int nbNuits;

    protected Logement logement;
    protected int nbVoyageurs;
    protected int tarif;


    //Constructeur
    public Sejour(Date paramDateArrivee, int paramNbNuits, Logement paramLogement, int paramNbVoyageurs) {
        this.dateArrivee = paramDateArrivee;
        this.nbNuits = paramNbNuits;
        this.logement = paramLogement;
        this.nbVoyageurs = paramNbVoyageurs;
        miseAJourTarif();
    }

    //Méthodes
    @Override
    public boolean isDateArriveeValide() {
        return dateArrivee.after(new Date());
    }

    @Override
    public boolean isNbVoyageursValide() {
        return nbVoyageurs >= 1 && nbVoyageurs <= logement.getNbVoyageursMax();
    }

    public void afficher() {
        logement.afficher();
        System.out.println("La date d'arrivée est le " + dateArrivee + " pour " + nbNuits + " nuits.");
        System.out.println("----------------------------------------");
        System.out.println(isDateArriveeValide() ? "La date d'arrivée est valide." : "La date d'arrivée n'est pas valide.");
        System.out.println(isNbNuitsValide() ? "Le nombre de nuits est valide." : "Le nombre de nuits n'est pas valide.");
        System.out.println(isNbVoyageursValide() ? "Le nombre de voyageurs est valide." : "Le nombre de voyageurs n'est pas valide.");
        System.out.println("----------------------------------------");
    }

    public Logement getLogement() {
        return logement;
    }


    public abstract void miseAJourTarif();

}
