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
				
		//Richiamiamo il metodo per stampare il prezzo base del prodotto
		System.out.printf("Il prezzo di base del prodotto è: %.2f \n" , userProd.getBasePrice());
		
		//Richiamiamo il metodo per stampare il prezzo + IVA del prodotto
		System.out.printf("Il prezzo sommato all'IVA del prodotto è: %.2f \n", userProd.getTaxedPrice());
		
		//Richiamiamo il metodo per stampare il nome completo del prodotto
		System.out.println("L'identificativo completo del prodotto è: " + userProd.getFullProdName());
				
		scanner.close();
	}

}
