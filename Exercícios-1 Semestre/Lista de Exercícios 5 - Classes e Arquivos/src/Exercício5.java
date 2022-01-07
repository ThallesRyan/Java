import java.io.*;
import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Array de objetos da classe
		pessoa[] Pessoas = new pessoa[]{new pessoa(),new pessoa(),new pessoa()};
		String nomeArquivo;
		String codigo , nome  ,endereco ,  complemento = new String();
		int idade ,numero ;
try {
	
		//Entrada do arquivo , se ele n existir , será criado
		System.out.print("Qual o nome do arquivo que serão escritos os dados?");
		nomeArquivo = entrada.next();
		FileWriter Escritor = new FileWriter(nomeArquivo + ".txt");

		System.out.println();
		//for para passar por todos os objetos e definir os atributos do objeto
		for(int i = 0; i < Pessoas.length ; i++)
		{
			System.out.printf("Pessoa[%d]\n\n" , (i + 1));
			System.out.print("Qual o código?");
			Pessoas[i].setCodigo(entrada.next());
			System.out.print("Qual o nome da pessoa?(Primeiro Nome)");
			Pessoas[i].setNome(entrada.next().trim());
			System.out.print("Qual a idade da pessoa?");			
			Pessoas[i].setIdade(entrada.nextInt());
			System.out.print("Qual o endereço da pessoa?(EscreverJunto)");			
			Pessoas[i].setEndereco(entrada.next().trim());
			System.out.print("Qual o número da casa dessa pessoa?");			
			Pessoas[i].setNumero(entrada.nextInt());
			System.out.print("Qual o complemento da casa dessa pessoa?");			
			Pessoas[i].setComplemento(entrada.next().trim());
			System.out.println();
		}
		//for para passar por todos os objetos e imprimir no arquivo
		for(int i = 0; i < Pessoas.length; i++)
		{
			
			Escritor.write("Pessoa " + (i + 1) + "\n");
			codigo = Pessoas[i].getCodigo();
			Escritor.write(codigo + "\n");
			nome = Pessoas[i].getNome();
			Escritor.write(nome + "\n");
			idade = Pessoas[i].getIdade() ;
			Escritor.write(idade + "\n" );
			endereco = Pessoas[i].getEndereco();
			Escritor.write(endereco + "\n");
			numero = Pessoas[i].getNumero();
			Escritor.write(numero + "\n");
			complemento = Pessoas[i].getComplemento();
			Escritor.write(complemento + "\n");
			
			

		}
		Escritor.close();
		entrada.close();
	}
catch(Exception ex)
{
	System.out.println(ex.getMessage());
}
	}

}

class pessoa
{
	private String codigo;
	private String nome;
	private int idade;
	private String endereco;
	private int numero ;
	private String complemento;
	
public pessoa()
{
		codigo = "xxx";
		nome = "xxx";
		idade = 0;
		numero = -1;
		complemento = "xxx";
}
		

public void inicializar(String codigo , String nome , int idade , String endereco , int numero , String complemento)
{
	setCodigo(codigo);
	setNome(nome);
	setIdade(idade);
	setEndereco(endereco);
	setNumero(numero);
	setComplemento(complemento);

}

//Gets e sets
public void setCodigo(String codigo)
{
	if (codigo != null)
		{this.codigo = codigo ;}
	else {System.out.println("Erro - código inválido");}
}
public String getCodigo()
{
	return codigo;
}


public void setNome(String nome)
{
	if (nome != null)
	{
	this.nome = nome;
	}
	else {System.out.println("Erro - nome do aluno Inválido");}
}
public String getNome()
{
	return nome;
}

public void setIdade(int idade)
{
	if(idade > 0)
	{	
		this.idade = idade;
	}
	else {System.out.println("Erro - idade inválida");}
}
public int getIdade()
{
	return idade;
}

public void setEndereco(String endereco)
{
	if(endereco != null)
	{
	this.endereco = endereco;
	}
	else {System.out.println("Erro - Endereço inválido");}
}
public String getEndereco()
{
return endereco;
}

public void setNumero(int numero)
{
	this.numero = numero ;
}
public int getNumero()
{
	return numero;
}

public void setComplemento(String complemento)
{
	if(complemento != null)
	{	
		this.complemento = complemento;
	}
	else {System.out.println("Erro - complemento inválido");}
}
public String getComplemento()
{
	return complemento;
}




}



