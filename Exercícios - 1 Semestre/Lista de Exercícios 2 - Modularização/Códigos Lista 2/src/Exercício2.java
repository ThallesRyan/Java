import java.util.Scanner;

public class Exerc�cio2 {
/*A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes, coletando dados 
sobre o sal�rio e n�mero de filhos. Fa�a um procedimento que leia esses dados para um 
n�mero n�o determinado de pessoas, calcule e exiba a m�dia de sal�rio da popula��o (a
condi��o de parada pode ser um flag ou a quantidade N). Fa�a um programa que acione o 
procedimento.*/
	
	
	public static void pesquisa(){
		Scanner entradapesquisa = new Scanner(System.in);
		//Declara��o das vari�veis locais
		char resposta;
		double salario , totalsalarios = 0 , totalfilhos = 0 , mediasalario , mediafilhos ;
		int filhos , habitantes = 0 ;
		
		//Print para iniciar o aplicativo
		System.out.print("Quer iniciar o programa?");
		resposta = entradapesquisa.next().charAt(0);
		
		
		while(resposta == 'S' || resposta == 's')	
		{
			//Print pedindo o sal�rio do habitante e armazenamento na vari�vel salario.
			System.out.print("Qual � o sal�rio deste habitante?");
			salario = entradapesquisa.nextDouble();
			//C�lculo para o total de sal�rios.
			totalsalarios = totalsalarios + salario ;
			
			//Print pedindo o n�mero de filhos do habitante e armazenamento na var�vel filhos.
			System.out.print("Qual o n�mero de filhos?");
			filhos = entradapesquisa.nextInt();
			//C�lculo para o total de filhos.
			totalfilhos = totalfilhos + filhos ;
			
			//Cada vez que o c�digo for executado , adicionar� 1 ao total de habitantes.
			habitantes = habitantes + 1 ;
			
			//Print perguntando se o usu�rio deseja executar o aplicativo de novo.
			System.out.print("Quer informar dados de mais um habitantes?");
			resposta = entradapesquisa.next().charAt(0);
		}
		// C�lculo da m�dia do sal�rio e exibi��o.
		mediasalario = ((double)totalsalarios/habitantes) ;
		System.out.printf("A m�dia do s�lario � R$%.2f por pessoa\n" , mediasalario);
		// C�lculo da m�dia do n�mero de filhos e exibi��o.
		mediafilhos = ((double)totalfilhos/habitantes) ;
		System.out.printf("A m�dia de filhos � %.1f por pessoa\n" , mediafilhos);
		
		entradapesquisa.close();
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		//Chamada da sub-rotina
		pesquisa();
		
		entrada.close();
		
		

	}

}
