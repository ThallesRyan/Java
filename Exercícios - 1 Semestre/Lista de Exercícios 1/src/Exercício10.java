/*Escreva um algoritmo que l� um valor n inteiro e positivo e que calcula a seguinte soma: 
S := 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
O algoritmo deve escrever cada termo gerado e o valor final de S.
*/

import java.util.Scanner;

public class Exerc�cio10 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int N  ;
	double  nsoma , S=1 ;
	//print pedindo um n�mero e armazenamento na vari�vel N
	System.out.println("Digite um n�mero inteiro e positivo");
	N = entrada.nextInt();
	//O c�digo ser� executado at� a vari�vel nsoma ser menor ou igual a N , coomeca com nsoma igual a 1 e ser� acrescentado de 1 em 1 no valor dela
	for (nsoma = 1 ; nsoma <= N ; nsoma ++)
	{ 
		S = S + 1.0/ nsoma ;
		
	}
	
	System.out.printf("O resultado dessa express�o � %.2f " , S);
	
	
	
	
	
	
	
	entrada.close();
	}

}
