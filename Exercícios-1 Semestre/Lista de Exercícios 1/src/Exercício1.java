import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner (System.in);
		double x , y ; // Declaração das variáveis que serão informadas pelo usuário
		 
		System.out.println("Digite dois números"); // Print na tela pedindo para os números serem inseridos
		
		//Entrada dos números e os mesmos sendo gravados na variável
		x = entrada.nextDouble(); 
		y = entrada.nextDouble();
		
		//Se x  for maior que y , mostrar na tela 
		if (x > y)
		{
			System.out.printf(" %.1f é o maior número ",x);
		 }
		//Se y for maior que x, mostar na tela	
		else if (y > x)
		{
			System.out.printf(" %.1f é o maior número " ,y);	
		}
		 // Se não nenhuma das opções acima, os numeros serão iguais.
		else 
		{
			System.out.printf(" %.1f e %.1f são iguais ", x, y );	
		}
		entrada.close();
		

		
		
		
	}

}
