import java.util.Scanner;

public class Exerc�cio6 {
	
	
	
	public static void preenc(int elementos[])
	{	
		Scanner entradaNotas = new Scanner (System.in);		
		//Declara��o do vetor que ser� gravado o resultado retonando da fun��o
		int negativos[];
		//Grava��o dos valores no vetor
		for (int i = 0 ; i < elementos.length ; i++)
		{
			System.out.println("Digite um valor:");
			elementos[i] = entradaNotas.nextInt();
		}
		//Chama da funcao levando o vetor "elementos" como par�metro e gravando o resultado da fun��o 
		negativos = funcao(elementos);
		
		//Chamada da fun��o levando o vetor negativos como par�metro 
		negativo(negativos);
		
	}

	public static int[] funcao(int vetor[])
	{	//Declara��o das vari�veis
		int neg = 0 ;
		int [] negativo = new int [10];
		
		//Grava��o dos valores negativos do vetor recebido no vetor com o nome negativo
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
		//Exibi�o dos valores negativos do vetor
		for (int i = 0 ; i < negativos.length; i ++)
		{
			if (negativos[i] < 0)
			System.out.println("Os n�meros negativos s�o "+ i + ": " + negativos[i] );
			
		}	
	}

	public static void main(String[] args) {
		//Declara��o do vetor
		int [] X = new int [10];
		//Chamada do m�dulo , levando o vetor como par�metro
		preenc(X);
		
		
	}

}
