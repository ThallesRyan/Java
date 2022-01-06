import java.util.Scanner;

public class Exercício7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Strings e variáveis
		String frase = new String();
		char[] letra;
		int letranova = 0;
		String fraseNova = new String();

		//Entrada da string
		System.out.println("Digite uma frase: ");
		frase = entrada.next();
		
		
		//transforma a string em um vetor de caracteres
		letra = frase.toCharArray();
		
		//For para percorrer os elementos da String
		for(int i = 0; i < letra.length; i++)
		{
			//Grava o numero do caractere atual na variável
			letranova = letra[i];
			//subtrai o número do caractere a 32 , para chegar na posição do caractere em MAIÚSCULO
			letranova -= 32;
			
			//Concatena os caracteres correspondente ao número
			fraseNova += ((char)letranova);
			
		}
		
		//Exibição
		System.out.println(fraseNova);
		entrada.close();

	}

}
