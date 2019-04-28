import java.util.Arrays;

public class DecalageTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tab[]= {1,2,3,4,5};
		int i; 
		int tmp = tab[4]; // CONSERVE LE DERNIER 
		for(i=4; i > 0; i--) {
			tab[i]=tab[i - 1];
			tab[0] = tmp; 
		}
		System.out.println(Arrays.toString(tab));
	}
}
