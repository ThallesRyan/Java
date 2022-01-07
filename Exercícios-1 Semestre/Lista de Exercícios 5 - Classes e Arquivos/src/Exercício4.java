import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class Exercício4 {

	public static void main(String[] args) {

		
	try 
	{
		String palavra = new String();
		String frase;
		int contaPalavra = 0 ;
		int contaLinhas = 0 ;
		String[] palavras;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Qual palavra gostaria de procurar no arquivo?");
		palavra = entrada.next().trim();
		FileReader leitorArq = new FileReader("arqEx4.txt");
		
		Scanner entradaFile = new Scanner(leitorArq);
		
		String[] LinhaTexto;
		
		
		while (entradaFile.hasNextLine()) 
		{
			//Toda linha será gravada em frase e depois gravada num array 
			frase = entradaFile.nextLine();
			
			palavras = frase.split(" ");
			
			//For vai passar por todos elementos do array e se achar a palavra , contará +1
			for(int i = 0 ; i < palavras.length; i++)
			{
				if (palavras[i].equals(palavra))
				{
					
					contaPalavra++;
				}
				
			}
			
			
			contaLinhas ++ ;
		}
		
		
		System.out.println("O total de vezes que essa palavra aparece no texto é " + contaPalavra);
		
		System.out.println("O total de linhas desse texto é " + contaLinhas);
		
		
		
		
		
		
		entrada.close();
	}
	
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}
		
		
		
	}

}
