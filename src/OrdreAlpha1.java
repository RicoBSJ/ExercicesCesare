
public class OrdreAlpha1 {

	public static void main(String[] args) {

		String[] tab = { "z", "c", "b", "a", "r" };
		affiche_tableau(tab);
		boolean quelqueChoseABouger = true;

		while (quelqueChoseABouger) {
			quelqueChoseABouger = false;
			for (int i = 0; i < tab.length; i++) {
				if (i + 1 < tab.length && tab[i].charAt(0) > tab[i + 1].charAt(0)) {
					String index = tab[i];
					tab[i] = tab[i + 1];
					tab[i + 1] = index;
					quelqueChoseABouger = true;
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
