import java.util.Scanner;

public class Exercício11 {

	public static void main(String[] args) {
		// declaração das variáveis. Gravei valores nelas para não dar erro no programa pois ele utulizaria o lixo
	int voto = 1 , candA = 0 , candB = 0 , candC = 0 , candD = 0, nulo = 0 , branco = 0  , total = 0;
		
	Scanner entrada = new Scanner(System.in);
	
	//Print mostrando as opções disponíveis e perguntando qual candidato o usuário deseja votar
	System.out.println("Candidato A - Número 1\nCandidato B - Número 2\nCandidato C - Número 3\nCandidato D - Número 4\n\nVoto Nulo - Número 5\nVoto em Branco - Número 6\nNúmero 0 - Finalizar votação\n\n");
	
	System.out.println("Em qual candidato deseja votar?");
	
	
	while (voto > 0)// A votação acabará quando escolherem a opção zero.
	{
		voto = entrada.nextInt();
		switch (voto) 
		{//cada vez que votarem em uma opção, será adicionado 1 na variável da opção escolhida
		case 1: candA ++ ;
		break;
		case 2: candB++ ;
		break;
		case 3: candC++;
		break;
		case 4: candD++;
		break;
		case 5: nulo++ ;
		break;
		case 6: branco++;
		break;
		
		}
		
		
		
		total = total +1;
		
		//Print mostrando os totais de voto en cada opção
		System.out.println("O total de votos para o candidato A é:" + candA);
		System.out.println("O total de votos para o candidato B é:" + candB);
		System.out.println("O total de votos para o candidato C é:" + candC);
		System.out.println("O total de votos para o candidato D é:" + candD);
		System.out.println("O total de votos nulos é: " + nulo);
		System.out.println("O total de votos brancos é:" + branco);
		
		
	}	
	
	
	
	
	
	
	
	entrada.close();
	}

}
