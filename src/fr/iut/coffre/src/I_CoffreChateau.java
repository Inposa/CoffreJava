package fr.iut.coffre.src;

public interface I_CoffreChateau {

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

}