package domain;

import java.util.Scanner;

public class AlgorithmTwo {

	public static void main(String[] args) {
		/*Elabore um algoritmo em Java que leia 4 notas de um participante, 
		 * em variáveis do tipo float e exiba na tela a média final do participante.
		 */
		
		float gradeOne, gradeTwo, gradeTree, gradeFour, average;
		
		 Scanner read = new Scanner(System.in);
		 
		System.out.println("por favor, insira a primeira nota:");
		gradeOne = read.nextFloat();
		System.out.println("por favor, insira a segunda nota:");
		gradeTwo = read.nextFloat();
		System.out.println("por favor, insira a terceira nota:");
		gradeTree = read.nextFloat();
		System.out.println("por favor, insira a quarta nota:");
		gradeFour = read.nextFloat();
		
		average = (gradeOne + gradeTwo + gradeTree + gradeFour)/4; 
		
		System.out.println("A media das suas notas é:" + Math.round(average));
		
	
		
		
		
	}

}
