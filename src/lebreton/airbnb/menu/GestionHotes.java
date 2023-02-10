package lebreton.airbnb.menu;

import java.util.Scanner;

import lebreton.airbnb.utilisateurs.Hote;

class GestionHotes {

	static void listerHotes(){

		//Créer le message d'erreur Throwable
		Throwable throwable = new Throwable("Erreur de saisie");



		System.out.println("-------------------------------------");
		System.out.println("Liste des hôtes ");
		int i = 1;
		// Afficher la liste des hôtes
		for (Hote hote : Menu.listHotes) {
			System.out.println("id = " + i + hote.toString());
			i++;
		}

		System.out.println("Saisir une option : ");
		System.out.println("1 : Ajouter un hôte");
		System.out.println("2 : Supprimer un hôte");
		System.out.println("3 : Retour");

		switch (Menu.choix(3)){
			case 1:
				try {
					ajouterHote();
				} catch (Exception exception){
					exception.getMessage();
					System.out.println("Try Again !" + exception.getMessage());
					listerHotes();
				} break;
			case 2:
				try{
					supprimerHote();
				} catch (Exception exception){
					exception.getMessage();
					System.out.println("Try Again !" + exception.getMessage());
					listerHotes();
				}
			case 3:
				Menu.listerMenu();
				break;
		}



	}

	private static void ajouterHote() throws Exception{
		System.out.println("-------------------------------------");
		System.out.println("Ajouter un nouvel hôte");


		System.out.println("Saisir le nom de l'hôte");
		String nom = Menu.scanner.next();
		System.out.println("Saisir le prénom de l'hôte");
		String prenom = Menu.scanner.next();
		System.out.println("Saisir l'âge de l'hôte");
		int age = Menu.scanner.nextInt();
		System.out.println("Saisir le temps de réponse moyen de l'hôte");
		int tempsReponseMoyen = Menu.scanner.nextInt();
		Menu.listHotes.add(new Hote(nom, prenom, age, tempsReponseMoyen));

		System.out.println("Hôte ajouté");
		listerHotes();
	}

	private static void supprimerHote() throws Exception {
		System.out.println("-------------------------------------");
		System.out.println("Supprimer un hôte");

		System.out.println("Quelle hôte souhaitez-vous supprimer ?");
		int id = Menu.scanner.nextInt();

		try{
			Menu.listHotes.remove(id - 1);
		} catch (IndexOutOfBoundsException exception){
			exception.getMessage();
			System.out.println("Erreur de saisie : " + exception.getMessage());
		}

		listerHotes();
	}
}
