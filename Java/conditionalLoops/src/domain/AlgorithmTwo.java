package domain;

import java.util.Scanner;

public class AlgorithmTwo {

	public static void main(String[] args) {
		/*Escreva um algoritmo em Java, que leia um número inteiro via teclado 
		 *e mostre na tela uma mensagem indicando se este número é par ou ímpar 
		 *e se o número é positivo ou negativo.*/

	int num,validates; 
	
	Scanner read = new Scanner(System.in);
	System.out.println("Por favor, insira um valor:");
	num = read.nextInt();
	validates = (num % 2);
	
	if(validates == 0 & num < 0){
		System.out.println("O número" + num + "é par e negativo!!");
	}
	else {
		System.out.println("O número " + num + " é par e positvo!!");
		}
	}

}
