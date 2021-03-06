package fr.iut.coffre.src.etatsCoffre;

import fr.iut.coffre.src.EtatsCoffre;

//Singleton
public class Bloque extends EtatsCoffre {

	private static String NOM_ETAT = "Bloque";
	private static EtatsCoffre INSTANCE = null;

	private Bloque() {
		
	}
	
	public static EtatsCoffre getInstance() {
		if(Bloque.INSTANCE == null) {
			Bloque.INSTANCE = new Bloque();
		}
		
		return Bloque.INSTANCE;
	}
	

	@Override
	public boolean lapinEstLibere() {
		return true;
	}

	@Override
	public boolean chienEstLibere() {
		return false;
	}

	@Override
	public String getNomEtat() {
		return Bloque.NOM_ETAT;
	}




}
