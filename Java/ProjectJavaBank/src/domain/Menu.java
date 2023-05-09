package domain;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import domain.util.Colors;
import domain.controller.AccountController;
import domain.model.Account;
import domain.model.CheckingAccount;
import domain.model.SavingsAccount;


public class Menu {

	public static void main(String[] args) {
		
		AccountController accounts = new AccountController();
		
		int number, agency,type,bDay;
		String holder;
		float balance, limit;
		
		System.out.println("\nCriar Contas\n");
		
		CheckingAccount ca2 = new CheckingAccount(accounts.createNumber(), 123, 1, "João da Silva", 1000f, 100.0f);
		accounts.register(ca2);
		
		CheckingAccount ca3 = new CheckingAccount(accounts.createNumber(), 124, 1, "Maria da Silva", 2000f, 100.0f);
		accounts.register(ca3);
		
		SavingsAccount sa2 = new SavingsAccount(accounts.createNumber(), 125, 2, "Mariana dos Santos", 4000f, 12);
		accounts.register(sa2);
		
		SavingsAccount sa3 = new SavingsAccount(accounts.createNumber(), 125, 2, "Juliana Ramos", 8000f, 15);
		accounts.register(sa3);
		
		accounts.listAll();
		
		
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
						System.out.println(Colors.TEXT_WHITE +"Criar conta\n\n");
						
						System.out.println(Colors.TEXT_WHITE+"Criar conta\n\n");
						System.out.println("Digite o número da Agência: ");
						agency = read.nextInt();
						System.out.println("Digite o nome do titular: ");
						read.skip("\\R?");
						holder = read.nextLine();
						
						do {
							System.out.println("Digite o tipo da conta (1-CC OU 2- CP): ");
							type = read.nextInt();
						}while(type < 1 && type > 2);
							
						System.out.println("Digite o saldo da Conta(R$): ");
						balance = read.nextFloat();

					switch (type) {
					 case 1 : { System.out.println("Digite o limite de Crédito (R$): ");
					 limit = read.nextFloat();
					 accounts.register(new CheckingAccount(accounts.createNumber(), agency, type, holder, balance,limit));
					 }
					 case 2 : 
						 System.out.println("Digite o dia do Aniversário da Conta: ");
							limit = read.nextFloat();
							accounts.register(new SavingsAccount(accounts.createNumber(), agency, type, holder, balance, bDay));
					
					}
						keyPress();
						break;
						
					case 3: 
						
						System.out.println(Colors.TEXT_WHITE_BOLD_BRIGHT +"Consultar dados da conta - por número\n\n");
						
						System.out.println("Digite o número da conta: ");
						number = read.nextInt();
						
						accounts.searchName(number);
						
						keyPress();
						break;
						
					case 4: 
						
						System.out.println(Colors.TEXT_WHITE_BOLD_BRIGHT +"Atualizar dados da conta\n\n");
						
						System.out.println("Digite o número da conta: ");
						number = read.nextInt();
						
						if(accounts.searchInCollection(number) != null) {
							
							System.out.println("Digite o número da agência: ");
							agency = read.nextInt();
							System.out.println("Digite o nome do Titular:");
							read.skip("\\R?");
							holder = read.nextLine();
							
							System.out.println("Digite o saldo da Conta (R$): ");
							balance = read.nextFloat();
							
							type = accounts.returnType(number);
							
							switch (type) {
							case 1 -> {
								System.out.println("Digiite o limite ded crédito (R$)");
								limit = read.nextFloat();
								accounts.update(new SavingsAccount(number, agency, type, holder, balance, limit));
							}
							case 2 -> {
								System.out.println("Digite o dia do aniversário da Conta: ");
								bDay = read.nextInt();
								accounts.update(new SavingsAccount(number, agency, type, holder, balance, bDay));
							}
							default -> {
								System.out.println("Tipo de conta inválido!");
							}
							}
				
						}else 
							System.out.println("\nConta não encontrada!");
						
						keyPress();
						break;
						
					case 5:
						
						System.out.println(Colors.TEXT_WHITE_BOLD_BRIGHT +"Apagar a conta\n\n");
						
						System.out.println("Digite o número da conta: ");
						number = read.nextInt();
						
						accounts.delete(number);
						
						keyPress();
						break;
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
