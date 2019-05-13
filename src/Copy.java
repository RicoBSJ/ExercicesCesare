import java.util.*;

public class Copy {

	private static String[] tabColor = {"bleu","vert","orange","jaune","gris","noir","rouge"};
	private static int longueurCombinaison = 4;
	private static int nombreEssai = 100;
	private static String[] presenteEtBienPlace;
	private static String[] presenteEtMalPlace;
	private static int nbrEssaiDef = 0;

	private static String cherchePresent() {
		ArrayList<String> pool = new ArrayList<String>();
		for (int i = 0; i < presenteEtMalPlace.length; i++) {
			if (presenteEtMalPlace[i] != null) {
				if (pool.contains(presenteEtMalPlace[i])) {
					pool.add(presenteEtMalPlace[i]);
				}
			}
		}
		Random rand = new Random();
		if (pool.isEmpty()) {
			return null;
		} else {
			return pool.get(rand.nextInt(pool.size()));
		}
	}
	
	private static String[] creerCombinaison() {
		String[] tabComp;
		if (nbrEssaiDef == 0) {
			tabComp = createTabColor(tabColor);
		} else {
			tabComp = presenteEtBienPlace.clone();
		}
		for (int i = 0; i < tabComp.length; i++) {
			if (tabComp[i] == null) {
				String result = cherchePresent();
				if (result != null) {
					tabComp[i] = result;
				} else {
					Random rand = new Random();
					String newColor = tabColor[rand.nextInt(tabColor.length)];
					tabComp[i] = newColor;
				}
			}
		}
		return tabComp;
	}

	public static void main(String[] args) {
		initializeTab();
		System.out.println("\rL'ordinateur a droit à " + nombreEssai + " essais");
		String[] tableauDefenseur = askTabColor();
		System.out.print("\rLe défenseur a entré la combinaison : ");
		dev(tableauDefenseur);
		boolean win = false;

		while (!win && nbrEssaiDef < nombreEssai) {
			String[] essaiComp = creerCombinaison();
			System.out.println("\rL'ordinateur essaie avec : " + Arrays.toString(essaiComp));
			nbrEssaiDef++;
			win = compareDefenseur(essaiComp, tableauDefenseur);
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
		for (int i = 0; i < longueurCombinaison; i++) {
			presenteEtBienPlace[i] = null;
			presenteEtMalPlace[i] = null;
		}
	}

	private static boolean compareDefenseur(String tableauJoueur[], String tableauJeu[]) {
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
		System.out.println(nbrPresent + " couleurs sont présentes et " + nbrBienPlace + " sont bien placées");
		return nbrBienPlace == tableauJeu.length;
	}

	private static String[] askTabColor() {
		Scanner sc = new Scanner(System.in);
		String[] resultat = new String[longueurCombinaison];
		System.out.println("\nVeuillez entrer votre combinaison à " + longueurCombinaison + " couleurs : ");
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
