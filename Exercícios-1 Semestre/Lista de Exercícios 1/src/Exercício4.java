import java.util.Scanner;

public class Exerc�cio4 {

	public static void main(String[] args) {
		
		double nota ; //Declara��o da vari�vel , que pode armazenar um  n�mero decimal
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a sua nota"); // Print na tela pedindo para inserir a nota
		nota = entrada.nextDouble();// entrada e armazenamento do n�mero do usu�rio
		// Se a condi��o for atendida , o c�digo ser� executado, se n�o for, os else if ser�o verificados e se nenhuma condi��o for verdadeira, o else ser� executado, mostrando na tela que o n�mero � inv�lido
		if(nota >= 8 && nota <= 10 ) 
		{
			System.out.print("�timo");			
		}
		else if (nota >= 7 && nota < 8)
		{
			
			System.out.print("Bom");	
		}

		else if (nota >= 5 && nota < 7)
		{	
			System.out.print("Regular");	
		}
		
		else if (nota <5 )
		{
			System.out.print("Insatisfat�rio");	
		}
		else 
		{
			System.out.print("N�mero inv�lido");
		}
		entrada.close();

	}

}
