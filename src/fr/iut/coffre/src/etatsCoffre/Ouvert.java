package fr.iut.coffre.src.etatsCoffre;

import fr.iut.coffre.src.EtatsCoffre;
import fr.iut.coffre.src.I_CoffreChateau;

//Singleton
public class Ouvert extends EtatsCoffre {

	private static String NOM_ETAT = "Ouvert";
	private static EtatsCoffre INSTANCE = null;
	
	private Ouvert() {}
	
	public static EtatsCoffre getInstance() {
		if(Ouvert.INSTANCE == null) {
			Ouvert.INSTANCE = new Ouvert();
		}
		
		return Ouvert.INSTANCE;
	}
	
	@Override
	public void fermerCoffre(I_CoffreChateau coffre) {
		coffre.setEtat(Ferme.getInstance());
	}

	@Override
	public boolean lapinEstLibere() {
		return false;
	}

	@Override
	public boolean chienEstLibere() {
		return true;
	}

	@Override
	public String getNomEtat() {
		return Ouvert.NOM_ETAT;
	}


}
