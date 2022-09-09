public class Concatena { 
	public static void main(String args[]) { 
		long start = System.nanoTime();
		// String texto = "";
		StringBuffer texto = new StringBuffer("");

		for (int i = 0; i < 1000000; i++) { 
			// texto += i;
			texto.append(i);
		}
		long finish = System.nanoTime();
		long tempo = finish - start;
		System.out.printf("Tempo %d%n", tempo);
	}
}
