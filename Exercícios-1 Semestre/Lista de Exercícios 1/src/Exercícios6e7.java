import java.util.Scanner;

public class Exerc�cios6e7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Declara��o das vari�veis 
		int numero , negativos = 0 , zeros = 0 , positivos = 0 , total = 0;
		double  porcnegat , porczeros , porcposi ;
		char opcao = 's' ; // declarei a vari�vel opcao para usar caracteres e j� gravei o caractere 's' nela, que usarei no while
		System.out.println("Digite um n�mero");

		while (opcao == 's') /*Enquanto a vari�vel char for igual a 's' , o c�digo ser� executado. A vari�vel opcao sempre ser� igual a 's',
		 criando assim um looping infinito proposital para o c�digo ser executado quantas vezes o usu�rio quiser.*/
		{ 
			numero = entrada.nextInt(); // Ir� ter a entrada da vari�vel "numero" toda vez que o c�digo for executado/repetido.
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
			
			total = total +1 ; //Toda vez que o c�digo for executado, ser� adicionado 1 ao total , que � o total de vezes que o c�digo foi executado
				
			//C�lculo da porcentagem
			porcnegat = ((double)negativos / total ) *100 ;
			porczeros = ((double)zeros / total) *100 ;
			porcposi = ((double)positivos / total) *100 ;
			
			//Prints dos resultados
			System.out.println("O total de n�meros negativos �: " + negativos );
			System.out.println("O total de n�emeros zero �: " + zeros );
			System.out.println("O total de n�meros positivos �: " + positivos + "\n" );
			System.out.printf("A porcentagem de valores negativos em rela��o ao total � de %.2f%%\n" , porcnegat);
			System.out.printf("A porcentagem de n�meros zero em rela��o ao total � de %.2f%%\n" , porczeros);
			System.out.printf("A porcentagem de n�meros positivos em rela��o ao total � de %.2f%%\n" , porcposi);
				
			// Usei para exibir uma linha pontilhada separando as repeti��es do c�digo	
			System.out.println("---------------------------------------------------------------------\n"); 
			
			//print pedindo para adicionar um n�mero, ele ser� mostrado e em seguinte o c�digo ser� repetido
			System.out.println("Digite outro n�mero:");
			}
		
		entrada.close();
	}

}
