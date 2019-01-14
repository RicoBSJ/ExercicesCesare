
public class OrdreAlpha1 {

	// public static void main(String[] args) {
	// // Résultat attendu : une chaîne de caractère qui est classée par ordre
	// // alphabétique a b c r z
	//
	// String[] tab = { "z", "c", "b", "a", "r" };
	// char[] tab2 = { 5 };
	// affiche_tableau(tab);
	//
	// for (int i = 0; i < tab.length; i++) {
	// char c = tab[i].charAt(0);
	// System.out.println(c);
	// }
	// }
	//
	// private static void affiche_tableau(String[] tab) {
	// for (int i = 0; i < tab.length; i++) {
	// System.out.print(tab[i]);
	// }
	// System.out.println();
	// }
//	public static void main(String[] args) {
//		// Résultat attendu : une chaîne de caractère qui est classée par ordre
//		// alphabétique a b c r z
//
//		int[] tab = { 5, 6, 9, 1, 3 };
//		int[] tab2 = new int[5];
//		affiche_tableau(tab);
//		boolean quelqueChoseABouger = true;
//
//		while (quelqueChoseABouger) {
//			quelqueChoseABouger=false;
//			for (int i = 0; i < tab.length; i++) {
//				if (i + 1 < tab.length && tab[i] > tab[i + 1]) {
//					int index = tab[i];
//					tab[i] = tab[i + 1];
//					tab[i + 1] = index;
//					quelqueChoseABouger=true;
//				}
//			}
//		}
//
//		affiche_tableau(tab);
//	}
//
//	private static void affiche_tableau(int[] tab) {
//		for (int i = 0; i < tab.length; i++) {
//			System.out.print(tab[i]);
//		}
//		System.out.println();
//	}
	
	public static void main(String[] args) {
		// Résultat attendu : une chaîne de caractère qui est classée par ordre
		// alphabétique a b c r z

//
//		for (int i = 0; i < tab.length; i++) {
//			char c = tab[i].charAt(0);
//			for (char j = 'i'; j < tab2.length; j++) {
//				tab2['j'] = j;
//				j = (char) i;
//				System.out.println(j);
//				if (tab2[char k] > tab2[char l]) {
//					
//				}

		String[] tab = { "z", "c", "b", "a", "r" };
		affiche_tableau(tab);
		boolean quelqueChoseABouger = true;

		while (quelqueChoseABouger) {
			quelqueChoseABouger=false;
			for (int i = 0; i < tab.length; i++) {
				if (i + 1 < tab.length && tab[i].charAt(0) > tab[i + 1].charAt(0)) {
					String index = tab[i];
					tab[i] = tab[i + 1];
					tab[i + 1] = index;
					quelqueChoseABouger=true;
				}
			}
		}

		affiche_tableau(tab);
	}

	private static void affiche_tableau(String[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]);
		}
		System.out.println();
	}
}
