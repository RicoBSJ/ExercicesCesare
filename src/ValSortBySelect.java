import java.util.Scanner;

public class ValSortBySelect {

	public static void main(String[] args) {
		Scanner lectureClavier = new Scanner(System.in);
		int nombre_valeur;
		int i;
		System.out.println("Entrez le nombre de valeur à saisir :");
		nombre_valeur = lectureClavier.nextInt();
		int[] tableau = new int[nombre_valeur];
		for (i = 0; i < tableau.length; i++) {
			System.out.print("Valeur n° " + (i + 1) + " : ");
			tableau[i] = lectureClavier.nextInt();
		}
		/* Parcours le tableau et affiche les valeurs stockées */
		for (int valeur : tableau) {
			System.out.println(valeur);
		}
		/* Appel de la fonction tri_selection et affichage des valeurs triées */
		System.out.println("Après le tri :");
		for (int valeur : tableau) {
			tri_selection(tableau, tableau.length);
			System.out.println(valeur);
		}
	}

	/* Ensemble des fonctions pour le tri */
	public static int maximum(int tab[], int taille) {
		int i = 0, indice_max = 0;
		while (i < taille) {
			if (tab[i] > tab[indice_max]) {
				indice_max = i;
			}
			i++;
		}
		return indice_max;
	}

	public static void echanger(int tab[], int x, int y) {
		int tmp;
		tmp = tab[x];
		tab[x] = tab[y];
		tab[y] = tmp;
	}

	public static void tri_selection(int tab[], int taille) {
		int indice_max;
		for (; taille > 1; taille--) {
			indice_max = maximum(tab, taille);
			echanger(tab, taille - 1, indice_max);
		}
	}
}
