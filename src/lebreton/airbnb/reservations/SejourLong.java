package lebreton.airbnb.reservations;

import lebreton.airbnb.logement.Logement;

import java.util.Date;

public class SejourLong extends Sejour implements ConditionsTarifairesInterface, SejourInterface {

    private static final int seuilNbNuit = 6;
    private static final int pourcentagePromotion = 20;

    private int promotion;

    public SejourLong(Date paramDateArrivee, int paramNbNuits, Logement paramLogement, int paramNbVoyageurs) {
        super(paramDateArrivee, paramNbNuits, paramLogement, paramNbVoyageurs);
    }

    @Override
    public void miseAJourTarif() {
        int totalPrice = nbNuits * logement.getTarifParNuit();
        promotion = totalPrice * pourcentagePromotion / 100;
        tarif = totalPrice - promotion;
    }

    @Override
    public boolean isDateArriveeValide() {
        return false;
    }

    @Override
    public boolean isNbNuitsValide() {
        return nbNuits >= 6 && nbNuits <= 31;
    }

    @Override
    public boolean isNbVoyageursValide() {
        return false;
    }



    @Override
    public void afficher() {
        //super.afficher();
        System.out.println("Sejour long: " + nbNuits + " nuit, prix total : " + tarif + " €.");
        System.out.println("Le montant de la réduction est de " + promotion + " €. ");
        System.out.println("----------------------------------------");
    }
}

