import java.util.Scanner;

public class Exerc�cio1 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner (System.in);
		double x , y ; // Declara��o das vari�veis que ser�o informadas pelo usu�rio
		 
		System.out.println("Digite dois n�meros"); // Print na tela pedindo para os n�meros serem inseridos
		
		//Entrada dos n�meros e os mesmos sendo gravados na vari�vel
		x = entrada.nextDouble(); 
		y = entrada.nextDouble();
		
		//Se x  for maior que y , mostrar na tela 
		if (x > y)
		{
			System.out.printf(" %.1f � o maior n�mero ",x);
		 }
		//Se y for maior que x, mostar na tela	
		else if (y > x)
		{
			System.out.printf(" %.1f � o maior n�mero " ,y);	
		}
		 // Se n�o nenhuma das op��es acima, os numeros ser�o iguais.
		else 
		{
			System.out.printf(" %.1f e %.1f s�o iguais ", x, y );	
		}
		entrada.close();
		

		
		
		
	}

}
