import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		String texto = new String();		
		
		System.out.println("Digite um texto: ");		
		texto = entrada.nextLine();		
		
		
		//For para percorrer a string
		for(int i = 0 ; i < texto.length(); i++)
		{
				
			//Vai substituir todo espaço maior que um , por um espaço somente
			texto = texto.replaceAll("  ", " ");
			
			
		}
		//Vai retirar os espaços das bordas
		texto = texto.trim();
		
		//Exibição
		System.out.println(texto);
		entrada.close();
		
		
		
		
		
		
		entrada.close();

	}

}
