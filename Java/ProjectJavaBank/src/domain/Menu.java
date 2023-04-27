package domain;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int op; 
		
		while(true){
			
			System.out.println("***********************************");
			System.out.println("                                   ");
			System.out.println("           Conta Bancária          ");
			System.out.println("***********************************");
			System.out.println("                                   ");
			System.out.println(" 1- Criar nova conta.              ");
			System.out.println(" 2- Listar todas as Contas.        ");
			System.out.println(" 3- Buscar conta por numero.       ");
			System.out.println(" 4- Atualizar dados da conta.      ");
			System.out.println(" 5- Apagar conta.                  ");
			System.out.println(" 6- sacar.                         ");
			System.out.println(" 7- Depositar.                     ");
			System.out.println(" 8- Transferir valores entre contas");
			System.out.println(" 9- Sair                           ");
			System.out.println("***********************************");
			
			op = read.nextInt();
			
			if (op == 9) {
				System.out.println("\n O seu futuro começa aqui!");
				read.close();
				System.exit(0);
			}
			
			switch (op) {
					
					case 1:
						System.out.println("Criar conta\n\n");
						
						break;
					
					case 2: 
						
						System.out.println("Listar todas as contas\n\n");
						
						break;
						
					case 3: 
						
						System.out.println("Consultar dados da conta - por número\n\n");
						
						break;
						
					case 4: 
						
						System.out.println("Atualizar dados da conta\n\n");
						
						break;
						
					case 5:
						
						System.out.println("Apagar a conta\n\n");
						
					case 6:
					
						System.out.println("Saque\n\n");
					
						break;
						
					case 7:
						
						System.out.println("Depósito\n\n");

						break;
						
					case 8:
						
						System.out.println("Transferência entre Contas\n\n");

						break;
						
					default:
						
						System.out.println("\nOpção Inválida!\n");
						
						break;
			}
		}
	}

}
