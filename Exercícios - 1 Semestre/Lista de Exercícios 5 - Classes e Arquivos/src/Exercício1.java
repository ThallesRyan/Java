import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
String nome1 = new String();
String nome2 = new String();
String conteudo1 = new String();
String conteudo2 = new String();


try {
	//Print pedindo o nome do arquivo , que será guardado na string e procurado pelo FileReader
	System.out.println("Qual o nome do primeiro arquivo?");
	nome1 = entrada.next();
	FileReader arq1 = new FileReader(nome1 + ".txt");
	
	System.out.println("Qual o nome do segundo arquivo?");
	nome2 = entrada.next();
	FileReader arq2 = new FileReader(nome2 + ".txt");


	//Pegando o conteúdo do arquivo e colocando na variável do tipo string e após , comparando as strings do arquivo 1 e arquivo 2
	Scanner entradaFile1 = new Scanner(arq1);
	while (entradaFile1.hasNextLine()) {
		System.out.println(entradaFile1.nextLine());
		conteudo1 += entradaFile1;
		
	}
	
		Scanner entradaFile2 = new Scanner(arq2);
		while (entradaFile2.hasNextLine()) {
			System.out.println(entradaFile2.nextLine());
			conteudo2 += entradaFile2;
		

		}
		
		
		//Teste dos conteúdos
		if(conteudo1.equals(conteudo2))
		{
			System.out.println("Os conteúdos são iguais");
			
		}
		else {System.out.println("Os conteúdos são diferentes");}
			
		entradaFile2.close();
		entradaFile1.close();
		entrada.close();
	}
catch(Exception ex)
{
	
	System.out.println(ex.getMessage());

}








	}

}
