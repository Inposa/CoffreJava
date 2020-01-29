package fr.iut.coffre.src.entities;

public abstract class EtatsCoffre {
	
	//public abstract EtatsCoffre getInstance();
	
	public abstract boolean lapinEstLibere();

	public abstract boolean chienEstLibere();
	
	public abstract String getNomEtat();

	
	public void oterLivre(I_Coffre coffre) {}

	public void remettreLivre(I_Coffre coffre) {}

	public void tournerChandelleVersDroite(I_Coffre coffre) {}

	public void tournerChandelleVersGauche(I_Coffre coffre) {}

	public void fermerCoffre(I_Coffre coffre) {}
	
	public void libererChien(I_Coffre coffre) {}
	
	public void libererLapin(I_Coffre coffre) {}
	
	public void recupererChien(I_Coffre coffre) {}
	
	
	public boolean peutOterLivre() {
		return false;
	}

	public boolean peutRemettreLivre() {
		return false;
	}

	public boolean peutTournerChandelleDroite() {
		return false;
	}

	public boolean peutTournerChandelleGauche() {
		return false;
	}

	public boolean peutFermerCoffre() {
		return false;
	}

}
