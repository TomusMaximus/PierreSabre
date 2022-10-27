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
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom()+ ", si tu tiens � la vie donne moi ta bourse !");
		int arg_vic = victime.getArgent();
		gagnerArgent(arg_vic);
		victime.seFaireExtorquer();
		parler("J�ai piqu� les " + arg_vic + " sous de "+ victime.getNom()+", ce qui me fait "+ getArgent() + 
				"sous dans ma poche. Hi ! Hi !");
		reputation+=1;
	}
}
