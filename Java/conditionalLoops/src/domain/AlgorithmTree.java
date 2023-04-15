package domain;

import java.util.Scanner;

public class AlgorithmTree {

	public static void main(String[] args) {
	/*Com base na tabela abaixo, escreva um algoritmo em Java que leia o código 
	 * de um item (número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro). 
	 * A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.*/
		
	int code,amount;
	float finalValue;
	
	Scanner read = new Scanner(System.in);
	
	System.out.println("\nMenu Burger Grill It");
	System.out.println("\n1 - Cachorro quente - R$ 10,00");
	System.out.println("\n2 - X-Salada - R$ 15,00");
	System.out.println("\n3 - X-Bacon R$ - 18,00");
	System.out.println("\n4 - Bauru - R$ 12,00");
	System.out.println("\n5 - Refrigerante - R$ 8,00");
	System.out.println("\n6 - Suco de Laranja - R$ 13,00");
	System.out.println("Por favor informe o código do produto:");
	code = read.nextInt();
	System.out.println("\n Informe a quantidade de produtos:");
	amount = read.nextInt();
	
	switch(code) {
	case 1:	
			finalValue = amount * 10; 
			System.out.println("\n seu pedido fica no valor total de: " + finalValue);
			break; 
	case 2:	
		finalValue = amount * 15; 
		System.out.println("\n seu pedido fica no valor total de: " + finalValue);
		break; 
	case 3:	
		finalValue = amount * 18; 
		System.out.println("\n seu pedido fica no valor total de: " + finalValue);
		break; 
	case 4:	
		finalValue = amount * 12; 
		System.out.println("\n seu pedido fica no valor total de: " + finalValue);
		break; 
	case 5:	
		finalValue = amount * 8; 
		System.out.println("\n seu pedido fica no valor total de: " + finalValue);
		break; 
	case 6:	
		finalValue = amount * 13; 
		System.out.println("\n seu pedido fica no valor total de: " + finalValue);
		break; 
		
	default: 
		System.out.println("código inválido!! volte para o menu inicial.");
		}
	
	}

}
