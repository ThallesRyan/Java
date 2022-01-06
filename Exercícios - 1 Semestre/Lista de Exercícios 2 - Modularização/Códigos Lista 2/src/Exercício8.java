import java.util.Scanner;

public class Exerc�cio8 {
	
	/*Escreva uma fun��o que recebe por par�metro um valor inteiro e positivo N e retorna o 
valor de S, calculado segundo a f�rmula abaixo. 
S = 2/4 + 5/5 + 10/6 + 17/7 + 26/8 + ... +(n2+1)/(n+3)
Fa�a um programa que leia N e imprima o valor retornado pela fun��o.
*/
	public static double expressao (int N)
	{
	
	double S = 0 ;

	//C�lculo da express�o
	S = ((N * N )+1)/(N + 3);

//Retorno do valor da express�o.
	return(S);
	}




	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//Declara��o das vari�veis
		int N ;
		double S;
		//Print pedindo para digitar o n�mero e armazenamento na vari�vel N
		System.out.print("Digite um n�mero inteiro positivo: ");
		N = entrada.nextInt();
		
		//Sub-rotina levando o par�metro e gravando o retorno na vari�vel S
		S = expressao(N);
		
		System.out.printf("O valor da express�o � %.2f" , S);
		entrada.close();

	}

}
