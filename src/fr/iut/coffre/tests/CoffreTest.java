package fr.iut.coffre.tests;

//import fr.iut.coffre.src.*;
import fr.iut.coffre.src.entities.Coffre;
import fr.iut.coffre.src.entities.I_Coffre;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CoffreTest {
	
	private I_Coffre coffre;

	@Before
	public void setUp() throws Exception {
		coffre = new Coffre();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAuDemarrage() {
		assertEquals("Caché Par Bibliothèque",coffre.getNomEtat());
		assertFalse(coffre.isChienLibere());
		assertFalse(coffre.isLapinLibere());
	}

	@Test
	public void testApresAvoirOteLeLivreDeLaBibliotheque() {
		coffre.oterLivre();
		assertEquals("Fermé",coffre.getNomEtat());
		assertFalse(coffre.isChienLibere());
		assertFalse(coffre.isLapinLibere());
	}
	
	@Test
	public void testApresAvoirRemisLeLivreDansLaBibliothequeSansAvoirTouchePrealablementALaChandelle() {
		coffre.oterLivre();
		coffre.remettreLivre();
		assertEquals("Caché Par Bibliothèque",coffre.getNomEtat());
		assertFalse(coffre.isChienLibere());
		assertFalse(coffre.isLapinLibere());
	}
	
	@Test
	public void tournerChandelleDroiteLibererChienGentil() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		
		assertEquals("Presque Ouvert", coffre.getNomEtat());
		assertTrue(coffre.isChienLibere());
		assertFalse(coffre.isLapinLibere());
		
	}
	
	@Test
	public void tournerChandelleGaucheLibererLapinMechant() {
		coffre.oterLivre();
		coffre.tournerChandelleVersGauche();
		
		assertEquals("Bloqué", coffre.getNomEtat());
		assertFalse(coffre.isChienLibere());
		assertTrue(coffre.isLapinLibere());
	}

	@Test
	public void oterLivreEtRemettre100fois() {
		for(int i=0;i>100;i++) {
			coffre.oterLivre();
			coffre.remettreLivre();
		}
		
		assertEquals("Caché Par Bibliothèque",coffre.getNomEtat());
		assertFalse(coffre.isChienLibere());
		assertFalse(coffre.isLapinLibere());
	}
	
	@Test
	public void tournerChandelleSansLivre() {
		coffre.tournerChandelleVersDroite();
		
		assertEquals("Caché Par Bibliothèque", coffre.getNomEtat());
		assertFalse(coffre.isChienLibere());
		assertFalse(coffre.isLapinLibere());
	}
	
	@Test	
	public void retournerAEtatInitialApresLiberationDuChien() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.remettreLivre();
		
		assertEquals("Caché Par Bibliothèque", coffre.getNomEtat());
		assertFalse(coffre.isChienLibere());
		assertFalse(coffre.isLapinLibere());
	}
	
	@Test	
	public void fermerCoffre100FoisDansEtatInitial() {
		for(int i=0;i<100;i++) {
			coffre.fermerCoffre();
		}
		
		assertEquals("Caché Par Bibliothèque", coffre.getNomEtat());
		assertFalse(coffre.isChienLibere());
		assertFalse(coffre.isLapinLibere());
	}

	@Test
	public void tournerChandelleDroite100Fois() {
		coffre.oterLivre();
		for(int i = 0;i<100;i++) {
			coffre.tournerChandelleVersDroite();
		}
		
		assertEquals("Ouvert", coffre.getNomEtat());
		assertTrue(coffre.isChienLibere());
		assertFalse(coffre.isLapinLibere());
	}

	@Test
	public void debloquerCoffreEtRevenirEtatInitial() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		coffre.fermerCoffre();
		coffre.remettreLivre();
		
		assertEquals("Caché Par Bibliothèque", coffre.getNomEtat());
		assertFalse(coffre.isChienLibere());
		assertFalse(coffre.isLapinLibere());
	}

	@Test
	public void faireNimporteQuoiSaufRetirerLivre() {
		for(int i=0;i<100;i++) {
			coffre.tournerChandelleVersDroite();
			coffre.tournerChandelleVersGauche();
			coffre.fermerCoffre();
			coffre.remettreLivre();
		}
		
		assertEquals("Caché Par Bibliothèque", coffre.getNomEtat());
		assertFalse(coffre.isChienLibere());
		assertFalse(coffre.isLapinLibere());
	}

	@Test
	public void tenterDAgirLorsqueCoffreBloqué() {
		coffre.oterLivre();
		coffre.tournerChandelleVersGauche();
		
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		
		assertEquals("Bloqué",coffre.getNomEtat());
		assertFalse(coffre.isChienLibere());
		assertTrue(coffre.isLapinLibere());
	}
	
}
