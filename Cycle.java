public class Cycle {
	public static void main (String[] args) {
		for (int a = 0; a <= 20; a++) {
			System.out.println(a);
		}
		int b = 6;
		while (b >= -6) {
			System.out.println(b);
			b -= 2;
		}
		int c = 10;
		int sum = 0;
		do { if(c % 2 != 0) {
			sum += c; 
			}
			c++;
		}
			while (c <= 20);
			System.out.println(sum);

	}
}