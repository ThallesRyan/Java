import java.util.Scanner;

public class Exerc�cio5 {
/*  coment�rio */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double diaria , promocao , diariapromo  , diapromocao , ocupacaopromo , ocupacaonormal , dianormal , diferenca; //Declara��o das vari�veis
		double ap = 75.0; /*  Declarei a vari�vel ap e j� gravei o n�mero 75, que � o total de apartamentos. Declarei em double para a divis�o e multiplica��o ser mais f�cil com as outras vari�veis */
		
		System.out.println("Qual o valor atual da di�ria?"); // print pedindo ao valor da di�ria ao usu�rio
		diaria = entrada.nextDouble();                  //Entrada do n�mero/ valor indicado pelo usu�rio e ele sendo gravado na vari�vel "diaria".
		
		promocao = (25.0/100)* diaria ;               // C�lculo da porcentagem sobre a di�ria e multiplica��o do valor da di�ria , que ter� como resultado o valor do desconto.
		diariapromo = (diaria - promocao) ;          // c�lculo para saber o valor da di�ria promocional
		ocupacaopromo = ap * 0.80 ;                 // C�lculo para saber a ocupa��o prevista nos dias de promo��o
		diapromocao = diariapromo * ocupacaopromo ;// C�lculo para saber o valor arrecadado nos dias promocionais
		ocupacaonormal = ap * 0.50 ;              // C�lculo para indicar a ocupa��o nos dias normais
		dianormal = diaria * ocupacaonormal ;    //C�lculo para saber o valor arrecado nos dias normais com 50 por cento de ocupa��o e valor normal
		
		System.out.printf("O valor da di�ria promocional � de R$ %.2f ." , diariapromo);                                          // Print mostrando o valor da di�ria promocional
		System.out.printf("\nO valor arrecadado com di�ria promocional e 80 por cento de ocupa��o � de R$%.2f .",  diapromocao); // print mostrando o valor arrecadado nos dias promocionais
		System.out.printf("\nO valor arrecadado com di�ria normal e 50 por cento de ocupa��o � de R$%.2f .",  dianormal);        // Print mostrando os valores arrecadados nos dias normais
		
		// Estrutura condicional para calcular a diferen�a do maior valor arrecadado, pelo menor valor e mostrar na tela.
		
		if (dianormal > diapromocao) 	
		{
			diferenca = dianormal - diapromocao ;
			System.out.printf("\nO valor arrecadado nos dias normais foram maiores e a diferen�a � de R$%.2f .", diferenca );		
		}
		
		else 
		{
			diferenca = diapromocao - dianormal ;
			System.out.printf("\nO valor arrecadado nos dias promocionais foram maiores e a diferen�a � de R$%.2f:", diferenca );				
		}	
		
		entrada.close();
	}

}
