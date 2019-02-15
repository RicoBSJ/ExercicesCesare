

public class IntSortBySelect {

	public static void main(String[] args) {

		int[] Tab = { 1, 8, 3, 9, 10 };

		for (int valeur : Tab) {
			tri_selection(Tab, Tab.length);
			System.out.println(valeur);
		}
	}

	/**
	 * Renvoie l'indice du plus grand élément du tableau
	 *
	 * int Tab[] :: tableau dans lequel on effectue la recherche
	 * Tab.length :: taille du tableau
	 *
	 * return int l'indice du plus grand élément
	 * 
	 **/

	private static int max(int Tab[], int taille) {
		// on considère que le plus grand élément est le premier
		int i = 0, indice_max = 0;

		while (i < taille) {
			if (Tab[i] > Tab[indice_max])
				indice_max = i;
			i++;
		}

		return indice_max;
	}

	/**
	 * Échange deux éléments d'un tableau
	 *
	 * int tab[] :: tableau dans lequel on effectue l'échange int x :: indice du
	 * premier élément int y :: indice du second élément
	 *
	 * return void
	 **/
	private static void echanger(int Tab[], int x, int y) {
		int tmp;

		tmp = Tab[x];
		Tab[x] = Tab[y];
		Tab[y] = tmp;
	}

	/**
	 * Trie le tableau donné selon l'algorithme de tri par sélection
	 *
	 * int tab[] :: tableau à trier int taille :: taille du tableau
	 *
	 * return void
	 **/
	private static void tri_selection(int Tab[], int taille) {
		int indice_max;

		/*
		 * à chaque tour de boucle, on va déplacer le plus grand élément
		 * vers la fin du tableau, on diminue donc à chaque fois sa taille
		 * car le dernier élément est obligatoirement correctement
		 * placé (et n'a donc plus besoin d'être parcouru/déplacé)
		 */

		for (; taille > 1; taille--) // tant qu'il reste des éléments non triés
		{
			indice_max = max(Tab, taille);

			echanger(Tab, taille - 1, indice_max); // on échange le dernier élément avec le plus grand
		}
	}

}
