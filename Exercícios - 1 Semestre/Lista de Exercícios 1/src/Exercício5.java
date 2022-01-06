import java.util.Scanner;

public class Exercício5 {
/*  comentário */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double diaria , promocao , diariapromo  , diapromocao , ocupacaopromo , ocupacaonormal , dianormal , diferenca; //Declaração das variáveis
		double ap = 75.0; /*  Declarei a variável ap e já gravei o número 75, que é o total de apartamentos. Declarei em double para a divisão e multiplicação ser mais fácil com as outras variáveis */
		
		System.out.println("Qual o valor atual da diária?"); // print pedindo ao valor da diária ao usuário
		diaria = entrada.nextDouble();                  //Entrada do número/ valor indicado pelo usuário e ele sendo gravado na variável "diaria".
		
		promocao = (25.0/100)* diaria ;               // Cálculo da porcentagem sobre a diária e multiplicação do valor da diária , que terá como resultado o valor do desconto.
		diariapromo = (diaria - promocao) ;          // cálculo para saber o valor da diária promocional
		ocupacaopromo = ap * 0.80 ;                 // Cálculo para saber a ocupação prevista nos dias de promoção
		diapromocao = diariapromo * ocupacaopromo ;// Cálculo para saber o valor arrecadado nos dias promocionais
		ocupacaonormal = ap * 0.50 ;              // Cálculo para indicar a ocupação nos dias normais
		dianormal = diaria * ocupacaonormal ;    //Cálculo para saber o valor arrecado nos dias normais com 50 por cento de ocupação e valor normal
		
		System.out.printf("O valor da diária promocional é de R$ %.2f ." , diariapromo);                                          // Print mostrando o valor da diária promocional
		System.out.printf("\nO valor arrecadado com diária promocional e 80 por cento de ocupação é de R$%.2f .",  diapromocao); // print mostrando o valor arrecadado nos dias promocionais
		System.out.printf("\nO valor arrecadado com diária normal e 50 por cento de ocupação é de R$%.2f .",  dianormal);        // Print mostrando os valores arrecadados nos dias normais
		
		// Estrutura condicional para calcular a diferença do maior valor arrecadado, pelo menor valor e mostrar na tela.
		
		if (dianormal > diapromocao) 	
		{
			diferenca = dianormal - diapromocao ;
			System.out.printf("\nO valor arrecadado nos dias normais foram maiores e a diferença é de R$%.2f .", diferenca );		
		}
		
		else 
		{
			diferenca = diapromocao - dianormal ;
			System.out.printf("\nO valor arrecadado nos dias promocionais foram maiores e a diferença é de R$%.2f:", diferenca );				
		}	
		
		entrada.close();
	}

}
