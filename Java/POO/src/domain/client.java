package domain;

import java.util.Scanner;

public class client {
	/* Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos, 
	 * crie a Classe Cliente com os seus respectivos Métodos e Atributos. Na sequência, 
	 * crie uma Classe chamada TestaCliente, instancie dois objetos da Classe Cliente e 
	 * apresente as informações destes 2 Objetos no console.*/
	
	Scanner read = new Scanner(System.in);
	
	String name, profession;
	double wage; 
	
	public void see() {
		
		System.out.println("Dados do cliente:");
		System.out.println("Nome : " + getName()+ "\nProfissão: " + getProfession() + "\nSalário: " + getWage());
	}


	public Scanner getRead() {
		return read;
	}

	public void setRead(Scanner read) {
		this.read = read;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}


	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public client(String name, String profession, double wage) {
		super();
		this.name = name;
		this.profession = profession;
		this.wage = wage;
	}

	
	
}
