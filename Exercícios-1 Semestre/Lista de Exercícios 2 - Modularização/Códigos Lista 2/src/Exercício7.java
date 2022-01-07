import java.util.Scanner;

public class Exerc�cio7 {

	/*Fa�a uma fun��o que recebe um valor inteiro e verifica se o valor � positivo ou negativo. 
A fun��o deve retornar um valor l�gico (true ou false). Fa�a um programa que l� N 
n�meros e para cada um deles exibe uma mensagem informando se ele � positivo ou n�o, 
dependendo se foi retornado verdadeiro ou falso pela fun��o.*/
	
	public static boolean numero (int inteiro)
	{//Se o valor foi maior ou igual  a zero , ser� retonando "true", ao contr�rio , ser� retornado "false".
		if (inteiro >= 0)
		{return true ; }
		
		else 
		{return false;}
		
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//Declara��o das vari�veis
		int N , rep , inteiro;
		boolean inteiroretornado ;
		
		//Quantidade de vez que o c�digo vai ser repetido., o n�mero ser� usado no for.
		System.out.print("Quantos n�meros ser�o inseridos?");
		N = entrada.nextInt();
		
		for(rep = 1 ; rep <= N ; rep ++)
		{
			//Leitura do n�mero inteiro e armazenamento na vari�vel.
			System.out.print("Digite um n�mero inteiro:");
			inteiro = entrada.nextInt();
			
			//Sub-rotina com o par�metro , o valor retonando da fun��o ser� gravado em inteiroretonado, sendo um valor true ou false
			inteiroretornado = numero(inteiro);
			
			//Se o valor de inteiroretornado for true , o c�digo ser� executado.
			if(inteiroretornado)
			{
				
				System.out.println("O n�mero � positivo ou � zero ");
				
			}
			
			//Se o valor for falso, ser� executado o else.
			else 
			{
				System.out.println("O n�mero � negativo");
				
			}
			
		}
		
		entrada.close();
	}

}
