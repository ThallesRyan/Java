import java.util.Scanner;

/*Fa�a uma fun��o que l� um n�mero indeterminado de notas de alunos, calcula e retorna a 
m�dia das notas dos alunos aprovados (nota maior ou igual a 6). Fa�a um programa que l� 
o n�mero de alunos e imprime a m�dia retornada pela fun��o.*/




public class Exerc�cio9 {

	public static double media(int alunos)
	{
		//Scanner do m�dulo
		Scanner entradamedia = new Scanner (System.in);
		//Declara��o das vari�veis locais
		
		double nota , totalnotas = 0 ;
		int rep  , alunosaprovados = 0 ;
		
		//For para repetir o c�digo para cada aluno
		for(rep = 1 ; rep <= alunos ; rep ++)
		{
			System.out.printf("Digite a nota do aluno %d : " , rep);
			nota = entradamedia.nextDouble();	
			
			//if para testar se a nota � maior ou igual a 6
			if (nota >= 6)
			{
				alunosaprovados ++ ;
				
				totalnotas = totalnotas + nota ;
				
				
				
			}
			
			
			
		 }
			//return retornar� a m�dia dos alunos aprovados.
		return (totalnotas / alunosaprovados) ;
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//Declara��o das vari�veis
		int alunos , rep ;
		double mediaalunosaprovados ;
		
		System.out.print("Digite quantos alunos s�o:");
		alunos = entrada.nextInt();
		
		
		// O resultado retornado do m�dulo m�dia ser� gravado na vari�vel mediaalunosaprovados
			mediaalunosaprovados = media( alunos);
			
			//Exibi��o da m�dia de nota dos alunos aprovados.
			System.out.printf("A m�dia de nota dos alunos aprovados � %.2f" , mediaalunosaprovados);
		
		
		
		
		
		
		
		
		
		
		entrada.close();

	}

}
