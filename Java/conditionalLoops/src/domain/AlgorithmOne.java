package domain;

import java.util.Scanner;

public class AlgorithmOne {

	public static void main(String[] args) {
		/*Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e 
		 * imprima na tela se a soma de A + B é maior, menor ou igual a C.
		 */
	int a, b, c;	
	
	Scanner read = new Scanner(System.in);
	
	System.out.println("\nPor favor informe o valor de a:");
	a = read.nextInt();
	System.out.println("\nPor favor informe o valor de b:");
	b = read.nextInt();
	System.out.println("\nPor favor informe o valor de c:");
	c = read.nextInt();
	
	if(a + b > c){
		System.out.println("A soma dos valores é maior que C!" ) ;
	}
	else if (a + b < c){
		System.out.println("A soma dos valores é menor que C!");
		}
	else if(a + b == c) {
		System.out.println("Os valores são iguais a C!");
	}
	
	}

}
