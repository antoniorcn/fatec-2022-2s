public class Numeros { 

	public static void main(String[] args) {
		int a = 10;
		int b = a++;
		System.out.printf("A: %d   B: %d %n", a, b);
		int c = ++a;
		System.out.printf("A: %d   C: %d %n", a, c);
		int d = b++ + ++a - 3;
		System.out.printf("A: %d   B: %d		D:%d  %n", 
			a, b, d);

	} 

}