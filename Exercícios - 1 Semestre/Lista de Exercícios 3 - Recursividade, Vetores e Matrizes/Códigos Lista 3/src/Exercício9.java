import java.util.Scanner;

public class Exercício9 {
	public static void preenc(int A[][] ,int B[][])
	{	
		Scanner entradapreenc = new Scanner(System.in);
		//Preenchimento da Matriz A  e B
		for(int ln = 0 ; ln < A.length; ln ++ )
		{
			for (int col = 0 ; col <A[ln].length ; col++)
			{
				System.out.printf("Digite um valor\nA[%d][%d]:" , ln , col);
				A[ln][col] = entradapreenc.nextInt();
				
				B[ln][col] = A[ln][col] * 2 ;
				
				System.out.printf("B[%d][%d]: %d" , ln , col ,B[ln][col] );
				
				System.out.println();
				System.out.println();
			}	
		}
		
	}
	
	public static int [][] matrizS(int A[][] , int B[][])
	{	//Declaração da matriz 
		int S[][] = new int [4][6] ;
		//Preenchimento da matriz S
		for(int ln = 0 ; ln < A.length ; ln++)
		{
			for(int col = 0 ; col < B[ln].length ; col++)
			{
				
				S[ln][col] = A[ln][col] + B[ln][col];
				
			}
		}
		
		
		return S ;
	}
	
	public static int [][] matrizD(int A[][] , int B[][])
	{
		//Declaração da matriz D
		int D[][] = new int [4][6] ;
		//Preenchimento da Mtris D
		for(int ln = 0 ; ln < A.length ; ln++)
		{
			for(int col = 0 ; col < B[ln].length ; col++)
			{
				
				D[ln][col] = A[ln][col] - B[ln][col];
				
			}
		}
		
		
		return D ;
	}
	public static void main(String[] args) {
	//Declaração dos vetores
	int A[][] = new int [4][6] , B[][] = new int [4][6] ,  S[][] , D[][];	
		//Chamada do Módulo, levando as matrizes A e B como parâmetros
		preenc(A , B);
		
		//Chamada da função, levando A e B como parâmetros e armazenamento na Matriz S
		S = matrizS(A, B);
		//Exibição da matriz S
			for(int ln = 0; ln < S.length ; ln++)
			{
				for(int col = 0 ; col < S[ln].length; col++)
				{
					System.out.printf("O valor de S[%d][%d] : %d " , ln , col , S[ln][col]);
					System.out.println();	
				}
			}
			System.out.println();	
			System.out.println();	
			//Chamada da função, levando A e B como parâmetros e armazenamento na Matriz D
			D = matrizD(A , B);
			//Exibição da matriz D
			for(int ln = 0; ln < D.length ; ln++)
			{
				
				for(int col = 0 ; col < D[ln].length; col++)
				{
					
					System.out.printf("O valor de D[%d][%d] : %d " , ln , col , D[ln][col]);
					System.out.println();	
					
				}
			}
			
	}

}
