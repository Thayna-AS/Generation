package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class algorithmTwo {

	public static void main(String[] args) {
		/*Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer, 
		 * inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário, que ele digite 
		 * via teclado 1 número inteiro e caso ele seja encontrado no Set, exiba na tela a mensagem: Número 00 
		 * Encontrado! Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: 
		 * O número NN não foi encontrado!*/
		
		Scanner read = new Scanner(System.in);
		
		Set<Integer> numberHunt= new HashSet<Integer>();
		
		numberHunt.add(2);
		numberHunt.add(5);
		numberHunt.add(1);
		numberHunt.add(3);
		numberHunt.add(4);
		numberHunt.add(9);
		numberHunt.add(7);
		numberHunt.add(8);
		numberHunt.add(10);
		numberHunt.add(6);
		
		System.out.println("Informe o número a ser pesquisado: ");
		int i = read.nextInt();
		
		boolean validator; 
		validator = numberHunt.contains(i);
		
		if(validator == true) {
			System.out.println("O número "+i+" foi localizado!");
		}else{
			System.out.println("O número "+i+" não foi localizado!");
		}
		
		
		
		
	}

}
