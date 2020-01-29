package fr.iut.coffre.src.graphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import fr.iut.coffre.src.controllers.ControllerChateauMedieval;
import fr.iut.coffre.src.controllers.ControllerCoffre;
import fr.iut.coffre.src.entities.CoffreBuilder;
import fr.iut.coffre.src.entities.I_Coffre;
import fr.iut.coffre.src.entities.ObservateurCoffre;

public class FenetreChateauMedieval extends JFrame implements ActionListener,
WindowListener, ObservateurCoffre{

	private JButton btOterLivre;
	private JButton btRemettreLivre;
	private JButton btTournerGauche;
	private JButton btTournerDroite;
	private JButton btFermerCoffre;
	private JButton btQuitter;

	private ControllerChateauMedieval controllerChateau;

	// Fenêtre d'affichage principale
	public FenetreChateauMedieval() {

		setTitle("exercice Chateau Médiéval (F02)");
		setBounds(500, 100, 400, 200);
		JPanel panBibliotheque = new JPanel();
		JPanel panCentre = new JPanel();
		JPanel panChandelle = new JPanel();
		JPanel panCoffre = new JPanel();
		JPanel panQuitter = new JPanel();
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		btOterLivre = new JButton("Oter livre UML");
		btRemettreLivre = new JButton("Remettre livre UML");
		btTournerGauche = new JButton("Tourner chandelle gauche");
		btTournerDroite = new JButton("Tourner chandelle droite");
		btFermerCoffre = new JButton("Fermer Coffre");
		btQuitter = new JButton("Quitter");
		panBibliotheque.add(btOterLivre);
		panBibliotheque.add(btRemettreLivre); 
		panChandelle.add(btTournerGauche);
		panChandelle.add(btTournerDroite); 
		panCoffre.add(btFermerCoffre);  
		panQuitter.add(btQuitter);

		panCentre.add(panChandelle, "North");
		panCentre.add(panCoffre, "South");			
		contentPane.add(panBibliotheque, "North");
		contentPane.add(panCentre);
		contentPane.add(panQuitter, "South");

		btOterLivre.addActionListener(this);
		btRemettreLivre.addActionListener(this);
		btTournerGauche.addActionListener(this);
		btTournerDroite.addActionListener(this);
		btFermerCoffre.addActionListener(this);
		btQuitter.addActionListener(this);

		addWindowListener(this);
		setVisible(true);

		this.controllerChateau = new ControllerCoffre(CoffreBuilder.getNewCoffre());


	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btOterLivre) {
			this.controllerChateau.oterLivre();
			System.out.println("Vous venez d'appuyer sur le bouton Oter Livre UML");
		}
		if (e.getSource() == btRemettreLivre) {
			this.controllerChateau.remettreLivre();
			System.out.println("Vous venez d'appuyer sur le bouton Remettre Livre UML");
		}

		if (e.getSource() == btTournerGauche) {
			this.controllerChateau.tournerChandelleVersGauche();
			System.out.println("Vous venez d'appuyer sur le bouton Tourner Chandelle vers la Gauche");
		}
		if (e.getSource() == btTournerDroite) {
			this.controllerChateau.tournerChandelleVersDroite();
			System.out.println("Vous venez d'appuyer sur le bouton Tourner Chandelle vers la Droite");
		}
		if (e.getSource() == btFermerCoffre) {
			this.controllerChateau.fermerCoffre();
			System.out.println("Vous venez d'appuyer sur le bouton Fermer Coffre");
		}
		if (e.getSource() == btQuitter){
			System.out.println("Vous venez d'appuyer sur le bouton Quitter, bye bye !");
			System.exit(0);
		}	
	}

	public void windowClosing(WindowEvent arg0) {
		System.out.println("Bye bye !");
		System.exit(0);
	}

	public void windowActivated(WindowEvent arg0) {}
	public void windowClosed(WindowEvent arg0) {}
	public void windowDeactivated(WindowEvent arg0) {}
	public void windowDeiconified(WindowEvent arg0) {}
	public void windowIconified(WindowEvent arg0) {}
	public void windowOpened(WindowEvent arg0) {}


	//Pour cacher boutons après	
	private void afficherBtChandelle() {
		btTournerDroite.setVisible(true);
		btTournerGauche.setVisible(true);
	}

	private void cacherBtChandelle() {
		btTournerDroite.setVisible(false);
		btTournerGauche.setVisible(false);
	}

	private void afficherBtFermerCoffre() {
		btFermerCoffre.setVisible(true);
	}

	private void cacherBtFermerCoffre() {
		btFermerCoffre.setVisible(false);
	}

	private void afficherBtOterLivre() {
		btOterLivre.setVisible(true);
	}

	private void cacherBtOterLivre() {
		btOterLivre.setVisible(false);
	}

	private void afficherBtRemettreLivre() {
		btRemettreLivre.setVisible(true);
	}

	private void cacherBtRemettreLivre() {
		btRemettreLivre.setVisible(false);
	}

	public static void main(String[] args) {
		FenetreChateauMedieval c = new FenetreChateauMedieval();

		FenetreChienGentil F_chienGentil = new FenetreChienGentil();
		FenetreEtat F_etat = new FenetreEtat();
		FenetreLapinTueur F_lapin = new FenetreLapinTueur();

		c.controllerChateau.setObservateur(F_chienGentil);
		c.controllerChateau.setObservateur(F_etat);
		c.controllerChateau.setObservateur(F_lapin);


	}

	@Override
	public void mettreAJour(I_Coffre coffre) {

	}

}




