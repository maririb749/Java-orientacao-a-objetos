package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		/*
		 * Fazer um progrmama para ler as medidas dos lados de dois triângulos X e Y
		 * (suponha medidas válidas) Em seguida, mostrar o valor das áreas dos dois
		 * triângulos e dizer quel dos dois triângulos possui a maior área. A fórmula
		 * para calcular a área de um triângulo a partir das medidas de seus lados a,b,c
		 * é a fórmula de Heron:
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

		
		double areax = x.area();
		double areay = y.area();

		System.out.printf("Triangle  x area: %.4f%n", areax);
		System.out.printf("Triangle  y area: %.4f%n", areay);

		// Saber qual das áreas é a maior

		if (areax > areay) {
			System.out.println("Larger area: x");
		} else {
			System.out.println("Larger area: y");

		}

		sc.close();

	}

}
