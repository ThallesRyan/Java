import java.util.Scanner;

public class Exercício2 {
/*A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes, coletando dados 
sobre o salário e número de filhos. Faça um procedimento que leia esses dados para um 
número não determinado de pessoas, calcule e exiba a média de salário da população (a
condição de parada pode ser um flag ou a quantidade N). Faça um programa que acione o 
procedimento.*/
	
	
	public static void pesquisa(){
		Scanner entradapesquisa = new Scanner(System.in);
		//Declaração das variáveis locais
		char resposta;
		double salario , totalsalarios = 0 , totalfilhos = 0 , mediasalario , mediafilhos ;
		int filhos , habitantes = 0 ;
		
		//Print para iniciar o aplicativo
		System.out.print("Quer iniciar o programa?");
		resposta = entradapesquisa.next().charAt(0);
		
		
		while(resposta == 'S' || resposta == 's')	
		{
			//Print pedindo o salário do habitante e armazenamento na variável salario.
			System.out.print("Qual é o salário deste habitante?");
			salario = entradapesquisa.nextDouble();
			//Cálculo para o total de salários.
			totalsalarios = totalsalarios + salario ;
			
			//Print pedindo o número de filhos do habitante e armazenamento na varável filhos.
			System.out.print("Qual o número de filhos?");
			filhos = entradapesquisa.nextInt();
			//Cálculo para o total de filhos.
			totalfilhos = totalfilhos + filhos ;
			
			//Cada vez que o código for executado , adicionará 1 ao total de habitantes.
			habitantes = habitantes + 1 ;
			
			//Print perguntando se o usuário deseja executar o aplicativo de novo.
			System.out.print("Quer informar dados de mais um habitantes?");
			resposta = entradapesquisa.next().charAt(0);
		}
		// Cálculo da média do salário e exibição.
		mediasalario = ((double)totalsalarios/habitantes) ;
		System.out.printf("A média do sálario é R$%.2f por pessoa\n" , mediasalario);
		// Cálculo da média do número de filhos e exibição.
		mediafilhos = ((double)totalfilhos/habitantes) ;
		System.out.printf("A média de filhos é %.1f por pessoa\n" , mediafilhos);
		
		entradapesquisa.close();
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		//Chamada da sub-rotina
		pesquisa();
		
		entrada.close();
		
		

	}

}
