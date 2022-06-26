package application;

import java.util.Locale;
import java.util.Scanner;

import util.calculator;

public class Program_6 {

	/*
	 * Fazer um programa para ler um valor numérico qualquer, mostrar quanto seria o
	 * valor de uma circunferência e do volume de uma esfera para um raio daquele
	 * valor. Informar o valor de PI com duas casas decimais.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		double c = calculator.circumference(radius);

		double v = calculator.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calculator.PI);

		sc.close();

	}

}
