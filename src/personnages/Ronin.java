package personnages;

public class Ronin extends Humain{
	private int reputation;

	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		this.reputation =1;
	}

}
