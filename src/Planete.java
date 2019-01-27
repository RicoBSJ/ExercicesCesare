

public class Planete {

	String nom;
	int diametre;
	String matiere;
	int totalVisiteurs;
	static String forme = "Sphérique";
	Vaisseau vaisseauActuellementAccoste;

	int revolution(int degres) {
		System.out
				.println("Je suis la planète " + nom + " et je tourne autour de mon étoile de " + degres + " degrés.");
		return degres / 360;
	}

	int rotation(int degres) {
		System.out.println("Je suis la planète " + nom + " et je tourne sur moi-même de " + degres + " degrés.");
		return degres / 360;
	}

	Vaisseau accueillirVaisseau(Vaisseau vaisseau) {
		totalVisiteurs = totalVisiteurs + vaisseau.nbPassagers;
		if (vaisseauActuellementAccoste == null) {
			System.out.println("Aucun vaisseau ne s'en va");
		} else {
			System.out.println("Un vaisseau de type " + vaisseauActuellementAccoste.type + " doit s'en aller");
		}
		Vaisseau vaisseauPrecedent = vaisseauActuellementAccoste;
		vaisseauActuellementAccoste = vaisseau;
		return vaisseauPrecedent;
	}
	
	static String expansion (double distanceDeSeparation) {
		if (distanceDeSeparation < 14.0) {
			return "Oh la la mais c'est super rapide !";
		}
		else {
			return "Je rêve ou c'est plus rapide que la lumière ?";
		}
	}
}