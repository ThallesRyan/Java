import java.util.Scanner;

public class Exerc�cio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Declara��o das Strings
		String texto = new String();
		String invString;
		String[] textoJunto;
		
		//Entrada da string
		System.out.println("Digite um texto sem acentos e pontua��es: ");
		texto = entrada.nextLine();		
		
		//Para colocar a string em mai�sculo
		texto = texto.toUpperCase();
		
		//Separa as palavras da string pelos espa�os e armazena cada palavra numa posi��o do vetor
		textoJunto = texto.split(" ");
		
		//Junta todas as palavras do vetor , n�o deixando espa�o vazio entre elas
		String fraseJunta = String.join("", textoJunto);
		
		
		//Inverte as string
		StringBuilder inv = new StringBuilder(fraseJunta).reverse();
		
		//Converte uma Stringbuilder para uma string
		invString = inv.toString();
		
		//Exibi�ao da string invertidade e sem espa�os
		System.out.println(invString);
		
		//Testa se a string ao contr�rio � igual a string normal
		if(fraseJunta.equals(invString))
		{
			
			System.out.println(texto + " � pal�ndromo");
		}
		
		else
		{System.out.println(texto + " n�o � pal�ndromo");}
		
		entrada.close();

	}

}
