import java.util.Scanner;

/*3. Fa�a um procedimento que recebe 3 valores inteiros por par�metro e os exiba em ordem 
crescente. Fa�a um programa que leia N conjuntos de 3 valores e acione o procedimento
para cada conjunto. (N deve ser lido do teclado)*/

public class Exerc�cio3 {
//Declara��o do m�dulo e recebimento dos par�metros
	public static void crescente(int n1 , int n2 , int n3)
	{
		//An�lise das condi��es e exibi��o dos n�meros em ordem crescente
		if (n1 > n2 && n2 > n3)
		{
			System.out.println(n3 + " " + n2 + " " + n1);
				
		}
		
		else if (n1 > n3 && n3 > n2)
		{
			System.out.println(n2 + " " + n3 + " " + n1);	
		}
			
		else if (n2 > n1 && n1 > n3)
		{
			System.out.println(n3 + " " + n1 + " " + n2);
		}
		
		else if (n2 > n3 && n3 > n1)
		{
			System.out.println(n1 + " " + n3 +" " + n2);
		}
		
		else if (n3 > n2 && n2 > n1)
		{
			System.out.println(n1 + " " + n2 + " " + n3);
		}
		
		else if (n3 > n1 && n1 > n2)
		{
			System.out.println(n2 + " " + n1 + " " + n3);
		}
		
		else if(n1 > n2 && n2==n3)
		{
			
			System.out.println(n3 + " " + n2 + " " + n1);
			
		}
		
		else if (n1 == n2 && n1 > n3)
			
		{ System.out.println(n3 + " " + n2 + " " + n1);}
			
		
		else if (n1 == n3 && n2 > n1)
			
		{ System.out.println(n1 + " " + n3 + " " + n2);}
		
		else if (n2 == n3 && n2 > n1)
		{System.out.println(n1 + " " + n2 + " " + n3);}
		
		
			
		else { System.out.println(n2 + " " + n1 + " " + n3);}
		
	}
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int N , rep , n1 , n2 , n3;
		
		
		System.out.println("Digite a quantidade de conjuntos: ");
		N = entrada.nextInt();		
		
		for(rep = 1 ; rep <= N ; rep ++)
		{
			System.out.println("Digite o primeiro n�mero: ");
			n1 = entrada.nextInt();
			System.out.println("Digite o segundo n�mero: ");
			n2 = entrada.nextInt();
			System.out.println("Digite o terceiro n�mero: ");
			n3 = entrada.nextInt();
			
			//Desvio do c�digo para o m�dulo levando os par�metros
			crescente(n1 , n2 , n3);
			
			
		}
		
		entrada.close();
	}

}
