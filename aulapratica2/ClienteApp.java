package aulapratica2;

public class ClienteApp {
	public static void main(String[] args) {
		ClientePF clientepf1 = new ClientePF("xyz", "bairro ai", "4554");
		ClientePJ clientepj1 = new ClientePJ("zyx", "bairro aqui", "5445");
		
		System.out.println("Dados cliente pf: " + clientepf1.getNome() + " " + clientepf1.endereco());
		
		System.out.println(clientepf1.toString());
		System.out.println(clientepj1.toString());
	}
}
