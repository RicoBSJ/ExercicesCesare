import java.util.Arrays;

public class Melanger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] T= {"a","b","c","d","e","f","g","h","i","j"};
		System.out.println(Arrays.toString(T));

		for(int i =T.length-1; i>=1; i--){
			
			//hasard reçoit un nombre entier aléatoire entre 0 et position
			double hasard=Math.floor(Math.random()*(i+1));
			
			//Echange
			String sauve=T[i];
			T[i]=T[(int) hasard];
			T[(int) hasard]=sauve;
		}
		System.out.println(Arrays.toString(T));
	}
}