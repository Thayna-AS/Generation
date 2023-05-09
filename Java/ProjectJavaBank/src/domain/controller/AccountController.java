package domain.controller;

import java.util.ArrayList;

import domain.model.Account;
import domain.repository.AccountRepository;

public class AccountController implements AccountRepository{

	
	private ArrayList<Account> listAccounts = new ArrayList<Account>();
	int number = 0;
	
	
	@Override
	public void searchName(int number) {
		var account = searchInCollection(number);
		
		if (account != null)
			account.view();
		else 
			
			System.out.println("\nA conta número: " + number +" não foi encontrada");
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
	public void delete(int number) {
		var account = searchInCollection(number);
		
		if (account != null) {
			if(listAccounts.remove(account) == true)
				System.out.println("\nA conta número: " + number + "foi deletada com sucesso!");
		}else 
			System.out.println("\nA conta número:"+ number +"não foi encontrada!");
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
	
	public Account searchInCollection(int number) {
		for (var account : listAccounts ) {
			if (account.getNumber() == number) {
				return account;
			}
		}
		return null;
	}
	
	@Override
	public void update(Account account) {
		var searchAccount = searchInCollection(account.getNumber());
		
		if(searchAccount != null) {
			listAccounts.set(listAccounts.indexOf(searchAccount),account);
			
			System.out.println("\nA conta numero: " + account.getNumber()+ "foi atualizada com sucesso!");
		}else 
			System.out.println("\nA conta numero: " + account.getNumber()+ "não foi encontrada!");
		
	}
	
	public int returnType(int number) {
		for (var account : listAccounts) {
			if (account.getNumber()== number) {
				return account.getTipe();
			} 
		}
		return 0;
	}
}
