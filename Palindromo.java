package exercicios;

public class Palindromo {

	public static void main(String[] args) {
		String palavra = "ovo";
		String palavraInvertida = "";
		
		for (int i = palavra.length() - 1 ; i >=0; i--) {
			palavraInvertida += palavra.charAt(i);
		}
		
		System.out.println(palavra);
		System.out.println(palavraInvertida);
		System.out.println();

		
		for (int i = 0; i < palavra.length(); i++) {
			
		}
		
		
		
		if (palavra==palavraInvertida) {
			System.out.println("A palavra é um palíndromo");
		} else {
			System.out.println("A palavra não é um palíndromo");
		}

	}

}
