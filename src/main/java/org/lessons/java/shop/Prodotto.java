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
		this.prodCode= (int) (r.nextDouble() * (999999 - 100000 + 1) + 100000);
			
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
		
		//Restituiamo il risultato della somma tra il prezzo del prodotto e la percentuale d'IVA
		
		return prodPrice + (prodPrice*((float)prodIva/100));
	}
	
		
	//Metodo per ottenere il nome esteso formato da "codicenumerico-nome"
		
	public String getFullProdName() {
			
		//Dichiariamo una variabile locale che conterrà il nome completo del prodotto
		String fullName = String.format("%d-%s",prodCode,prodName);
		
		return fullName;
	}
	
	

}
