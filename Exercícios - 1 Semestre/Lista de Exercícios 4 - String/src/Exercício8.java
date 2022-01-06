import java.util.Scanner;

public class Exercício8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Declaração das strings e variáveis
		String frase = new String();
		
		char[] letra;
		int letranova = 0;
		String fraseNova = new String();
		
		System.out.println("Digite uma frase: ");
		frase = entrada.nextLine();
		
		
		//transforma a string em um vetor de caracteres
		letra =frase.toCharArray();
		
		//For para percorrer os elementos da string 
		for(int i = 0; i < letra.length; i++)
		{
			//Grava o número do caractere atual na variável
			letranova = letra[i];
			
			//Se o caractere for vazio , o caractere não será modificado
			if(letra[i] == ' ')
			{
				
			}
			
				
			//Se for diferente de caractere vazio , o caractere será substituido por um 3 posições a frente
			else
			letranova += 3;
			
			//Concatena os caracteres correspondente ao número
			fraseNova += ((char)letranova);
			
			
			
		}
		//Exibição
		System.out.println(fraseNova.toUpperCase());
		
		entrada.close();
	}

}
