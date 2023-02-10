package lebreton.airbnb.reservations;

import lebreton.airbnb.logement.Logement;

import java.util.Date;

public class SejourSpecialSaintValentin extends Sejour{

    public SejourSpecialSaintValentin(Date paramDateArrivee, int paramNbNuits, Logement paramLogement, int paramNbVoyageurs) {
        super(paramDateArrivee, paramNbNuits, paramLogement, paramNbVoyageurs);
    }

    @Override
    public void miseAJourTarif() {
        tarif = 100;
    }

    @Override
    public boolean isNbNuitsValide() {
        return nbNuits == 2;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Saint Valentin -> tarif : " + tarif);
    }
}
