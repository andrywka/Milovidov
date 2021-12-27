import java.util.Scanner;

public class ConditionalStatement {
	public static void main (String [] args) {
		
		System.out.println("How old are you?");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		if (age > 20) {
			System.out.println("Nu zdarova, otec!");
		}
		System.out.println("If you are man print '1', if you are woman print '2'");
		int sex = scan.nextInt();
		if (sex == 1) {
			System.out.println("Hello, boy!");
		}
		else {
			System.out.println("Hello, girl!");
		}
		System.out.println("What is your height?");
		double height = scan.nextDouble();
		if (height < 1.80) {
			System.out.println("Derji rastishku");
		}
		else {
			System.out.println("Dostan' vorobushka");
		}
		System.out.println("What is your name? If it starts with 'M' print 1, if with 'I' print 2, if any other print '3' ");
		int name = scan.nextInt();
		if (name == 1) {
			System.out.println("Misha, privet");
		}
		else if (name == 2) {
			System.out.println("Hello, Igor");
		}
		else {
			System.out.println("Privet, neznakomec");
		}

		}
	}
