package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class algorithmOne {

	public static void main(String[] args) {
		/*Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String. 
		 *O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las individualmente no ArrayList. 
		 *Em seguida, faça o que se pede:
		 *Mostre na tela todas as cores que foram adicionadas. 
		 *Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.*/

	Scanner read = new Scanner(System.in);
		
	ArrayList<String> colors = new ArrayList();
	
	int validator = 0;
	String register;
	
	while(validator < 5) {
		System.out.println("Por favor, informe a cor a ser adicionada: ");
		register = read.nextLine();
		colors.add(register);
		
		validator++;
	}
	System.out.println(colors);
	Collections.sort(colors);
	System.out.print("Lista ordenada:" + colors);
	}
	
}
