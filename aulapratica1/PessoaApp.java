package aulapratica1;

public class PessoaApp {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(1, "Guiga");
		Pessoa pessoa2 = new Pessoa(2, "Nina");
		System.out.println("O nome do objeto pessoa1 �: " + pessoa1.getNome());
		System.out.println("O nome do objeto pessoa2 �: " + pessoa2.getNome());
	}
	
}
