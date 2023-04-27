package domain.repository;

import domain.model.Account;

public interface AccountRepository {
	
	//CRUD da conta.
	
	public void searchName(int number);
	public void listAll();
	public void register(Account account);
	public void update(Account account);
	public void delete(int number);
	
	//Métodos Bancários.
	
	public void withdraw(int number, float value);
	public void deposit(int number, float value);
	public void transfer(int numberOrigin, int numberDestiny, float value);
	
}
