import java.util.Scanner;

public class Exercício6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		//Declaração das Strings
		String palavra = new String();
		char[] palavraArray;
		String vazio = "";
		
		//Entrada da string digitada pelo usuário
		System.out.println("Digite uma palavra: ");
		palavra = entrada.next();
		
		//Passa a palavra digitada para um vetor de Caracteres
		palavraArray = palavra.toCharArray();		
		
		//For passando pelas posições do Array
		for(int i = 0 ; i <palavraArray.length; i++)
		{
			//Imprime a primeira posição do Array
			if(i == 0)
			{
			System.out.println(palavraArray[i]);
			}
			//Imprime as posições seguintes do array , colocando espaço no começo. O espaço é aumentado a cada repetição
			if(i > 0)
			{
				System.out.println(vazio + palavraArray[i]);
			}
			
			vazio = vazio + " ";
		}
		
		entrada.close();
		
	}

}
