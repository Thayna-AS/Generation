package domain;

import java.util.Scanner;

public class AlgorithmTree {

	public static void main(String[] args) {
		
		/*Elabore um algoritmo em Java, que leia o Salário Bruto, o Adicional Noturno,
		 *as Horas Extras e os Descontos de um Colaborador, em variáveis do tipo float 
		 *e exiba na tela o Salário Líquido. Veja o exemplo abaixo 
		 */

		
		float grossSalary, additionalNight, extraHours, discounts, netValue; 
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Por favor, insira o valor so salário bruto:");
		grossSalary = read.nextFloat();
		
		System.out.println("Por favor, insira do adicional noturno:");
		additionalNight = read.nextFloat();
		
		System.out.println("Por favor, insira o valor total de horas extras:");
		extraHours = read.nextFloat();
		
		System.out.println("Por favor insira o valor de desconto:");
		discounts = read.nextFloat();
		
		netValue = grossSalary + additionalNight + extraHours * 5 - discounts; 
		
		
		System.out.println("O valor do salário liquido é: "+ netValue);
	}

}
