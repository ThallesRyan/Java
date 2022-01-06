import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); // Scanner para o usuário usar o teclado
		int x , y , soma, novo ; // declaração das variáveis
		
		System.out.println("Digite dois números");// print na tela pedindo os números a serem somados
		// a entrada dos números pedidos e o armazenamento nas variáveis
		x = entrada.nextInt();
		y = entrada.nextInt();
		soma = x + y ; // a variável soma é igual a x + y
		
		if (soma >= 10) // se a variável soma for maior ou igual a 10 , executar o código 
		{
			novo = soma + 5 ; // a variável novo armazenará o resultado de "soma" mais o número 5
			System.out.print("O resultado final é "+ novo);// imprimir o resultado na tela	
		}
		else // caso a varável soma não foi igual ou maior que 10 , executar este código
		{ 
			novo = soma + 7 ; //a variável novo armazenará o resultado de "soma" mais o número 7
			System.out.print("O resultado final é "+ novo);	// imprimir o resultado na tela
		}
		entrada.close();
	}
}
