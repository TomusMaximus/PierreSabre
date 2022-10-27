package personnages;

public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		super(nom, argent, "th�");
	}
	
	public void seFaireExtorquer(){
		perdreArgent(getArgent());
		parler("J�ai tout perdu! Le monde est trop injuste...");
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent +" sous ! Je te remercie g�n�reux donateur!");
		
	}

}
