package fr.iut.coffre.src.etatsCoffre;

import fr.iut.coffre.src.EtatsCoffre;
import fr.iut.coffre.src.I_CoffreChateau;

public abstract class Visible extends EtatsCoffre {

	@Override
	public void remettreLivre(I_CoffreChateau coffre) {
		this.recupererChien(coffre);
		coffre.setEtat(Cache.getInstance());
	}

	@Override
	public abstract void tournerChandelleVersDroite(I_CoffreChateau coffre);

	@Override
	public void tournerChandelleVersGauche(I_CoffreChateau coffre) {
		this.libererLapin(coffre);
		coffre.setEtat(Bloque.getInstance());
	}

	@Override
	public boolean lapinEstLibere() {
		return false;
	}

	@Override
	public abstract boolean chienEstLibere();
	
	@Override
	public void recupererChien(I_CoffreChateau coffre) {
		coffre.setChienLibere(false);
	}
	
	@Override
	public void libererLapin(I_CoffreChateau coffre) {
		coffre.setLapinLibere(true);
	}
	
	@Override
	public void libererChien(I_CoffreChateau coffre) {
		coffre.setChienLibere(true);
	}

	@Override
	public abstract String getNomEtat();


}
