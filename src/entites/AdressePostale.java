package entites;

public class AdressePostale {
	
	public int numeroRue = 18;
	public String libelleVoie = "Times Square Gardens";
	public int codePostal = 10010;
	public String ville = "NY City";

	public AdressePostale(int numeroRue, String libelleVoie, int codePostal, String ville) {
		this.numeroRue = numeroRue;
		this.libelleVoie = libelleVoie;
		this.codePostal = codePostal;
		this.ville = ville;
	}
}
