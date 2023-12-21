package atelier_08;

public class atelier_08 {

	public static void main(String[] args) {
	int i = 1000,j;
	
		try {
			do {
				i--;
				j=1/i;
			} while (true);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());//affichage de l'erreur//
			System.out.println("Reprise du contrôle d'exception");
		}
	}
}

