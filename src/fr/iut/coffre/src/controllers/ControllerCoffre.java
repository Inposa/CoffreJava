package fr.iut.coffre.src.controllers;

import fr.iut.coffre.src.entities.Coffre;
import fr.iut.coffre.src.entities.EtatsCoffre;
//import fr.iut.coffre.src.entities.EtatsCoffre;
import fr.iut.coffre.src.entities.I_Coffre;
import fr.iut.coffre.src.entities.ObservateurCoffre;

public class ControllerCoffre implements ControllerChateauMedieval {
	private I_Coffre coffre;
	
	public ControllerCoffre(I_Coffre coffre) {
		//this.coffre = new Coffre();
		this.coffre = coffre;
	}

	@Override
	public void oterLivre() {
		this.coffre.oterLivre();
	}

	@Override
	public void remettreLivre() {
		this.coffre.remettreLivre();
	}

	@Override
	public void tournerChandelleVersDroite() {
		this.coffre.tournerChandelleVersDroite();
	}

	@Override
	public void tournerChandelleVersGauche() {
		this.coffre.tournerChandelleVersGauche();
	}

	@Override
	public void fermerCoffre() {
		this.coffre.fermerCoffre();
	}

	@Override
	public void setObservateur(ObservateurCoffre Obs) {
		this.coffre.attacherObservateur(Obs);
	}

	
	//public boolean isLapinLibere();
	
	//public void setLapinLibere(boolean lapinLibere);
	
	//public void setChienLibere(boolean chienLibere);

	//public boolean isChienLibere();
	
	//public String getNomEtat();
	
	//public void setEtat(EtatsCoffre etatCoffre);

	
}
