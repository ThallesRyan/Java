import java.util.Scanner;

public class Exerc�cio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Declara��o das v�rias vari�veis
		int filhos , entrevist = 0 , totalfilhos = 0 , salariomenos100 = 0;
		double salario = 0 , mediasalario = 0 , salariorec=0 , totalsalarios = 0 , mediafilhos=0 , maiorsalario = 0 , porcsalariomenos100  ;
		//Enquanto o valor do sal�rio for maior ou igual a zero , o c�digo ser� repetido
		while (salario >= 0)
		{
			System.out.println("Qual � o seu sal�rio atualmente?");
			salario = entrada.nextDouble();
			System.out.println("Quantos filhos voc� tem?");
			filhos = entrada.nextInt();		
			
			// Toda vez que o c�digo for repetido , ser� adicionado 1 ao n�mero de entrevistados
			entrevist = entrevist + 1 ; 
			// O sal�rio ser� adicionado ao total para depois fazer a m�dia
			totalsalarios = totalsalarios + salario ; 
			mediasalario = totalsalarios/entrevist ;
			//o n�mero de filhos de cada entrevistado ser� adicionado ao total para fazer a m�dia
			totalfilhos = totalfilhos + filhos ;
			mediafilhos =((double)totalfilhos/entrevist) ;
			
			//Estrutura condional para calcular o maior sal�rio e os sal�rios menores de 100,00
			if (salario > maiorsalario)
			{
				maiorsalario = salario ;
				
			}
			
			if (salario <= 100)
			{
				
				salariomenos100 ++ ;
			}
			
			porcsalariomenos100 = ((double)salariomenos100 / entrevist)* 100 ;
			
			//Exibi��o
			System.out.print("O total de entrevistados � " + entrevist + "\n");
			System.out.printf("A m�dia de sal�rio � R$%.2f\n" ,mediasalario );
			System.out.printf("A m�dia de filhos � aproximadamente %.0f filho por pessoa\n" , mediafilhos);
			System.out.printf("O maior sal�rio � R$%.2f\n" , maiorsalario );
			System.out.printf("A porcentagem de pessoas com sal�rio de at� R$100,00 � %.2f%%\n\n" , porcsalariomenos100);
		}
		
		
		entrada.close();
	}

}
