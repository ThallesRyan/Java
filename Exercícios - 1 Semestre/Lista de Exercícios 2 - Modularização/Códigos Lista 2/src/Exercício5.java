import java.util.Scanner;

public class Exerc�cio5 {
	
	//M�dulo recebendo o valor da m�dia em double
	public static void conceito(double media)
	{   // An�lise da m�dia e exibi��o da nota
		
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
	//Vari�veis
	int rep , N ;
	double media ;
	
	//N�mero de repeti��es do c�digo
	System.out.print("Digite quantos alunos voc� deseja calcular as notas:");
	N = entrada.nextInt();
	
	for (rep = 1 ; rep <= N ; rep ++)
	{
		
		System.out.print("Digite a m�dia do aluno:");
		media = entrada.nextDouble();
		
		//M�dulo sendo chamado e o valor da m�dia sendo enviada por par�metro
		conceito(media);
		
		
		
		
		
	}
	
	
	
	entrada.close();

	}

}
