import java.util.Scanner;

/*3. Faça um procedimento que recebe 3 valores inteiros por parâmetro e os exiba em ordem 
crescente. Faça um programa que leia N conjuntos de 3 valores e acione o procedimento
para cada conjunto. (N deve ser lido do teclado)*/

public class Exercício3 {
//Declaração do módulo e recebimento dos parâmetros
	public static void crescente(int n1 , int n2 , int n3)
	{
		//Análise das condições e exibição dos números em ordem crescente
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
			System.out.println("Digite o primeiro número: ");
			n1 = entrada.nextInt();
			System.out.println("Digite o segundo número: ");
			n2 = entrada.nextInt();
			System.out.println("Digite o terceiro número: ");
			n3 = entrada.nextInt();
			
			//Desvio do código para o módulo levando os parâmetros
			crescente(n1 , n2 , n3);
			
			
		}
		
		entrada.close();
	}

}
