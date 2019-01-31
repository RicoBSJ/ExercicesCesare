import java.util.*;

public class OrdreAlphabetique {

// public static void main(String[] args) {
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

	// Résultat attendu : une chaîne de caractère qui est classée par ordre
	// alphabétique a b c r z

	public static void main(String[] args) {
		String[] tab = { "z", "c", "b", "a", "r" };
		affiche_tableau(tab);
		String[] tab2 = new String[5];
		int j = 4;

		for (int i = 0; i < tab.length; i++) {
			tab[i] = tab2[j];
			if (i > j) {
				tab[i] = tab[4];
			} else {
				tab[i] = tab[0];
			}
			System.out.println(i);
		}
	}

	private static void affiche_tableau(String[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]);
		}
		System.out.println();
	}
}