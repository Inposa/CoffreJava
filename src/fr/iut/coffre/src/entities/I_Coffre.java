package fr.iut.coffre.src.entities;

public interface I_Coffre {

	public abstract void oterLivre();

	public abstract void remettreLivre();

	public abstract void tournerChandelleVersDroite();

	public abstract void tournerChandelleVersGauche();

	public abstract void fermerCoffre();

	public abstract boolean isLapinLibere();
	
	public abstract void setLapinLibere(boolean lapinLibere);
	
	public abstract void setChienLibere(boolean chienLibere);

	public abstract boolean isChienLibere();
	
	public abstract String getNomEtat();
	
	public abstract void setEtat(EtatsCoffre etatCoffre);
	
	public abstract void attacherObservateur(ObservateurCoffre O);

	
	public abstract boolean peutOterLivre();
	public abstract boolean peutRemettreLivre();
	public abstract boolean peutTournerChandelleDroite();
	public abstract boolean peutTournerChandelleGauche();
	public abstract boolean peutFermerCoffre();
	
	//public abstract boolean peutRemettreLivre();
	
	
	
}