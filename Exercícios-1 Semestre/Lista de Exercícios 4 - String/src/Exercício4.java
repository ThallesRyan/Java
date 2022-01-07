import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Declaração das Strings
		String texto = new String();
		String invString;
		String[] textoJunto;
		
		//Entrada da string
		System.out.println("Digite um texto sem acentos e pontuações: ");
		texto = entrada.nextLine();		
		
		//Para colocar a string em maiúsculo
		texto = texto.toUpperCase();
		
		//Separa as palavras da string pelos espaços e armazena cada palavra numa posição do vetor
		textoJunto = texto.split(" ");
		
		//Junta todas as palavras do vetor , não deixando espaço vazio entre elas
		String fraseJunta = String.join("", textoJunto);
		
		
		//Inverte as string
		StringBuilder inv = new StringBuilder(fraseJunta).reverse();
		
		//Converte uma Stringbuilder para uma string
		invString = inv.toString();
		
		//Exibiçao da string invertidade e sem espaços
		System.out.println(invString);
		
		//Testa se a string ao contrário é igual a string normal
		if(fraseJunta.equals(invString))
		{
			
			System.out.println(texto + " é palíndromo");
		}
		
		else
		{System.out.println(texto + " não é palíndromo");}
		
		entrada.close();

	}

}
