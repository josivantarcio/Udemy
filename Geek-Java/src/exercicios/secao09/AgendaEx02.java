package exercicios.secao09;

public class AgendaEx02 {
	private int pessoas = 3;
	private String[] nome = new String[pessoas];
	private int[] idade = new int[pessoas];
	private float[] altura = new float[pessoas];

	public int getPessoas() {
		return pessoas;
	}

	public void setPessoas(int pessoas) {
		this.pessoas = pessoas;
	}

	
	public String[] getNome() {
		return nome;
	}

	public void setNome(String[] nome) {
		this.nome = nome;
	}

	public int[] getIdade() {
		return idade;
	}

	public void setIdade(int[] idade) {
		this.idade = idade;
	}

	public float[] getAltura() {
		return altura;
	}

	public void setAltura(float[] altura) {
		this.altura = altura;
	}

	void armazenarPessoas(String nome, int idade, float altura) {
		for (int i = 0; i < pessoas; i++) {

			this.nome[i] = nome;
			this.idade[i] = idade;
			this.altura[i] = altura;
			
		}
	}

	void removerPessoas(String nome) {
		for (int i = 0; i < this.nome[i].length(); i++) {
			if (nome.equals(this.nome[i])) {
				System.out.println("O nome foi achado na lista.");
				break;
			} else {
				System.out.println("Refaça a Busca. Não foi possível localizar o nome!");
				break;
			}
		}
	}

	void buscarPessoa(String nome) {
		for (int i = 0; i < this.nome[i].length(); i++) {
			if (nome.equals(this.nome)) {
				System.out.println("O Primeiro nome foi achado na lista na Posição: " + i);
				break;
			} else {
				System.out.println("Não Localizado!");
			}
		}
	}

	void imprimirAgenda() {
		for (int i = 0; i < this.nome.length; i++) {
			System.out.println("Contato " + i);
			System.out.println("Nome: " + this.nome[i]);
			System.out.println("Idade: " + this.idade[i]);
			System.out.println("Altura: " + this.altura[i]);
		}
	}

	void imprimrPessoa(int index) {
		for (int i = 0; i < this.nome[i].length(); i++) {
			System.out.println(this.nome[i].indexOf(index));
			
		}
	}

}
