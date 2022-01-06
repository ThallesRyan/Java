import java.util.Scanner;

public class Exerc�cio6 {
	
	/*Escreva uma fun��o que recebe por par�metro um valor inteiro e positivo N e retorna o 
valor de S, calculado segundo a f�rmula abaixo. 

S = 1 + 1/1! + �! + 1/3! + 1 /N!   */
	
	
	public static double expressao(int numero) /* S = 1 + (1 / N!) */
	{
		//Vari�veis locais
		int rep ;
		double fatorial = 1 , somado1 = 0 , S = 0 ;
		
		
		//C�lculo do fatorial
		for(rep = numero ; rep > 1 ; rep --)
			
		{	
			fatorial = fatorial * rep; // 
			
			//C�lculo do S
				if (rep < numero && rep >= 2)
				{
					
					fatorial = (1/fatorial);
					
					S = 1 + fatorial ;
				}
				
		
		
		
		
		
	}	
	
		return(S);
	
		
		
	}

	public static void main(String[] args) {
		
		
		
		
		Scanner entrada = new Scanner(System.in);
		//Vari�veis 
		int numero ;
		double S ;
		
		//Print pedindo um valor positivo e armazenamento
		System.out.print("Digite um n�mero inteiro positivo:");
		numero = entrada.nextInt();
		
		S = expressao(numero);
		
		//Exibi��o do valor da express�o
		System.out.printf("O valor da express�o � %.2f " , S );
		
	
		
		entrada.close();
		
		

	}

}
