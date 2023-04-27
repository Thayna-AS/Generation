package domain.model;

public class SavingsAccount extends Account {

	private int bday;
	public SavingsAccount(int number, int agency, int type, String holder, float balance) {
		super(number, agency, type, holder, balance);
		this.bday = bday;
		
	}
	public int getBday() {
		return bday;
	}
	public void setBday(int bday) {
		this.bday = bday;
	}
	
	@Override
		public void view() {
		super.view();
		System.out.println("Aniversário da conta: " + this.bday);
	}
}
