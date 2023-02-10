package lebreton.airbnb.reservations;

import lebreton.airbnb.logement.Logement;
import lebreton.airbnb.logement.Maison;
import lebreton.airbnb.outils.MaDate;
import lebreton.airbnb.utilisateurs.Voyageur;

import java.util.Date;

public class SejourFactory {
    private static final Date SaintValentin = new MaDate(14,2,2023);
    public static Sejour getSejour(Logement logement, int nbNuits, int nbVoyageur, Date maDate1){
        Sejour sejour;
        if(nbNuits > 6){
            sejour = new SejourLong(maDate1, nbNuits, logement, nbVoyageur);
        } else if (nbNuits == 2 && (maDate1.equals(SaintValentin) && nbVoyageur == 2)) {
            sejour = new SejourSpecialSaintValentin(maDate1, nbNuits, logement, nbVoyageur);
        } else{
            sejour = new SejourCourt(maDate1, nbNuits, logement, nbVoyageur);
        }
        return sejour;
    }
}
