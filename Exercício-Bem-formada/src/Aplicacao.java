import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);
	
		 PilhaCaractere minhaPilha = new PilhaCaractere();
		 String dados = null;
		 boolean result;
		 
		 dados = entrada.nextLine();
		 while(!dados.equals("FIM")) {
			
			 result = teste(dados, minhaPilha);
			 if(result == true) {
				 System.out.println("Correto");
			 }else {
				 System.out.println("Incorreto");
			 }
			 dados = entrada.nextLine();
		 
		 }
		
		entrada.close();
	}
	public static boolean teste(String frase,PilhaCaractere pilha) {
		char vetor[] = frase.toCharArray();
		
		for(int i = 0; i < vetor.length; i++) {
		Caractere caractere = new Caractere(vetor[i]);
		
		if(caractere.getLetra() == '(') {
			pilha.empilhar(caractere);
		}
		else if(caractere.getLetra() == '[') {
			pilha.empilhar(caractere);
		}
		else if(caractere.getLetra() == ')' && !pilha.pilhaVazia()) {
			if(pilha.desempilhar().getLetra() == '('  ) {
				
			}else {return false;}
		}
		else if(caractere.getLetra() == ']' ) {
			if(pilha.desempilhar().getLetra() == '[') {
				
			}else {return false;}	
		}
		
		else if(pilha.pilhaVazia() && caractere.getLetra() == ')' || caractere.getLetra() == ']') {
			return false;
		}
		}
		
		
		return true;
		
	}
}

