package domain;

import java.util.Scanner;

public class AlgorithmOne {
	
	
	
	public static void main(String[] args) {
		
	double wage, allowance, finalwage;
	
	Scanner read = new Scanner(System.in);
	
	System.out.println("por favor, informe o valor total do salário:");
	wage = read.nextDouble();
	System.out.println("por favor, informe o valor do abono:");
	allowance = read.nextDouble();
	
	finalwage = wage + allowance; 
	
	System.out.println("Seu salário final é: " + finalwage);
	
	
	}
	
}