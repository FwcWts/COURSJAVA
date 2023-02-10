package lebreton.airbnb.reservations;

import lebreton.airbnb.logement.Logement;

import java.util.Date;

public class SejourCourt extends Sejour implements ConditionsTarifairesInterface, SejourInterface {

    public SejourCourt(Date paramDateArrivee, int paramNbNuits, Logement paramLogement, int paramNbVoyageurs) {
        super(paramDateArrivee, paramNbNuits, paramLogement, paramNbVoyageurs);
    }

    @Override
    public boolean isNbNuitsValide() {
        return nbNuits >= 1 && nbNuits <= 5;
    }

    @Override
    public void miseAJourTarif() {
        tarif = nbNuits * logement.getTarifParNuit();
    }

    /**
     * Affiche les informations du séjour
     */
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Sejour court: " + nbNuits + " nuit, prix total : " + tarif + " €.");
        System.out.println("----------------------------------------");
    }
}
