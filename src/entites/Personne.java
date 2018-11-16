package entites;

import java.util.Calendar;

public class Personne {

	public String nom; 
	public String prenom;
	public String adressePostale; 
	public int anneeNaissance;

	
	
	
	public Personne(String nom, String prenom) {
		this.nom = nom; 
		this.prenom = prenom;
		
	}
	
	public Personne(String nom, String prenom, String adressePostale) {
		this.nom = nom; 
		this.prenom = prenom;
		this.adressePostale = adressePostale; 
		
	}
	
	public String toString(String nom, String prenom) {
	
			return "nom => " + nom + ", prenom => " + prenom;
			
		}	
	
	public void setNom(String nom) {	
		this.nom = nom;
	}
	
	public void setPrenom(String prenom) {	
		this.prenom = prenom;
	}
	
	public void setAdresse(String adressePostale) {	
		this.adressePostale = adressePostale;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public String getAdresse() {
		return adressePostale;
	}
	
	public int getAnneeNaissance() {
		return anneeNaissance;
	}
	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}
	
	public int getAge() {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		return year = this.anneeNaissance;
	}
	
	}



