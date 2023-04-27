package domain;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import domain.util.Colors;
import domain.model.Account;
import domain.model.CheckingAccount;
import domain.model.SavingsAccount;


public class Menu {

	public static void main(String[] args) {
		
		
		//teste da classe CheckingAccount.
		CheckingAccount ca1 = new CheckingAccount(2, 123, 1, "Mariana", 1000.0f);
		ca1.view();
		ca1.withdraw(12000.0f);
		ca1.view();
		ca1.deposit(5000.0f);
		ca1.view();
		
		//teste da classe SavingsAccount;
		SavingsAccount sa1 = new SavingsAccount(3, 123, 2, "Victor", 10000.0f);
		sa1.view();
		sa1.withdraw(1000.1f);
		sa1.view();
		sa1.deposit(5000.0f);
		sa1.view();
		
		
		Scanner read = new Scanner(System.in);
		
		int op; 
		
		while(true){
			
			
			System.out.println(Colors.TEXT_YELLOW + Colors.ANSI_BLACK_BACKGROUND +
							   "***********************************");
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
			System.out.println("***********************************" + Colors.TEXT_RESET);
			op = read.nextInt();
			
			try {
				op = read.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				read.nextLine();
				op = 0;
			}
			
			if (op == 9) {
				System.out.println("\n O seu futuro começa aqui!");
				read.close();
				System.exit(0);
			}
			
			switch (op) {
					
					case 1:
						System.out.println(Colors.TEXT_WHITE_BOLD_BRIGHT +"Criar conta\n\n");
						
						break;
					
					case 2: 
						
						System.out.println(Colors.TEXT_WHITE_BOLD_BRIGHT +"Listar todas as contas\n\n");
						
						break;
						
					case 3: 
						
						System.out.println(Colors.TEXT_WHITE_BOLD_BRIGHT +"Consultar dados da conta - por número\n\n");
						
						break;
						
					case 4: 
						
						System.out.println(Colors.TEXT_WHITE_BOLD_BRIGHT +"Atualizar dados da conta\n\n");
						
						break;
						
					case 5:
						
						System.out.println(Colors.TEXT_WHITE_BOLD_BRIGHT +"Apagar a conta\n\n");
						
					case 6:
					
						System.out.println(Colors.TEXT_WHITE_BOLD_BRIGHT +"Saque\n\n");
					
						break;
						
					case 7:
						
						System.out.println(Colors.TEXT_WHITE_BOLD_BRIGHT +"Depósito\n\n");

						break;
						
					case 8:
						
						System.out.println(Colors.TEXT_WHITE_BOLD_BRIGHT +"Transferência entre Contas\n\n");

						break;
						
					default:
						
						System.out.println(Colors.TEXT_RED_BOLD +"\nOpção Inválida!\n");
						
						break;
			}
		}
		
	}
		public static void keyPress() {
			try {
				System.out.println(Colors.TEXT_RESET + "\n\nPressione Enter para continuar..");
				System.in.read();
			}catch (IOException e) {
				System.out.println("Você pressionou uma tecla diferente de Enter!");
			}
		
	}

}
