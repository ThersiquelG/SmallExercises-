package www.banane.com;
import java.util.Scanner ;

public class Tableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Les tableaux ont une taille max définie par son contenu
		char[] tab = new char[5];

		tab[0] = 'A' ;
		tab[1] = 'V' ;
		tab[2] = 'I' ;
		tab[3] = 'O' ;
		tab[4] = 'N' ;






		/*	for( int position = 0 ; position < 5 ; position++) {
			if (tab[position] == 'I') {
				System.out.println("Un 'I' est présent.");
			}
		} */

		/*	Scanner mysc = new Scanner(System.in);
		char c = mysc.next(".").charAt(0); 

		if(c == tab[0]) {
			System.out.println("Vous avez gagner.");
		} else {
			System.out.println("Vous avez perdu");
		} */


		boolean GameOn = true ;
		while (GameOn){
			System.out.println("****Bienvenue****");
			System.out.println("Veuillez entrer une majuscule");

			Scanner mysc = new Scanner(System.in);
			char c = mysc.next(".").charAt(0);

			if((c == tab[0]) || (c == tab[4])) {
				GameOn = false;
				System.out.println("Vous avez gagner.");
			} else {
				GameOn = false;
				System.out.println("Vous avez perdu.");
			} 


			System.out.println("Voulez vous rejouer ? (y/n)");
			Scanner replay = new Scanner(System.in);
			char d = replay.next(".").charAt(0);
			if (d == 'y') {
				GameOn = true;
			} else {
				GameOn = false;
				System.out.print("Au revoir.");
			}






		}







	}
}


