/*8. Escrever um algoritmo que lê um valor N inteiro e positivo e que calcula e escreve o valor 
de E:
E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / N!   */


import java.util.Scanner;

public class Exercício8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double E, fat;
		int num, N, valor;
		
		
		System.out.println("Digite um número inteiro e positivo");
		N = entrada.nextInt();
		
		E = 1;
		// O código será executado até num ser menor ou igual a n
		for(num = 1; num <= N; num++)
		{
			// valor é igual ao num, cálculo do fatorial
			fat = 1;
			for (valor = num; valor > 1; valor--)
			{
				fat = fat * valor;
			}
			// Expressão será feita quantas vezes o código for executados
			E = E + 1/fat;
		}
		
		// Escrever o valor de E
		System.out.printf("O valor da expressão é %.6f\n",E);
		
		
		
		
		
		
		
		
		entrada.close();
	}

}
