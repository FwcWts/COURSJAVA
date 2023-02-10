package lebreton.airbnb;

import lebreton.airbnb.logement.Appartement;
import lebreton.airbnb.logement.Logement;
import lebreton.airbnb.logement.Maison;
import lebreton.airbnb.outils.MaDate;
import lebreton.airbnb.reservations.*;
import lebreton.airbnb.utilisateurs.Hote;
import lebreton.airbnb.utilisateurs.Personne;
import lebreton.airbnb.outils.Utile;
import lebreton.airbnb.utilisateurs.Voyageur;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {

        Voyageur monVoyageur1 = new Voyageur("Willou ", "LaCartouche ", 30);
        Hote monHote1 = new Hote("Jean ", "LaPomme ", 40, 5);

        Date maDate1 = new MaDate(14, 2, 2023);

        Maison maMaison1 = new Maison(monHote1, 500, "1 rue de la pomme", 150, 5, 50, true);
        Appartement monAppartement1 = new Appartement(monHote1, 100, "2 rue de la pomme", 250, 2, 1, 15);

        int nbNuits = 2;
        int nbVoyageurs = 2;

        Sejour sejour;
        sejour = SejourFactory.getSejour(maMaison1, nbNuits, nbVoyageurs, maDate1);

        Reservation maReservation;

        try {
            maReservation = new Reservation(1,sejour, monVoyageur1);
            maReservation.afficher();
            maReservation.writter();
        } catch (Exception e){
            System.out.println("L'erreur est : " + e.getMessage()+ e.getClass());
        }
    }
}
