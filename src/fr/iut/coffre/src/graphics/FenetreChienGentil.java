package fr.iut.coffre.src.graphics;

import java.awt.*;
import javax.swing.*;

import fr.iut.coffre.src.entities.I_Coffre;
import fr.iut.coffre.src.entities.ObservateurCoffre;

public class FenetreChienGentil extends JFrame implements ObservateurCoffre {

	private JTextField txtChien;

	public FenetreChienGentil() {
		setTitle("Chien du Chateau Médiéval");
		setBounds(300,500,190,130);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		JLabel labChien = new JLabel ("CHIEN");
		contentPane.add(labChien);
		txtChien = new JTextField(15);
		contentPane.add(txtChien);
		setVisible(true);
		afficherChien(false);
	}

	public void afficherChien(boolean libre) {
		if (libre == true)
			txtChien.setText("Le chien gentil est libéré !");
		else 
			txtChien.setText("Le chien gentil est enfermé");
	}

	@Override
	public void mettreAJour(I_Coffre coffre) {
		//Mettre à jour l'affichage du chien 
		this.afficherChien(coffre.isChienLibere());
	}
}