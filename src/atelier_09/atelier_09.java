package atelier_09;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import util.Keyboard;

public class atelier_09 {
	public static void main(String[] args) {
		String ligne;
		try {
			File f=new File("src/atelier_09/Nom.txt");
			PrintWriter pr=new PrintWriter(f);
			pr.print("Valérie");
			pr.close();
			System.out.println("Fin d'écriture fichier");
		}
		catch(IOException e) {e.printStackTrace();}
}
	
}
