import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); // Scanner para o usu�rio usar o teclado
		int x , y , soma, novo ; // declara��o das vari�veis
		
		System.out.println("Digite dois n�meros");// print na tela pedindo os n�meros a serem somados
		// a entrada dos n�meros pedidos e o armazenamento nas vari�veis
		x = entrada.nextInt();
		y = entrada.nextInt();
		soma = x + y ; // a vari�vel soma � igual a x + y
		
		if (soma >= 10) // se a vari�vel soma for maior ou igual a 10 , executar o c�digo 
		{
			novo = soma + 5 ; // a vari�vel novo armazenar� o resultado de "soma" mais o n�mero 5
			System.out.print("O resultado final � "+ novo);// imprimir o resultado na tela	
		}
		else // caso a var�vel soma n�o foi igual ou maior que 10 , executar este c�digo
		{ 
			novo = soma + 7 ; //a vari�vel novo armazenar� o resultado de "soma" mais o n�mero 7
			System.out.print("O resultado final � "+ novo);	// imprimir o resultado na tela
		}
		entrada.close();
	}
}
