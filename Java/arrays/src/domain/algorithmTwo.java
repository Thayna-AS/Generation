package domain;

import java.util.Scanner;

public class algorithmTwo {

	public static void main(String[] args) {
	/*Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, 
	 * mostre na tela:
	 *Todos os elementos da Diagonal Principal
	 *Todos os elementos da Diagonal Secundária
	 *A Soma de todos os elementos da Diagonal Principal
	 *A Soma de todos os elementos da Diagonal Secundária*/
		
	Scanner read = new Scanner(System.in);
	
	int vector [][] = new int [3][3];
	int sumDOne = 0, sumDTwo = 0;
	String valueDOne="", valueDTwo="" ;
	
	for(int line = 0; line <3; line++ ) {
		for( int column = 0; column <3; column++) {
			System.out.printf("informe um número na posição [%d][%d]:", line, column);
			vector [line][column] = read.nextInt();
			
			if(line == column) {
				sumDOne += vector[line][column];
				valueDOne += vector[line][column]+ "";
			}
			if(line + column == 2) {
				sumDOne += vector[line][column];
				valueDTwo += vector[line][column]+ "";
			}
		}
	}
	System.out.println("Elementos da diagonal principal é: " + valueDOne);
	System.out.println("Elementos da diagonal secundária é: " + valueDTwo);
	System.out.println("Soma da diagonal principal é: " + sumDOne);
	System.out.println("Soma da diagonal secundária é: " + sumDTwo);
}					
}
