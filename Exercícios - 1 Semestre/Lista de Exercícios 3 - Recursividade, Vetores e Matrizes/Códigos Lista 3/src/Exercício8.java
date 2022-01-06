import java.util.Scanner;

public class Exerc�cio8 {
	
	//M�dulo para preencher a matriz
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
	//M�dulo para c�lculo da soma da linha 4
	public static double somalinha4(double[][] matriz)
	{
		double somalinha = 0 ;
		for(int col = 0 ; col < matriz.length ; col++)
		{	
			somalinha += matriz[4][col]  ;
		}
		return somalinha;
	}
	
	//M�dulo para c�lculo da coluna 2
	public static double somacoluna2(double[][] matriz)
	{
		double somacoluna = 0 ;
		for(int ln = 0 ; ln < matriz.length ; ln++)
		{	
			somacoluna += matriz[ln][2]  ;
		
		}
		
		return somacoluna;
	}
	//C�lculo da soma do diagonal principal
	public static double somadiagonalprincipao(double [][] m)
	{
		double somadiagonal = 0;
		
		for (int i = 0 ; i < m.length ; i ++ )
		{
			
			somadiagonal += m[i][i] ;
			
		}	
		return somadiagonal;
	}
	
	//C�lculo da soma do diagonal secund�rio
	public static double somadiagonalsecundaria (double m[][])
	{ int somadiagonalsecundaria = 0 , col = 4 ;
	

	for (int i = 0 ; i < m.length ; i ++)
	{
		
		
		somadiagonalsecundaria += m[i][col] ;
		col -- ;
		
	}
	
	
		return somadiagonalsecundaria ;
	}
	
	//C�lculo da soma da matriz inteira
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
		//Declara��o da matriz
		double [][] M = new double[5][5];
		//M�dulo passando a matriz por par�metro
		matriz(M);
				
		//Exibi��o dos resultados das somas
		System.out.printf("O resultado da soma da linha 4 � %.2f \n " , somalinha4(M));
		System.out.printf("O resultado da soma da coluna 2 � %.2f \n " , somacoluna2(M));
		System.out.printf("O resultado da soma da diagonal principal � %.2f \n" , somadiagonalprincipao(M));
		System.out.printf("O resultado da soma da diagonal Secund�ria � %.2f \n" , somadiagonalsecundaria(M));
		System.out.printf("O resultado da soma de todos os elementos da matriz � %.2f \n " , somamatriz(M));
	}

}
