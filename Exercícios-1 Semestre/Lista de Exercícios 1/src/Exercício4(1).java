import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		
		double nota ; //Declaração da variável , que pode armazenar um  número decimal
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a sua nota"); // Print na tela pedindo para inserir a nota
		nota = entrada.nextDouble();// entrada e armazenamento do número do usuário
		// Se a condição for atendida , o código será executado, se não for, os else if serão verificados e se nenhuma condição for verdadeira, o else será executado, mostrando na tela que o número é inválido
		if(nota >= 8 && nota <= 10 ) 
		{
			System.out.print("Ótimo");			
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
			System.out.print("Insatisfatório");	
		}
		else 
		{
			System.out.print("Número inválido");
		}
		entrada.close();

	}

}
