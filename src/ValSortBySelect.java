
import java.util.Scanner;

public class ValSortBySelect {

	public static void main(String[] args) {

		Scanner lectureClavier = new Scanner(System.in);
		int nombre_valeur;
		int i;
		System.out.println("Entrez le nombre de valeur � saisir :");
		nombre_valeur = lectureClavier.nextInt();
		int[] tableau = new int[nombre_valeur];
		for (i = 0; i < tableau.length; i++) {
			System.out.print("Valeur n� " + (i + 1) + " : ");
			tableau[i] = lectureClavier.nextInt();
		}
		/* Parcours le tableau et affiche les valeurs stock�es */
		for (int valeur : tableau) {
			System.out.println(valeur);
		}
		/* Appel de la fonction tri_selection et affichage des valeurs tri�es */
		System.out.println("Apr�s le tri :");
		for (int valeur : tableau) {
			tri_selection(tableau, tableau.length);
			System.out.println(valeur);
		}
	}

	/**
	 * Renvoie l'indice du plus grand �l�ment du tableau
	 *
	 * int tab[] :: tableau dans lequel on effectue la recherche int taille ::
	 * taille du tableau
	 *
	 * return int l'indice du plus grand �l�ment
	 **/

	static int max(int tab[], int taille) {
		// on consid�re que le plus grand �l�ment est le premier
		int i = 0, indice_max = 0;

		while (i < taille) {
			if (tab[i] > tab[indice_max])
				indice_max = i;
			i++;
		}
		return indice_max;
	}

	/**
	 * Echange deux �l�ments d'un tableau
	 *
	 * int tab[] :: tableau dans lequel on effectue l'�change int x :: indice du
	 * premier �l�ment int y :: indice du second �l�ment
	 *
	 * return void
	 **/

	static void echanger(int tab[], int x, int y) {
		int tmp;

		tmp = tab[x];
		tab[x] = tab[y];
		tab[y] = tmp;
	}

	/**
	 * Trie le tableau donn� selon l'algorithme de tri par s�lection
	 *
	 * int tab[] :: tableau � trier int taille :: taille du tableau
	 *
	 * return void
	 **/

	static void tri_selection(int tab[], int taille) {
		int indice_max;

		// à chaque tour de boucle, on va d�placer le plus grand �l�ment
		// vers la fin du tableau, on diminue donc à chaque fois sa taille
		// car le dernier �l�ment est obligatoirement correctement
		// plac� (et n'a donc plus besoin d'�tre parcouru/d�plac�)

		for (; taille > 1; taille--) // tant qu'il reste des �l�ments non tri�s
		{
			indice_max = max(tab, taille);

			echanger(tab, taille - 1, indice_max); // on �change le dernier �l�ment avec le plus grand
		}
	}
}
