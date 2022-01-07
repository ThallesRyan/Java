import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class Exerc�cio3 {

	public static void main(String[] args) {
		
	
	try {
		//Declara��o do arquivo
		File arq = new File("arqEx3.txt");
		
		//FileReader para ler o arquivo que ser� copiado
		FileReader LerArquivo = new FileReader(arq);
		
		//FileWrite para fazer a c�pia do arquivo
		FileWriter copia = new FileWriter("arqEx3Copia.txt");
		
		//Scanner para a entrada dos dados do Arquivo
		Scanner entradaArq = new Scanner(LerArquivo);
		
		//Para gravar todas as linhas do arquivo na copia
		while (entradaArq.hasNextLine()) {
			copia.write(entradaArq.nextLine() + "\n");
		}
		
		
		
		
		copia.close();
	}	
	
	catch(Exception ex)
	{
		
		System.out.println(ex.getMessage());

	}
		
	}

}
