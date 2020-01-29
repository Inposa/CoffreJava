package fr.iut.coffre.src.entities;

import java.util.ArrayList;
import java.util.List;

import fr.iut.coffre.src.entities.etatsCoffre.Cache;

// Contexte

public class Coffre implements I_Coffre {
	
	private boolean chienLibere;
	private boolean lapinLibere;
	
	private EtatsCoffre etat;
	
	private String nomEtat;
	
	//Observateurs qui mettrons à jour les fenêtres d'état
	private List<ObservateurCoffre> auditeurs;
	
	
	public Coffre() {
		this.auditeurs = new ArrayList<ObservateurCoffre>();
		
		this.etat = Cache.getInstance();
		this.nomEtat = etat.getNomEtat();
		
		// = false pour les deux
		this.chienLibere = this.etat.chienEstLibere();
		this.lapinLibere = this.etat.lapinEstLibere();
		
	
		
	}
	
	//Ajouter un observateur à la liste
	@Override
	public void attacherObservateur(ObservateurCoffre O) {
		this.auditeurs.add(O);
		O.mettreAJour(this);
		
	}
	
	private void avertir() {
		for(ObservateurCoffre O : this.auditeurs) {
			O.mettreAJour(this);
		}
	}
	
	
	@Override
	public void oterLivre() {
		this.etat.oterLivre(this);
	}

	@Override
	public void remettreLivre() {
		this.etat.remettreLivre(this);
	}

	@Override
	public void tournerChandelleVersDroite() {
		this.etat.tournerChandelleVersDroite(this);
	}

	@Override
	public void tournerChandelleVersGauche() {
		this.etat.tournerChandelleVersGauche(this);
	}

	@Override
	public void fermerCoffre() {
		this.etat.fermerCoffre(this);
	}


	@Override
	public String getNomEtat() {
		return this.nomEtat;
	}

	@Override
	public boolean isChienLibere() {
		return chienLibere;
	}

	@Override
	public void setChienLibere(boolean chienLibere) {
		this.chienLibere = chienLibere;
	}

	@Override
	public boolean isLapinLibere() {
		return lapinLibere;
	}

	@Override
	public void setLapinLibere(boolean lapinLibere) {
		this.lapinLibere = lapinLibere;
	}

	@Override
	public void setEtat(EtatsCoffre etatCoffre) {
		this.etat = etatCoffre;
		this.nomEtat = etat.getNomEtat();
		
		this.avertir();
	}

	@Override
	public boolean peutOterLivre() {
		return this.etat.peutOterLivre();
	}

	@Override
	public boolean peutRemettreLivre() {
		return this.etat.peutRemettreLivre();
	}

	@Override
	public boolean peutTournerChandelleDroite() {
		return this.etat.peutTournerChandelleDroite();
	}

	@Override
	public boolean peutTournerChandelleGauche() {
		return this.etat.peutTournerChandelleGauche();
	}

	@Override
	public boolean peutFermerCoffre() {
		return this.etat.peutFermerCoffre();
	}

}
