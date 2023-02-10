package lebreton.airbnb.reservations;

import java.util.Date;

public interface SejourInterface {
    boolean isDateArriveeValide();
    boolean isNbNuitsValide();
    boolean isNbVoyageursValide();
    void afficher();
}

