package domain;


public class testClient {
	
	public static void main(String[] args) {
		
		client clientOne = new client ("Thayna", "Desenvolvedora Java junior", 3200.00);
		PhysicalPerson physicalOne = new PhysicalPerson("Marina", "Analista de dados Junior", 1200.0, "55544488822");
		
		clientOne.see();
		physicalOne.see();
		
			
	}
}
