package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	//Dichiarazione degli attributi della classe
	
	int prodCode;
	String prodName;
	String prodInfo;
	float prodPrice;
	int prodIva;
	
	//Metodo costruttore della classe
	
		public Prodotto(String prodName,String prodInfo,float prodPrice,int prodIva) {
			
			//Dichiarazione di una variabile locale per contenere un'istanza di Random
			Random r = new Random();
			
			//Assegnazione di un valore random compreso tra 0 e 999999 all'attributo prodCode relativo all'istanza che si sta creando
			this.prodCode= r.nextInt(1000000);
			
			//Assegnazione degli altri attributi del metodo
			this.prodName =prodName;
			this.prodInfo=prodInfo;
			this.prodPrice=prodPrice;
			this.prodIva=prodIva;
		}
		
	//Metodo per avare il prezzo base
		
		public float getBasePrice() {
			return prodPrice;
		}
		
	//Metodo per avere il prezzo + IVA
		
		public float getTaxedPrice( ) {
			
			return prodPrice += prodPrice * (prodIva/100);
		}
		
	
	

}
