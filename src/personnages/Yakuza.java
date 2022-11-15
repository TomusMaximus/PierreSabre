package personnages;

public class Yakuza extends Humain{
	private String clan; 
	private int reputation;
	
	public Yakuza(String nom, int argent, String boisson, String clan, int reputation) {
		super(nom, argent, boisson);
		this.clan = clan;
		this.setReputation(reputation);
	}
		public String getClan() {
		return clan;
	}

	int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public void setClan(String clan) {
		this.clan = clan;
	}


	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+ ", si tu tiens à la vie donne moi ta bourse !");
		int argVic = victime.getArgent();
		gagnerArgent(argVic);
		victime.seFaireExtorquer();
		parler("J’ai piqué les " + argVic + " sous de "+ victime.getNom()+", ce qui me fait "+ getArgent() + 
				"sous dans ma poche. Hi ! Hi !");
		setReputation(getReputation() + 1);
	}
	
	public void perdre(Ronin adversaire) {
		adversaire.parler("Je t’ai eu petit yakusa ! ");
		parler("- J’ai perdu mon duel et mes " + getArgent() + 
				" sous, snif... J'ai déshonoré le clan de " + getClan() + ".");
		adversaire.gagnerArgent(getArgent());			
		perdreArgent(getArgent());
		reputation--;
	}
	
	public void gagner(Ronin adversaire) {
		adversaire.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
		parler("Ce ronin pensait vraiment battre" +getNom() + " du clan de " +getClan() + 
				" ? Je l'ai dépouillé de ses " +  adversaire.getArgent() + " sous." );
		gagnerArgent(adversaire.getArgent());
		adversaire.perdreArgent(adversaire.getArgent());
		reputation++;
	}
	
}
