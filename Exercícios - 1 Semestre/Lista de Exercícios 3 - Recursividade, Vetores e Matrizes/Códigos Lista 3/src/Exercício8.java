import java.util.Scanner;

public class Exercício8 {
	
	//Módulo para preencher a matriz
	public static void matriz (double M[][])
	{
		Scanner entradamatriz = new Scanner (System.in);
		
		//Preenchimento da matriz
		for(int ln = 0 ; ln < M.length ; ln++ )
		{
			for(int col = 0 ; col < M[ln].length ; col ++)
			{
				
				System.out.printf("Digite um valor [%d][%d]:"  , ln , col );
				M[ln][col] =  entradamatriz.nextDouble();
			}
			System.out.println();
		}
	}
	//Módulo para cálculo da soma da linha 4
	public static double somalinha4(double[][] matriz)
	{
		double somalinha = 0 ;
		for(int col = 0 ; col < matriz.length ; col++)
		{	
			somalinha += matriz[4][col]  ;
		}
		return somalinha;
	}
	
	//Módulo para cálculo da coluna 2
	public static double somacoluna2(double[][] matriz)
	{
		double somacoluna = 0 ;
		for(int ln = 0 ; ln < matriz.length ; ln++)
		{	
			somacoluna += matriz[ln][2]  ;
		
		}
		
		return somacoluna;
	}
	//Cálculo da soma do diagonal principal
	public static double somadiagonalprincipao(double [][] m)
	{
		double somadiagonal = 0;
		
		for (int i = 0 ; i < m.length ; i ++ )
		{
			
			somadiagonal += m[i][i] ;
			
		}	
		return somadiagonal;
	}
	
	//Cálculo da soma do diagonal secundário
	public static double somadiagonalsecundaria (double m[][])
	{ int somadiagonalsecundaria = 0 , col = 4 ;
	

	for (int i = 0 ; i < m.length ; i ++)
	{
		
		
		somadiagonalsecundaria += m[i][col] ;
		col -- ;
		
	}
	
	
		return somadiagonalsecundaria ;
	}
	
	//Cálculo da soma da matriz inteira
	public static double somamatriz(double [][]m)
	{
		double soma = 0 ;
		
		for(int ln = 0 ; ln < m.length ; ln++)
		{
			for (int col = 0 ; col < m[ln].length ; col++ )
			{
				
				soma += m[ln][col] ; 
				
				
			}
		}
		return soma;
	}
	public static void main(String[] args) {
		//Declaração da matriz
		double [][] M = new double[5][5];
		//Módulo passando a matriz por parâmetro
		matriz(M);
				
		//Exibição dos resultados das somas
		System.out.printf("O resultado da soma da linha 4 é %.2f \n " , somalinha4(M));
		System.out.printf("O resultado da soma da coluna 2 é %.2f \n " , somacoluna2(M));
		System.out.printf("O resultado da soma da diagonal principal é %.2f \n" , somadiagonalprincipao(M));
		System.out.printf("O resultado da soma da diagonal Secundária é %.2f \n" , somadiagonalsecundaria(M));
		System.out.printf("O resultado da soma de todos os elementos da matriz é %.2f \n " , somamatriz(M));
	}

}
