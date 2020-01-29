package fr.iut.coffre.src.entities.etatsCoffre;

import fr.iut.coffre.src.entities.EtatsCoffre;
import fr.iut.coffre.src.entities.I_Coffre;

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
	public void fermerCoffre(I_Coffre coffre) {
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

	@Override
	public boolean peutFermerCoffre() {
		return true;
	}

}
