import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		String texto = new String();		
		
		System.out.println("Digite um texto: ");		
		texto = entrada.nextLine();		
		
		
		//For para percorrer a string
		for(int i = 0 ; i < texto.length(); i++)
		{
				
			//Vai substituir todo espa�o maior que um , por um espa�o somente
			texto = texto.replaceAll("  ", " ");
			
			
		}
		//Vai retirar os espa�os das bordas
		texto = texto.trim();
		
		//Exibi��o
		System.out.println(texto);
		entrada.close();
		
		
		
		
		
		
		entrada.close();

	}

}
