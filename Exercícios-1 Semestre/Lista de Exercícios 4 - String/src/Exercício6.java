import java.util.Scanner;

public class Exerc�cio6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		//Declara��o das Strings
		String palavra = new String();
		char[] palavraArray;
		String vazio = "";
		
		//Entrada da string digitada pelo usu�rio
		System.out.println("Digite uma palavra: ");
		palavra = entrada.next();
		
		//Passa a palavra digitada para um vetor de Caracteres
		palavraArray = palavra.toCharArray();		
		
		//For passando pelas posi��es do Array
		for(int i = 0 ; i <palavraArray.length; i++)
		{
			//Imprime a primeira posi��o do Array
			if(i == 0)
			{
			System.out.println(palavraArray[i]);
			}
			//Imprime as posi��es seguintes do array , colocando espa�o no come�o. O espa�o � aumentado a cada repeti��o
			if(i > 0)
			{
				System.out.println(vazio + palavraArray[i]);
			}
			
			vazio = vazio + " ";
		}
		
		entrada.close();
		
	}

}
