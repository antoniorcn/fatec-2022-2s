package edu.curso;
class Estouro { 
	int [][] arr = new int[1000][10];
	Estouro proximo;
}
public class Teste {
	public static void main(String[] args) {
		Estouro raiz = new Estouro();
		Estouro e = raiz;
		int count = 0;
		while(true) {
			System.out.println(count++);
			e.proximo = new Estouro();
			e = e.proximo;
		}
	}
}
