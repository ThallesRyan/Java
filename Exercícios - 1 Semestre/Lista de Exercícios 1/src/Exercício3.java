import java.util.Scanner;

public class Exerc�cio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int nasc , anoatual , idade ; // Declara��o das vari�veis com n�meros inteiros
		char aniver ; // Declara��o da vari�vel que armazenar� um caractere
		anoatual = 2021; // O ano atual que ser� usado para calcular a idade
	
		

		System.out.println("Qual seu ano de nascimento"); // print na tela pedindo o ano de nascimento 
		nasc = entrada.nextInt(); // entrada do ano de nascimento , que � gravado na vari�vel "nasc"
		idade = anoatual - nasc ; // C�lculo  da idade 
		System.out.println("Voc� j� fez anivers�rio? (S-sim N-n�o) "); // print na tela perguntando se a pessoa j� fez anivers�rio
		aniver = entrada.next().charAt(0); // A resposta ser� gravada na vari�vel "aniver".
		
		switch (aniver) // Switch usado para analisar a resposta e caso alguma abaixo, executar� o c�digo respectivo
		{
			case 's': System.out.print("Voc� tem " + idade + " anos. ");// Caso s , mostrar� o print na tela
			break;
			case 'S': System.out.print("Voc� tem " + idade + " anos. "); // Caso o usu�rio colocar o s em mai�sculo
			break;
			case 'n': idade = idade - 1; // Caso o usu�rio selecionar que n�o fez anivers�rio , fazer o c�lculo idade - 1 e exibir o print
			System.out.print("Voc� tem " + idade + " anos. " ); 
			break;
			case 'N': idade = idade - 1;
			System.out.print("Voc� tem " + idade + " anos. " ); // caso o usu�rio colocar n mai�sculo
			break;
			// Se o usu�rio n�o digitar nenhuma das op��es indicadas , o default ser� executado
			default: System.out.print("Voc� tem ou completar� " + idade + " anos este ano ...Escolha S ou N para indicar a idade exata ." ); 
			break;
		}
		
		// ap�s saber a idade exata do usu�rio, testar com if se ele pode ou n�o tirar carteira de habilita��o	
		if (idade >= 18)// caso ele tenha 18 ou mais anos de idade,  ele poder� tirar carteira
		{ System.out.println("\nVoc� j� tem idade para conseguir carta de habilita��o. "); 
		}		
		else // caso contr�rio, n�o poder� tirar carteira
		{
			System.out.println("\nVoc� n�o tem idade para conseguir carta de habilita��o.");
		}
		entrada.close();
		
	}

}
