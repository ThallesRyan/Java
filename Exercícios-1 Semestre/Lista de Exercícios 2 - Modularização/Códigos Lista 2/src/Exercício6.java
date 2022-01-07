import java.util.Scanner;

public class Exercício6 {
	
	/*Escreva uma função que recebe por parâmetro um valor inteiro e positivo N e retorna o 
valor de S, calculado segundo a fórmula abaixo. 

S = 1 + 1/1! + ½! + 1/3! + 1 /N!   */
	
	
	public static double expressao(int numero) /* S = 1 + (1 / N!) */
	{
		//Variáveis locais
		int rep ;
		double fatorial = 1 , somado1 = 0 , S = 0 ;
		
		
		//Cálculo do fatorial
		for(rep = numero ; rep > 1 ; rep --)
			
		{	
			fatorial = fatorial * rep; // 
			
			//Cálculo do S
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
		//Variáveis 
		int numero ;
		double S ;
		
		//Print pedindo um valor positivo e armazenamento
		System.out.print("Digite um número inteiro positivo:");
		numero = entrada.nextInt();
		
		S = expressao(numero);
		
		//Exibição do valor da expressão
		System.out.printf("O valor da expressão é %.2f " , S );
		
	
		
		entrada.close();
		
		

	}

}
