import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String siglas = "";
		String nome = new String() ;
		
		String[] nomesep ;
		
		System.out.println("Digite seu nome:");
		nome = entrada.nextLine().toUpperCase();
		
		
		nomesep = nome.split(" ");
		
		
		//For para passar pelos elementos do vetor de string
		for(int i = 0 ; i < nomesep.length; i++)
		{
			//Todo primeiro caracter do vetor será concatenado a string siglas , se for diferente dos elementos "E" , "DO" , "DA" , "DOS" , "DAS" , "DE" , "DI" e "DU"
			if(!nomesep[i].equals("E") && !nomesep[i].equals("DO") && !nomesep[i].equals("DA") 
				&& !nomesep[i].equals("DOS") && !nomesep[i].equals("DAS") && !nomesep[i].equals("DE") && 
				!nomesep[i].equals("DI") && !nomesep[i].equals("DU")  )
				
				
				siglas += nomesep[i].charAt(0);
			
			
			
		}
		
		//Exibição
		System.out.println(siglas);
		
		
		entrada.close();
	}

}
