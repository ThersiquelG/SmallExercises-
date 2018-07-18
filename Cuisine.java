package www.banane.com;
import java.util.Scanner;

public class Cuisine {

	public static void isFoodReady(int a) {
		for ( int cuisson = 1 ; cuisson <=30; cuisson++) {
			if ( cuisson < 30) 
				System.out.println("Patience ! Ce n'est pas encore prêt ... ");
			else 
				System.out.println("Votre plat est prêt !");
			

		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a1 = "Harricots verts";
		String a2 = "Blé" ;
		String a3 = "Souris";
		System.out.println("Bienvenue dans ma cuisine, veuillez choisir vos ingrédients: " + a1+ "  -  "+ a2 + "  -  " + a3);
		System.out.println("*******************");
		
		;
		
		boolean weAreCooking = true ;
		while (weAreCooking) {
			Scanner cuistot = new Scanner(System.in);
			String aliments = cuistot.nextLine();
			
			
			if(aliments.equals(a1)) {
				System.out.println("Vous avez obtenu des " + a1);
				
			} else {
				System.out.println("Je ne connais pas cet aliment :( ");
			}
				
			
			if (aliments.equals(a2)) {
				System.out.println("Vous avez obtenu du " + a2);
				System.out.println("Nous pouvons lancer la cuisson !");
				isFoodReady(30);
				weAreCooking = false ;
			}
			
			
			
			
			
			
			
			
		}


	}
	
}



