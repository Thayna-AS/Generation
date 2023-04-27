package domain;

import java.util.Scanner;

public class client {
	/* Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos, 
	 * crie a Classe Cliente com os seus respectivos Métodos e Atributos. Na sequência, 
	 * crie uma Classe chamada TestaCliente, instancie dois objetos da Classe Cliente e 
	 * apresente as informações destes 2 Objetos no console.*/
	
	Scanner read = new Scanner(System.in);
	
	String name, profession, cpf;
	double wage; 
	
	public void see () {
		
		System.out.println("Dados do cliente:");
		System.out.println("Nome : " + getName()+ "\nProfissão: " + getProfession() + "\nCPF: " + getCpf() + "\nSalário: " + getWage());
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public client(String name, String profession, String cpf, double wage) {
		super();
		this.name = name;
		this.profession = profession;
		this.cpf = cpf;
		this.wage = wage;
	}

	
	
}
