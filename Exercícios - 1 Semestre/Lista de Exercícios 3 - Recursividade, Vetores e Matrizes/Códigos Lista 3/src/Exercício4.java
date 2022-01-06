import java.util.Scanner;

public class Exercício4 {
	
	public static void preenc(int vetor[])
	{
		Scanner entradapreenc = new Scanner(System.in);
		
		//Preenchimento do vetor
		for (int i = 0 ; i < vetor.length ; i++)
		{	
			System.out.printf("Digite um valor [%d] :" , i);
			vetor[i] = entradapreenc.nextInt();
				
		}
	}
	
	
	public static int funcao (int vetor[] , int valor)
	{
		int quant = 0 ;
		//For passando por todos elementos do vetor
		for(int i = 0 ; i < vetor.length ; i++)
		{
			//Só executará o código se o número na posição do vetor for igual ao valor
			if (vetor[i] == valor)
			{
				quant ++ ;
				
			}
			
			
		}
		return quant ;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Declaração das variáveis e do vetor
		int valor ;
		int A[] = new int[10];
		//Chamada do módulo levando o vetor A como parâmetro
		preenc(A);
		//Print pedindo o valor a ser identificado quantas vezes este apareceu no vetor
		System.out.println("\nDigite um valor para identificar quantas vezes este aparece no vetor:");
		valor = entrada.nextInt();
		//Print mostrando o resultado da funcao
		System.out.printf("Este número aparece no vetor %d vezes " , funcao(A , valor));
		
		entrada.close();
	}

}
