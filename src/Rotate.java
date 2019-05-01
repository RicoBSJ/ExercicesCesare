
public class Rotate {

	public static void main(String[] args) {
		int[] tab = { 1, 2, 3, 4 };
		rotateRightOne(tab);
		System.out.print(tab[0]);
		System.out.print(tab[1]);
		System.out.print(tab[2]);
		System.out.print(tab[3]);
	}

	public static int[] rotateRightOne(int[] tab) {
		int[] tabrot = new int[tab.length];

		for (int i = 0; i < (tab.length - 1); i++) {
			tabrot[i] = tab[i + 1];
			tabrot[tabrot.length - 1] = tab[0];
			tab = tabrot;
		}
		return tab;
	}
}