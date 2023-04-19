package domain;

import java.util.Scanner;

public class AlgorithmTree {

	public static void main(String[] args) {
	/*Escreva um algoritmo em Java, que leia números inteiros via teclado,até que o número zero seja digitado. 
	  Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos*/
		
	Scanner read = new Scanner(System.in);
	
	int num, sumPositive  = 0 ;

	 do{
		 System.out.println("Informe um número:");
		 num = read.nextInt();
		 
		 if(num >= 0) {
			 sumPositive += num;
		 }
		 
	 }while (num != 0);
	 
	 System.out.println("A quantidade de número positivos informados é:" + sumPositive);
	}
}


