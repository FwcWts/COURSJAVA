package lebreton.airbnb.outils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utile {

    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    private Utile() {

    }

    public static Date createDate(int jour, int mois, int annee){
        Date date = new Date(annee - 1900, mois - 1, jour);
        return date;
    }

    public static String dateToString(Date date){
        String jour = (date.getDate() < 10 ? "0" + date.getDate() : "") + date.getDate();
        String mois = (date.getMonth() < 10 ? "0" + date.getMonth() : "") + date.getMonth();
        String annee = "" + (date.getYear() + 1900);

        return jour + "/" + mois + "/" + annee;
    }

    public static String dateToString2(Date date){
        return SIMPLE_DATE_FORMAT.format(date);
    }

}
