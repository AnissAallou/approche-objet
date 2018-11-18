package essais;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		// 2 instances de la classe Personne
		Personne personne1 = new Personne("Aallou","Aniss","42 rue Mont Saint Michel",1995);
		Personne personne2 = new Personne("Cabella", "Rémy","32 rue des Haricots", 1988);
		
		personne1.printPersonne();
		personne2.printPersonne();
		System.out.println(personne1.getAge());
	}

}
