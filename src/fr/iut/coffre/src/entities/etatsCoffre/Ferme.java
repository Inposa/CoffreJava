package fr.iut.coffre.src.entities.etatsCoffre;

import fr.iut.coffre.src.entities.EtatsCoffre;
import fr.iut.coffre.src.entities.I_CoffreChateau;

//Singleton
public class Ferme extends Visible {
	
	private static String NOM_ETAT = "Ferme"; 
	private static Visible INSTANCE = null;
	
	private Ferme() {
		
	}
	
	public static EtatsCoffre getInstance() {
		if(Ferme.INSTANCE == null) {
			Ferme.INSTANCE = new Ferme();
		}
		
		return Ferme.INSTANCE;
	}
	
	@Override
	public void tournerChandelleVersDroite(I_CoffreChateau coffre) {
		this.libererChien(coffre);
		coffre.setEtat(PresqueOuvert.getInstance());
	}

	@Override
	public boolean chienEstLibere() {
		return false;
	}

	@Override
	public String getNomEtat() {
		return Ferme.NOM_ETAT;
	}




	
}
