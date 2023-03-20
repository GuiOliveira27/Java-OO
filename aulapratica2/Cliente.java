package aulapratica2;

public class Cliente {
	private String nome;
	private String endereco;
	
	public  Cliente(String nome, String endereco) {
		this.nome=nome;
		this.endereco=endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String endereco() {
		return endereco;
	}
	
	public void setNome(String nome){
		this.nome=nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco=endereco;
	}
	
	public String toString() {
		return "nome: " + nome + "endereco " + endereco;
	}
}
