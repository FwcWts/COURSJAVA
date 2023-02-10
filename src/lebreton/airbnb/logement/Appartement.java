package lebreton.airbnb.logement;

import lebreton.airbnb.utilisateurs.Hote;

public class Appartement extends Logement {
    private int numeroEtage;
    private int superficieBalcon;

    public Appartement(Hote paramHote, int paramTarifParNuit, String paramAdresse, int paramSuperficie, int paramNbVoyageursMax, int paramNumeroEtage, int paramSuperficieBalcon) {
        super(paramHote, paramTarifParNuit, paramAdresse, paramSuperficie, paramNbVoyageursMax);
        numeroEtage = paramNumeroEtage;
        superficieBalcon = paramSuperficieBalcon;
    }

    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Le logement est un appartement");
        System.out.println("Numéro d'étage : " + numeroEtage);
        System.out.println("Superficie du balcon : " + superficieBalcon + " m²");
    }
}
