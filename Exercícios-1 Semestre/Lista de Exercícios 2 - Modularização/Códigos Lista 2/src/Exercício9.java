import java.util.Scanner;

/*Faça uma função que lê um número indeterminado de notas de alunos, calcula e retorna a 
média das notas dos alunos aprovados (nota maior ou igual a 6). Faça um programa que lê 
o número de alunos e imprime a média retornada pela função.*/




public class Exercício9 {

	public static double media(int alunos)
	{
		//Scanner do módulo
		Scanner entradamedia = new Scanner (System.in);
		//Declaração das variáveis locais
		
		double nota , totalnotas = 0 ;
		int rep  , alunosaprovados = 0 ;
		
		//For para repetir o código para cada aluno
		for(rep = 1 ; rep <= alunos ; rep ++)
		{
			System.out.printf("Digite a nota do aluno %d : " , rep);
			nota = entradamedia.nextDouble();	
			
			//if para testar se a nota é maior ou igual a 6
			if (nota >= 6)
			{
				alunosaprovados ++ ;
				
				totalnotas = totalnotas + nota ;
				
				
				
			}
			
			
			
		 }
			//return retornará a média dos alunos aprovados.
		return (totalnotas / alunosaprovados) ;
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//Declaração das variáveis
		int alunos , rep ;
		double mediaalunosaprovados ;
		
		System.out.print("Digite quantos alunos são:");
		alunos = entrada.nextInt();
		
		
		// O resultado retornado do módulo média será gravado na variável mediaalunosaprovados
			mediaalunosaprovados = media( alunos);
			
			//Exibição da média de nota dos alunos aprovados.
			System.out.printf("A média de nota dos alunos aprovados é %.2f" , mediaalunosaprovados);
		
		
		
		
		
		
		
		
		
		
		entrada.close();

	}

}
