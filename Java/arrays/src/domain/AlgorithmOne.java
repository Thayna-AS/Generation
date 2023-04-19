package domain;

import java.util.Scanner;
public class AlgorithmOne {

	public static void main(String[] args) {
		/*
		 * Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
		 * construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário
		 * irá digitar um número e o programa deve exibir na tela a posição deste número
		 * no vetor. Caso o número não seja encontrado, a mensagem: “Não foi
		 * encontrado!” deve ser exibida na tela.
		 */

		Scanner read = new Scanner(System.in);

		int vector[] = new int[10];
		int line, lineUser;

		for (int i = 0; i < vector.length; i++) {
			System.out.println("Por favor, informe um valor:");
			vector[i] = read.nextInt();
		}
		
		System.out.println("informe o número que deseja saber a posição");
		lineUser = read.nextInt();
		
		int x = 0;
		for (int i = 0; i < vector.length; i++) {
			x++;
			if (vector[i] == lineUser) {
				System.out.println("A posiç: "+ i);
				break;
			}else if(x == vector.length) {
				System.out.println("Errou");
				
			}
		}
	}
}