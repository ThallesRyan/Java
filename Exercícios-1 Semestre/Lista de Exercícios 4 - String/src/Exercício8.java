import java.util.Scanner;

public class Exerc�cio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Declara��o das strings e vari�veis
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
			//Grava o n�mero do caractere atual na vari�vel
			letranova = letra[i];
			
			//Se o caractere for vazio , o caractere n�o ser� modificado
			if(letra[i] == ' ')
			{
				
			}
			
				
			//Se for diferente de caractere vazio , o caractere ser� substituido por um 3 posi��es a frente
			else
			letranova += 3;
			
			//Concatena os caracteres correspondente ao n�mero
			fraseNova += ((char)letranova);
			
			
			
		}
		//Exibi��o
		System.out.println(fraseNova.toUpperCase());
		
		entrada.close();
	}

}
