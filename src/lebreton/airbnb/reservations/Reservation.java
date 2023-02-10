package lebreton.airbnb.reservations;

import lebreton.airbnb.utilisateurs.Personne;
import lebreton.airbnb.utilisateurs.Voyageur;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;

public class Reservation {

    //Attributs
    private int identifiant;
    private Sejour sejour;
    private Voyageur voyageur;
    private boolean estValidee;
    private Date dateDeReservation;


    //Constructeur
    public Reservation(int paramIdentifiant, Sejour paramSejour, Voyageur paramVoyageur) throws Exception {

        if (paramSejour.isNbVoyageursValide() && paramSejour.isDateArriveeValide() && paramSejour.isNbNuitsValide()) {
            identifiant = paramIdentifiant;
            sejour = paramSejour;
            voyageur = paramVoyageur;
            estValidee = false;
            dateDeReservation = new Date();
        } else {
            throw new Exception("Cacahuète");
        }
    }

    //Méthode
    public void afficher() {
        voyageur.afficher();
        System.out.print(" qui a fait une réservation chez ");
        sejour.afficher();
        System.out.println("Le numéro de réservation est le " + identifiant + ".");
        identifiant++;
    }

    public void writter() throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("reservation.txt", "UTF-8");
        writer.println("Le numéro de réservation est le " + identifiant + ".");
        writer.println("La date de réservation est le " + dateDeReservation + ".");
        writer.println("Le voyageur est : " + voyageur.getNom() + " " + voyageur.getPrenom() + ".");
        writer.println("Pour une durée de " + sejour.nbNuits + " nuits.");
        writer.println("Un total de " + sejour.nbVoyageurs + " voyageurs.");
        writer.println("Le logement est : " + sejour.getLogement() + ".");
        writer.println("Le tarif est de : " + sejour.tarif + "€.");
        writer.close();
    }
}


