package fr.iut.coffre.src.entities.etatsCoffre;

import fr.iut.coffre.src.entities.EtatsCoffre;
import fr.iut.coffre.src.entities.I_Coffre;

//Singleton
public class Cache extends EtatsCoffre{
	
	private static String NOM_ETAT = "Caché Par Bibliothèque";
	private static EtatsCoffre INSTANCE = null;

	private Cache(){}
	
	public static EtatsCoffre getInstance() {
		if(Cache.INSTANCE == null) {
			Cache.INSTANCE = new Cache();
		}
		
		return Cache.INSTANCE;
	}

	
	@Override
	public void oterLivre(I_Coffre coffre) {
		coffre.setEtat(Ferme.getInstance());
	}

	@Override
	public boolean lapinEstLibere() {
		return false;
	}

	@Override
	public boolean chienEstLibere() {
		return false;
	}

	@Override
	public String getNomEtat() {
		return Cache.NOM_ETAT;
	}
	
	@Override
	public boolean peutOterLivre() {
		return true;
	}

}
