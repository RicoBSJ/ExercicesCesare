
public class OrdreAlpha1 {

	public static void main(String[] args) {
		// Résultat attendu : une chaîne de caractère qui est classée par ordre
		// alphabétique a b c r z
		String[] tab = { "z", "c", "b", "a", "r" };
		char[] tab2 = { 5 };
		affiche_tableau(tab);

		for (int i = 0; i < tab.length; i++) {
			char c = tab[i].charAt(0);
			for (char j = 'i'; j < tab2.length; j++) {
				tab2['j'] = j;
				j = (char) i;
				System.out.println(j);
//				if (tab2[char k] > tab2[char l]) {
//					
//				}
			}
		}
	}

	private static void affiche_tableau(String[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]);
		}
		System.out.println();
	}

}
