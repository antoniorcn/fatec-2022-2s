package edu.curso;

public class TesteInstancias {
	public static void main(String[] args) {
		Pessoa joao = new Pessoa();
		joao.nome = "João Silva";
		joao.cpf= "1111111111-11";
		joao.cor = "branco";
		joao.endereco = "Av. Aguia de Haia, 1000";
		
		Pessoa maria = new Pessoa();
		maria.nome = "Maria Silva";
		maria.cpf = "222222222-22";
		maria.cor = "negra";
		maria.endereco = "Av. Aguia de Haia, 1200";
		
		joao.comer();
		maria.comer();
		joao.trabalhar();
		maria.trabalhar();
		joao.dormir();
		joao.comer();
		joao.dormir();
		maria.dormir();
	}
}
