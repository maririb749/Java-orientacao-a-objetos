package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program_4 {

	/*
	 * Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e
	 * imposto). Em seguida, mostrar os dados do funcion�rio (nome e sal�rio
	 * l�quido). Em seguida, aumentar o sal�rio do funcion�rio com base em uma
	 * porcentagem dada (somente o sal�rio bruto � afetado pela porcentagem) e
	 * mostrar novamente os dados do funcion�rio.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();

		System.out.print("Nome: ");
		emp.name = sc.nextLine();
		System.out.print("Salario bruto: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Imposto: ");
		emp.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Funcion�rio: " + emp);
		System.out.println();
		System.out.print("Qual a percentagem para aumentar o sal�rio? ");
		double percentagem = sc.nextDouble();
		emp.increaseSalary(percentagem);

		System.out.println();
		System.out.println("Dados atualizados" + emp);

		sc.close();
	}

}
