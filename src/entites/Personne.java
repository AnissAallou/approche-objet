package entites;

import java.util.*;

public class Personne {

	public String nom; 
	public String prenom;
	public String adressePostale;
	public int anneeNaissance;


	
	// Constructeur valorisant les attributs suivants : nom, prenom, adressePostale
	public Personne(String nom, String prenom, String adressePostale, int anneeNaissance) {
		
		this.nom = nom; 
		this.prenom = prenom;
		this.adressePostale = adressePostale; 
		this.anneeNaissance = anneeNaissance;
		
	}
	
	public void printPersonne() { // méthode pour afficher le nom, le prénom et l'adresse
		System.out.println("Nom => " + this.nom + "; prenom => " + this.prenom + "; adresse => " + this.adressePostale);
	}

	
	// méthode qui retourne l'âge de la personne
	public String getAge() {
		int year = Calendar.getInstance().get(Calendar.YEAR); // renvoie la valeur du champ de calendrier donné.
		return year - this.anneeNaissance + " ans";
	}
	
	// getter ("accesseur") pour l'attribut nom
	public String getNom() {
		return nom;
	}
	
	// getter ("accesseur") pour l'attribut prenom
	public String getPrenom() {
		return prenom;
	}
	
	// getter ("accesseur") pour l'attribut adressePostale
	public String getAdresse() {
		return adressePostale;
	}
	
	// getter ("accesseur") pour l'attribut anneeNaissance
	public int getAnneeNaissance() {
		return anneeNaissance;
	}
	
	// setter ("mutateur") pour l'attribut nom
	public void setNom(String nom) {	
		this.nom = nom;
	}
	
	// setter ("mutateur") pour l'attribut prenom
	public void setPrenom(String prenom) {	
		this.prenom = prenom;
	}
	
	// setter ("mutateur") pour l'attribut adressePostale
	public void setAdresse(String adressePostale) {	
		this.adressePostale = adressePostale;
	}

	// setter ("mutateur") pour l'attribut anneeNaissance
	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}
	

	
}



