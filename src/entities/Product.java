package entities;

public class Product {
		private String nome;
		private double preco;
		
		//construtor
		public Product(String nome, double preco) {
			this.nome = nome;
			this.preco = preco;
		}


		//metodos get e set
		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public double getPreco() {
			return preco;
		}


		public void setPreco(double preco) {
			this.preco = preco;
		}


		@Override
		public String toString() {
			return "Relatório [nome: " + nome + ", preco: " + preco + "]";
		}
		
		
		
		
}
