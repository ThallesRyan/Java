import java.util.Scanner;

public class Exerc�cio5 {
	
	//M�dulo recebendo e preenchendo o vetor com as notas digitadas 
	public static void preenc(double notas[])
	{
		//Valores sendo gravados no vetor
		Scanner entradaNotas = new Scanner (System.in);
		for (int i = 0 ; i < notas.length; i ++)
		{

			System.out.println("Digite a nota do aluno: " );
			notas[i] = entradaNotas.nextDouble();	
		}
		//Passagem do vetor por par�metro
		media(notas);
	}
	
	
	public static void media(double media[])
	{
		//Declara��o das vari�veis locais
		double totalnotas = 0 , alunos = 0 , medianotas = 0 ;
		int acimadamedia = 0;
		
		//Soma das notas dos alunos
		for (int i = 0 ; i < media.length ; i++)		
		{
		totalnotas += (media[i]);
		alunos += 1 ;
		}
		
		//C�lculo da m�dia
		medianotas = totalnotas / alunos ;
		//Exibi��o da m�dia das notas
		System.out.printf("A m�dia de notas � %.2f \n" , medianotas);
		
		//C�lculo das notas acima da m�dia
		for(int pos = 0 ; pos < media.length ; pos ++)
		{
			if (media[pos] > medianotas)
			{
				acimadamedia += 1;
				
			}
			
		}
		//Exibi��o da quantidade de alunos acima da m�dia
		System.out.println("O total de alunos acima da m�dia � " + acimadamedia);
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		//Decla��o do vetor e tamanho dele.
		double[] notas = new double[10];

		//M�dulo passando o Vetor como par�metro
		preenc(notas);
		
		entrada.close();
		
	}

}
