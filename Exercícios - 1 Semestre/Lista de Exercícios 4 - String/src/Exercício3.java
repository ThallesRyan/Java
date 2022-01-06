import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String data = new String();		
		String[] datasep ;
		
		System.out.println("Digite a sua data de nascimento (dd/mm/aaaa)");
		data = entrada.next();
		
		//var separar a string em toda / e gravar em uma posição do vetor
		datasep = data.split("/");
		
	//If para testar se o usuário digitou o número de dias corretamente , não pode passar de dois dígitos
	if(datasep[0].length() == 1 || datasep[0].length() == 2 )		
	{	
		//if e else if ´para identificar qual mês o usuário nasceu e imprimir por extenso
		if(datasep[1].equals("01") || datasep[1].equals("1") )
		{
			System.out.println("Você nasceu em " + datasep[0] + " de " + "Janeiro de " + datasep[2]);
			
		}
		
		else if(datasep[1].equals("02") || datasep[1].equals("2") )
		{
			System.out.println("Você nasceu em " + datasep[0] + " de " + "Fevereiro de " + datasep[2]);
			
		}
		else if(datasep[1].equals("03") || datasep[1].equals("3") )
		{
			System.out.println("Você nasceu em " + datasep[0] + " de " + "Março de " + datasep[2]);
			
		}
		else if(datasep[1].equals("04") || datasep[1].equals("4") )
		{
			System.out.println("Você nasceu em " + datasep[0] + " de " + "Abril de " + datasep[2]);
			
		}
		else if(datasep[1].equals("05") || datasep[1].equals("3") )
		{
			System.out.println("Você nasceu em " + datasep[0] + " de " + "Maio de " + datasep[2]);
			
		}
		else if(datasep[1].equals("06") || datasep[1].equals("6") )
		{
			System.out.println("Você nasceu em " + datasep[0] + " de " + "Junho de " + datasep[2]);
			
		}
		else if(datasep[1].equals("07") || datasep[1].equals("7") )
		{
			System.out.println("Você nasceu em " + datasep[0] + " de " + "Julho de " + datasep[2]);
			
		}
		else if(datasep[1].equals("08") || datasep[1].equals("8") )
		{
			System.out.println("Você nasceu em " + datasep[0] + " de " + "Agosto de " + datasep[2]);
			
		}
		else if(datasep[1].equals("09") || datasep[1].equals("9") )
		{
			System.out.println("Você nasceu em " + datasep[0] + " de " + "Setembro de " + datasep[2]);
			
		}
		else if(datasep[1].equals("10"))
		{
			System.out.println("Você nasceu em " + datasep[0] + " de " + "Outubro de " + datasep[2]);
			
		}
		else if(datasep[1].equals("11"))
		{
			System.out.println("Você nasceu em " + datasep[0] + " de " + "Novembro de " + datasep[2]);
			
		}
		else if(datasep[1].equals("12"))
		{
			System.out.println("Você nasceu em " + datasep[0] + " de " + "Dezembro de " + datasep[2]);
			
		}
		
		else
			System.out.println("Digite um mês existente");
	}
		else
			System.out.println("Digite uma data existente");
			
		entrada.close();
	}

}
