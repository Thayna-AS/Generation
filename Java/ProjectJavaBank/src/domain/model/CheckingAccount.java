package domain.model;

public class CheckingAccount extends Account {

	private float limit;
	
	public CheckingAccount(int number, int agency, int type, String holder, float balance) {
		super(number, agency, type, holder, balance);
		;
		
	}
	
	public boolean withdraw(float value) {
		
		if(this.getBalance() + this.getLimit() < value) {
			System.out.println("\n Saldo insuficiente!");
			return false;
		}
		
		this.setBalance(this.getBalance() - value);
		return true;
	}
	
	public void view() {
		
		super.view();
		System.out.println("Limite de crédito: " + this.limit);
	}

	public float getLimit() {
		return limit;
	}

	public void setLimit(float limit) {
		this.limit = limit;
	}

	
	
}
