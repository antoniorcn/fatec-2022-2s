class Elemento { 
	int[][] data = new int [1000][100];
	Elemento proximo; 
}

public class Teste { 
	public static void main(String args[]) { 
		Elemento raiz = new Elemento();
		Elemento e = raiz;

		int contador = 0;

		while (true) { 
			e.proximo = new Elemento();
			e = e.proximo;
			System.out.println(contador++);
		}
	}
}
