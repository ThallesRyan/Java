import java.util.Scanner;

public class Recursividade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor, resp;
		
		System.out.println("Digite o número para fatorial:");
		valor = entrada.nextInt();
		resp = recursividade(valor);
		
		System.out.println(resp);
		entrada.close();
		
	}
	/* exemplo como valor = 3
	 * 
	 return 3 * recursividade(3 - 1);
	 return 2 * recussividade(2 - 1);
	 if(valor == 1)return valor;
	 
	 //Vai retornando os valores de baixo para cima, da última chamada, para as anteriores
	 quando o valor foi igual a 1, retornou 1
	  
	 if(valor == 1)return valor;// retornou 1
	 return 2 * 1// a variável valor * o resultado de valor - 1(valor = 1)
	 return 3 * 2 // a variável valor * o resultado de valor - 1(valor = 2), como essa foi a primeira chamada, retorna o valor final
	 
	 a primeira chamada agora retorna o valor final
	 
	 
	 
	 */
	private static int recursividade(int valor) {
		 if(valor == 1)return valor;		
		 else
		 return valor * recursividade(valor - 1); 
	}

}
