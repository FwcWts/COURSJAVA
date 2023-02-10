package lebreton.airbnb.logement;

import lebreton.airbnb.utilisateurs.Hote;

public class Maison extends Logement{
    private int superficieJardin;
    private boolean piscine;
    public Maison(Hote paramHote, int paramTarifParNuit, String paramAdresse, int paramSuperficie, int paramNbVoyageursMax, int paramSuperficieJardin, boolean paramPiscine) {
        super(paramHote, paramTarifParNuit, paramAdresse, paramSuperficie, paramNbVoyageursMax);
        superficieJardin = paramSuperficieJardin;
        piscine = paramPiscine;
    }

    public void afficher(){
        super.afficher();
        System.out.println("Le logement est une maison");
        System.out.println("Superficie du jardin : " + superficieJardin + " m²");
        if(piscine){
            System.out.println("La maison possède une piscine.");
        }else{
            System.out.println("La maison ne possède pas de piscine.");
        }
    }
}
