package entities;

public class Hotel {
	
	//variaveis
	private String nome, email;
	private int numQuarto;

	//construtor
	public Hotel(String nome, String email, int quarto) {
		super();
		this.nome = nome;
		this.email = email;
		this.numQuarto = quarto;
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

	
	public int getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}

	@Override
	public String toString() {
		return "Cadastro: nome " + nome + ", email: " + email + "Quarto Nr: " + numQuarto;
	}
	
	
}
