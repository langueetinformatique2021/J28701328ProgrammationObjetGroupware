package atelier_08;

public class division_exo3 {

	public static void main(String[] args) { 
		try{
			division(); 
	}catch(ArithmeticException e){
		System.out.println(e.getMessage());
		System.out.println("Reprise du contrôle d'exception");
	}
	}
	public static void division() throws ArithmeticException {
		int i = 1000, j;
		do {
			i--;
			j = 1 / i;
		} while (true);
	}

}
