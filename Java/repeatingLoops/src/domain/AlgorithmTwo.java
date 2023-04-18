package domain;

import java.util.Scanner;

public class AlgorithmTwo {

	public static void main(String[] args) {

		/*
		 * Escreva um algoritmo em Java, que leia a idade de várias pessoas (números
		 * inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja
		 * menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A
		 * leitura dos dados deve ser finalizada ao digitar uma idade negativa
		 */

		Scanner read = new Scanner(System.in);

		int validator = 1, age = 0, minor = 0, older = 0, i;



		while (validator == 1) {
			System.out.println("Por favor, informe sua idade:");
			age = read.nextInt();
			if (age < 0) {
				validator = 0;
			} else if (age < 21) {
				minor++;
			} else if (age > 50) {
				older++;
			}
		}
		System.out.println("A quantidade de pessoas com menos que 21 anos é:" + minor);
		System.out.println("A quantide de pessoas com mais que 50 anos de idade é:" + older);
	}

}