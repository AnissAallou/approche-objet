package entites;

public class AdressePostale {
	
	public int numeroRue = 18;
	public String libelleVoie = "Times Square Gardens";
	public int codePostal = 10010;
	public String ville = "NY City";
	
	

	//constructeur 
	public AdressePostale(int numeroRue, String libelleVoie, int codePostal, String ville) {
		this.numeroRue = numeroRue;
		this.libelleVoie = libelleVoie;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	// getters (accesseurs)
	
	public AdressePostale(String libelleVoie, String ville, int codePostal) {
		this.libelleVoie = libelleVoie; 
		this.ville = ville; 
		this.codePostal = codePostal;
	}

	public int getNumeroRue() {
		return numeroRue;
	}

	public String getLibelleVoie() {
		return libelleVoie;
	}
	
	public String getVille() {
		return ville;
	}
	
	public int getCodePostal() {
		return codePostal;
	}
	
	
	// setters (mutateurs)
	
	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	public void setLibelleVoie(String libelleVoie) {
		this.libelleVoie = libelleVoie;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	
	public void printAdresse() { // méthode pour afficher l'adresse
		System.out.println("numéro de Rue => " + this.numeroRue + " libellé de voie => " + this.libelleVoie + " ville => " + this.ville + " code postal => " + this.codePostal);
	}

}
