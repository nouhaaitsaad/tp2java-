package tp2java;

public class Banque {

	    private String nom;
	    private comptebancaire[] comptes;
	    private int nbActuels;

	    public Banque(String nom, int capacite) {
	        this.nom = nom;
	        this.comptes = new comptebancaire[capacite];
	        this.nbActuels = 0;
	    }

	  
	    public void ajouterCompte(comptebancaire c) {
	        if (nbActuels < comptes.length) {
	            comptes[nbActuels] = c;
	            nbActuels++;
	        } else {
	            System.out.println("Banque pleine !");
	        }
	    }

	    public void afficherTous() {
	        for (int i = 0; i < nbActuels; i++) {
	            comptes[i].afficher();
	        }
	    }
	}

