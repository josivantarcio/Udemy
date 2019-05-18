package entities;

public class Hotel {
	
	//variaveis
	private String nome, email;

	//construtor
	public Hotel(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	//metodos get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	@Override
	public String toString() {
		return "Hotel [nome " + nome + ", email: " + email + "]";
	}
	
	
}
