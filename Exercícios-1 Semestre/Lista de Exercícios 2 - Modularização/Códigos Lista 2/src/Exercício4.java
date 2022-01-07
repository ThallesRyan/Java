import java.util.Scanner;

public class Exerc�cio4 {

	public static void triangulo(int x , int y , int z)
	{
		//If examindo os valores de x , y e z para identificar qual tipo de tri�ngulo eles formam
		if (x == y && y == z)
		{System.out.println("Tri�ngulo equil�tero.");}
		
		else if(x == y || x == z || y == z )
		{System.out.println("Tri�ngulo Is�sceles.");}
		
		else if (x != y && x != z && y != z )
		{System.out.println("Tri�ngulo Escaleno.");}
	}
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Declara��o das var�veis
		int x , y , z ;
		char resp;
		
		//Print perguntando se o usu�rio quer iniciar o c�digo
		System.out.println("Quer iniciar o programa?(S ou N)");
		resp = entrada.next().charAt(0);
		
		//Enquanto a resposta for S , o c�digo ser� executado
	while (resp == 'S' || resp == 's')
	{		
		System.out.println("Digite tr�s valores para o comprimento dos lados de um tri�ngulo");
		x = entrada.nextInt();
		y = entrada.nextInt();
		z = entrada.nextInt();
		
		//If examinando se o lado do tri�ngulo � maior que a soma dos outros dois
		if ( x <= (y + z) && y <= (x + z) && z <= (y + x))
		{System.out.println("Pode formar um tri�ngulo.");
			
			triangulo(x , y , z); // Desvio do c�digo para o m�dulo levando os par�metro
		}
		else 
		{
			System.out.println("Esses valores n�o podem formar um tri�ngulo...");
		
	     }
	
		//Print perguntando se o usu�rio deseja continuar o c�digo
		System.out.println("");
		System.out.println("Quer repetir o programa? (S ou N)");
		resp = entrada.next().charAt(0);
		
	}	
		
		entrada.close();

	}

}
