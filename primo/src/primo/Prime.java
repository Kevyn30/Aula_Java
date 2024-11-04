package primo;

import java.util.Scanner;

public class Prime {
	public static void main(String[] arg) {
		isPrime();
	}

	public static void isPrime() {
		int num, rest, prime=0;
		
		Scanner dig = new Scanner(System.in);
		
		System.out.print("Digite algum número pra saber se é primo ou n.");
		
		num = dig.nextInt();
		
		rest = num;
		for (int i = num; i <= rest; i++) {

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					prime++;
				}
				
			}
			if (prime == 2) {
				System.out.println("O número " + i + " é primo");
			} else {
				System.out.println("Número " + i + " não é primo");
			}
		}
	}
}
