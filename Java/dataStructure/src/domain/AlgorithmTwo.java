package domain;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AlgorithmTwo {

	public static void main(String[] args) {
	/*Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String, 
	 * para organizar a ordem de chegada dos Clientes de um Banco. O programa deverá ter um Menu que aceitará 
	 * as opções 0, 1, 2 e 3:
	1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
	2: Listar todos os Clientes na fila
	3: Chamar (retirar) uma pessoa da fila 
	0: O programa deve ser finalizado. 
	Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila..*/

		
		Queue<String> Clients = new LinkedList<String>();
		Scanner read = new Scanner(System.in);
		int i; 
		
		do {
			System.out.println("Menu incial");
			System.out.println("Por favor, selecione a opção desejada:");
			System.out.println("1 - Adicionar novo cliente a lista.");
			System.out.println("2 - Visualizar cartela de clientes completa.");
			System.out.println("3 - Excluir cliente da lista.");
			System.out.println("0 - Encerrar.");
			i = read.nextInt();
			
			
		switch (i){
			
			case 1:
				
				read.nextLine();
				System.out.println("Por favor, informe o Nome do cliente à ser adicionado: ");
				String sumName = read.nextLine();
				Clients.add(sumName);
				break; 
				
			case 2: 
				
				read.nextLine();
				
				if(Clients == null) {
					System.out.println("A cartela de clientes está vazia, por favor, adicione um novo cliente primeiro!");
				} else {
					System.out.println("Cartela completa de clientes: " + Clients);
				}
				
			case 3: 
				
				read. nextLine();
				System.out.println("Por favor, informe o nome do Cliente para a exclusão.");
				String exclude = read.nextLine();
				
				if (Clients.contains(exclude)) {
					Clients.remove(Clients);
					System.out.println("Cliente excluido com sucesso!");	
				
				}else {
					System.out.println("Não foi possível encontrar esse cliente em nossa cartela, tente novamente!");
				}
				default: 
					System.out.println("O programa foi encerrado, obrigado pela interação com nossa plataforma!");
		} 
			
			
		}while( i != 0); 	
		
	}

}
