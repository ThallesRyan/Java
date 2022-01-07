import java.util.Scanner;

/*10. Faça uma função que recebe a idade de um nadador por parâmetro e retorna a categoria 
desse nadador de acordo com a tabela abaixo.
Idade (anos) Categoria
5 a 7 F
8 a 10 E
11 a 13 D
14 a 15 C
16 a 17 B
Acima de 18 A
 Faça um programa que lê a idade de um nadador e imprime a categoria retornada pela 
 função*/
public class Exercício10 {
	
	
	public static char categoria (int idade)
	{  //Análise da idade e retorno da categoria correspondente .
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
		//Se digitar um número negativo , a função retornará o 0.
		else {return('N');}
	}
	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);	
	
	//Declaração das variáveis
	int idade ;
	char categoria ;
	char resposta = 'S';
	//While usado para repetir o programa se o usuário quiser
	while (resposta == 'S' || resposta == 's')
	{	
    //Print pedindo a idade
	System.out.print("Qual é a idade do nadador?");
	idade = entrada.nextInt();
	
	//Chamada do módulo
	categoria = categoria(idade);
	
	if (categoria == 'N')
	{
		
		System.out.println("Não pertence a nenhuma categoria");
		
		System.out.print("Quer repetir o programa?(S ou N)");
		resposta = entrada.next().charAt(0);
		System.out.println("");
	}
	
	else {
	//Exibição da categoria retornada pelo módulo.
	System.out.println("A categoria deste nadador é " + categoria);
	
	
	System.out.print("Quer repetir o programa?(S ou N)");
	resposta = entrada.next().charAt(0);
	System.out.println("");
	}
	
	}
	
	entrada.close();
	}
	
	
	
	
	

}
