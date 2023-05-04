package domain.controller;

import java.util.ArrayList;

import domain.model.Account;
import domain.repository.AccountRepository;

public class AccountController implements AccountRepository{

	
	private ArrayList<Account> listAccounts = new ArrayList<Account>();
	int number = 0;
	
	
	@Override
	public void searchName(int number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listAll() {
		for(var account : listAccounts) {
			account.view();
		}
	}

	@Override
	public void register(Account account) {
		listAccounts.add(account);
		System.out.println("\nA conta número: " + account.getNumber() + "foi criada com sucesso!");
		}

	@Override
	public void update(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(int number, float value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(int number, float value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer(int numberOrigin, int numberDestiny, float value) {
		// TODO Auto-generated method stub
		
	}
	
	public int createNumber() {
		return ++ number;
	}
	
}
