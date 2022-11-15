package personnages;

public class Humain {
	private String nom;
	private int argent;
	private String boisson;
	private Humain[] memoire;
	private int nbMemoire = 0;

	public Humain (String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
		this.memoire = new Humain[30];

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
	
	public void memoriser(Humain autrehumain) {
		if (nbMemoire == 30) {
			return;
		}
		memoire[nbMemoire] = autrehumain;
		nbMemoire++;
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.direBonjour();
		memoriser(autreHumain);
		autreHumain.memoriser(this);
	}
	
	public void listerConnaissance() {
		System.out.print( "(" + nom + ") - Je connais beaucoup de monde dont: ");
		for (int i=0; i<nbMemoire; ++i){
			System.out.print(memoire[i].getNom());
			if (i != nbMemoire-1) {
				System.out.print(", ");
			}
		}
		System.out.println("");
	}
}
