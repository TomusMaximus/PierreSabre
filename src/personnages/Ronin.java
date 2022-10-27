package personnages;

public class Ronin extends Humain{
	private int reputation;

	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		this.reputation =1;
	}
	
	public void donner(Commercant beneficiaire) {
		int don = getArgent()/10;
		perdreArgent(don);
		parler(beneficiaire.getNom() + " prend ces "+ don+ " sous.");
		beneficiaire.recevoir(don);
	}

}
