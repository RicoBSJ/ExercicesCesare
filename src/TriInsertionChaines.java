/* Auteur: Nicolas JANEY          */
/* nicolas.janey@univ-fcomte.fr   */
/* Fevrier 2005                   */

import java.io.*;

public class TriInsertionChaines {
  static BufferedReader flux = new BufferedReader(new InputStreamReader(System.in));
  
  /* Fonction de recherche de la position d'insertion     */
  /* d'une valeur a l'interieur d'un tableau              */
  /* ind : indice de la valeur dont on calcule            */
  /*       la position d'insertion                        */
  /* t   : tableau ou la position d'insertion             */
  /*       est recherchee                                 */

  public static int indiceInsertion(String [] t,String v,int imax) {
  /* Definition d'une variable entiere de recherche            */
  /* de la position d'insertion (initialisee a 0)              */
    int i = 0;
  /* La boucle de recherche s'execute tant que la valeur       */
  /* a l'indice courant est plus petite que la valeur          */
  /* que l'on souhaite inserer et que l'on a pas depasse       */
  /* de 1 l'indice maximum de recherche                        */
    while ( ( t[i].compareTo(v) < 0 ) && ( i <= imax ) )
  /* L'indice de recherche est incremente de 1                 */
      i++;
  /* Resultat : i                                              */
    return(i);
  }
  
  /* Fonction de decalage d'une cellule vers la droite    */
  /* d'une partie d'un tableau de chaines                 */
  /* t   : Tableau ou le decalage est realise             */
  /* ideb : Indice de la premiere valeur a decaler        */
  /* ifin : Indice de la derniere valeur a decaler        */

  public static void decalage(String [] t,int ideb,int ifin) {
  /* Le decalage est effectue a rebour (de l'indice final      */
  /*  a l'indice initial par pas de -1                         */
    for ( int i = ifin ; i >= ideb ; i-- )
      t[i+1] = t[i];
  }
  
  /* Fonction de tri par insertion                        */
  /* t : tableau a trier                                  */

  public static void triInsertion(String [] t) {
    String aux;
  /* Pour tous les indices de 1 au dernier indice              */
  /* du tableau a trier                                        */
    for ( int i = 1 ; i < t.length ; i++ ) {
  /* Determination de la position d'insertion de l'element     */
  /* d'indice i dans la partie du tableau deja triee           */
      int indice = indiceInsertion(t,t[i],i-1);
  /* Si la position d'insertion est differente                 */
  /* de la position actuelle                                   */
      if ( indice != i ) {
  /* Memorisation de t[i] dans une variable auxiliaire         */
        aux = t[i];
  /* On realise le decalage                                    */
        decalage(t,indice,i-1);
  /* Insertion                                                 */
        t[indice] = aux; } }
  }
  
  /* Fonction d'affichage d'un tableau de chaines         */
  /* t : tableau dont les valeurs doivent etre affichees  */
  
  public static void afficheTableau(String [] t) {
    for ( int i = 0 ; i < t.length ; i++ )
      System.out.println(t[i]+" ");
  }
  
  /* Fonction de creation d'un tableau de chaines              */
  /* tirees au hasard                                          */
  /* taille : nombre de chaines du tableau                     */
  /* nb     : nombre de caracteres                             */
  
  public static String [] initTableau(int taille,int nb) {
    String [] t = new String[taille];
    char c[] = new char[nb];
    for ( int i = 0 ; i < t.length ; i++ ) {
      for ( int j = 0 ; j < nb ; j++ )
        c[j] =(char) (97+Math.random()*25);
      t[i] = String.copyValueOf(c); }
    return(t);
  }

  /* Fonction principale                                  */

  public static void main(String [] args) throws IOException {
    String [] tab = { "abc","aaa","ccc","bbb" };
  /* Affichage du tableau non trie                             */
    System.out.println("Tableau initial :");
    afficheTableau(tab);
  /* Tri du tableau                                            */
    triInsertion(tab);
  /* Affichage du tableau trie                                 */
    System.out.println("Tableau trie :");
    afficheTableau(tab);
  /* Lecture au clavier de donnees initiales                   */
    System.out.print("Taille du tableau a generer et a trier : ");
    int n = Integer.valueOf(flux.readLine()).intValue();
    System.out.print("Nombre de caracteres des chaines       : ");
    int nb = Integer.valueOf(flux.readLine()).intValue();
  /* Generation du tableau a trier tire au hasard              */
    tab = initTableau(n,nb);
  /* Affichage du tableau non trie                             */
    System.out.println("Tableau initial :");
    afficheTableau(tab);
  /* Tri du tableau                                            */
    triInsertion(tab);
  /* Affichage du tableau trie                                 */
    System.out.println("Tableau trie :");
    afficheTableau(tab);
  }
}