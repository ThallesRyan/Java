/*8. Escrever um algoritmo que l� um valor N inteiro e positivo e que calcula e escreve o valor 
de E:
E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / N!   */


import java.util.Scanner;

public class Exerc�cio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double E, fat;
		int num, N, valor;
		
		
		System.out.println("Digite um n�mero inteiro e positivo");
		N = entrada.nextInt();
		
		E = 1;
		// O c�digo ser� executado at� num ser menor ou igual a n
		for(num = 1; num <= N; num++)
		{
			// valor � igual ao num, c�lculo do fatorial
			fat = 1;
			for (valor = num; valor > 1; valor--)
			{
				fat = fat * valor;
			}
			// Express�o ser� feita quantas vezes o c�digo for executados
			E = E + 1/fat;
		}
		
		// Escrever o valor de E
		System.out.printf("O valor da express�o � %.6f\n",E);
		
		
		
		
		
		
		
		
		entrada.close();
	}

}
