import java.util.Scanner;

public class Exercício5 {
	
	//Módulo recebendo o valor da média em double
	public static void conceito(double media)
	{   // Análise da média e exibição da nota
		
		if (media <= 39)
		{
		 System.out.println("Nota F");	
		}

		else if (media > 39 && media <= 59)
		{
			System.out.println("Nota E");
		}
		
		else if (media > 59 && media <= 69 )
		{	
			System.out.println("Nota D");
		}
		
		else if (media > 69 && media <= 79)
		{	
			System.out.println("Nota C");
		}
		
		else if (media > 79 && media <= 89)
		{
			System.out.println("Nota B");
		}
		
		else if (media >= 90)
		{
			System.out.println("Nota A");
		}
		
		
	}

	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	//Variáveis
	int rep , N ;
	double media ;
	
	//Número de repetições do código
	System.out.print("Digite quantos alunos você deseja calcular as notas:");
	N = entrada.nextInt();
	
	for (rep = 1 ; rep <= N ; rep ++)
	{
		
		System.out.print("Digite a média do aluno:");
		media = entrada.nextDouble();
		
		//Módulo sendo chamado e o valor da média sendo enviada por parâmetro
		conceito(media);
		
		
		
		
		
	}
	
	
	
	entrada.close();

	}

}
