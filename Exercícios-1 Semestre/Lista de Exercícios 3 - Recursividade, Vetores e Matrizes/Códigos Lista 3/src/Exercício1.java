import java.util.Scanner;

public class Exerc�cio1 {
	
	public static int divisao(int numerador , int denominador)
	{
		
		
		
		
		
		
		
		return (divisao (numerador - numerador , denominador));
		
		}
	
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int numerador , denominador , resultado ;
		
		System.out.println("Digite dois n�mero: ");
		numerador = entrada.nextInt();		
		denominador = entrada.nextInt();		

		resultado = divisao( numerador , denominador ) ;
		
		System.out.println("O resultado � "+  resultado);
		entrada.close();
		

	}

}
