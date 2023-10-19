package atelier01;

public class SimpleProgramme1 {

	public static void main(String[] args) {
		
		String nom ="Valerie Peng";
		System.out.println(nom);
		
		String mots[] = nom.split(" ");
		for (int i = 0;i < mots.length;i++)
		System.out.println(mots[i]);

}
}
