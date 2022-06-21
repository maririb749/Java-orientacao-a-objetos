package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		/*
		 * Fazer um progrmama para ler as medidas dos lados de dois tri�ngulos X e Y
		 * (suponha medidas v�lidas) Em seguida, mostrar o valor das �reas dos dois
		 * tri�ngulos e dizer quel dos dois tri�ngulos possui a maior �rea. A f�rmula
		 * para calcular a �rea de um tri�ngulo a partir das medidas de seus lados a,b,c
		 * � a f�rmula de Heron:
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	    Triangle x,y;
	    x = new Triangle();
	    y = new Triangle();

		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c= sc.nextDouble();

		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c= sc.nextDouble();

		// calculo da area

		double p = (x.a + x.b + x.c) / 2.0;
		double areax = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

		p = (y.a + y.b + y.c) / 2.0;
		double areay = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

		System.out.printf("Triangle  x area: %.4f%n", areax);
		System.out.printf("Triangle  y area: %.4f%n", areay);

		// Saber qual das �reas � a maior

		if (areax > areay) {
			System.out.println("Larger area: x");
		} else {
			System.out.println("Larger area: y");

		}

		sc.close();

	}

}
