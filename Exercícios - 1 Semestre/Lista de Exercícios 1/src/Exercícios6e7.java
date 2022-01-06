import java.util.Scanner;

public class Exercícios6e7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Declaração das variáveis 
		int numero , negativos = 0 , zeros = 0 , positivos = 0 , total = 0;
		double  porcnegat , porczeros , porcposi ;
		char opcao = 's' ; // declarei a variável opcao para usar caracteres e já gravei o caractere 's' nela, que usarei no while
		System.out.println("Digite um número");

		while (opcao == 's') /*Enquanto a variável char for igual a 's' , o código será executado. A variável opcao sempre será igual a 's',
		 criando assim um looping infinito proposital para o código ser executado quantas vezes o usuário quiser.*/
		{ 
			numero = entrada.nextInt(); // Irá ter a entrada da variável "numero" toda vez que o código for executado/repetido.
			if (numero < 0) 
			{ 
				negativos  = negativos + 1 ;	
			}
			else if (numero == 0)
			{	
				zeros = zeros + 1 ;	
			}
			else if ( numero > 0)	
			{
				positivos = positivos + 1 ;
			}
			
			total = total +1 ; //Toda vez que o código for executado, será adicionado 1 ao total , que é o total de vezes que o código foi executado
				
			//Cálculo da porcentagem
			porcnegat = ((double)negativos / total ) *100 ;
			porczeros = ((double)zeros / total) *100 ;
			porcposi = ((double)positivos / total) *100 ;
			
			//Prints dos resultados
			System.out.println("O total de números negativos é: " + negativos );
			System.out.println("O total de núemeros zero é: " + zeros );
			System.out.println("O total de números positivos é: " + positivos + "\n" );
			System.out.printf("A porcentagem de valores negativos em relação ao total é de %.2f%%\n" , porcnegat);
			System.out.printf("A porcentagem de números zero em relação ao total é de %.2f%%\n" , porczeros);
			System.out.printf("A porcentagem de números positivos em relação ao total é de %.2f%%\n" , porcposi);
				
			// Usei para exibir uma linha pontilhada separando as repetições do código	
			System.out.println("---------------------------------------------------------------------\n"); 
			
			//print pedindo para adicionar um número, ele será mostrado e em seguinte o código será repetido
			System.out.println("Digite outro número:");
			}
		
		entrada.close();
	}

}
