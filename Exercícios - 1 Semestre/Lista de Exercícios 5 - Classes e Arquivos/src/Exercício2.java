import java.io.FileReader;
import java.util.Scanner;
import java.io.*;

public class Exercício2 {

	public static void main(String[] args) {
		String nome = new String();
		int conta = 0;
	try 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o nome do primeiro arquivo?");
		nome = entrada.next();
		FileReader lerArq = new FileReader(nome + ".txt");
		
		Scanner entradaFile = new Scanner(lerArq);
		
		//Enquanto tiver uma próxima linha
		while(entradaFile.hasNextLine())
		{
			entradaFile.nextLine();

			conta ++;
			

		}
		System.out.println("Esse arquivo tem um total de " + conta + " linhas");

		
		entradaFile.close();
		entrada.close();
		
		
	}
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());

	}
	
	
	
		
	}

}
