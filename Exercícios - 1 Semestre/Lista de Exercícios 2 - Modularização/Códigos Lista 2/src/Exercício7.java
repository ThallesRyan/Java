import java.util.Scanner;

public class Exercício7 {

	/*Faça uma função que recebe um valor inteiro e verifica se o valor é positivo ou negativo. 
A função deve retornar um valor lógico (true ou false). Faça um programa que lê N 
números e para cada um deles exibe uma mensagem informando se ele é positivo ou não, 
dependendo se foi retornado verdadeiro ou falso pela função.*/
	
	public static boolean numero (int inteiro)
	{//Se o valor foi maior ou igual  a zero , será retonando "true", ao contrário , será retornado "false".
		if (inteiro >= 0)
		{return true ; }
		
		else 
		{return false;}
		
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//Declaração das variáveis
		int N , rep , inteiro;
		boolean inteiroretornado ;
		
		//Quantidade de vez que o código vai ser repetido., o número será usado no for.
		System.out.print("Quantos números serão inseridos?");
		N = entrada.nextInt();
		
		for(rep = 1 ; rep <= N ; rep ++)
		{
			//Leitura do número inteiro e armazenamento na variável.
			System.out.print("Digite um número inteiro:");
			inteiro = entrada.nextInt();
			
			//Sub-rotina com o parâmetro , o valor retonando da função será gravado em inteiroretonado, sendo um valor true ou false
			inteiroretornado = numero(inteiro);
			
			//Se o valor de inteiroretornado for true , o código será executado.
			if(inteiroretornado)
			{
				
				System.out.println("O número é positivo ou é zero ");
				
			}
			
			//Se o valor for falso, será executado o else.
			else 
			{
				System.out.println("O número é negativo");
				
			}
			
		}
		
		entrada.close();
	}

}
