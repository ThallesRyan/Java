import java.util.Scanner;

public class Exerc�cio7 {

	public static void preenc(int X[] , int Y[])
	{
		Scanner entradapreenc = new Scanner (System.in);
		//Preenchimento dos vetores X e Y 
		for(int i = 0 ; i < X.length; i++)
		{
			System.out.println("Digite um valor: ");
			X[i] = entradapreenc.nextInt();
			
			//Os elementos do vetor Y s�o iguais aos elementos do vetor X soma a 1.
			Y[i] = X[i] + 1 ;
		}
				
	}
	
	public static void PreencNovoVetor(int X[] , int Y[])
	{	//Declara��o do vetor e das vari�veis
		int novoVetor[] = new int [20] ;
		int posX = 0 , posY = 0;
		
		//Preenchimento do Novo vetor
		//O novo vetor ter� os valores do vetor X nas posi��es �mpares
		for (int imp = 1 ; imp < novoVetor.length ; imp +=2)
		{
			
			novoVetor[imp] = X[posX];
					posX ++ ;
		}
		//O novo vetor ter� os valores do vetor Y nas posi��es pares
		for (int par = 0 ; par < novoVetor.length ; par +=2)
		{
			
			novoVetor[par] = Y[posY];
					posY ++ ;
		}
		
		//Chamada do m�dulo , levando o vetor novoVetor preenchido
		exibicao(novoVetor);
	}
	
	public static void exibicao(int novoVetor[])
	{
		//Exibi��o dos valores contidos no vetor
		for (int i = 0 ; i < novoVetor.length ; i++)
		{
			System.out.printf("Novo Vetor[%d] : %d \n" , i , novoVetor[i] );	
		}	
	}
	public static void main(String[] args) {
		
		//Declara��o dos vetores
		int X[] = new int[10] , Y[] = new int[10];
		//Chamada do m�dulo levando os vetores X e Y como par�metros
		preenc(X , Y);
		//Chamadad do m�dulo, levando os vetores X e Y preenchidos como par�metros
		PreencNovoVetor(X , Y);
		
	}

}
