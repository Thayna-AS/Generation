package domain;

public class PhysicalPerson extends client{
	
	public PhysicalPerson(String name, String profession, double wage) {
		super(name, profession, wage);
	
	}
	
	String cpf;
	
	public void see() {
			System.out.println(getCpf());
		
	}

	public PhysicalPerson(String name, String profession, double wage, String cpf) {
		super(name, profession, wage);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
