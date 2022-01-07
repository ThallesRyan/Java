import java.util.Scanner;

/*10. Fa�a uma fun��o que recebe a idade de um nadador por par�metro e retorna a categoria 
desse nadador de acordo com a tabela abaixo.
Idade (anos) Categoria
5 a 7 F
8 a 10 E
11 a 13 D
14 a 15 C
16 a 17 B
Acima de 18 A
 Fa�a um programa que l� a idade de um nadador e imprime a categoria retornada pela 
 fun��o*/
public class Exerc�cio10 {
	
	
	public static char categoria (int idade)
	{  //An�lise da idade e retorno da categoria correspondente .
		if (idade > 4 && idade <8)
		{
			
			return('F');
			
		}	
			
		else if(idade > 7 && idade < 11)
		{
			return('E');
			
		}	
		
		else if(idade > 10 && idade < 14)
		{
			return('D');
			
		}	
		
		
		else if(idade > 13 && idade < 16)
		{
			return('C');
			
		}	
		

		else if(idade > 15 && idade < 18)
		{
			return('B');
			
		}	
		
		else if(idade >= 18)
		{
			return('A');
			
		}	
		//Se digitar um n�mero negativo , a fun��o retornar� o 0.
		else {return('N');}
	}
	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);	
	
	//Declara��o das vari�veis
	int idade ;
	char categoria ;
	char resposta = 'S';
	//While usado para repetir o programa se o usu�rio quiser
	while (resposta == 'S' || resposta == 's')
	{	
    //Print pedindo a idade
	System.out.print("Qual � a idade do nadador?");
	idade = entrada.nextInt();
	
	//Chamada do m�dulo
	categoria = categoria(idade);
	
	if (categoria == 'N')
	{
		
		System.out.println("N�o pertence a nenhuma categoria");
		
		System.out.print("Quer repetir o programa?(S ou N)");
		resposta = entrada.next().charAt(0);
		System.out.println("");
	}
	
	else {
	//Exibi��o da categoria retornada pelo m�dulo.
	System.out.println("A categoria deste nadador � " + categoria);
	
	
	System.out.print("Quer repetir o programa?(S ou N)");
	resposta = entrada.next().charAt(0);
	System.out.println("");
	}
	
	}
	
	entrada.close();
	}
	
	
	
	
	

}
