import java.util.Scanner;

public class Exerc�cio11 {

	public static void main(String[] args) {
		// declara��o das vari�veis. Gravei valores nelas para n�o dar erro no programa pois ele utulizaria o lixo
	int voto = 1 , candA = 0 , candB = 0 , candC = 0 , candD = 0, nulo = 0 , branco = 0  , total = 0;
		
	Scanner entrada = new Scanner(System.in);
	
	//Print mostrando as op��es dispon�veis e perguntando qual candidato o usu�rio deseja votar
	System.out.println("Candidato A - N�mero 1\nCandidato B - N�mero 2\nCandidato C - N�mero 3\nCandidato D - N�mero 4\n\nVoto Nulo - N�mero 5\nVoto em Branco - N�mero 6\nN�mero 0 - Finalizar vota��o\n\n");
	
	System.out.println("Em qual candidato deseja votar?");
	
	
	while (voto > 0)// A vota��o acabar� quando escolherem a op��o zero.
	{
		voto = entrada.nextInt();
		switch (voto) 
		{//cada vez que votarem em uma op��o, ser� adicionado 1 na vari�vel da op��o escolhida
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
		
		//Print mostrando os totais de voto en cada op��o
		System.out.println("O total de votos para o candidato A �:" + candA);
		System.out.println("O total de votos para o candidato B �:" + candB);
		System.out.println("O total de votos para o candidato C �:" + candC);
		System.out.println("O total de votos para o candidato D �:" + candD);
		System.out.println("O total de votos nulos �: " + nulo);
		System.out.println("O total de votos brancos �:" + branco);
		
		
	}	
	
	
	
	
	
	
	
	entrada.close();
	}

}
