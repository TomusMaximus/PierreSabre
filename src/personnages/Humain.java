package personnages;

public class Humain {
	private String nom;
	private int argent;
	private String boisson; 

	public Humain (String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;

	}
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}

	public void parler(String texte) {
		System.out.println("("+ nom +") - "+ texte);
	}
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	public void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public void gagnerArgent(int salaire) {
		argent += salaire;
	}
	
	public void acheter(String article, int prix) {
		if (argent> prix){
			parler("J'ai " +argent+" sous en poche. Je vais pouvoir m'offrir " + article+ "à" + prix+ "sous");
			argent -= prix;
		}
		else {
			parler("Je n'ai plus que " +argent+"sous en poche. Je ne peux même pas m'offrir un kimono à\r\n" 
					+ prix+" sous.");
		}
	}
}
