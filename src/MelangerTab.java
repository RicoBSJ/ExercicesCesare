import java.util.Arrays;

public class MelangerTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] tab= {"a","b","c","d","e","f","g","h","i","j"};
		System.out.println(Arrays.toString(tab));

		for(int position=tab.length-1; position>=1; position--){
			
			//hasard reçoit un nombre entier aléatoire entre 0 et position
			double hasard=Math.floor(Math.random()*(position+1));
			
			//Echange
			String sauve=tab[position];
			tab[position]=tab[(int) hasard];
			tab[(int) hasard]=sauve;

		}
		System.out.println(Arrays.toString(tab));
	}
}
