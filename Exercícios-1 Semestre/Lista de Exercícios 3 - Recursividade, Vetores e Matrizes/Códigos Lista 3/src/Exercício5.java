import java.util.Scanner;

public class Exercício5 {
	
	//Módulo recebendo e preenchendo o vetor com as notas digitadas 
	public static void preenc(double notas[])
	{
		//Valores sendo gravados no vetor
		Scanner entradaNotas = new Scanner (System.in);
		for (int i = 0 ; i < notas.length; i ++)
		{

			System.out.println("Digite a nota do aluno: " );
			notas[i] = entradaNotas.nextDouble();	
		}
		//Passagem do vetor por parâmetro
		media(notas);
	}
	
	
	public static void media(double media[])
	{
		//Declaração das variáveis locais
		double totalnotas = 0 , alunos = 0 , medianotas = 0 ;
		int acimadamedia = 0;
		
		//Soma das notas dos alunos
		for (int i = 0 ; i < media.length ; i++)		
		{
		totalnotas += (media[i]);
		alunos += 1 ;
		}
		
		//Cálculo da média
		medianotas = totalnotas / alunos ;
		//Exibição da média das notas
		System.out.printf("A média de notas é %.2f \n" , medianotas);
		
		//Cálculo das notas acima da média
		for(int pos = 0 ; pos < media.length ; pos ++)
		{
			if (media[pos] > medianotas)
			{
				acimadamedia += 1;
				
			}
			
		}
		//Exibição da quantidade de alunos acima da média
		System.out.println("O total de alunos acima da média é " + acimadamedia);
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		//Declação do vetor e tamanho dele.
		double[] notas = new double[10];

		//Módulo passando o Vetor como parâmetro
		preenc(notas);
		
		entrada.close();
		
	}

}
