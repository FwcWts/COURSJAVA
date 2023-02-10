package lebreton.airbnb.utilisateurs;

public class Hote extends Personne{

    private int delaiDeReponse;

    public Hote(String paramPrenom, String paramNom, int paramAge, int paramDelaiDeReponse) {
        super(paramPrenom, paramNom, paramAge);
        delaiDeReponse = paramDelaiDeReponse;
    }

    public int getDelaiDeReponse() {
        return delaiDeReponse;
    }

    @Override
    public String toString(){

        return "Nom : " + getNom() + " -Prénom : " + getPrenom() + " -Age : " + getAge() + " -Délais de réponse : " + getDelaiDeReponse();
    }

    @Override
    public void afficher(){
        super.afficher();
        System.out.println("\nLe délai de réponse de l'hôte est de " + delaiDeReponse + " heures.");
    }
}
