package fr.iut.coffre.src.etatsCoffre;

import fr.iut.coffre.src.EtatsCoffre;
import fr.iut.coffre.src.I_CoffreChateau;

// Singleton
public class PresqueOuvert extends Visible {
	
	private static String NOM_ETAT = "PresqueOuvert";
	private static Visible INSTANCE = null;
	
	private PresqueOuvert() {}
	
	public static EtatsCoffre getInstance() {
		if(PresqueOuvert.INSTANCE == null) {
			PresqueOuvert.INSTANCE = new PresqueOuvert(); 
		}
		
		return PresqueOuvert.INSTANCE;
	}
	
	@Override
	public void tournerChandelleVersDroite(I_CoffreChateau coffre) {
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