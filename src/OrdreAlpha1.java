
public class OrdreAlpha1 {

	public static void main(String[] args) {
		// Résultat attendu : une chaîne de caractère qui est classée par ordre
		// alphabétique a b c r z
		String[] tab = { "z", "c", "b", "a", "r" };
		char[] tab2 = { 5 };
		affiche_tableau(tab);

		for (int i = 0; i < tab.length; i++) {
			char c = tab[i].charAt(0);
			System.out.println(c);
		}
	}

	private static void affiche_tableau(String[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]);
		}
		System.out.println();
	}

}
