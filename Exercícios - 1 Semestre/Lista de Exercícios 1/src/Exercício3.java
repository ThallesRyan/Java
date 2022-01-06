import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int nasc , anoatual , idade ; // Declaração das variáveis com números inteiros
		char aniver ; // Declaração da variável que armazenará um caractere
		anoatual = 2021; // O ano atual que será usado para calcular a idade
	
		

		System.out.println("Qual seu ano de nascimento"); // print na tela pedindo o ano de nascimento 
		nasc = entrada.nextInt(); // entrada do ano de nascimento , que é gravado na variável "nasc"
		idade = anoatual - nasc ; // Cálculo  da idade 
		System.out.println("Você já fez aniversário? (S-sim N-não) "); // print na tela perguntando se a pessoa já fez aniversário
		aniver = entrada.next().charAt(0); // A resposta será gravada na variável "aniver".
		
		switch (aniver) // Switch usado para analisar a resposta e caso alguma abaixo, executará o código respectivo
		{
			case 's': System.out.print("Você tem " + idade + " anos. ");// Caso s , mostrará o print na tela
			break;
			case 'S': System.out.print("Você tem " + idade + " anos. "); // Caso o usuário colocar o s em maiúsculo
			break;
			case 'n': idade = idade - 1; // Caso o usuário selecionar que não fez aniversário , fazer o cálculo idade - 1 e exibir o print
			System.out.print("Você tem " + idade + " anos. " ); 
			break;
			case 'N': idade = idade - 1;
			System.out.print("Você tem " + idade + " anos. " ); // caso o usuário colocar n maiúsculo
			break;
			// Se o usuário não digitar nenhuma das opções indicadas , o default será executado
			default: System.out.print("Você tem ou completará " + idade + " anos este ano ...Escolha S ou N para indicar a idade exata ." ); 
			break;
		}
		
		// após saber a idade exata do usuário, testar com if se ele pode ou não tirar carteira de habilitação	
		if (idade >= 18)// caso ele tenha 18 ou mais anos de idade,  ele poderá tirar carteira
		{ System.out.println("\nVocê já tem idade para conseguir carta de habilitação. "); 
		}		
		else // caso contrário, não poderá tirar carteira
		{
			System.out.println("\nVocê não tem idade para conseguir carta de habilitação.");
		}
		entrada.close();
		
	}

}
