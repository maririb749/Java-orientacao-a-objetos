package application;

import java.util.Locale;
import java.util.Scanner;

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

		double xA, xB, xC, yA, yB, yC;

		System.out.println("Enter the measures of triangle X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();

		// calculo da area

		double p = (xA + xB + xC) / 2.0;
		double areax = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		p = (yA + yB + yC) / 2.0;
		double areay = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

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
