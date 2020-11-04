package application;

import java.util.Scanner;

import model.service.PrintServiceAula203;



public class ProgramAula203 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintServiceAula203<Integer> ps = new PrintServiceAula203<>();
		
		System.out.print("How many values?: ");
		Integer n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			ps.addValue(num);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		sc.close();

	}

}
