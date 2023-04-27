package domain.model;

public abstract class Account {
	
	private int number, agency;
	private String holder;
	private float balance;
	private int type;
	
	public boolean withdraw(float value) {
		
		if (this.getBalance() < value) {
			System.out.println("\n Saldo insuficiente!");
			return false;
		}
		
		this.setBalance(this.getBalance() - value );
		return true;
		 
	}
	
	public void deposit (float value ) {
		this.setBalance(this.getBalance() + value);

	}
	
	public void view () {
		
		String type = "";
		
		switch (this.type){
		
		case 1: 
			
			type = "Conta corrente";
			break;
		case 2: 
			
			type = "Conta poupança";
			break;
		
		}
		
		System.out.println("Dados da conta:");
		System.out.println("*****************************");
		System.out.println("Numero da conta: " + this.number);
		System.out.println("Agência: " + this.agency);
		System.out.println("Tipo da conta: " + type);
		System.out.println("Titular: "+ this.holder);
		System.out.println("Saldo: " + this.balance);
		
	}
	
	
	public Account(int number, int agency, int tipe, String holder, float balance) {
		this.number = number;
		this.agency = agency;
		this.type = type;
		this.holder = holder;
		this.balance = balance;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public int getAgency() {
		return agency;
	}


	public void setAgency(int agency) {
		this.agency = agency;
	}


	public int getTipe() {
		return type;
	}


	public void setTipe(int tipe) {
		this.type = type;
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public float getBalance() {
		return balance;
	}


	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
}
