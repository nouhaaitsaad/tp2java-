package tp2java;

public class TestBanque {
	    public static void main(String[] args) {

	        Banque b = new Banque("MarocBank", 1500);

	        comptebancaire c1 = new comptebancaire("Ali", 1000, 500);
	        comptebancaire c2 = new comptebancaire("Sara", 2000, 300);
	        comptebancaire c3 = new comptebancaire("Omar", 1500, 400);

	        b.ajouterCompte(c1);
	        b.ajouterCompte(c2);
	        b.ajouterCompte(c3);

	        c1.deposer(500);
	        c1.retirer(1200);

	        c2.virementVers(c3, 500);

	        b.afficherTous();

	        System.out.println("Solde c2 avec intérêts: " + c2.calculerSoldeAvecInterets());
	        System.out.println("Solde c2 avec bonus: " + c2.calculerSoldeAvecInterets(0.015));

	        System.out.println("Nombre total de comptes: " + comptebancaire.getNbComptes());
	        System.out.println("Taux intérêt: " + comptebancaire.getTauxInteretAnnuel());
	    }
	}
