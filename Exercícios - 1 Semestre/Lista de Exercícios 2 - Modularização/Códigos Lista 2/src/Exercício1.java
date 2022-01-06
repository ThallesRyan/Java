import java.util.Scanner;

public class Exerc�cio1 {

	//Declara��o do m�dulo recebendo os par�metros , calculando a m�dia aritm�tica e exibindo o resultado
	public static void mediaA(double n1 , double n2 , double n3)
	{
		double resultado ;
		
		resultado = (n1 + n2 + n3)/3 ;
		
		System.out.printf("O resultado da m�dia Aritm�tica � %.2f :" , resultado);
		
	}
	
	//M�dulo recebendo os par�mentros , calculando a m�dia ponderada e exibindo o resultado
	public static void mediaP(double n1 , double n2 , double n3)
	{
		double resultado ;
		resultado = ((n1 *5 )+ (n2 * 3) +( n3 * 2))/10 ;
		
		System.out.printf("O resultado da m�dia Ponderada � %.2f :" , resultado);
	}
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		//Declara��o das vari�veis 
		double n1 , n2 , n3 ;
		int N , rep;
		char letra ;
		
		//N�mero de alunos 
		System.out.printf("Digite o n�mero de alunos que ter�o as notas lidas? ");
		N = entrada.nextInt();
		
		//Repeti��o para executar o c�digo para cada aluno que o usu�rio digitar 
		for (rep = 1 ; rep <= N ; rep ++) 
		{
		//Os prints pedindo as notas e o armazenamento dos valores digitados pelo usu�rio nas vari�veis
		
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
				mediaA(n1 , n2 , n3);// O c�digo ser� desviado para o m�dulo mediaA , enviando os par�metros entre par�nteses
				System.out.println("\n");
			}
			else if (letra == 'P' || letra == 'p')
			{
			
			mediaP(n1 , n2 , n3); //O c�digo ser� desviado para o m�dulo mediaP , enviando os par�metros entre par�nteses
			System.out.println("\n");
			}	
		
		}
		entrada.close();

	}
}
