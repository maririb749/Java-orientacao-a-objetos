package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee1;

public class Program13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee1> list = new ArrayList<>();
		
		System.out.print("How many Employees will be registred? ");
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			
			System.out.println();
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while(hasId(list,id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
				
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			
			Employee1 emp = new Employee1(id, name,salary);
			
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt();
		
		Employee1 emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null); 
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter thr percentage:");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee1 e : list) {
			System.out.println(e);
			
		}
		sc.close();

	}
	
	public static Integer position(List<Employee1> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
		
	}
	public static boolean hasId(List<Employee1> list, int id) {
		Employee1 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
	    return emp!= null;
	
	}
	
}
