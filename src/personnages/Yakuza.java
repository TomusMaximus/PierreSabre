package personnages;

public class Yakuza extends Humain{
	private String clan; 
	private int reputation;
	
	public Yakuza(String nom, int argent, String boisson, String clan, int reputation) {
		super(nom, argent, boisson);
		this.clan = clan;
		this.reputation =reputation;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+ ", si tu tiens à la vie donne moi ta bourse !");
		int argVic = victime.getArgent();
		gagnerArgent(argVic);
		victime.seFaireExtorquer();
		parler("J’ai piqué les " + argVic + " sous de "+ victime.getNom()+", ce qui me fait "+ getArgent() + 
				"sous dans ma poche. Hi ! Hi !");
		reputation+=1;
	}
	
	public int perdre() {
		perdreArgent(getArgent());
		reputation--;
		parler("");
		return 0;
	}
}
