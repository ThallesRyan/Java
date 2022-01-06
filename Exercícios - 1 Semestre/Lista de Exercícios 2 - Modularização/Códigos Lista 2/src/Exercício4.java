import java.util.Scanner;

public class Exercício4 {

	public static void triangulo(int x , int y , int z)
	{
		//If examindo os valores de x , y e z para identificar qual tipo de triângulo eles formam
		if (x == y && y == z)
		{System.out.println("Triângulo equilátero.");}
		
		else if(x == y || x == z || y == z )
		{System.out.println("Triângulo Isósceles.");}
		
		else if (x != y && x != z && y != z )
		{System.out.println("Triângulo Escaleno.");}
	}
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Declaração das varáveis
		int x , y , z ;
		char resp;
		
		//Print perguntando se o usuário quer iniciar o código
		System.out.println("Quer iniciar o programa?(S ou N)");
		resp = entrada.next().charAt(0);
		
		//Enquanto a resposta for S , o código será executado
	while (resp == 'S' || resp == 's')
	{		
		System.out.println("Digite três valores para o comprimento dos lados de um triângulo");
		x = entrada.nextInt();
		y = entrada.nextInt();
		z = entrada.nextInt();
		
		//If examinando se o lado do triângulo é maior que a soma dos outros dois
		if ( x <= (y + z) && y <= (x + z) && z <= (y + x))
		{System.out.println("Pode formar um triângulo.");
			
			triangulo(x , y , z); // Desvio do código para o módulo levando os parâmetro
		}
		else 
		{
			System.out.println("Esses valores não podem formar um triângulo...");
		
	     }
	
		//Print perguntando se o usuário deseja continuar o código
		System.out.println("");
		System.out.println("Quer repetir o programa? (S ou N)");
		resp = entrada.next().charAt(0);
		
	}	
		
		entrada.close();

	}

}
