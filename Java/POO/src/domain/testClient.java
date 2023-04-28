package domain;


public class testClient {
	
	public static void main(String[] args) {
		
		client clientOne = new client ("Thayna", "Desenvolvedora Java junior", 3200.00);
		PhysicalPerson physicalOne = new PhysicalPerson("Marina", "Analista de dados Junior", 1200.0, "555.444.888-22");
		LegalPerson legalOne = new LegalPerson("Martin", "CEO", 500000.0, "00.777 789/0001-22", "Beauty class");
		
		clientOne.see();
		physicalOne.see();
		legalOne.see();
			
	}
}
