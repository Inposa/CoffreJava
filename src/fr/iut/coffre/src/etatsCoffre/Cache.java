package fr.iut.coffre.src.etatsCoffre;

import fr.iut.coffre.src.EtatsCoffre;
import fr.iut.coffre.src.I_CoffreChateau;

//Singleton
public class Cache extends EtatsCoffre{
	
	private static String NOM_ETAT = "CacheParBibliotheque";
	private static EtatsCoffre INSTANCE = null;

	private Cache(){}
	
	public static EtatsCoffre getInstance() {
		if(Cache.INSTANCE == null) {
			Cache.INSTANCE = new Cache();
		}
		
		return Cache.INSTANCE;
	}

	
	@Override
	public void oterLivre(I_CoffreChateau coffre) {
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


}
