package fr.iut.coffre.src.entities.etatsCoffre;

import fr.iut.coffre.src.entities.EtatsCoffre;
import fr.iut.coffre.src.entities.I_Coffre;

// Singleton
public class PresqueOuvert extends Visible {
	
	private static String NOM_ETAT = "Presque Ouvert";
	private static Visible INSTANCE = null;
	
	private PresqueOuvert() {}
	
	public static EtatsCoffre getInstance() {
		if(PresqueOuvert.INSTANCE == null) {
			PresqueOuvert.INSTANCE = new PresqueOuvert(); 
		}
		
		return PresqueOuvert.INSTANCE;
	}
	
	@Override
	public void tournerChandelleVersDroite(I_Coffre coffre) {
		coffre.setEtat(Ouvert.getInstance());
	}

	@Override
	public boolean lapinEstLibere() {
		return super.lapinEstLibere();
	}

	@Override
	public boolean chienEstLibere() {
		return true;
	}

	@Override
	public String getNomEtat() {
		return PresqueOuvert.NOM_ETAT;
	}

}