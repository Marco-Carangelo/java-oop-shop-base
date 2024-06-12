package org.lessons.java.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Dichiariamo delle variabili che verranno usate per acquisire i dati dei prodotti da tastiera e per popolare gli attributi degli oggetti
		
		String userProdName;
		String userProdInfo;
		float userProdPrice;
		int userProdIva;
		
		//Acquisiamo i valori delle variabili
		
		System.out.println("Inserisci il nome del prodotto: ");
		userProdName= scanner.nextLine();
		System.out.println("Inserisci la descrizione del prodotto: ");
		userProdInfo= scanner.nextLine();
		System.out.println("Inserisci il prezzo del prodotto, non comprensivo di IVA: ");
		userProdPrice= scanner.nextFloat();
		System.out.println("Inserisci il valore dell'Iva da applicare sul prodotto: ");
		userProdIva= scanner.nextInt();
		
		//Creiamo un'istanza della classe prodotto
		
		Prodotto userProd = new Prodotto(userProdName,userProdInfo,userProdPrice,userProdIva);
				
		
				
				
		scanner.close();
	}

}
