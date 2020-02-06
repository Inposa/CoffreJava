package fr.iut.coffre.src.controllers;

import fr.iut.coffre.src.entities.ObservateurCoffre;

//Stratégie
public interface ControllerChateauMedieval {
	public abstract void oterLivre();

	public abstract void remettreLivre();

	public abstract void tournerChandelleVersDroite();

	public abstract void tournerChandelleVersGauche();

	public abstract void fermerCoffre();

	public abstract void setObservateur(ObservateurCoffre O);
	
	
	//public boolean isLapinLibere();
	
	//public void setLapinLibere(boolean lapinLibere);
	
	//public void setChienLibere(boolean chienLibere);

	//public boolean isChienLibere();
	
	//public String getNomEtat();
	
	//public void setEtat(EtatsCoffre etatCoffre);
}
