

import javax.swing.plaf.synth.SynthSeparatorUI;

public class HelloUniverse extends Planete {

	public static void main(String[] args) {

		Planete mercure = new Planete();
		mercure.nom = "Mercure";
		mercure.diametre = 4880;
		mercure.matiere = "Tellurique";
		Planete venus = new Planete();
		venus.nom = "Venus";
		venus.diametre = 12100;
		venus.matiere = "Tellurique";
		Planete terre = new Planete();
		terre.nom = "Terre";
		terre.diametre = 12756;
		terre.matiere = "Tellurique";
		Planete mars = new Planete();
		mars.nom = "Mars";
		mars.diametre = 6792;
		mars.matiere = "Tellurique";
		Planete jupiter = new Planete();
		jupiter.nom = "Jupiter";
		jupiter.diametre = 142984;
		jupiter.matiere = "Gazeuse";
		Planete saturne = new Planete();
		saturne.nom = "Saturne";
		saturne.diametre = 120536;
		saturne.matiere = "Gazeuse";
		Planete uranus = new Planete();
		uranus.nom = "Uranus";
		uranus.diametre = 51118;
		uranus.matiere = "Gazeuse";
		Planete neptune = new Planete();
		neptune.nom = "Neptune";
		neptune.diametre = 49532;
		neptune.matiere = "Gazeuse";

		Vaisseau nouveauVaisseau = new Vaisseau();
		nouveauVaisseau.type = "FREGATE";
		nouveauVaisseau.nbPassagers = 9;
		mars.accueillirVaisseau(nouveauVaisseau);
		Vaisseau autreVaisseau = new Vaisseau();
		autreVaisseau.type = "CROISEUR";
		autreVaisseau.nbPassagers = 42;
		mars.accueillirVaisseau(autreVaisseau);

		System.out.println(
				"Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de " + mars.totalVisiteurs + ".");
		System.out.println("La forme d'une planète est "+Planete.forme);
		System.out.println("La forme de "+mars.nom+" est : "+mars.forme);
		
		System.out.println(Planete.expansion(10.5d));
		System.out.println(Planete.expansion(14.2d));
		
	}

}
