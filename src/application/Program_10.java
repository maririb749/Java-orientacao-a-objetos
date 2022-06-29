package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product1;

public class Program_10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * Fazer um programa para ler um numero inteiro N e os dados(nome e preço) de N
		 * produtos. Armazene os N produtos em um vetor. Em seguida, mostrar p preço
		 * médio dos produtos.
		 */

        int n = sc.nextInt();
		Product1[] vect = new Product1[n];

		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product1(name, price);

		}

		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();

		}

		double avg = sum / vect.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);

		sc.close();

	}

}
