package lebreton.airbnb.outils;


import java.text.SimpleDateFormat;
import java.util.Date;

public class MaDate extends Date {
    public MaDate(int jour, int mois, int annee){
        super(annee - 1900, mois - 1, jour);
    };

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(this);
    };
}
