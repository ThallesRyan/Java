import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		MyIO.setCharset("UTF-8");
		
		String line ;
		String[] accommodations;
		int quantity = 0;
		try {
			//BufferedReader databaseCont = new BufferedReader(new FileReader("C:\\Users\\thall\\Documents\\Faculdade\\JAVA\\2 semestre\\Ex-Bolha\\dados_airbnb.txt"));
			//BufferedReader database = new BufferedReader(new FileReader("C:\\Users\\thall\\Documents\\Faculdade\\JAVA\\2 semestre\\Ex-Bolha\\dados_airbnb.txt"));
		
			BufferedReader databaseCont = new BufferedReader(new FileReader("/tmp//dados_airbnb.txt"));
			BufferedReader database = new BufferedReader(new FileReader("/tmp//dados_airbnb.txt"));
		
		
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
		
				int sortQuantity = entrada.nextInt();
				
				int NextId;
		
				int[] ids = new int[sortQuantity +1];
				
				for(int i = 0; i < sortQuantity; i++) {
					NextId = entrada.nextInt();
					
					ids[i] = NextId;		
				}
				int n = 0;
				
				Accommodation[] sortArray = new Accommodation[sortQuantity];
				
				
				for(int i = 0; i < arrayAccommodation.length; i++) {
					
					if(arrayAccommodation[i].getRoomId() == ids[n] && n < (sortQuantity)) {
						sortArray[n] = new Accommodation();
						sortArray[n] = arrayAccommodation[i];
						//System.out.println(sortArray[n].getRoomId());
						
						i = 0;
						n++;
					}
					
				}
			
				//for(int i = 0; i < sortArray.length; i++) {
					//System.out.println(" ");
				//System.out.println(sortArray[i].getRoomId());}
				
				
				//Selection

				sort(sortArray, sortQuantity);
				

				for(int i = 0; i < sortArray.length; i++ ) {
					System.out.println(sortArray[i].toString());
				}
				
				
				
				
				//System.out.println("Total de movimentacoes: " + mudancasTotal );
				//System.out.println("Total de comparacoes: " + comparacaoTotal);
				
				/*SAiDA
				for(int i = 0; i < sortArray.length; i++) {
					System.out.println(sortArray[i].toString());
				}*/
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}	
		entrada.close();
		

	
		
	}
	
	public static void sort(Accommodation[] sortArray, int n) throws IOException {
		int comparacaoTotal = 0 , mudancasTotal = 0;
		String strLocalTime1   = LocalDateTime.now().format(DateTimeFormatter.ofPattern("SSS"));

		for (int i = 0; i < (n - 1); i++) {
	        	int menor = i;
	         	for (int j = (i + 1); j < n; j++) {
	         			//Se a primeira String for maior em ordem alfabetica, resultado eh positivo
	         			
	            		if (sortArray[menor].getCountry().compareToIgnoreCase(sortArray[j].getCountry()) > 0) {
	               			menor = j;
	               			mudancasTotal++;
	               			comparacaoTotal++;
	               			
	            		}else if (sortArray[menor].getCountry().compareToIgnoreCase(sortArray[j].getCountry()) == 0) {
	            			comparacaoTotal++;
	            			if(sortArray[menor].getCity().compareTo(sortArray[j].getCity())> 0) {
	            				mudancasTotal++;
	            				menor = j;
	            				comparacaoTotal++;
	            			}else if(sortArray[menor].getCity().compareToIgnoreCase(sortArray[j].getCity()) == 0){
	            				comparacaoTotal++;
	            				if(sortArray[menor].getNeighbourhood().compareTo(sortArray[j].getNeighbourhood())> 0) {
	            					mudancasTotal++;
	            					menor = j;
	            					comparacaoTotal++;
	            				}else if(sortArray[menor].getNeighbourhood().compareToIgnoreCase(sortArray[j].getNeighbourhood()) == 0) {
	            					comparacaoTotal++;
	            					if(sortArray[menor].getRoomId() > sortArray[j].getRoomId()) {
	            						mudancasTotal++;
	            						menor = j;
	            						comparacaoTotal++;
	            					}else {comparacaoTotal++;}
	            				}else {comparacaoTotal++;}
	            				
	            			}else {comparacaoTotal++;}
	            			
	            			
	            		}else {comparacaoTotal++;}
	            		
	            		
	         	}
	      		Accommodation temp = sortArray[i];
	      		sortArray[i] = sortArray[menor];
	      		sortArray[menor] = temp;
	      	}
		String strLocalTime2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("SSS"));
		
		

		int intLocalTime1 = Integer.parseInt(strLocalTime1);
		int intLocalTime2 = Integer.parseInt(strLocalTime2);
		int totaltime = intLocalTime2 - intLocalTime1;
		
		
		File relatorio = new File("737156_Selecao.txt");
		BufferedWriter writeRelatorio = new BufferedWriter(new FileWriter(relatorio));
		writeRelatorio.write("Matricula:737156"+ "\t" + totaltime + " Milissegundos"+ "\t" + "Numero de comparacoes: "+comparacaoTotal + "\t" + "Numero de mudancas: " + mudancasTotal);
		writeRelatorio.close();
		
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
