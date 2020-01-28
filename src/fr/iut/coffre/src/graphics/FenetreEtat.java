package fr.iut.coffre.src.graphics;

import java.awt.*;
import javax.swing.*;

import fr.iut.coffre.src.entities.I_CoffreChateau;
import fr.iut.coffre.src.entities.Observateur;

public class FenetreEtat extends JFrame implements Observateur {

	private JTextField txtEtat;

	public FenetreEtat() {
		setTitle("Etat du coffre");
		setBounds(500,500,190,130);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		JLabel labEtat = new JLabel("ETAT");
		contentPane.add(labEtat);
		txtEtat = new JTextField(15);
		contentPane.add(txtEtat);
		setVisible(true);
		afficherEtat("pas d'état");
	}

	public void afficherEtat(String etat) {
		txtEtat.setText(etat);
	}

	@Override
	public void mettreAJour(I_CoffreChateau coffre) {
		this.afficherEtat(coffre.getNomEtat());
	}
	
	
	
}