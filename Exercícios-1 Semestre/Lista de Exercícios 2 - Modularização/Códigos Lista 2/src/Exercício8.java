import java.util.Scanner;

public class Exercício8 {
	
	/*Escreva uma função que recebe por parâmetro um valor inteiro e positivo N e retorna o 
valor de S, calculado segundo a fórmula abaixo. 
S = 2/4 + 5/5 + 10/6 + 17/7 + 26/8 + ... +(n2+1)/(n+3)
Faça um programa que leia N e imprima o valor retornado pela função.
*/
	public static double expressao (int N)
	{
	
	double S = 0 ;

	//Cálculo da expressão
	S = ((N * N )+1)/(N + 3);

//Retorno do valor da expressão.
	return(S);
	}




	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//Declaração das variáveis
		int N ;
		double S;
		//Print pedindo para digitar o número e armazenamento na variável N
		System.out.print("Digite um número inteiro positivo: ");
		N = entrada.nextInt();
		
		//Sub-rotina levando o parâmetro e gravando o retorno na variável S
		S = expressao(N);
		
		System.out.printf("O valor da expressão é %.2f" , S);
		entrada.close();

	}

}
