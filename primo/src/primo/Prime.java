package primo;

import java.util.Scanner;

public class Prime {
	public static void main(String[] arg) {
		isPrime();
	}

	public static void isPrime() {
		int num, prime=0;
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("Digite algum número pra saber se é primo ou n. ");
		
		num = inputScanner.nextInt();
		

			for (int cont = 1; cont <= num; cont++) {
				if (num % cont == 0) {
					prime++;
				}
				
			}
			if (prime == 2) {
				System.out.println("O número " + num + " é primo");
			} else {
				System.out.println("Número " + num + " não é primo");
			}
		
	}
}
