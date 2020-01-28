package fr.iut.coffre.src.controllers;

import fr.iut.coffre.src.entities.Coffre;
import fr.iut.coffre.src.entities.EtatsCoffre;
//import fr.iut.coffre.src.entities.EtatsCoffre;
import fr.iut.coffre.src.entities.I_CoffreChateau;
import fr.iut.coffre.src.entities.Observateur;

public class FacadeCoffre {
	private I_CoffreChateau coffre;
	
	public FacadeCoffre() {
		this.coffre = new Coffre();
	}

	public void oterLivre() {
		this.coffre.oterLivre();
	}

	public void remettreLivre() {
		this.coffre.remettreLivre();
	}

	public void tournerChandelleVersDroite() {
		this.coffre.tournerChandelleVersDroite();
	}

	public void tournerChandelleVersGauche() {
		this.coffre.tournerChandelleVersGauche();
	}

	public void fermerCoffre() {
		this.coffre.fermerCoffre();
	}

	public void attacherObservateur(Observateur O) {
		this.coffre.attacherObservateur(O);
	}
	
	//public boolean isLapinLibere();
	
	//public void setLapinLibere(boolean lapinLibere);
	
	//public void setChienLibere(boolean chienLibere);

	//public boolean isChienLibere();
	
	//public String getNomEtat();
	
	//public void setEtat(EtatsCoffre etatCoffre);

	
}
