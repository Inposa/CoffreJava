package fr.iut.coffre.src.graphics;

import java.awt.*;
import javax.swing.*;

import fr.iut.coffre.src.entities.I_CoffreChateau;
import fr.iut.coffre.src.entities.Observateur;

public class FenetreLapinTueur extends JFrame implements Observateur{

	private JTextField txtLapin;

	public FenetreLapinTueur() {
		setTitle("Lapin du Chateau Médiéval");
		setBounds(700,500,190,130);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel labLapin = new JLabel ("LAPIN");
		contentPane.add(labLapin);
		txtLapin = new JTextField(15);
		contentPane.add(txtLapin);
		setVisible(true);
		afficherLapin(false);
	}
	
	public void afficherLapin(boolean libre) {
		if (libre == true)
			txtLapin.setText("Le lapin tueur est libéré !");
		else 
			txtLapin.setText("Le lapin tueur est enfermé");
	}

	@Override
	public void mettreAJour(I_CoffreChateau coffre) {
		this.afficherLapin(coffre.isLapinLibere());
	}
}