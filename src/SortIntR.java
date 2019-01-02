
public class SortIntR {

	/**
	 * Renvoie l'indice du plus grand élément du tableau
	 *
	 * int tab[] :: tableau dans lequel on effectue la recherche int taille ::
	 * taille du tableau
	 *
	 * return int l'indice du plus grand élément
	 * 
	 **/

	int max(int tab[], int taille) {
		// on considère que le plus grand élément est le premier
		int i = 0, indice_max = 0;

		while (i < taille) {
			if (tab[i] > tab[indice_max])
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
	void echanger(int tab[], int x, int y) {
		int tmp;

		tmp = tab[x];
		tab[x] = tab[y];
		tab[y] = tmp;
	}

	/**
	 * Trie le tableau donné selon l'algorithme de tri par sélection
	 * 
	 * VERSION RÉCURSIVE
	 *
	 * int tab[] :: tableau à trier int taille :: taille du tableau
	 *
	 * return void
	 * @return 
	 **/
	void tri_selection_recursif(int tab[], int taille) {
		// un tableau d'un seul élément ou moins n'a pas besoin d'être trié
		if (taille <= 1)
			return;

		echanger(tab, taille - 1, max(tab, taille)); // on échange le dernier élément avec le plus grand

		// on rappelle la fonction en diminuant la taille du tableau
		// on peut faire cela car on est certain que le dernier élément
		// est le plus grand (donc plus besoin de le déplacer)
		return tri_selection_recursif(tab, taille - 1);
	}

	public static void main(String[] args) {

		int[] Tab = { 1, 8, 3, 9, 10 };
		int taille = Tab.length;

	}
}