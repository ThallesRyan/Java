import java.util.Scanner;

public class Exercício6 {
	
	
	
	public static void preenc(int elementos[])
	{	
		Scanner entradaNotas = new Scanner (System.in);		
		//Declaração do vetor que será gravado o resultado retonando da função
		int negativos[];
		//Gravação dos valores no vetor
		for (int i = 0 ; i < elementos.length ; i++)
		{
			System.out.println("Digite um valor:");
			elementos[i] = entradaNotas.nextInt();
		}
		//Chama da funcao levando o vetor "elementos" como parâmetro e gravando o resultado da função 
		negativos = funcao(elementos);
		
		//Chamada da função levando o vetor negativos como parâmetro 
		negativo(negativos);
		
	}

	public static int[] funcao(int vetor[])
	{	//Declaração das variáveis
		int neg = 0 ;
		int [] negativo = new int [10];
		
		//Gravação dos valores negativos do vetor recebido no vetor com o nome negativo
		for (int i = 0 ; i < vetor.length ; i++)
		{
			if(vetor[i] < 0)
			{
				negativo[neg] = vetor[i] ;
				
				neg ++ ;
			}
		}
		return negativo ;
	}
	
	public static void negativo (int negativos[])
	{
		//Exibião dos valores negativos do vetor
		for (int i = 0 ; i < negativos.length; i ++)
		{
			if (negativos[i] < 0)
			System.out.println("Os números negativos são "+ i + ": " + negativos[i] );
			
		}	
	}

	public static void main(String[] args) {
		//Declaração do vetor
		int [] X = new int [10];
		//Chamada do módulo , levando o vetor como parâmetro
		preenc(X);
		
		
	}

}
