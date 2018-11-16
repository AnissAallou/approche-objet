package essais;

import entites.Personne;
import entites.AdressePostale;

public class TestPersonne {
	public static void main(String[] args) {
		
		Personne personne = new Personne("Aallou", "Aniss");
		personne.nom = "Aallou";
		personne.prenom = "Aniss";
		personne.adressePostale = "mdr";
		
		Personne personne2 = new Personne("Wick", "Michael");
		personne2.nom = "Wick";
		personne2.prenom = "Michael";
		personne2.adressePostale = "lol";
		
		Personne personne3 = new Personne("Wayne", "John");
		personne3.nom = "Wayne";
		personne3.prenom = "John";
		
		Personne personne4 = new Personne("Pirlo", "Andrea");
		personne4.nom = "Pirlo";
		personne4.prenom = "Andrea";
		personne4.adressePostale = "Milano";
		
		
		// Modifier la classe TestPersonne de manière à utiliser le premier constructeur de la
		//classe Personne pour valoriser les attributs nom et prenom ainsi que la méthode
		// setAdresse() qui permet de modifier l’adresse pour valoriser l’adresse.
		
		Personne personne5 = new Personne("Giggs", "Ryan");
		personne5.nom = "Giggs";
		personne5.prenom = "Ryan";
		
		
		
	}
	public void setAdresse(String adressePostale) {
		this.monAdressePostale = adressePostale;
	}
	}
	
	
	
	

