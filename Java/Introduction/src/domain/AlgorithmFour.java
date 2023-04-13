package domain;

import java.util.Scanner;

public class AlgorithmFour {
	
	/*Leia quatro valores float (n1, n2, n3, n4). A seguir, calcule e mostre a diferença 
	 * do produto entre o n1 e n2 pelo produto entre o n3 e o n4. Veja os exemplos abaixo:
	 */

	public static void main(String[] args) {
		
	float n1, n2, n3,n4, difference;
	
	Scanner read = new Scanner(System.in);
	
	System.out.println("Por favor, informe o primeiro núimero: ");
	n1 = read.nextFloat();
	
	System.out.println("Por favor, informe o segundo número: " );
	n2 = read.nextFloat();
	
	System.out.println("Por favor, informe o terceiro número: ");
	n3 = read.nextFloat();
	
	System.out.println("Por favor, informe o terceiro número: ");
	n4 = read.nextFloat();
	
	
	difference = (n1 * n2) - (n3 * n4); 
	
	System.out.println("A diferença entre os produtos é: " + difference); 
	
	}

}
