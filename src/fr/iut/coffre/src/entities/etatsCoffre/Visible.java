package fr.iut.coffre.src.entities.etatsCoffre;

import fr.iut.coffre.src.entities.EtatsCoffre;
import fr.iut.coffre.src.entities.I_Coffre;

public abstract class Visible extends EtatsCoffre {

	@Override
	public void remettreLivre(I_Coffre coffre) {
		this.recupererChien(coffre);
		coffre.setEtat(Cache.getInstance());
	}

	@Override
	public abstract void tournerChandelleVersDroite(I_Coffre coffre);

	@Override
	public void tournerChandelleVersGauche(I_Coffre coffre) {
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
	public void recupererChien(I_Coffre coffre) {
		coffre.setChienLibere(false);
	}
	
	@Override
	public void libererLapin(I_Coffre coffre) {
		coffre.setLapinLibere(true);
	}
	
	@Override
	public void libererChien(I_Coffre coffre) {
		coffre.setChienLibere(true);
	}

	@Override
	public abstract String getNomEtat();

	
	@Override
	public boolean peutRemettreLivre() {
		return true;
	}

	@Override
	public boolean peutTournerChandelleDroite() {
		return true;
	}

	@Override
	public boolean peutTournerChandelleGauche() {
		return true;
	}

}
