import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class teste {

	
		public static void main(String[] args) throws Exception {
			Scanner entrada = new Scanner(System.in);
			MyIO.setCharset("UTF-8");
			
			String line ;
			String[] accommodations;
			int quantity = 0;
			try {
				BufferedReader databaseCont = new BufferedReader(new FileReader("C:\\Users\\thall\\Documents\\Faculdade\\JAVA\\2 semestre\\Ex-Bolha\\dados_airbnb.txt"));
				BufferedReader database = new BufferedReader(new FileReader("C:\\Users\\thall\\Documents\\Faculdade\\JAVA\\2 semestre\\Ex-Bolha\\dados_airbnb.txt"));
			
				//BufferedReader databaseCont = new BufferedReader(new FileReader("/tmp//dados_airbnb.txt"));
				//BufferedReader database = new BufferedReader(new FileReader("/tmp//dados_airbnb.txt"));
			
			
				databaseCont.readLine();
				line = databaseCont.readLine();
				while(line != null) {
					quantity ++;	
					line = databaseCont.readLine();		
				}
			
				//For para alocar os dados da linha nos objetos
				Accommodation[] arrayAccommodation = new Accommodation[quantity];
			
				database.readLine();
				line = database.readLine();
				while(line != null) {	
					for(int i = 0 ; i < arrayAccommodation.length; i++) {
						accommodations = line.split("\t");
						arrayAccommodation[i] = new Accommodation();
						arrayAccommodation[i].setRoomId(Integer.parseInt(accommodations[0]));
						arrayAccommodation[i].setHostId(Integer.parseInt(accommodations[1]));
						arrayAccommodation[i].setRoomType(accommodations[2]);
						arrayAccommodation[i].setCountry(accommodations[3]);
						arrayAccommodation[i].setCity(accommodations[4]);
						arrayAccommodation[i].setNeighbourhood(accommodations[5]);
						arrayAccommodation[i].setReviews(Integer.parseInt(accommodations[6]));
						arrayAccommodation[i].setOverallSatisfaction(Double.parseDouble(accommodations[7]));
						arrayAccommodation[i].setAccommodates(Integer.parseInt(accommodations[8]));
						arrayAccommodation[i].setBedrooms(Double.parseDouble(accommodations[9]));
						arrayAccommodation[i].setPrice(Double.parseDouble(accommodations[10]));
						arrayAccommodation[i].setPropertyType(accommodations[11]);

						line = database.readLine();		
						}	
					}	
			/*
				
				*/
					
					/* COMECO 
					int comparacaoTotal = 0;
					Accommodation aux = new Accommodation();
					
					
					String strLocalTime1   = LocalDateTime.now().format(DateTimeFormatter.ofPattern("SSS"));
					
					TabelaHash hash = new TabelaHash(7507);
					int tamVetor = arrayAccommodation.length;
					Inteiro novo;
					String nextLine = entrada.next();
					while(!nextLine.equals("FIM")) {
						for(int i = 0; i < tamVetor ; i++) {
							if(Integer.parseInt(nextLine) == arrayAccommodation[i].getHostId()) {
								novo = new Inteiro(arrayAccommodation[i].getHostId());
								hash.inserir(novo);
								tamVetor = i;
							}	
						}
						 nextLine = entrada.next();
					}
					
					nextLine = entrada.next();
					while(!nextLine.equals("FIM")){
						
					}
					
					System.out.println(hash.pesquisar(1));
					
					
					String strLocalTime2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("SSS"));
					
					int intLocalTime1 = Integer.parseInt(strLocalTime1);
					int intLocalTime2 = Integer.parseInt(strLocalTime2);
					
					int totaltime = intLocalTime2 - intLocalTime1;
					
					
					File relatorio = new File("737156_hashSeparado.txt");
					
					BufferedWriter writeRelatorio = new BufferedWriter(new FileWriter(relatorio));
					
					writeRelatorio.write("Matricula:737156"+ "\t" + totaltime + " Milissegundos"+ "\t" + "Numero de comparacoes: "+comparacaoTotal + "\t" + "Numero de mudancas: " + mudancasTotal);
					
					writeRelatorio.close();
					//System.out.println("Total de movimentacoes: " + mudancasTotal );
					//System.out.println("Total de comparacoes: " + comparacaoTotal);
					
					/*for(int i = 0; i < sortArray.length; i++) {
						System.out.println(sortArray[i].toString());
					}
					FINAL*/
				
				
				Accommodation aux = new Accommodation();
				int comparacaoTotal = 0;
				
				
				
				String strLocalTime1   = LocalDateTime.now().format(DateTimeFormatter.ofPattern("SSS"));
				
				TabelaHash meuHash = new TabelaHash(7507);
				Inteiro novo;
				
				String linha = entrada.next();
				while(!linha.equals("FIM")) {
					int tamVetor = arrayAccommodation.length;
					for(int i = 0; i < tamVetor;i++) {
					try {comparacaoTotal++;	
						if(Integer.parseInt(linha) == arrayAccommodation[i].getRoomId()) {
							novo = new Inteiro(arrayAccommodation[i].getHostId());
							meuHash.inserir(novo);
							tamVetor = i;
						}
						}catch(Exception e) {
							System.out.println(e.getMessage());
						}
						
					}
					
					linha = entrada.next();
					
				}	
				
				//meuHash.imprimir();
				
				 linha = entrada.next();
					while(!linha.equals("FIM")) {
						novo = new Inteiro(Integer.parseInt(linha));
						Inteiro pesq = meuHash.pesquisar(novo.getDado());
						comparacaoTotal++;
						if(pesq == null) {System.out.println("NAO");}
						else {
						System.out.println(pesq.getDado()% 7507 + " SIM");
						}
						linha = entrada.next();
					}
					
					String strLocalTime2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("SSS"));
					
					int intLocalTime1 = Integer.parseInt(strLocalTime1);
					int intLocalTime2 = Integer.parseInt(strLocalTime2);
					
					int totaltime = intLocalTime2 - intLocalTime1;
					
					
					File relatorio = new File("737156_hashSeparado.txt");
					
					BufferedWriter writeRelatorio = new BufferedWriter(new FileWriter(relatorio));
					
					writeRelatorio.write("Matricula:737156"+ "\t" + totaltime + " Milissegundos"+ "\t" + "Numero de comparacoes: "+comparacaoTotal);
					
					writeRelatorio.close();
				
				/*
				novo = new Inteiro(21);
				try {
					meuHash.inserir(novo);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				novo = new Inteiro(34);
				try {
					meuHash.inserir(novo);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				novo = new Inteiro(13);
				try {
					meuHash.inserir(novo);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

				novo = new Inteiro(16);
				try {
					meuHash.inserir(novo);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				novo = new Inteiro(30);
				try {
					meuHash.inserir(novo);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				*/
				
				
				
				
			/*	
				novo = meuHash.pesquisar(13);
				if (novo == null)
					System.out.println("Nenhum elemento com a chave 13 foi encontrado na tabela hash!");
				else
					System.out.println("Elemento de chave 13 encontrado na tabela hash!"); // Essa mensagem deve ser exibida
				
				novo = meuHash.pesquisar(0);
				if (novo == null)
					System.out.println("Nenhum elemento com a chave 0 foi encontrado na tabela hash!"); // Essa mensagem deve ser exibida
				else
					System.out.println("Elemento de chave 0 encontrado na tabela hash!");

				meuHash.imprimir();*/
				/* [0]: 18
				   [1]
				   [2]
				   [3]: 30 -> 21
				   [4]: 13
				   [5]
				   [6] 
				   [7]: 16 -> 34
				   [8]
				*/
				
				
				
				
				
				
				
				
				
				
			}catch(IOException ex) {
				System.out.println(ex.getMessage());
			}	
			entrada.close();
		}
		
	}

	 	class Accommodation {
	 		private String roomType, country, city, neighbourhood, propertyType;
	 		private int reviews, accommodates, roomId, hostId;
	 		private double overallSatisfaction, bedrooms, price;

	    public Accommodation() {
	    	roomId = 0;
	    }

	    public Accommodation(int roomId, int hostId, String roomType, String country, String city, String neighbourhood, int reviews, Double overallSatisfaction, int accommodates, int bedrooms, double price,String propertyType ) {
	     
	    	this.roomId = roomId;
	    	this.hostId = hostId;
	    	this.roomType = roomType;
	    	this.country = country;
	    	this.city = city;
	    	this.neighbourhood = neighbourhood;
	    	this.reviews = reviews;
	    	this.overallSatisfaction = overallSatisfaction;
	    	this.accommodates = accommodates;
	    	this.bedrooms = bedrooms;
	    	this.price = price;
	    	this.propertyType = propertyType;
	    }


	    public String getRoomType() {
	        return roomType;
	    }

	    public Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }

	    public void setRoomType(String roomType) {
	        this.roomType = roomType;
	    }

	    public String getCountry() {
	        return country;
	    }

	    public void setCountry(String country) {
	        this.country = country;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public String getNeighbourhood() {
	        return neighbourhood;
	    }

	    public void setNeighbourhood(String neighbourhood) {
	        this.neighbourhood = neighbourhood;
	    }

	    public String getPropertyType() {
	        return propertyType;
	    }

	    public void setPropertyType(String propertyType) {
	        this.propertyType = propertyType;
	    }

	    public int getReviews() {
	        return reviews;
	    }

	    public void setReviews(int reviews) {
	        this.reviews = reviews;
	    }

	    public int getAccommodates() {
	        return accommodates;
	    }

	    public void setAccommodates(int accommodates) {
	        this.accommodates = accommodates;
	    }

	    public int getRoomId() {
	        return roomId;
	    }

	    public void setRoomId(int roomId) {
	        this.roomId = roomId;
	    }

	    public int getHostId() {
	        return hostId;
	    }

	    public void setHostId(int hostId) {
	        this.hostId = hostId;
	    }

	    public double getOverallSatisfaction() {
	        return overallSatisfaction;
	    }

	    public void setOverallSatisfaction(double overallSatisfaction) {
	        this.overallSatisfaction = overallSatisfaction;
	    }

	    public double getBedrooms() {
	        return bedrooms;
	    }

	    public void setBedrooms(double bedrooms) {
	        this.bedrooms = bedrooms;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    @Override
	    public String toString() {
	        return "[" + roomId + " ## "
	                + hostId + " ## "
	                + roomType + " ## "
	                + country + " ## "
	                + city + " ## "
	                + neighbourhood + " ## "
	                + reviews + " ## "
	                + overallSatisfaction + " ## "
	                + accommodates + " ## "
	                + bedrooms + " ## "
	                + price + " ## "
	                + propertyType
	                + "]";
	    }
	}
	 	
	 	class Inteiro {
	 		
	 	    private int dado;
	 		    
	 	    public Inteiro(int valor) {
	 	        dado = valor;
	 	    }
	 		    
	 	    public int getDado() {
	 	        return dado;
	 	    }
	 	}
	 	
	 	class Celula {
	 		
	 	    Inteiro item;
	 	    Celula  proximo;
	 		    
	 	    public Celula(Inteiro elemento) {
	 		        
	 	        item = elemento;
	 	        proximo = null;
	 	    }
	 		    
	 	    public Celula() {
	 		        
	 	        item = new Inteiro(0);
	 	        proximo = null;
	 	    }
	 	}
	 	
	 	class ListaEncadeada {

	 		private Celula primeiro;
	 	    private Celula ultimo;
	 	    private int tamanho;
	 	    
	 	    public ListaEncadeada() {
	 	        
	 	        Celula sentinela = new Celula();
	 	        primeiro = ultimo = sentinela;
	 	        tamanho = 0;
	 	    }
	 	    
	 	    public void inserir(Inteiro elemento, int posicao) throws Exception{

	 	        Celula aux, anterior;
	 	        Celula nova;
	 	        int qtde;
	 	        
	 	        if (posicao <= tamanho) {
	 	            aux = primeiro.proximo;
	 	            anterior = primeiro;
	 	            
	 	            for (qtde = 0; qtde < posicao; qtde++) {
	 	                aux = aux.proximo;
	 	                anterior = anterior.proximo;
	 	            }
	 	            
	 	            nova = new Celula(elemento);
	 	            anterior.proximo = nova;
	 	            nova.proximo = aux;
	 	            
	 	            if (posicao == tamanho)
	 	            // if (anterior == ultimo)
	 	            // if (aux == NULL)
	 	                ultimo = ultimo.proximo;
	 	                // ultimo = nova;
	 	            
	 	            tamanho++;
	 	            
	 	        } else
	 	            throw new Exception("Erro ao tentar inserir na lista: posicao invalida!");
	 	    }
	 	    
	 	    public Inteiro pesquisar(int dado) {
	 	    
	 	    	Celula aux;
	 	    	
	 	    	aux = primeiro.proximo;
	 	    	
	 	    	while (aux != null) {
	 	    		if (aux.item.getDado() == dado) {
	 	    			return aux.item;
	 	    		}
	 	    		aux = aux.proximo;
	 	    	}
	 	    	return null;
	 	    }
	 	    
	 	    public Inteiro remover(int posicao) throws Exception {
	 	        
	 	        Celula aux, anterior;
	 	        int qtde;
	 	        Inteiro retirado = null;
	 	        
	 	        if (!listaVazia()) {
	 	            if (posicao < tamanho) {
	 	                        
	 	                aux = primeiro.proximo;
	 	                anterior = primeiro;
	 	                
	 	                for (qtde = 0; qtde < posicao; qtde++) {
	 	                    aux = aux.proximo;
	 	                    anterior = anterior.proximo;
	 	                }
	 	                
	 	                anterior.proximo = aux.proximo;
	 	                tamanho--;
	 	                
	 	                if (posicao == tamanho)
	 	                    ultimo = anterior;
	 	                
	 	                aux.proximo = null;
	 	                retirado = aux.item;
	 	                
	 	            } else
	 	                throw new Exception ("Erro ao tentar remover da lista: posicao invalida!");
	 	        } else {
	 	        
	 	            throw new Exception ("Erro ao tentar remover da lista: lista vazia!");
	 	        }
	 	        return retirado;
	 	    } 
	 	    
	 	    public boolean listaVazia() {
	 	        
	 	        boolean resp;
	 	        
	 	        if (primeiro == ultimo)
	 	            resp = true;
	 	        else
	 	            resp = false;
	 	        
	 	        return resp;
	 	    }
	 	    
	 	    public void imprimir() {
	 	        
	 	        Celula aux;
	 	        
	 	        aux = primeiro.proximo;
	 	        while (aux != null) {
	 	            System.out.println(aux.item.getDado());
	 	            aux = aux.proximo;
	 	        }
	 	    }
	 	}
	 	
	 	class TabelaHash {

	 		private int M;
	 		private ListaEncadeada[] tabelaHash;
	 		
	 		public TabelaHash(int tamanho) {
	 			
	 			M = tamanho;
	 			
	 			tabelaHash = new ListaEncadeada[M];
	 			
	 			for (int i = 0; i < M; i++)
	 				tabelaHash[i] = new ListaEncadeada();
	 		}
	 		
	 		private int funcaoHash(int chave) {
	 			
	 			return (chave % M);
	 		}
	 		
	 		public Inteiro pesquisar(int chave) {
	 			
	 			int posicao;
	 			Inteiro pesquisado;
	 			
	 			posicao = funcaoHash(chave);
	 			
	 			pesquisado = tabelaHash[posicao].pesquisar(chave);
	 			
	 			return pesquisado;
	 		}
	 		
	 		public void inserir(Inteiro novo) throws Exception{
	 			
	 			int posicao;
	 			
	 			posicao = funcaoHash(novo.getDado());
	 			if ((tabelaHash[posicao].pesquisar(novo.getDado())) == null)
	 				tabelaHash[posicao].inserir(novo, 0);
	 			else
	 				throw new Exception("Erro ao tentar inserir na tabela hash: elemento ja inserido!");
	 					
	 		}
	 		
	 		public void imprimir() {
	 			
	 			for (int i = 0; i < M; i++)
	 				if (!tabelaHash[i].listaVazia()) {
	 					System.out.println("Posicao [" + i + "]:");
	 					tabelaHash[i].imprimir();
	 				}
	 				else
	 					System.out.println("Nenhum elemento na posicao " + i + " da tabela hash.");
	 		}
	 	}
	 	