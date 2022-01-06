import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Declaração da String
		String telefone = new String();
		
		//Entrada do telefone
		System.out.println("Digite o número de seu telefone");
		telefone = entrada.next();
		
		//Testa o tamanho da string sem o "-" e adiciona o 9 , se precisar
		if(telefone.length() == 8)
		{
			
			System.out.println("Número de telefone corrigido: "+"9" + telefone);
			
		}
		//Testa a string com o "-" e adiciona o 9 , se precisar
		else if (telefone.length() == 9 && telefone.contains("-"))
		{
			System.out.println("Número de telefone corrigido: "+"9" + telefone);
		}
		
		else
		{
			System.out.println("O número de telefone está correto : "+ telefone);
		}	
		
		
		
		
		entrada.close();
	}

}
