
public class SortInt {
	
	/**
	*   Renvoie l'indice du plus grand élément du tableau
	*
	*   int tab[] :: tableau dans lequel on effectue la recherche
	*   int taille :: taille du tableau
	*
	*   return int l'indice du plus grand élément
	*   
	**/
	
	int max(int tab[], int taille)
	{
	    // on considère que le plus grand élément est le premier
		int i=0, indice_max=0;
	    
	    while(i < taille)
	    {
	        if(tab[i] > tab[indice_max])
	            indice_max = i;
	        i++;
	    }
	    
	    return indice_max;
	}
	
	/**
	*   Échange deux éléments d'un tableau
	*
	*   int tab[] :: tableau dans lequel on effectue l'échange
	*   int x :: indice du premier élément
	*   int y :: indice du second élément
	*
	*   return void
	**/
	void echanger(int tab[], int x, int y)
	{
	    int tmp;
	    
	    tmp = tab[x];
	    tab[x] = tab[y];
	    tab[y] = tmp;
	}
	
	/**
	*   Trie le tableau donné selon l'algorithme de tri par sélection
	*
	*   int tab[] :: tableau à trier
	*   int taille :: taille du tableau
	*
	*   return void
	**/
	void tri_selection(int tab[], int taille)
	{
	    int indice_max;
	    
	    // à chaque tour de boucle, on va déplacer le plus grand élément
	    // vers la fin du tableau, on diminue donc à chaque fois sa taille
	    // car le dernier élément est obligatoirement correctement
	    // placé (et n'a donc plus besoin d'être parcouru/déplacé)

	    for(; taille > 1 ; taille--) // tant qu'il reste des éléments non triés
	    {
	        indice_max = max(tab, taille);
	    
	        echanger(tab, taille-1, indice_max); // on échange le dernier élément avec le plus grand
	    }
	}

	public static void main(String[] args) {
		
		int[] Tab = { 1, 8, 3, 9, 10 };
		int taille = Tab.length;

	}
}
