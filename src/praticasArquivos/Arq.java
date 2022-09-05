package praticasArquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arq {

	public static void main(String[] args) {

		File file = new File("/home/matheusemanuel/Documentos/test/");
		try {
			Scanner leia = new Scanner(file);
			while (leia.hasNextLine()) {
				System.out.println(leia.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("falhou!!");
		}

	}

}
