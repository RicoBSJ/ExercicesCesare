import java.util.Arrays;
import java.util.Scanner;

public class Copy {

	private static String[] tabColor = { "vert", "orange", "jaune", "gris" };
	static public int longueurCombinaison = 4;
	static public int nombreEssai = 5;
	private static String[] presenteEtBienPlace;
	private static String[] presenteEtMalPlace;
	private static String[] copy;
	private static int nbrEssaiDef = 0;
	
	private static String[] creerCombinaison() {
		if (nbrEssaiDef == 0) {
			String tabComp[] = createTabColor(tabColor);
			if (nbrEssaiDef != 0) {
				tabComp = presenteEtBienPlace;
			}
			for (int i = 0; i < tabComp.length; i++) {
				copy = presenteEtBienPlace;
				if (presenteEtBienPlace[i] == null && presenteEtMalPlace[i] != null) {
					presenteEtBienPlace[i] = presenteEtMalPlace[i];
					if (presenteEtBienPlace[i] == null && presenteEtMalPlace[i] == null) {
						presenteEtMalPlace[i] = tabColor[i];
					}
					presenteEtBienPlace[i] = presenteEtMalPlace[i];
					presenteEtMalPlace[i] = null;
				}
			}
		}
		return copy;
	}

	public static void main(String[] args) {
		initializeTab();
		System.out.println("\rL'ordinateur a droit � " + nombreEssai + " essais");
		String[] tableauDefenseur = askTabColor();
		System.out.print("\rLe d�fenseur a entr� la combinaison : ");
		dev(tableauDefenseur);
		boolean win = false;

		String[] premierEssai = creerCombinaison();
		System.out.println("\rL'ordinateur essaie avec : " + Arrays.toString(premierEssai));

		while (!win && nbrEssaiDef < nombreEssai) {
			nbrEssaiDef++;
			win = compareDefenseur(premierEssai, tableauDefenseur);
		}
		if (win == true) {
			System.out.println("\rL'ordinateur gagne en " + nbrEssaiDef + " essai(s)");
		} else {
			System.out.println("\rL'ordinateur a perdu !");
		}
	}

	private static String[] createTabColor(String tabColor[]) {
		String[] tab = new String[longueurCombinaison];
		for (int i = 0; i < longueurCombinaison; i++) {
			int r = (int) random(0, tabColor.length);
			tab[i] = tabColor[r];
		}
		return tab;
	}
	
	private static double random(double min, double max) {
		return min + Math.random() * (max - min);
	}

	private static void initializeTab() {
		presenteEtBienPlace = new String[longueurCombinaison];
		presenteEtMalPlace = new String[longueurCombinaison];
		copy = new String[longueurCombinaison];
		for (int i = 0; i < longueurCombinaison; i++) {
			presenteEtBienPlace[i] = null;
			presenteEtMalPlace[i] = null;
			copy[i] = null;
		}
	}
	
	private static boolean compareDefenseur(String tableauJoueur[], String tableauJeu[]) {
		nbrEssaiDef++;
		int nbrPresent = 0;
		int nbrBienPlace = 0;
		for (int i = 0; i < tableauJoueur.length; i++) {
			for (int j = 0; j < tableauJeu.length; j++) {
				if (tableauJoueur[i].equals(tableauJeu[j])) {
					nbrPresent++;
					if (i == j) {
						nbrBienPlace++;
						presenteEtBienPlace[i] = tableauJoueur[i];
					} else {
						presenteEtMalPlace[i] = tableauJoueur[i];
					}
				}
			}
		}
		System.out.print("presenteEtMalPlace :");
		System.out.println(Arrays.toString(presenteEtMalPlace));
		System.out.print("presenteEtBienPlace :");
		System.out.println(Arrays.toString(presenteEtBienPlace));
		System.out.println(nbrPresent + " couleurs sont pr�sentes et " + nbrBienPlace + " sont bien plac�es");
		return nbrBienPlace == tableauJeu.length;
	}
	
	private static String[] askTabColor() {
		Scanner sc = new Scanner(System.in);
		String[] resultat = new String[longueurCombinaison];
		System.out.println("\nVeuillez entrer votre combinaison � " + longueurCombinaison + " couleurs : ");
		System.out.println("\rVoici les couleurs disponibles : " + Arrays.toString(tabColor));
		for (int i = 0; i < resultat.length; i++) {
			System.out.println("\rCouleur " + (i + 1) + " :");
			resultat[i] = sc.nextLine();
		}
		return resultat;
	}
	
	private static void dev(String[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}
	
}
