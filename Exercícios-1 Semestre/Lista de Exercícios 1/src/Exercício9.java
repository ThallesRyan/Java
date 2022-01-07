import java.util.Scanner;

public class Exercício9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Declaração das várias variáveis
		int filhos , entrevist = 0 , totalfilhos = 0 , salariomenos100 = 0;
		double salario = 0 , mediasalario = 0 , salariorec=0 , totalsalarios = 0 , mediafilhos=0 , maiorsalario = 0 , porcsalariomenos100  ;
		//Enquanto o valor do salário for maior ou igual a zero , o código será repetido
		while (salario >= 0)
		{
			System.out.println("Qual é o seu salário atualmente?");
			salario = entrada.nextDouble();
			System.out.println("Quantos filhos você tem?");
			filhos = entrada.nextInt();		
			
			// Toda vez que o código for repetido , será adicionado 1 ao número de entrevistados
			entrevist = entrevist + 1 ; 
			// O salário será adicionado ao total para depois fazer a média
			totalsalarios = totalsalarios + salario ; 
			mediasalario = totalsalarios/entrevist ;
			//o número de filhos de cada entrevistado será adicionado ao total para fazer a média
			totalfilhos = totalfilhos + filhos ;
			mediafilhos =((double)totalfilhos/entrevist) ;
			
			//Estrutura condional para calcular o maior salário e os salários menores de 100,00
			if (salario > maiorsalario)
			{
				maiorsalario = salario ;
				
			}
			
			if (salario <= 100)
			{
				
				salariomenos100 ++ ;
			}
			
			porcsalariomenos100 = ((double)salariomenos100 / entrevist)* 100 ;
			
			//Exibição
			System.out.print("O total de entrevistados é " + entrevist + "\n");
			System.out.printf("A média de salário é R$%.2f\n" ,mediasalario );
			System.out.printf("A média de filhos é aproximadamente %.0f filho por pessoa\n" , mediafilhos);
			System.out.printf("O maior salário é R$%.2f\n" , maiorsalario );
			System.out.printf("A porcentagem de pessoas com salário de até R$100,00 é %.2f%%\n\n" , porcsalariomenos100);
		}
		
		
		entrada.close();
	}

}
