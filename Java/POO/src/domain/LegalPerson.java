package domain;

public class LegalPerson extends client{

	public LegalPerson(String name, String profession, double wage) {
		super(name, profession, wage);
	}
	
	 String cnpj, company;

	 
	public void see() {
		
		System.out.println("Dados cliente Pj:");
		System.out.println("CNPJ: " + getCnpj() + "\nEmpresa: " + getCompany());
	}
	
	 
	public LegalPerson(String name, String profession, double wage, String cnpj, String company) {
		super(name, profession, wage);
		this.cnpj = cnpj;
		this.company = company;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	 
	
	
}
