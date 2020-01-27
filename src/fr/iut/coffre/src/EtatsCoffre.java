package fr.iut.coffre.src;

public abstract class EtatsCoffre {
	
	//public abstract EtatsCoffre getInstance();
	
	public abstract boolean lapinEstLibere();

	public abstract boolean chienEstLibere();
	
	public abstract String getNomEtat();

	
	public void oterLivre(I_CoffreChateau coffre) {}

	public void remettreLivre(I_CoffreChateau coffre) {}

	public void tournerChandelleVersDroite(I_CoffreChateau coffre) {}

	public void tournerChandelleVersGauche(I_CoffreChateau coffre) {}

	public void fermerCoffre(I_CoffreChateau coffre) {}
	
	public void libererChien(I_CoffreChateau coffre) {}
	
	public void libererLapin(I_CoffreChateau coffre) {}
	
	public void recupererChien(I_CoffreChateau coffre) {}

}
