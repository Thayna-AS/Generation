package domain;

import java.util.Scanner;

public class AlgorithmOne {
	
	public static void main (String[]args ) {
		
	/*Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela quantos números são pares e 
	 *quantos número são ímpares. Veja o exemplo abaixo:*/
		
	Scanner read = new Scanner(System.in);
	
	int num = 0, sumPair = 0, sumOdd = 0, i;
	
	
	for (i = 0; i < 10; i++) {
		System.out.println("Por favor, informe um valor:");
		num = read.nextInt();
		if(num % 2 == 0) {
				sumPair++;
		} else {
				sumOdd ++; 
		}
		
	}
	System.out.println("Quantidade de números pares informados é:" + sumPair);
	System.out.println("Quantidade de números impares informados é:" + sumOdd);
}
	
}
