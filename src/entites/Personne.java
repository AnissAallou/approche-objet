package entites;

import java.util.Calendar;

public class Personne {

	public String nom; 
	public String prenom;
	public String adressePostale; 
	public int anneeNaissance;

	
	
	// Constructeur valorisant les attributs suivants : nom, prenom.
	public Personne(String nom, String prenom) {
		this.nom = nom; 
		this.prenom = prenom;
		
	}
	
	// Constructeur valorisant les attributs suivants : nom, prenom, adressePostale
	public Personne(String nom, String prenom, String adressePostale) {
		this.nom = nom; 
		this.prenom = prenom;
		this.adressePostale = adressePostale; 
		
	}
	
	public String toString(String nom, String prenom) {
	
			return "nom => " + nom + ", prenom => " + prenom;
			
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

	// setter ("mutateur") pour l'attribut anneeNaissance
	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}
	
	// méthode qui retourne l'âge de la personne
	public int getAge() {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		return year = this.anneeNaissance;
	}
	
	}



