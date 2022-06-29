package application;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que leia um n�mero inteiro positivo N (m�ximo = 10) e depois
		 * N n�meros inteiros e armazene-os em um vetor. Em seguida, mostrar na tela
		 * todos os n�meros negativos lidos.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.println("Quantos n�meros voc� vai digitar? ");
		n = sc.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um n�mero: ");
			vetor[i] = sc.nextInt();
		}

		System.out.println("NUMEROS NEGATIVOS: ");

		for (int i = 0; i < n; i++) {
			if (vetor[i] < 0) {
				System.out.printf("%d\n", vetor[i]);
			}
		}

		sc.close();
	}

}
