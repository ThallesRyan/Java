import java.util.Scanner;

public class Exerc�cio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Declara��o da String
		String telefone = new String();
		
		//Entrada do telefone
		System.out.println("Digite o n�mero de seu telefone");
		telefone = entrada.next();
		
		//Testa o tamanho da string sem o "-" e adiciona o 9 , se precisar
		if(telefone.length() == 8)
		{
			
			System.out.println("N�mero de telefone corrigido: "+"9" + telefone);
			
		}
		//Testa a string com o "-" e adiciona o 9 , se precisar
		else if (telefone.length() == 9 && telefone.contains("-"))
		{
			System.out.println("N�mero de telefone corrigido: "+"9" + telefone);
		}
		
		else
		{
			System.out.println("O n�mero de telefone est� correto : "+ telefone);
		}	
		
		
		
		
		entrada.close();
	}

}
