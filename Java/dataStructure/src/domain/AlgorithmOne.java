package domain;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class AlgorithmOne {

	public static void main(String[] args) {
	
/*
 * Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String, 
 * para organizar a retirada de livros em uma pilha. O programa deverá ter um Menu que aceitará 
 * as opções 0, 1, 2 e 3:
	1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
	2: Listar todos os livros da Pilha
	3: Retirar um livro da pilha 
	0: O programa deve ser finalizado. 
	Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, 
	ele deverá informar que a pilha está vazia.*/

	Stack<String> library = new Stack<String>();
	Scanner read = new Scanner(System.in);
	int i ;

	do{
		
		System.out.println("Bem vindo ao Library");
		System.out.println("\nPor favor, escolha uma das opções abaixo:");
		System.out.println("1 - Adicionar novo livro. ");
		System.out.println("2 - Visualizar todos os livros disponíveis. ");
		System.out.println("3 - Retirar um livro da lista. ");
		System.out.println("0 - Encerrar o menu.");
		i = read.nextInt();
		
		
	switch (i){
		case 1: 
			
			read.nextLine();
			System.out.println("Por favor, informe o nome do livro à ser adicionado: ");
			String sumBook = read.nextLine();
			library.add(sumBook);
			break;
			
		case 2:
			
			read.nextLine();
			System.out.println("O acervo de Library completo até o momento é: " + library);
			break;
			
		case 3: 
			
			read.nextLine();
			System.out.println("Qual titulo gostaria de remover da lista?");
			String excludeBook = read.nextLine();
			
		if (library.contains(excludeBook)){
			library.remove(excludeBook);
			System.out.println("Livro removido com sucesso!");
		}else {
			System.out.println("Esse titulo não foi encontrado em nosso acervo, por favor tente outro titulo!");
		}
		default: 
			System.out.println("O programa foi encerrado, obrigado pela interação com nossa plataforma!");
	}
  }
	while (i != 0);
 }
}