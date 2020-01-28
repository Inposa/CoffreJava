package fr.iut.coffre.src.entities;

import java.util.ArrayList;
import java.util.List;

import fr.iut.coffre.src.entities.etatsCoffre.Cache;

// Contexte

public class Coffre implements I_CoffreChateau {
	
	private boolean chienLibere;
	private boolean lapinLibere;
	
	private EtatsCoffre etat;
	
	private String nomEtat;
	
	private List<Observateur> auditeurs;
	
	
	public Coffre() {
		this.auditeurs = new ArrayList<Observateur>();
		
		this.etat = Cache.getInstance();
		this.nomEtat = etat.getNomEtat();
		
		// = false pour les deux
		this.chienLibere = this.etat.chienEstLibere();
		this.lapinLibere = this.etat.lapinEstLibere();
		
	
		
	}
	
	//Ajouter un observateur à la liste
	@Override
	public void attacherObservateur(Observateur O) {
		this.auditeurs.add(O);
		O.mettreAJour(this);
		
	}
	
	private void avertir() {
		for(Observateur O : this.auditeurs) {
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

}
