import java.util.Scanner;

public class Exercício1 {

	//Declaração do módulo recebendo os parâmetros , calculando a média aritmética e exibindo o resultado
	public static void mediaA(double n1 , double n2 , double n3)
	{
		double resultado ;
		
		resultado = (n1 + n2 + n3)/3 ;
		
		System.out.printf("O resultado da média Aritmética é %.2f :" , resultado);
		
	}
	
	//Módulo recebendo os parâmentros , calculando a média ponderada e exibindo o resultado
	public static void mediaP(double n1 , double n2 , double n3)
	{
		double resultado ;
		resultado = ((n1 *5 )+ (n2 * 3) +( n3 * 2))/10 ;
		
		System.out.printf("O resultado da média Ponderada é %.2f :" , resultado);
	}
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		//Declaração das variáveis 
		double n1 , n2 , n3 ;
		int N , rep;
		char letra ;
		
		//Número de alunos 
		System.out.printf("Digite o número de alunos que terão as notas lidas? ");
		N = entrada.nextInt();
		
		//Repetição para executar o código para cada aluno que o usuário digitar 
		for (rep = 1 ; rep <= N ; rep ++) 
		{
		//Os prints pedindo as notas e o armazenamento dos valores digitados pelo usuário nas variáveis
		
		System.out.print("Digite a primeira nota :");
		n1 = entrada.nextDouble();
		System.out.print(" Digite a segunda nota :");
		n2 = entrada.nextDouble();
		System.out.print("Digite a terceira nota :");
		n3 = entrada.nextDouble();
		System.out.print("Digite a letra (A ou P) :");
		letra = entrada.next().charAt(0);
		
		//Condicional para examinar o valor de letra e executar os comandos, se os valores forem verdadeiros
		
		
			if (letra == 'A' || letra == 'a') 
			{
				mediaA(n1 , n2 , n3);// O código será desviado para o módulo mediaA , enviando os parâmetros entre parênteses
				System.out.println("\n");
			}
			else if (letra == 'P' || letra == 'p')
			{
			
			mediaP(n1 , n2 , n3); //O código será desviado para o módulo mediaP , enviando os parâmetros entre parênteses
			System.out.println("\n");
			}	
		
		}
		entrada.close();

	}
}
