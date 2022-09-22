package edu.curso.cadeiacontrutores;
public class Funcionario extends Pessoa {
	public Funcionario() { 
		super();
		System.out.println("Instanciando um funcionario");
	}
	
	public Funcionario(String texto) { 
		super(texto);
	}
//	public Funcionario() { 
//		super();
//	}

}
