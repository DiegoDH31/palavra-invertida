package palavraInvertida;

import java.util.Scanner;

public class PalavraInvertida {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = sc.next();
		String palavraInvertida = "";
		
		for(int i = 0; i < palavra.length(); i++) {
			palavraInvertida += palavra.charAt(palavra.length() - (i + 1));		
			
		}
		
		System.out.println(palavraInvertida);
		
		sc.close();
	}
	
}
 