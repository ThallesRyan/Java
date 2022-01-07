import java.util.Scanner;

public class Exercício10 {

	public static void preenc(int m[][])
	{Scanner entradapreenc = new Scanner(System.in);
	
		//Preenchimento da Matriz e exibição
		for (int ln = 0 ; ln < m.length ; ln++)
		{
			for (int col = 0 ; col < m[ln].length; col++)
			{

				m[ln][col] = col + ln + 1;;	
				
				System.out.printf("[%d][%d]: %d\n" ,ln , col, m[ln][col]);
			}
			System.out.println();
		}

	}
	
	public static void a(int m[][])
	{
		int a[][] = new int [4][6];
		
		a = m ;
	System.out.println("A....\n");
		for (int ln = 0 ; ln < a.length; ln++)
		{
			for(int col = 0 ; col<a[ln].length ; col ++)
				
			{
				
				if(ln == 2 )
				{
					
					a[2][col] = m[8][col];
					
				}
				if(ln == 8)
				{
					a[8][col] = m[2][col];
					
				}
				System.out.printf("[%d][%d]: %d\n" ,ln , col, a[ln][col]);
			}
			System.out.println();

		}
	}
	
	public static void b(int m[][])
	{
		
		int B[][] = new int[10][10]; 
		B = m;
		
		for(int ln = 0 ; ln <B.length; ln++)
		{
			for (int col = 0 ; col < B[ln].length; col++)
			{
				
				if(col == 4)
				{
					
					B[ln][4] = m [ln][4] ;
				}
				
				if(col == 10)
				{
					B[ln][10] = m [ln][10];
				}
				
				System.out.printf("[%d][%d]: %d\n" ,ln , col, B[ln][col]);
			}
			System.out.println();

		}
	}
	public static void main(String[] args) {
		//Declaração da matriz
		int M[][] = new int[10][10];
		//Chamada do módulo e levando o parâmetro M
		preenc(M);

		a(M);
		b(M);
	}

}
