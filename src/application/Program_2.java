package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//leitura dos dados do produto
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		// impressão provisória
		
		System.out.println(product);
		
		
		
		sc.close();
	}

}
