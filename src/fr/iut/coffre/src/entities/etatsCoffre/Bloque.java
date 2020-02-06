package fr.iut.coffre.src.entities.etatsCoffre;

import fr.iut.coffre.src.entities.EtatsCoffre;

//Singleton
public class Bloque extends EtatsCoffre {

	private static String NOM_ETAT = "Bloqué";
	private static EtatsCoffre INSTANCE = null;

	private Bloque() {}
	
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
